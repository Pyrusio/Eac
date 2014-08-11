package Eac.eacItem;

import Eac.reference.Reference;
import Eac.reference.Names;
import net.minecraft.item.Item;

public class ItemDustAirActiv extends Item
{
	public ItemDustAirActiv()
	{
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "dustAiract");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.actairdust_unlocalizedName);
	}

}
