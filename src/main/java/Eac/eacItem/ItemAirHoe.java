package Eac.eacItem;

import Eac.lib.ModInfo;
import Eac.lib.Names;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemAirHoe extends ItemHoe
{
	protected ItemAirHoe(ToolMaterial material)
	{
		super(material);
		setTextureName(ModInfo.ID.toLowerCase() + ":" + "airHoe");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.AirHoe_unlocalizedName);
	}
}
