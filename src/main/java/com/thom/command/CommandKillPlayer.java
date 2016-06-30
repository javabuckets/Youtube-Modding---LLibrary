package com.thom.command;

import net.ilexiconn.llibrary.server.command.Command;
import net.ilexiconn.llibrary.server.command.CommandHandler;
import net.ilexiconn.llibrary.server.command.ICommandExecutor;
import net.ilexiconn.llibrary.server.command.argument.CommandArguments;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class CommandKillPlayer implements ICommandExecutor
{
	public CommandKillPlayer(Command command, FMLServerStartingEvent event) 
	{
		command.addRequiredArgument("target", EntityPlayer.class);
		CommandHandler.INSTANCE.registerCommand(event, command, this);
	}
	
	public void execute(MinecraftServer server, ICommandSender sender, CommandArguments arguments) throws CommandException 
	{
		if (arguments.hasArgument("target"))
		{
			EntityPlayerMP player = (EntityPlayerMP) arguments.getArgument("target");
			
			player.onKillCommand();
			player.addChatMessage(new TextComponentString(sender.getName() + " killed you for good, " + player.getName() + "!"));
		}
	}
}