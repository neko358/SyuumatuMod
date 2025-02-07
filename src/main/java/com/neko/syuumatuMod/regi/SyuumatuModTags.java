package com.neko.syuumatuMod.regi;

import com.neko.syuumatuMod.main.SyuumatuMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class SyuumatuModTags {

    public static class Blocks{

        public static final TagKey<Block> NEEDS_PLASTIC_TOOL = tag("needs_plastic_tool");
        private static TagKey<Block> tag (String name){
            return BlockTags.create(new ResourceLocation(SyuumatuMod.MOD_ID,name));
        }
    }

    public static class Items{

        public static final TagKey<Item> SYUUMATU_SERIES = tag("syuumatu_series");
        private static TagKey<Item> tag (String name){
            return ItemTags.create(new ResourceLocation(SyuumatuMod.MOD_ID,name));
        }
    }
}
