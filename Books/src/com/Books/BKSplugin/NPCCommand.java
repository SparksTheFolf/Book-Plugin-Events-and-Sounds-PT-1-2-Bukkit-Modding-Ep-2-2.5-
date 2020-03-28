package com.Books.BKSplugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import net.md_5.bungee.api.ChatColor;

public class NPCCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		
		if(sender instanceof Player) {
			
			if(cmd.getName().equalsIgnoreCase("npc")) {
				ItemStack NPCBook = new ItemStack(Material.WRITTEN_BOOK);
				BookMeta NPCMeta = (BookMeta) NPCBook.getItemMeta();
				
				NPCMeta.setTitle(ChatColor.GOLD + "Villager");
				NPCMeta.setAuthor(ChatColor.GREEN + "Villager's");
				NPCMeta.addPage(
						ChatColor.DARK_PURPLE + "\n\nWelcome to the village! :)",
						ChatColor.GOLD + "Thx For Watching this Live Stream!!!!!:)",
						ChatColor.DARK_BLUE + "Github code will be up soon for your viewing! :)");
				
				
				NPCBook.setItemMeta(NPCMeta);
				
				((Player) sender).getInventory().setItemInHand(NPCBook);
				}
			
		}
		
		
		return false;
	}

}
