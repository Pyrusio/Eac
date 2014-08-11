package Eac.eacItem;

import Eac.reference.Reference;
import Eac.reference.Names;
import net.minecraft.item.ItemPickaxe;

public class ItemAirPick extends ItemPickaxe
{
	protected ItemAirPick(ToolMaterial material)
	{
		super(material);
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "airPick");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.AirPickaxe_unlocalizedName);
	}

}
