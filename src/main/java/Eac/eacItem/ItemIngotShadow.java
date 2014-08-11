package Eac.eacItem;

import Eac.reference.Reference;
import Eac.reference.Names;
import net.minecraft.item.Item;

public class ItemIngotShadow extends Item {

	public ItemIngotShadow()
	{
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "ingotShadow");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.ingotShadow_unlocalizedName);
	}
}
