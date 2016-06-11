package com.thom.init;

import com.thom.util.BlockRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;

public class ModBlocks 
{
	public static Block simple;
	
	public static void init()
	{
		simple = new Block(Material.GROUND).setUnlocalizedName("simple");
		BlockRegistry.registerBlock(simple);
	}
	
	public static void registerRenders()
	{
		BlockRegistry.registerRender(simple);
	}
}