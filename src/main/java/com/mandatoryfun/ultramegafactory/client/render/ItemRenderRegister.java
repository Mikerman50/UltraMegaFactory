package com.mandatoryfun.ultramegafactory.client.render;

import com.mandatoryfun.ultramegafactory.init.ModBlocks;
import com.mandatoryfun.ultramegafactory.init.ModItems;
import com.mandatoryfun.ultramegafactory.item.ItemGeneric;
import com.mandatoryfun.ultramegafactory.lib.RefStrings;
import com.mandatoryfun.ultramegafactory.lib.RegistryHelper;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

/**
 * Created by cendr_000 on 25.03.2016.
 */
public class ItemRenderRegister {

    public static void preinit()
    {
        ModelBakery.registerItemVariants(ModItems.Ingot.iron, RegistryHelper.getResource("iron_ingot_t1"), RegistryHelper.getResource("iron_ingot_t2"), RegistryHelper.getResource("iron_ingot_t3"), RegistryHelper.getResource("iron_ingot_t4"), RegistryHelper.getResource("iron_ingot_t5"));
    }

    public static void init() {
        for (ItemGeneric itemGeneric : ModItems.getAllItems())
            if (itemGeneric.getRegisterRender())
                register(itemGeneric);

        register(ModItems.Ingot.iron, 0, "iron_ingot_t1");
        register(ModItems.Ingot.iron, 1, "iron_ingot_t2");
        register(ModItems.Ingot.iron, 2, "iron_ingot_t3");
        register(ModItems.Ingot.iron, 3, "iron_ingot_t4");
        register(ModItems.Ingot.iron, 4, "iron_ingot_t5");
    }

    private static void register(ItemGeneric item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getIdentifier(), "inventory"));
    }

    private static void register(ItemGeneric item, int meta) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(item.getIdentifier(), "inventory"));
    }

    private static void register(ItemGeneric item, int meta, String file) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(RegistryHelper.getResource(file), "inventory"));
    }
}
