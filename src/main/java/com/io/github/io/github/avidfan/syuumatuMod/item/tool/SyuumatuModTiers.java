package com.io.github.io.github.ユーザー名.syuumatuMod.item.tool;

import com.io.github.io.github.ユーザー名.syuumatuMod.main.SyuumatuMod;
import com.io.github.io.github.ユーザー名.syuumatuMod.regi.SyuumatuModItems;
import com.io.github.io.github.ユーザー名.syuumatuMod.regi.SyuumatuModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class SyuumatuModTiers {

    public static final ForgeTier PLASTIC = new ForgeTier(3,750,7.0F,3.0F,10,SyuumatuModTags.Blocks.NEEDS_PLASTIC_TOOL,()-> Ingredient.of(SyuumatuModItems.PLASTIC_INGOT.get()));

    static {
        TierSortingRegistry.registerTier(PLASTIC,new ResourceLocation(SyuumatuMod.MOD_ID,"plastic"), List.of(Tiers.IRON),List.of(Tiers.DIAMOND));
    }
}
