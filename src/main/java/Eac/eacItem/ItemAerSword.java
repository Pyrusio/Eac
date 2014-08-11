package Eac.eacItem;

import Eac.reference.Reference;
import Eac.reference.Names;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemAerSword extends ItemSword
{

	public ItemAerSword(ToolMaterial material)
	{
		super(material);
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "aerSword");
		setCreativeTab(CreativeTabs.tabCombat);
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.AerialSword_unlocalizedName);
	}

}
