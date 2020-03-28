package com.Books.BKSplugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		System.out.println("Josh's Books ENABLED");
		
		getCommand("josh").setExecutor(new JoshCommand());
		getCommand("herobrine").setExecutor(new HerobrineCommand());
		getCommand("npc").setExecutor(new NPCCommand());
	}
	
	@Override
	public void onDisable() {	
		System.out.println("Josh's Books DISABLED");
		
	}

	

}
