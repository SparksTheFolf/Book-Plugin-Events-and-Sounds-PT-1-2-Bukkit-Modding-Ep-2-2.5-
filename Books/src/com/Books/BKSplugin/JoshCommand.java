package com.Books.BKSplugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import net.md_5.bungee.api.ChatColor;

public class JoshCommand implements CommandExecutor {
	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		
		if(sender instanceof Player) {
			if(cmd.getName().equalsIgnoreCase("josh")) {
				ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
				BookMeta meta = (BookMeta) book.getItemMeta();
				meta.setTitle(ChatColor.GREEN + "Your Brother");
				meta.setAuthor("Nolan");
				meta.addPage(
						ChatColor.RED + "Hi little bro " + ChatColor.BLUE + "(Josh) " + ChatColor.DARK_RED + "how is your day today?", 
						"Meh \nGood \nAwesome");
				
				book.setItemMeta(meta);
				
			((Player) sender).getInventory().setItem(1, book);
			}
		}
		
		
		return false;
	}

}
