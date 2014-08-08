package Eac.eacItem;

import Eac.lib.ModInfo;
import Eac.lib.Names;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemEnderStar extends Item
{
	public ItemEnderStar()
	{
		setTextureName(ModInfo.ID.toLowerCase() + ":" + "starEnder");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.enderstar_unlocalizedName);
	}

	public boolean isFull3D()
	{
		return false;
	}
}
