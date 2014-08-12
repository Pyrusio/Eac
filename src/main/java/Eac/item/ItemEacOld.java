package Eac.item;

import Eac.Eac;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemEacOld extends Eac
{

    public static void init()
    {
        // Items
        enderstar = new ItemEnderStar();
//        dustair = new ItemDustAir();
        dustairact = new ItemDustAirActiv();
        ingotair = new ItemIngotAir();
//        ingotshadow = new ItemIngotShadow();
//        dustshadow = new ItemDustShadow();
//        cdustshadow = new ItemCDustShadow();
//        pdustshadow = new ItemPDustShadow();

        GameRegistry.registerItem(enderstar, "Enderstar");
//        GameRegistry.registerItem(dustair, "Air_Dust");
        GameRegistry.registerItem(dustairact, "Active_Air_Dust");
        GameRegistry.registerItem(ingotair, "Air_Ingot");
//        GameRegistry.registerItem(ingotshadow, "Shadow_Ingot");
//        GameRegistry.registerItem(dustshadow, "Shadow_Dust");
//        GameRegistry.registerItem(cdustshadow, "Shadow_Dust_Crushed");
//        GameRegistry.registerItem(pdustshadow, "Shadow_Dust_Purified");
    }
}
