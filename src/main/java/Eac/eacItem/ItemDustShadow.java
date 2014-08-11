package Eac.eacItem;

import Eac.reference.Names;
import Eac.reference.Reference;
import net.minecraft.item.Item;


public class ItemDustShadow extends Item
{
    public ItemDustShadow()
    {
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "dustShadow");
        setCreativeTab(Eac.tabs.Main.tabEac);
        setUnlocalizedName(Names.ShadowDust_unlocalizedName);
    }
}
