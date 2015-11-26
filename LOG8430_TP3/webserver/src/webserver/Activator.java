package webserver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLDecoder;
import java.util.Collections;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import ca.polymtl.log8430.model.TP2.TP2Factory;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "webserver"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private Server server;
	public static File savedModel = new File(Activator.class.getProtectionDomain().getCodeSource().getLocation().getPath() +"savedModel.xml");

	private EObject root;

	/**
	 * The constructor
	 */
	public Activator() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		server = new Server(5002);
		XMIResource xmiResource = new XMIResourceImpl();

		System.out.println("Le modele est enregistré dans le fichier: " + savedModel.getAbsolutePath());
		if (savedModel.exists()) {
			// load from plug-in specific location
			FileInputStream in = new FileInputStream(savedModel);
			xmiResource.load(in, Collections.emptyMap());
			in.close();
			root = xmiResource.getContents().get(0);
			System.out.println("Le modele existait deja, on le charge.");
		} else {
			root = TP2Factory.eINSTANCE.createFichier();
			System.out.println("Le modele n'existait pas et un nouveau a ete cree.");
		}
		server.setHandler(addEmfHandler(root));
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					server.start();
					server.join();
				} catch (Exception e) {
					getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, "Failed to start webserver"));
				}
			}
		}).start();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.
	 * BundleContext)
	 */
	@ Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Roberto");
		XMIResource xmiResource = new XMIResourceImpl();
		xmiResource.getContents().add(root);
		FileOutputStream out = new FileOutputStream(savedModel);
		xmiResource.save(out, Collections.emptyMap());
		out.close();
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 *
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	private Handler addEmfHandler(EObject root) {
		return new EMFHandler(root);
	}
}
