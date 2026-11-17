package fr.byswiizen.disabledespawn.command.subcommands;

import fr.byswiizen.disabledespawn.DisableDespawn;
import fr.byswiizen.disabledespawn.util.ColorUtil;
import org.bukkit.command.CommandSender;
import revxrsal.commands.annotation.Command;
import revxrsal.commands.annotation.Subcommand;
import revxrsal.commands.bukkit.annotation.CommandPermission;


@Command("disabledespawn")
public class ReloadSubCommand {
	
	public DisableDespawn plugin;
	public ReloadSubCommand(DisableDespawn instance) {
		this.plugin = instance;
	}
	
	
	@Subcommand("reload")
	@CommandPermission("disabledespawn.reload")
	public void reload(CommandSender sender) {
		try {
			DisableDespawn.configfile.reload();
			DisableDespawn.messagesfile.reload();
			sender.sendMessage(ColorUtil.translate(DisableDespawn.messagesfile.getString("prefix") + " " + DisableDespawn.messagesfile.getString("reload-success")));
		} catch (Exception error) {
			error.printStackTrace();
		}
	}
}