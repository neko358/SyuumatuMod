package com.io.github.io.github.avidfan.syuumatuMod.item.fopd;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FoodRation extends Item {
    public FoodRation() {
        super(new Properties().food(SyuumatuModFoods.RATION_FOOD));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> list, TooltipFlag  flag){
        list.add(Component.translatable(this.getDescriptionId() + ".desc1"));
    }
}
