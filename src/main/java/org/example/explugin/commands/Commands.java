package org.example.explugin.commands;


import com.github.puzzle.paradox.game.command.CommandManager;
import com.github.puzzle.paradox.game.command.CommandSource;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import org.example.explugin.commands.Client.Hi;
import org.example.explugin.commands.console.Say;

public class Commands {
    public static void registerConsoleCommands(){
        LiteralArgumentBuilder<CommandSource> say = CommandManager.literal("say");
        say.then(CommandManager.argument("txt", StringArgumentType.greedyString())
                .executes(new Say()));
        CommandManager.consoledispatcher.register(say);
    }

    public static void registerClientCommands(){
        LiteralArgumentBuilder<CommandSource> msg = CommandManager.literal("msg");
        msg.then(CommandManager.argument("name", StringArgumentType.word())
                .then(CommandManager.argument("msg",StringArgumentType.greedyString())
                        .executes(new Hi())));
        CommandManager.dispatcher.register(msg);
    }
}
