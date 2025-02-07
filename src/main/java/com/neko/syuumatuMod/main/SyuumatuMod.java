package com.neko.syuumatuMod.main;

import com.neko.syuumatuMod.regi.SyuumatuModItems;
import com.neko.syuumatuMod.regi.tab.SyuumatuModTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("syuumatumod")
public class SyuumatuMod {

    public static final String MOD_ID = "syuumatumod";

    public SyuumatuMod(){

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        SyuumatuModItems.ITEMS.register(bus);
        SyuumatuModTabs.MOD_TABS.register(bus);

    }
}
