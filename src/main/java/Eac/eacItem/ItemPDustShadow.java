package Eac.eacItem;

import Eac.reference.Names;
import Eac.reference.Reference;
import net.minecraft.item.Item;

public class ItemPDustShadow extends Item
{
    public ItemPDustShadow()
    {
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "itemPurifiedCrushedShadowOre");
        setCreativeTab(Eac.tabs.Main.tabEac);
        setUnlocalizedName(Names.ShadowPDust_unlocalizedName);
    }
}
