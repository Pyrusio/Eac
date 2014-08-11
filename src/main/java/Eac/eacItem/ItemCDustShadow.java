package Eac.eacItem;

import Eac.reference.Names;
import Eac.reference.Reference;
import net.minecraft.item.Item;

public class ItemCDustShadow extends Item
{
    public ItemCDustShadow()
    {
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "itemCrushedShadowOre");
        setCreativeTab(Eac.tabs.Main.tabEac);
        setUnlocalizedName(Names.ShadowCDust_unlocalizedName);
    }
}
