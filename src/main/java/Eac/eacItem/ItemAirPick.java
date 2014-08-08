package Eac.eacItem;

import Eac.lib.ModInfo;
import Eac.lib.Names;
import net.minecraft.item.ItemPickaxe;

public class ItemAirPick extends ItemPickaxe
{
	protected ItemAirPick(ToolMaterial material)
	{
		super(material);
		setTextureName(ModInfo.ID.toLowerCase() + ":" + "airPick");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.AirPickaxe_unlocalizedName);
	}

}
