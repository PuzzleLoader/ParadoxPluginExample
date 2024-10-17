package org.example.explugin;

import com.github.puzzle.paradox.game.command.Commands;
import com.github.puzzle.paradox.loader.entrypoint.interfaces.PluginInitializer;

public class ExamplePlugin implements PluginInitializer {

    @Override
    public void onInit() {
        Constants.LOGGER.info("Hello From INIT");
        Commands.registerConsoleCommands();
        Commands.registerClientCommands();

    }
}
