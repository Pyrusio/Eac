package Eac.eacItem;

import Eac.lib.ModInfo;
import Eac.lib.Names;
import net.minecraft.item.Item;

public class ItemDustAirActiv extends Item
{
	public ItemDustAirActiv()
	{
		setTextureName(ModInfo.ID.toLowerCase() + ":" + "dustAiract");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.actairdust_unlocalizedName);
	}

}
