package Eac.init;

import Eac.item.Air.ItemDustAir;
import Eac.item.Air.ItemDustAirActiv;
import Eac.item.Air.ItemIngotAir;
import Eac.item.ItemEac;
import Eac.item.Other.ItemEnderPerlite;
import Eac.item.Other.ItemEnderStar;
import Eac.item.Shadow.ItemCDustShadow;
import Eac.item.Shadow.ItemDustShadow;
import Eac.item.Shadow.ItemIngotShadow;
import Eac.item.Shadow.ItemPDustShadow;
import Eac.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModItems
{
    // Air
    public static final ItemEac dustAir = new ItemDustAir();
    public static final ItemEac dustAirAct = new ItemDustAirActiv();
    public static final ItemEac ingotair = new ItemIngotAir();
    // Shadow
    public static final ItemEac cdustShadow = new ItemCDustShadow();
    public static final ItemEac pdustShadow = new ItemPDustShadow();
    public static final ItemEac dustShadow = new ItemDustShadow();
    public static final ItemEac ingotShadow = new ItemIngotShadow();
    // Ender
    public static final ItemEac enderstar = new ItemEnderStar();
    public static final ItemEac enderperlite = new ItemEnderPerlite();

    public static void init()
    {
        // Air
        GameRegistry.registerItem(dustAir, "Air_Dust");
        GameRegistry.registerItem(dustAirAct, "Active_Air_Dust");
        GameRegistry.registerItem(ingotair, "Air_Ingot");
        // Shadow
        GameRegistry.registerItem(cdustShadow, "Shadow_Dust_Crushed");
        GameRegistry.registerItem(pdustShadow, "Shadow_Dust_Purified");
        GameRegistry.registerItem(dustShadow, "Shadow_Dust");
        GameRegistry.registerItem(ingotShadow, "Shadow_Ingot");
        // Ender
        GameRegistry.registerItem(enderstar, "Enderstar");
        GameRegistry.registerItem(enderperlite, "Ender_Perlite");
    }
}
