package com.thom.misc;

import com.thom.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMod extends CreativeTabs 
{
	public CreativeTabMod() 
	{
		super("modCreativeTab");
	}
	
	@Override
	public Item getTabIconItem() 
	{
		return ModItems.simpleItem;
	}
	
	@Override
	public String getTranslatedTabLabel() 
	{
		return "Mod Creative Tab";
	}
}
