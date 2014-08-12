package Eac.init;

import Eac.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemEac dustShadow = new ItemDustShadow();
    public static final ItemEac dustAir = new ItemDustAir();
    public static final ItemEac cdustShadow = new ItemCDustShadow();
    public static final ItemEac pdustShadow = new ItemPDustShadow();
    public static final ItemEac ingotShadow = new ItemIngotShadow();

    public static void init()
    {
        GameRegistry.registerItem(dustShadow, "Shadow_Dust");
        GameRegistry.registerItem(cdustShadow, "Shadow_Dust_Crushed");
        GameRegistry.registerItem(pdustShadow, "Shadow_Dust_Purified");
        GameRegistry.registerItem(ingotShadow, "Shadow_Ingot");
        GameRegistry.registerItem(dustAir, "Air_Dust");
    }
}
