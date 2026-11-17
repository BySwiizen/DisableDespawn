package fr.byswiizen.disabledespawn.command.subcommands;

import fr.byswiizen.disabledespawn.DisableDespawn;
import fr.byswiizen.disabledespawn.util.ColorUtil;
import org.bukkit.command.CommandSender;
import revxrsal.commands.annotation.Command;
import revxrsal.commands.annotation.Subcommand;


@Command("disabledespawn")
public class HelpSubCommand {
	
	public DisableDespawn plugin;
	public HelpSubCommand(DisableDespawn instance) {
		this.plugin = instance;
	}
	
	
	@Subcommand("help")
	public void help(CommandSender sender) {
		for (String line : DisableDespawn.messagesfile.getStringList("help")) {
			sender.sendMessage(ColorUtil.translate(DisableDespawn.messagesfile.getString("prefix") + " " + line));
		}
	}
}