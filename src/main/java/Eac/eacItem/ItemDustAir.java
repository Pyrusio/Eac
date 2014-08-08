package Eac.eacItem;

import Eac.lib.ModInfo;
import Eac.lib.Names;
import net.minecraft.item.Item;

public class ItemDustAir extends Item
{
	public ItemDustAir()
	{
		setTextureName(ModInfo.ID.toLowerCase() + ":" + "dustAir");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.AirDust_unlocalizedName);
	}

}
