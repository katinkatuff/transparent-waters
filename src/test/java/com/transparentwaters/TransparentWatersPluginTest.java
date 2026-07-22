package com.transparentwaters;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class TransparentWatersPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(TransparentWatersPlugin.class);
		RuneLite.main(args);
	}
}