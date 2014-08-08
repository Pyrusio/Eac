package Eac.eacItem;

import Eac.lib.ModInfo;
import Eac.lib.Names;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class ItemAirSword extends ItemSword
{
	protected ItemAirSword(ToolMaterial material)
	{
		super(material);
		setTextureName(ModInfo.ID.toLowerCase() + ":" + "airSword");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.AirSword_unlocalizedName);
	}
}
