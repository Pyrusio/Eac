package Eac.eacItem;

import Eac.reference.Reference;
import Eac.reference.Names;
import net.minecraft.item.Item;

public class ItemDustAir extends Item
{
	public ItemDustAir()
	{
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "dustAir");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.AirDust_unlocalizedName);
	}

}
