package com.mandatoryfun.ultramegafactory.init;

import com.mandatoryfun.ultramegafactory.item.ItemDustGeneric;
import com.mandatoryfun.ultramegafactory.item.ItemGeneric;
import com.mandatoryfun.ultramegafactory.item.ItemIngotGeneric;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

    public static void init()
    {
        //raw metals

        Ingot.iron = registerIngot("iron_ingot", "Fe", "dEx\u00AE");
        Ingot.steel = registerIngot("steel_ingot", "Fe with less C", "C means \u0A74communism");
        Ingot.enrichedSteel = registerIngot("enriched_steel_ingot", "Fe with almost none of C", "C means \u0A74communism");
        Ingot.copper = registerIngot("copper_ingot", "Cu", "Do not mismatch with rust");
        Ingot.tin = registerIngot("tin_ingot", "Sn", "You can make little tin soldiers", "If you really want", "Cat meal is packed in it");
        Ingot.silver = registerIngot("silver_ingot", "Ag", "You can steal it", "It's very expensive!");
        Ingot.aluminium = registerIngot("aluminium_ingot", "Al", "Do not cook with it!", "If you do not know why", "Ask Uncle Google");
        Ingot.titanium = registerIngot("titanium_ingot", "Ti", "Light but durable metal", "Expensive as Valve\u00AE");
        Ingot.zinc = registerIngot("zinc_ingot", "Zn", "Fairly reactive, ask Alessandro Volta");
        Ingot.antimony = registerIngot("antimony_ingot", "Sb", "Not that big of a deal", "But with tin and lead useful for batteries");
        Ingot.lead = registerIngot("lead_ingot", "Pb", "Who is the leader now?");
        Ingot.cobalt = registerIngot("cobalt_ingot", "Co", "Totally useless", "Microsoft\u00AE");
        Ingot.chrome = registerIngot("chrome_ingot", "Cr", "Used to browse internet");
        Ingot.nickel = registerIngot("nickel_ingot", "Ni", "Metal made from Minecraft\u00AE nicks", "Minecraft is trademark of Microsoft, which also made MSMistake and Falldows");

        //alloys

        Ingot.bronze = registerIngot("bronze_ingot", "3 Cu and 1 Sn", "You get the third place Lame!");
        Ingot.electrum = registerIngot("electrum_ingot", "Au and Ag", "Really good conductor of", "...wait for it...", "electricity!");
        Ingot.brass = registerIngot("brass_ingot", "Cu and Zn");
        Ingot.PbSnSbAlloy = registerIngot("PbSnSb_alloy_ingot", "Pb, Sn and Sb", "Also called battery alloy", "");

    }

    public static class Ingot
    {
        //raw metals

        public static ItemIngotGeneric iron;
        public static ItemIngotGeneric steel;
        public static ItemIngotGeneric enrichedSteel;
        public static ItemIngotGeneric copper;
        public static ItemIngotGeneric tin;
        public static ItemIngotGeneric silver;
        public static ItemIngotGeneric aluminium;
        public static ItemIngotGeneric titanium;
        public static ItemIngotGeneric zinc;
        public static ItemIngotGeneric antimony;
        public static ItemIngotGeneric lead;
        public static ItemIngotGeneric cobalt;
        public static ItemIngotGeneric chrome;
        public static ItemIngotGeneric nickel;

        //alloys

        public static ItemIngotGeneric bronze;
        public static ItemIngotGeneric electrum;
        public static ItemIngotGeneric brass;
        public static ItemIngotGeneric PbSnSbAlloy;
    }

    public static class Dust
    {

    }

    private static ItemGeneric register(String unlocalizedName) {
        ItemGeneric item;
        GameRegistry.registerItem(item = new ItemGeneric(unlocalizedName), unlocalizedName);
        return item;
    }

    private static ItemIngotGeneric registerIngot(String unlocalizedName, String formula, String... description) {
        ItemIngotGeneric item;
        GameRegistry.registerItem(item = new ItemIngotGeneric(unlocalizedName, formula, description), unlocalizedName);
        return item;
    }

    private static ItemDustGeneric registerDust(String unlocalizedName, String formula, String... description) {
        ItemDustGeneric item;
        GameRegistry.registerItem(item = new ItemDustGeneric(unlocalizedName, formula, description), unlocalizedName);
        return item;
    }
}
