package com.neko.syuumatuMod.regi;

import com.neko.syuumatuMod.item.ItemPlasticingot;
import com.neko.syuumatuMod.item.fopd.FoodRation;
import com.neko.syuumatuMod.item.tool.ToolPlasticPickaxe;
import com.neko.syuumatuMod.main.SyuumatuMod;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SyuumatuModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SyuumatuMod.MOD_ID);

    public static final RegistryObject<Item> PLASTIC_INGOT = ITEMS.register("plastic_ingot", ItemPlasticingot::new);

    public static final RegistryObject <PickaxeItem> PLASTIC_PICKAXE = ITEMS.register("plastic_pickaxe", ToolPlasticPickaxe::new);

    public static final RegistryObject<Item> RATION_FOOD = ITEMS.register("ration_food", FoodRation::new);
}
