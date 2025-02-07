package com.neko.syuumatuMod.item.tool;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class ToolPlasticPickaxe extends PickaxeItem {

    public ToolPlasticPickaxe() {
        super(SyuumatuModTiers.PLASTIC, 1, -2.8F, new Properties().fireResistant());
    }
}
