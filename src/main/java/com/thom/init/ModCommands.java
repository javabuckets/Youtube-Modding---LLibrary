package com.thom.init;

import com.thom.command.CommandKillPlayer;
import com.thom.command.CommandMoveBlock;

import net.ilexiconn.llibrary.server.command.Command;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class ModCommands 
{
	public static void init(FMLServerStartingEvent event) 
	{
		CommandKillPlayer cmdKillPlayer = new CommandKillPlayer(Command.create("killPlayer"), event);
		CommandMoveBlock cmdMoveBlock = new CommandMoveBlock(Command.create("moveBlock"), event);
	}
}