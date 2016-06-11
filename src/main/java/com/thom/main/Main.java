package com.thom.main;

import com.thom.init.ModBlocks;
import com.thom.init.ModItems;
import com.thom.proxies.ServerProxy;
import com.thom.reference.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class Main 
{
	@SidedProxy(clientSide = "com.thom.proxies.ClientProxy", serverSide = "com.thom.proxies.ServerProxy")
	public static ServerProxy proxy;
	
	@Instance(Reference.MOD_ID)
	public static Main instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModBlocks.init();
		ModItems.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		ModBlocks.registerRenders();
		ModItems.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}