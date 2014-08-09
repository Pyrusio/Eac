package Eac.eacItem;

import Eac.lib.ModInfo;
import Eac.lib.Names;
import net.minecraft.item.Item;

public class ItemIngotShadow extends Item {

	public ItemIngotShadow()
	{
		setTextureName(ModInfo.ID.toLowerCase() + ":" + "ingotShadow");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.ingotShadow_unlocalizedName);
	}
}
