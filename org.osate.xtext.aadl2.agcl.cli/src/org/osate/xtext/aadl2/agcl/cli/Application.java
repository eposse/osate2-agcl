package org.osate.xtext.aadl2.agcl.cli;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.modelsupport.resources.OsateResourceUtil;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
	 */
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("Hello RCP World!");
		System.out.println("Hello headless Osate World!");  
		final Map args = context.getArguments();  
		final String[] appArgs = (String[]) args.get("application.args");  
		for (final String arg : appArgs) {  
			System.out.println(arg);  
		}
		readModelFile("");

		return IApplication.EXIT_OK;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	public void stop() {
		// nothing to do
	}
	
	void readModelFile(String modelName) {
		if (modelName.equals("")) 
			modelName = "Test2.aadl";
		String modelPath = "~/Local/runtime-Osate2withAGCL/test1/packages";
		try {
			Path srcPath = Paths.get(Paths.get(modelPath, modelName)
					.toString()
					.replaceAll("~", System.getProperty("user.home"))).toRealPath();
			String srcPathStr = srcPath.toString();
			System.out.println("source path: '" + srcPathStr + "'");
			Resource file = OsateResourceUtil.getResource(URI.createFileURI(srcPath.toString()));
			EList list = file.getContents(); 
			AadlPackage spec = (AadlPackage) list.get(0);
			System.out.println(" Spec name = "+spec.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
