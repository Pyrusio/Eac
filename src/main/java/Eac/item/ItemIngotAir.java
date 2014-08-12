package Eac.item;

import Eac.reference.Reference;
import Eac.reference.Names;
import Eac.tabs.Main;
import net.minecraft.item.Item;

public class ItemIngotAir extends Item
{

	public ItemIngotAir()
	{
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "ingotAir");
		setCreativeTab(Main.tabEac);
		setUnlocalizedName(Names.ingotAir_unlocalizedName);
	}

}
