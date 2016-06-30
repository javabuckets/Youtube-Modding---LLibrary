package com.thom.command;

import net.ilexiconn.llibrary.server.command.Command;
import net.ilexiconn.llibrary.server.command.CommandHandler;
import net.ilexiconn.llibrary.server.command.ICommandExecutor;
import net.ilexiconn.llibrary.server.command.argument.CommandArguments;
import net.minecraft.block.Block;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class CommandMoveBlock implements ICommandExecutor
{
	public CommandMoveBlock(Command command, FMLServerStartingEvent event) 
	{
		command.addRequiredArgument("getX", Integer.class);
		command.addRequiredArgument("getY", Integer.class);
		command.addRequiredArgument("getZ", Integer.class);
		command.addRequiredArgument("setX", Integer.class);
		command.addRequiredArgument("setY", Integer.class);
		command.addRequiredArgument("setZ", Integer.class);
		
		CommandHandler.INSTANCE.registerCommand(event, command, this);
	}

	public void execute(MinecraftServer server, ICommandSender sender, CommandArguments arguments) throws CommandException
	{
		World world = server.getEntityWorld();
		
		int x, y, z;
		x = arguments.getArgument("getX");
		y = arguments.getArgument("getY");
		z = arguments.getArgument("getZ");
		Block getBlock = world.getBlockState(new BlockPos(x, y, z)).getBlock();
		
		int x2, y2, z2;
		x2 = arguments.getArgument("setX");
		y2 = arguments.getArgument("setY");
		z2 = arguments.getArgument("setZ");
		
		world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState());
		world.setBlockState(new BlockPos(x2, y2, z2), getBlock.getDefaultState());
	}
}