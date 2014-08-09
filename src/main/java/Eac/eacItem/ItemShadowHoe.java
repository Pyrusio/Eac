package Eac.eacItem;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;
import Eac.lib.ModInfo;
import Eac.lib.Names;

public class ItemShadowHoe extends ItemHoe
{
	protected ItemShadowHoe(ToolMaterial material)
	{
		super(material);
		setTextureName(ModInfo.ID.toLowerCase() + ":" + "shadowHoe");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.ShadowHoe_unlocalizedName);
	}
}
