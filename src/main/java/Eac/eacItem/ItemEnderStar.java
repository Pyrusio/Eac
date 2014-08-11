package Eac.eacItem;

import Eac.reference.Reference;
import Eac.reference.Names;
import net.minecraft.item.Item;

public class ItemEnderStar extends Item
{
	public ItemEnderStar()
	{
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "starEnder");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.enderstar_unlocalizedName);
	}

	public boolean isFull3D()
	{
		return false;
	}
}
