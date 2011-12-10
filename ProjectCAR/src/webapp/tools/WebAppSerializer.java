package webapp.tools;

import generator.website.ActionFormsFactory;
import generator.website.ActionsFactory;
import generator.website.DAOFactory;
import generator.website.DomainFactory;
import generator.website.FormPageFactory;
import generator.website.NormalPageFactory;
import generator.website.ResourcesFileFactory;
import generator.website.StrutsConfigFactory;
import generator.website.WebConfigToXML;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import webapp.DynamicWebApp;
import webapp.FormPage;
import webapp.NormalPage;
import webapp.Page;
import webapp.WebappPackage;

public class WebAppSerializer {

	public DynamicWebApp load(File f) {
		ResourceSet rs = new ResourceSetImpl();
		Resource.Factory.Registry registry = rs.getResourceFactoryRegistry();
		Map<String, Object> m = registry.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		rs.getPackageRegistry().put(WebappPackage.eNS_URI,
				WebappPackage.eINSTANCE);
		URI uri = URI.createFileURI(f.getAbsolutePath());
		Resource resource = rs.getResource(uri, true);
		if (resource.isLoaded() && resource.getContents().size() > 0) {
			return (DynamicWebApp) resource.getContents().get(0);
		}
		return null;
	}

	public void generateWebConfig(DynamicWebApp app) {
		WebConfigToXML test = new WebConfigToXML();
		FileWriter output;
		BufferedWriter writer;
		System.out.println("Generating web.xml");
		try {
			output = new FileWriter("web.xml");
			writer = new BufferedWriter(output);
			// Appel de la méthode generate de la classe générée par JET
			writer.write(test.generate(app));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeFile(Object model, Object generator, String filename) {
		FileWriter output;
		BufferedWriter writer;
		System.out.println("Generating " + filename + " ... ");
		try {
			output = new FileWriter(filename);
			writer = new BufferedWriter(output);
			// Appel de la méthode generate de la classe générée par JET
			if (generator instanceof WebConfigToXML) {
				WebConfigToXML test = (WebConfigToXML) generator;
				writer.write(test.generate(model));
			} else if (generator instanceof ResourcesFileFactory) {
				ResourcesFileFactory res = (ResourcesFileFactory) generator;
				writer.write(res.generate(model));
			} else if (generator instanceof NormalPageFactory) {
				NormalPageFactory npage = (NormalPageFactory) generator;
				writer.write(npage.generate(model));
			} else if (generator instanceof StrutsConfigFactory) {
				StrutsConfigFactory conf = (StrutsConfigFactory) generator;
				writer.write(conf.generate(model));
			}
			writer.close();
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void generateFormPages(DynamicWebApp app) {

		FormPageFactory npageFac = new FormPageFactory();
		String sources = npageFac.generate(app);

		ArrayList<String> codePages = new ArrayList<String>();
		int count = 0;
		for (int i = 0; i < sources.length(); i++) {
			if (sources.charAt(i) == '$') {
				String str = sources.substring(count, i - 1);
				codePages.add(str);
				count = i + 1;
			}
		}
		ArrayList<String> namePages = new ArrayList<String>();

		for (Page p : app.getPages()) {
			if (p instanceof FormPage) {
				namePages.add(p.getName());
			}
		}

		FileWriter output;
		BufferedWriter writer;

		for (int i = 0; i < namePages.size(); i++) {
			try {
				System.out
						.println("Generating " + namePages.get(i) + ".jsp...");
				output = new FileWriter("src/gen/pages/" + namePages.get(i)
						+ ".jsp");
				writer = new BufferedWriter(output);
				writer.write(codePages.get(i));
				writer.close();
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
	public void generateDomainClasses(DynamicWebApp app) {

		DomainFactory npageFac = new DomainFactory();
		String sources = npageFac.generate(app);

		ArrayList<String> codePages = new ArrayList<String>();
		int count = 0;
		for (int i = 0; i < sources.length(); i++) {
			if (sources.charAt(i) == '#') {
				String str = sources.substring(count, i - 1);
				codePages.add(str);
				count = i + 1;
			}
		}
		ArrayList<String> namePages = new ArrayList<String>();

		for (Page p : app.getPages()) {
			if (p instanceof FormPage && ((FormPage)p).isPersist()) {
				namePages.add(p.getName().substring(0,1).toUpperCase()+p.getName().substring(1));
			}
		}

		FileWriter output;
		BufferedWriter writer;

		for (int i = 0; i < namePages.size(); i++) {
			try {
				System.out
						.println("Generating " + namePages.get(i) + ".java...");
				output = new FileWriter("src/gen/domain/" + namePages.get(i)
						+ ".java");
				writer = new BufferedWriter(output);
				writer.write(codePages.get(i));
				writer.close();
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// dao
	
	public void generateDAOClasses(DynamicWebApp app) {

		DAOFactory npageFac = new DAOFactory();
		String sources = npageFac.generate(app);

		ArrayList<String> codePages = new ArrayList<String>();
		int count = 0;
		for (int i = 0; i < sources.length(); i++) {
			if (sources.charAt(i) == '#') {
				String str = sources.substring(count, i - 1);
				codePages.add(str);
				count = i + 1;
			}
		}
		ArrayList<String> namePages = new ArrayList<String>();

		for (Page p : app.getPages()) {
			if (p instanceof FormPage && ((FormPage)p).isPersist()) {
				namePages.add(p.getName().substring(0,1).toUpperCase()+p.getName().substring(1));
			}
		}

		FileWriter output;
		BufferedWriter writer;

		for (int i = 0; i < namePages.size(); i++) {
			try {
				String fName = namePages.get(i).substring(3);
				System.out
						.println("Generating DAO" + fName.substring(0,1).toUpperCase()+fName.substring(1) + ".java...");
				output = new FileWriter("src/gen/dao/DAO" + fName.substring(0,1).toUpperCase()+fName.substring(1)
						+ ".java");
				writer = new BufferedWriter(output);
				writer.write(codePages.get(i));
				writer.close();
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void generateNormalPage(DynamicWebApp app) {
		NormalPageFactory npageFac = new NormalPageFactory();
		String sources = npageFac.generate(app);
		ArrayList<String> codePages = new ArrayList<String>();
		int count = 0;
		for (int i = 0; i < sources.length(); i++) {
			if (sources.charAt(i) == '$') {
				String str = sources.substring(count, i - 1);
				codePages.add(str);
				count = i + 1;
			}
		}
		ArrayList<String> namePages = new ArrayList<String>();
		for (Page p : app.getPages()) {
			if (p instanceof NormalPage) {
				namePages.add(p.getName());
			}
		}
		FileWriter output;
		BufferedWriter writer;

		for (int i = 0; i < namePages.size(); i++) {
			try {
				System.out.println("Generating " + namePages.get(i)
						+ ".jsp ...");
				output = new FileWriter("src/gen/pages/" + namePages.get(i)
						+ ".jsp");
				writer = new BufferedWriter(output);
				writer.write(codePages.get(i));
				writer.close();
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void generateAction(DynamicWebApp app) {
		ActionsFactory aFactory = new ActionsFactory();
		String sources = aFactory.generate(app);
		ArrayList<String> codeJavas = new ArrayList<String>();
		int count = 0;
		for (int i = 0; i < sources.length(); i++) {
			if (sources.charAt(i) == '$') {
				String str = sources.substring(count, i - 1);
				codeJavas.add(str);
				count = i + 1;
			}
		}

		ArrayList<String> nameJavaFiles = new ArrayList<String>();
		for (Page p : app.getPages()) {
			if (p instanceof FormPage) {
				nameJavaFiles.add(p.getName().substring(0, 1).toUpperCase()
						+ p.getName().substring(1) + "Action");
			}
		}
		FileWriter output;
		BufferedWriter writer;

		for (int i = 0; i < nameJavaFiles.size(); i++) {
			try {
				System.out.println("Generating " + nameJavaFiles.get(i)
						+ " ...");
				output = new FileWriter("src/gen/servlets/"
						+ nameJavaFiles.get(i) + ".java");
				writer = new BufferedWriter(output);
				writer.write(codeJavas.get(i));
				writer.close();
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void generateActionForm(DynamicWebApp app) {
		ActionFormsFactory aFactory = new ActionFormsFactory();
		String sources = aFactory.generate(app);
		ArrayList<String> codeJavas = new ArrayList<String>();
		int count = 0;
		for (int i = 0; i < sources.length(); i++) {
			if (sources.charAt(i) == '#') {
				String str = sources.substring(count, i - 1);
				codeJavas.add(str);
				count = i + 1;
			}
		}

		ArrayList<String> nameJavaFiles = new ArrayList<String>();
		for (Page p : app.getPages()) {
			if (p instanceof FormPage) {
				nameJavaFiles.add(p.getName().substring(0, 1).toUpperCase()
						+ p.getName().substring(1) + "ValidationForm");
			}
		}
		FileWriter output;
		BufferedWriter writer;

		for (int i = 0; i < nameJavaFiles.size(); i++) {
			try {
				System.out
						.println("generating " + nameJavaFiles.get(i) + "... ");
				output = new FileWriter("src/gen/actionForms/"
						+ nameJavaFiles.get(i) + ".java");
				writer = new BufferedWriter(output);
				writer.write(codeJavas.get(i));
				writer.close();
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		File f = new File("examples/aDynamicWebApp.xmi");
		WebAppSerializer serializer = new WebAppSerializer();
		DynamicWebApp app = serializer.load(f);

		serializer.writeFile(app, new WebConfigToXML(), "src/gen/web.xml");
		serializer.writeFile(app, new ResourcesFileFactory(),
				"src/gen/Resources.properties");
		serializer.writeFile(app, new ResourcesFileFactory(),
				"src/gen/Resources_en_EN.properties");
		serializer.writeFile(app, new ResourcesFileFactory(),
				"src/gen/Resources_fr_FR.properties");
		serializer.writeFile(app, new StrutsConfigFactory(),
				"src/gen/struts-config.xml"); 
		serializer.generateNormalPage(app);
		serializer.generateAction(app);
		serializer.generateActionForm(app);
		serializer.generateDAOClasses(app);
		
		// generating form pages
		serializer.generateFormPages(app);
		serializer.generateDomainClasses(app);

		System.out.println("\nGeneration completed successfully !!!");

	}
}
