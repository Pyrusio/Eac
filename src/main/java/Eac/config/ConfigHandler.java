package Eac.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static void init(File configFile)
    {
        // Create the config object from the given config file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try
        {
            // Load the Config file
            configuration.load();

            // Read in properties from config file
            configValue = configuration.get("EacConfig", "configValue", true, "This is an example config value").getBoolean(true);
        }
        catch (Exception e)
        {
           // Log the exception
        }
        finally
        {
            // Save the config file
            configuration.save();
        }

        System.out.println("Configuration Test: " + configValue);
    }
}
