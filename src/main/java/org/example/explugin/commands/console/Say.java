package org.example.explugin.commands.console;

import com.github.puzzle.paradox.game.command.CommandSource;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import finalforeach.cosmicreach.networking.netty.packets.MessagePacket;
import finalforeach.cosmicreach.networking.server.ServerSingletons;

import static com.github.puzzle.paradox.core.PuzzlePL.SERVER_ACCOUNT;

public class Say implements Command<CommandSource> {
    public Say(){}

    @Override
    public int run(CommandContext<CommandSource> context) throws CommandSyntaxException {
        var pack = new MessagePacket("[Server] "+ "hi");
        pack.playerUniqueId = SERVER_ACCOUNT.getUniqueId();
        ServerSingletons.server.broadcast(pack);
        return 0;
    }
}
