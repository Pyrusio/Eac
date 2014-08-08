package Eac.eacItem;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import Eac.lib.ModInfo;
import Eac.lib.Names;

public class ItemAirSpade extends ItemSpade
{
	protected ItemAirSpade(ToolMaterial material)
	{
		super(material);
		setTextureName(ModInfo.ID.toLowerCase() + ":" + "airSpade");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.AirSpade_unlocalizedName);
	}
}
