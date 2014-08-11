package Eac.eacItem;

import Eac.reference.Reference;
import net.minecraft.item.ItemHoe;
import Eac.reference.Names;

public class ItemShadowHoe extends ItemHoe
{
	protected ItemShadowHoe(ToolMaterial material)
	{
		super(material);
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "shadowHoe");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.ShadowHoe_unlocalizedName);
	}
}
