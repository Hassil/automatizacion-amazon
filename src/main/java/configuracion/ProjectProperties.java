package configuracion;


import utileria.Log4J;

import java.io.IOException;
import java.util.Properties;


public class ProjectProperties {

    private static Properties properties;

    private ProjectProperties() {
    }

    private static void readProperties() {
        String env = System.getProperty("env") != null ? "env" : "environment.qa";
        env += ".properties";

        try {
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            properties.load(cl.getResourceAsStream(env));
        } catch (IOException e) {
            Log4J.error("Ocurrió un error al leer las propiedades de " + env + ": " + e.getMessage());
        }
    }

    public static Properties getProperties() {
        if (ProjectProperties.properties == null) {
            ProjectProperties.properties = new Properties();
            readProperties();
        }

        return properties;
    }

}
