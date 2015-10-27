package ca.polymtl.log8430.tp1.Commands;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;

import sun.misc.Launcher;

/**
 * Classe qui permet le chargement dynamique de commandes
 * Source de l'implementation : http://www.javaworld.com/article/2077477/learn-java/java-tip-113--identify-subclasses-at-runtime.html
 * @author Alexandre St-Onge, Mathieu Laprise, Julien Bergeron, Mathias Varinot
 */
public class DynamicCommandLoader {
	/**
	 * Fonction qui permet de charger dynamiquement les commandes selon
	 * le nom du package passé en paramètre
	 * @param pckgname	Le nom du package contenant les commandes
	 * @return			La liste de toutes les commandes
	 */
	public ArrayList<Command> load(String pckgname) {
        // Code from JWhich (source citée plus haut)
        // ======
        // Translate the package name into an absolute path
        String name = new String(pckgname);
        ArrayList<Command> commands = new ArrayList<Command>();
        if (!name.startsWith("/")) {
            name = "/" + name;
        }        
        name = name.replace('.','/');
        
        // Get a File object for the package
        URL url = Launcher.class.getResource(name);
        String result = new String("");
        try {
        	// pour que les paths avec les espaces soient pas transformes en %20
			result = java.net.URLDecoder.decode(url.getFile(), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        File directory = new File(result);
        // New code
        // ======
        if (directory.exists()) {
            // Get the list of the files contained in the package
            String [] files = directory.list();
            for (int i=0;i<files.length;i++) {
                 
                // we are only interested in .class files
                if (files[i].endsWith(".class")) {
                    // removes the .class extension
                    String classname = files[i].substring(0,files[i].length()-6);
                    try {
                        // Try to create an instance of the object
                        Object o = Class.forName(pckgname+"."+classname).getDeclaredConstructor(String.class).newInstance(new String(""));

                        if (o instanceof Command) {
                        	commands.add((Command) o);
                        }
                    } catch (ClassNotFoundException cnfex) {
                        System.err.println(cnfex);
                    } catch (InstantiationException iex) {
                        // We try to instantiate an interface
                        // or an object that does not have a 
                        // default constructor
                    } catch (IllegalAccessException iaex) {
                        // The class is not public
                    } catch (IllegalArgumentException e) {
					
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (NoSuchMethodException e) {
					
					} catch (SecurityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
            }
        }
		return commands;
    }

}
