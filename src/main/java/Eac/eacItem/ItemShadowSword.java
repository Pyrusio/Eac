package Eac.eacItem;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import Eac.lib.ModInfo;
import Eac.lib.Names;

public class ItemShadowSword extends ItemSword {
	protected ItemShadowSword(ToolMaterial material)
	{
		super(material);
		setTextureName(ModInfo.ID.toLowerCase() + ":" + "shadowSword");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.ShadowSword_unlocalizedName);
	}
}
