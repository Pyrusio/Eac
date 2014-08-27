package Eac.init;

import Eac.item.*;
import Eac.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemEac dustShadow = new ItemDustShadow();
    public static final ItemEac dustAir = new ItemDustAir();
    public static final ItemEac dustAirAct = new ItemDustAirActiv();
    public static final ItemEac cdustShadow = new ItemCDustShadow();
    public static final ItemEac pdustShadow = new ItemPDustShadow();
    public static final ItemEac ingotShadow = new ItemIngotShadow();
    public static final ItemEac enderstar = new ItemEnderStar();
    public static final ItemEac ingotair = new ItemIngotAir();
    public static final ItemEac enderperlite = new ItemEnderPerlite();

    public static void init()
    {
        GameRegistry.registerItem(dustShadow, "Shadow_Dust");
        GameRegistry.registerItem(cdustShadow, "Shadow_Dust_Crushed");
        GameRegistry.registerItem(pdustShadow, "Shadow_Dust_Purified");
        GameRegistry.registerItem(ingotShadow, "Shadow_Ingot");
        GameRegistry.registerItem(dustAir, "Air_Dust");
        GameRegistry.registerItem(dustAirAct, "Active_Air_Dust");
        GameRegistry.registerItem(enderstar, "Enderstar");
        GameRegistry.registerItem(ingotair, "Air_Ingot");
        GameRegistry.registerItem(enderperlite, "Ender_Perlite");
    }
}
