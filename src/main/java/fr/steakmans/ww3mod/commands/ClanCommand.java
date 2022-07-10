package fr.steakmans.ww3mod.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;

public class ClanCommand {

    public static final ClanCommand cmd = new ClanCommand();

    public static void register(CommandDispatcher<CommandSource> dispatcher) {
        dispatcher.register(Commands.literal("c").executes(cmd::run));
        dispatcher.register(Commands.literal("clan").executes(cmd::run));
    }

    public int run(CommandContext<CommandSource> ctx) {

        return 0;
    }

}
