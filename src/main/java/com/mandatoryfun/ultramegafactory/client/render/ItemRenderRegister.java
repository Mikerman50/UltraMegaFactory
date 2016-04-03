package com.mandatoryfun.ultramegafactory.client.render;

import com.mandatoryfun.ultramegafactory.init.ModItems;
import com.mandatoryfun.ultramegafactory.item.ItemGeneric;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

/**
 * Created by cendr_000 on 25.03.2016.
 */
public class ItemRenderRegister {

    public static void init() {
        for (ItemGeneric itemGeneric : ModItems.getAllItems())
            if (itemGeneric.getRegisterRender())
                register(itemGeneric);

        register(ModItems.Ingot.iron, 0);
        register(ModItems.Ingot.iron, 1);
        register(ModItems.Ingot.iron, 2);
        register(ModItems.Ingot.iron, 3);
        register(ModItems.Ingot.iron, 4);
    }

    private static void register(ItemGeneric item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getIdentifier(), "inventory"));
    }

    private static void register(ItemGeneric item, int meta) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(item.getIdentifier(), "inventory"));
    }
}