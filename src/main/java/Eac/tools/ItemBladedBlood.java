package Eac.tools;

import Eac.reference.Reference;
import Eac.reference.Names;
import net.minecraft.item.ItemSword;

public class ItemBladedBlood extends ItemSword
{

	public ItemBladedBlood(ToolMaterial material)
	{
		super(material);
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "bloodDblade");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.bladeDblood_unlocalizedName);
	}

}
