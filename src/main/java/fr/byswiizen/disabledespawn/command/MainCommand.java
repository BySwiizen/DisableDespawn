package fr.byswiizen.disabledespawn.command;

import fr.byswiizen.disabledespawn.DisableDespawn;
import fr.byswiizen.disabledespawn.command.subcommands.HelpSubCommand;
import org.bukkit.command.CommandSender;
import revxrsal.commands.annotation.Command;
import revxrsal.commands.annotation.CommandPlaceholder;


@Command("disabledespawn")
public class MainCommand {
	
	public DisableDespawn plugin;
	public HelpSubCommand helpcommand;
	public MainCommand(DisableDespawn instance) {
		this.plugin = instance;
		this.helpcommand = new HelpSubCommand(instance);
	}
	
	
	@CommandPlaceholder
	public void help(CommandSender sender) {
		helpcommand.help(sender);
	}
}