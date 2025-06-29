package util;

import java.util.Properties;
import java.io.InputStream;

public class ConfigUtil {
    private static final Properties props = new Properties();

    static {
        try (InputStream input = ConfigUtil.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input != null) {
                props.load(input);
            }
        } catch (Exception e) {
            System.out.println("Failed to load config.properties.");
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }
}
