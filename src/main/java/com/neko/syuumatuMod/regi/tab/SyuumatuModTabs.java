package com.neko.syuumatuMod.regi.tab;

import com.neko.syuumatuMod.main.SyuumatuMod;
import com.neko.syuumatuMod.regi.SyuumatuModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.checkerframework.checker.units.qual.C;

public class SyuumatuModTabs {

    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SyuumatuMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SYUUMATU_MAIN =MOD_TABS.register("syuumatu_main",
            ()-> {return CreativeModeTab.builder()
                    .icon(()->new ItemStack(SyuumatuModItems.PLASTIC_INGOT.get()))
                    .title(Component.translatable("itemGroup.syuumatu_main"))
                    .displayItems((param,output)->{
                        for(Item item:syuumatuMain.items){
                            output.accept(item);
                        }
                    })
                    .build();
    });
}
