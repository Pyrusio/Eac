package Eac.eacItem;

import Eac.lib.ModInfo;
import Eac.lib.Names;
import net.minecraft.item.Item;

public class ItemIngotAir extends Item
{

	public ItemIngotAir()
	{
		setTextureName(ModInfo.ID.toLowerCase() + ":" + "ingotAir");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.ingotAir_unlocalizedName);
	}

}
