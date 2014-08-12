package Eac.tools;

import Eac.reference.Reference;
import net.minecraft.item.ItemSpade;
import Eac.reference.Names;

public class ItemAirSpade extends ItemSpade
{
	protected ItemAirSpade(ToolMaterial material)
	{
		super(material);
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "airSpade");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.AirSpade_unlocalizedName);
	}
}
