package Eac.eacItem;

import Eac.reference.Reference;
import Eac.reference.Names;
import net.minecraft.item.Item;

public class ItemIngotAir extends Item
{

	public ItemIngotAir()
	{
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "ingotAir");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.ingotAir_unlocalizedName);
	}

}
