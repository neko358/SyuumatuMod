package com.neko.syuumatuMod.item;

import com.neko.syuumatuMod.regi.SyuumatuModTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ItemPlasticingot extends Item {
    public ItemPlasticingot() {
        super(new Properties()
                .fireResistant()
                .stacksTo(64)
        );
    }
}
