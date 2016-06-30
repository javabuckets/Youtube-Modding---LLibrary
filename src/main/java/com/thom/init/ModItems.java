package com.thom.init;

import com.thom.util.ItemRegistry;

import net.minecraft.item.Item;

public class ModItems 
{
	public static Item simpleItem;
	
	public static void init()
	{
		simpleItem = new Item().setUnlocalizedName("simpleItem").setCreativeTab(ModCreativeTabs.creativeTab);
		ItemRegistry.registerItem(simpleItem);
	}
	
	public static void registerRenders()
	{
		ItemRegistry.registerRender(simpleItem);
	}
}