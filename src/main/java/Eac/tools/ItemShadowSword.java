package Eac.tools;

import Eac.reference.Reference;
import net.minecraft.item.ItemSword;
import Eac.reference.Names;

public class ItemShadowSword extends ItemSword {
	protected ItemShadowSword(ToolMaterial material)
	{
		super(material);
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "shadowSword");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.ShadowSword_unlocalizedName);
	}
}
