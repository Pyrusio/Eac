package Eac.eacItem;

import Eac.reference.Reference;
import net.minecraft.item.ItemAxe;
import Eac.reference.Names;

public class ItemAirAxe extends ItemAxe
{
	protected ItemAirAxe(ToolMaterial material)
	{
		super(material);
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "airAxe");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.AirAxe_unlocalizedName);
	}
}
