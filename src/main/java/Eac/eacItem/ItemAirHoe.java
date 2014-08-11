package Eac.eacItem;

import Eac.reference.Reference;
import Eac.reference.Names;
import net.minecraft.item.ItemHoe;

public class ItemAirHoe extends ItemHoe
{
	protected ItemAirHoe(ToolMaterial material)
	{
		super(material);
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "airHoe");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.AirHoe_unlocalizedName);
	}
}
