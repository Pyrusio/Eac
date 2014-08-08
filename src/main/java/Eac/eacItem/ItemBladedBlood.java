package Eac.eacItem;

import Eac.lib.ModInfo;
import Eac.lib.Names;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemBladedBlood extends ItemSword
{

	public ItemBladedBlood(ToolMaterial material)
	{
		super(material);
		setTextureName(ModInfo.ID.toLowerCase() + ":" + "bloodDblade");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.bladeDblood_unlocalizedName);
	}

}
