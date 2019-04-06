package ca.damocles.dad;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("DAD is started up!");
		
		this.getCommand("hello").setExecutor(new CommandHello());
	}
	
	@Override
	public void onDisable() {
		System.out.println("DAD is now turned off!");
	}
	
	
	
	
}
