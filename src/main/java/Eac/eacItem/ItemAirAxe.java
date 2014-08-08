package Eac.eacItem;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import Eac.lib.ModInfo;
import Eac.lib.Names;

public class ItemAirAxe extends ItemAxe
{
	protected ItemAirAxe(ToolMaterial material)
	{
		super(material);
		setTextureName(ModInfo.ID.toLowerCase() + ":" + "airAxe");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.AirAxe_unlocalizedName);
	}
}
