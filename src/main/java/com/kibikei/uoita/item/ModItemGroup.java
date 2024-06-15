package com.kibikei.uoita.item;


import com.kibikei.uoita.Uoita;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup UOITA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Uoita.MOD_ID,"uoita_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.uoita_group"))
                    .icon(()->new ItemStack(ModItems.WAND)).entries((displayContext, entries) -> {
                        entries.add(ModItems.WAND);
                    }).build());
    public static void registerModItemGroup(){

    }
}
