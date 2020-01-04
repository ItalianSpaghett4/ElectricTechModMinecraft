package com.mukasz.electrictech;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ElectricTech.MODID, name = ElectricTech.NAME,version = ElectricTech.VERSION, acceptedMinecraftVersions = ElectricTech.MC_VERSION)
public class ElectricTech {
	
	public static final String MODID = "electrictech";
	public static final String NAME = "ElectricTech";
	public static final String VERSION = "0.0.1";
	public static final String MC_VERSION = "[1.12.2]";
	
	public static final Logger LOGGER = LogManager.getLogger(ElectricTech.MODID);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info(ElectricTech.NAME + "Witaj przywo�ywaczu!");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	
	
}