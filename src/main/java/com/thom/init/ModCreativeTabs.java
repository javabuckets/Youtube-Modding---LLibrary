package com.thom.init;

import com.thom.misc.CreativeTabMod;

import net.minecraft.creativetab.CreativeTabs;

public class ModCreativeTabs 
{
	public static CreativeTabs creativeTab;
	
	public static void init()
	{
		creativeTab = new CreativeTabMod();
	}
}