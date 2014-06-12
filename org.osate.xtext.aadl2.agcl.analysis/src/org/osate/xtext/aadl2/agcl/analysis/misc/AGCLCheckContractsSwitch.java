package org.osate.xtext.aadl2.agcl.analysis.misc;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.parsetree.reconstr.IParseTreeConstructor;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.Element;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.ThreadImplementation;
import org.osate.aadl2.ThreadType;
import org.osate.aadl2.TypedElement;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.ConnectionInstance;
import org.osate.aadl2.instance.FeatureInstance;
import org.osate.aadl2.instance.InstanceObject;
import org.osate.aadl2.instance.util.InstanceSwitch;
import org.osate.aadl2.modelsupport.modeltraversal.AadlProcessingSwitchWithProgress;
import org.osate.aadl2.util.Aadl2Switch;
import org.osate.xtext.aadl2.agcl.agcl.AGCLAnnexSubclause;
import org.osate.xtext.aadl2.agcl.agcl.AGCLContract;
import org.osate.xtext.aadl2.agcl.agcl.util.AgclSwitch;

@Deprecated
public class AGCLCheckContractsSwitch extends AadlProcessingSwitchWithProgress {
	
	protected AgclSwitch agclSwitch;
	protected ISerializer serializer;
	private IParseTreeConstructor parseTreeConstructor;

	public AGCLCheckContractsSwitch(IProgressMonitor pm) {
		super(pm);
	}

	@Override
	protected void initSwitches() {
//		Injector injector = new AGCLStandaloneSetup().createInjectorAndDoEMFRegistration();  
//		serializer = injector.getInstance(Serializer.class);   
//		parseTreeConstructor = injector.getInstance(AGCLParsetreeConstructor.class);
		System.out.println("monitor = " + monitor);
		agclSwitch = new AgclSwitch<String>() {
			public String caseAGCLAnnexSubclause(AGCLAnnexSubclause obj) {
				monitor.subTask("AGCL annex subclause" + obj.getName());
				System.out.println("* AGCL annex subclause");
				System.out.println("    name = '" + obj.getName() + "'");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				monitor.worked(1);
				return obj.toString();
			}
			public String caseAGCLContract(AGCLContract obj) {
				monitor.subTask("contract" + obj.getName());
				System.out.println("* contract");
				System.out.println("    name = '" + obj.getName() + "'");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				monitor.worked(1);
				return obj.toString();
			}
		};
		aadl2Switch = new Aadl2Switch<String>() {
			public String caseThreadType(ThreadType obj) {
				return defaultDeclarativeNamedNodeAction(obj, "thread");
			}
			public String caseThreadImplementation(ThreadImplementation obj) {
				return defaultDeclarativeNamedNodeAction(obj, "thread implementation");
			}
			public String caseAnnexLibrary(AnnexLibrary obj) {
			    return defaultDeclarativeNamedNodeAction(obj, "annex library");
			}
			public String caseAnnexSubclause(AnnexSubclause obj) {
				return defaultDeclarativeNamedNodeAction(obj, "annex subclause");
			}
		};
		instanceSwitch = new InstanceSwitch<String>() {
			public String caseComponentInstance(ComponentInstance obj) {
				return defaultInstanceNodeAction(obj, "component instance");
			}
		};

	}
	
	protected String defaultDeclarativeNamedNodeAction(NamedElement obj, String msg) {
		monitor.subTask("declarative node: " + msg + ":" + obj.getName());
		System.out.println("* declarative node: " + msg);
		System.out.println("    name = '" + obj.getName() + "'");
		if (obj instanceof TypedElement) {
			System.out.println("    type = '" + ((TypedElement)obj).getType() + "'");
		}
		try {
//			agclSwitch.doSwitch(obj);
			String s = serializer.serialize(obj);
			System.out.println("[" + s + "]");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		monitor.worked(1);
		return obj.toString();
	}

	protected String defaultInstanceNodeAction(InstanceObject obj, String msg) {
		monitor.subTask("instance node: " + msg + ":" + obj.getName());
		System.out.println("* instance node: " + msg);
		System.out.println("    name = '" + obj.getName() + "'");
		System.out.println("    full = '" + obj.getFullName() + "'");
		System.out.println("    path = '" + obj.getComponentInstancePath() + "'");
		if (obj instanceof ComponentInstance) {
			System.out.println("    cat = '" + ((ComponentInstance)obj).getCategory() + "'");
			System.out.println("    children = '" + ((ComponentInstance)obj).getChildren() + "'");
			for (Element e : ((ComponentInstance)obj).getChildren()) {
				if (e instanceof ComponentInstance) {
					System.out.println("        - component: name: " + ((NamedElement) e).getName() + "; cat = " + ((ComponentInstance)e).getCategory());
				}
				else if (e instanceof FeatureInstance) {
					System.out.println("        - feature: name: " + ((NamedElement) e).getName() + "; cat = " + ((FeatureInstance)e).getCategory());
				}
				else if (e instanceof ConnectionInstance) {
					System.out.println("        - connection: name: " + ((NamedElement) e).getName() + "; kind = " + ((ConnectionInstance)e).getKind());
				}
				else {
					System.out.println("        - other: name: " + ((NamedElement) e).getName() + "; str = " + e.toString());
				}
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		monitor.worked(1);
		return obj.toString();
	}

}
