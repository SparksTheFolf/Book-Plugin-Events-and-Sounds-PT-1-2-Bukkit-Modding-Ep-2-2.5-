package com.Books.BKSplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class HerobrineCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		
		if (sender instanceof Player) {
			if(cmd.getName().equalsIgnoreCase("herobrine")) {
				ItemStack herobrineBook = new ItemStack(Material.WRITTEN_BOOK);
				BookMeta herobrineMeta = (BookMeta) herobrineBook.getItemMeta();
				herobrineMeta.setTitle(ChatColor.RED + "Herobrine " + ChatColor.GOLD + "!BEWARE!");
				herobrineMeta.setAuthor(ChatColor.DARK_RED + "Herobrine");
				herobrineMeta.addPage(
						ChatColor.RED + "HI this is Herobrine",
						ChatColor.GOLD + "you have 72 minecraft hours left to go before you die from the world boarder" + ChatColor.DARK_RED + "\n\nGOOD LUCK! ;)");
				
				herobrineBook.setItemMeta(herobrineMeta);
				
				((Player) sender).getInventory().setItemInHand(herobrineBook);
				
				((Player) sender).playSound(((Player) sender).getPlayer().getLocation(), Sound.BLOCK_ANVIL_PLACE, 1, 1);
				
				sender.sendMessage(
						ChatColor.RED + sender.getName() + " ,you are now with" + ChatColor.GOLD + " Herobrine!" // new line for each one
						+ ChatColor.BOLD + ChatColor.AQUA + "\n\n Good Luck!!");
		
						}
		}
		
		return false;
	}

}
