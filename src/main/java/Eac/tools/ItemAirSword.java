package Eac.tools;

import Eac.reference.Reference;
import Eac.reference.Names;
import net.minecraft.item.ItemSword;

public class ItemAirSword extends ItemSword
{
	protected ItemAirSword(ToolMaterial material)
	{
		super(material);
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "airSword");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.AirSword_unlocalizedName);
	}
}
