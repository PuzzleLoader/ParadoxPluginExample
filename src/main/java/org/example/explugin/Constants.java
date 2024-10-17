package org.example.explugin;

import finalforeach.cosmicreach.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Constants {

    public static final String PLUGIN_ID = "example-plugin";
    public static final Identifier PLUGIN_NAME = Identifier.of(PLUGIN_ID, "Example Plugin");
    public static final Logger LOGGER = LogManager.getLogger(PLUGIN_ID);


}
