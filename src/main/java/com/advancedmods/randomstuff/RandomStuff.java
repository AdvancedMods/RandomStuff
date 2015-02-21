package com.advancedmods.randomstuff;

import com.advancedmods.randomstuff.core.RSProps;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Dennisbonke on 21-2-2015.
 */
@Mod(name = RSProps.name, modid = RSProps.modid, version = RSProps.version, canBeDeactivated = false)
public class RandomStuff {

    @Instance(RSProps.modid)
    public static RandomStuff instance;
    public static final Logger log = LogManager.getLogger("RandomStuff");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {



    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {



    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {



    }

}
