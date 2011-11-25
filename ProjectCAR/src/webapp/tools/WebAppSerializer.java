package webapp.tools;

import generator.website.NormalPageFactory;
import generator.website.ResourcesFileFactory;
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
		System.out.println("Creating web.xml");
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
		System.out.println("Creating web.xml");
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
			}
			writer.close();
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
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
		System.out.println("Creating web.xml");
		for (int i = 0; i < namePages.size(); i++) {
			try {
				output = new FileWriter("src/" + namePages.get(i) + ".jsp");
				writer = new BufferedWriter(output);
				writer.write(codePages.get(i));
				writer.close();
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		File f = new File("examples/aDynamicWebApp.xmi");
		WebAppSerializer sel = new WebAppSerializer();
		DynamicWebApp app = sel.load(f);

		// sel.writeFile(app, new WebConfigToXML(), "src/web.xml");
		// sel.writeFile(app, new ResourcesFileFactory(),
		// "src/Resources.properties");
		// sel.writeFile(app, new NormalPageFactory(), "src/main.jsp");
		sel.generateNormalPage(app);

	}
}
