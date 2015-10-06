package ca.polymtl.log8430.tp1.Commands;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URL;

import sun.misc.Launcher;
// Source http://www.javaworld.com/article/2077477/learn-java/java-tip-113--identify-subclasses-at-runtime.html
public class DynamicCommandLoader {
	public static void find(String pckgname) {
        // Code from JWhich
        // ======
        // Translate the package name into an absolute path
        String name = new String(pckgname);
        if (!name.startsWith("/")) {
            name = "/" + name;
        }        
        name = name.replace('.','/');
        
        // Get a File object for the package
        URL url = Launcher.class.getResource(name);
        String result = new String("");
        try {
			result = java.net.URLDecoder.decode(url.getFile(), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
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
                        Object o = Class.forName(pckgname+"."+classname).newInstance();

                        if (o instanceof Command) {
                            System.out.println(classname);
                        }
                    } catch (ClassNotFoundException cnfex) {
                        System.err.println(cnfex);
                    } catch (InstantiationException iex) {
                        // We try to instantiate an interface
                        // or an object that does not have a 
                        // default constructor
                    } catch (IllegalAccessException iaex) {
                        // The class is not public
                    }
                }
            }
        }
    }

}
