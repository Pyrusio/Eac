package Eac.eacItem;

import Eac.reference.Reference;
import net.minecraft.item.ItemSpade;
import Eac.reference.Names;

public class ItemShadowSpade extends ItemSpade
{
	protected ItemShadowSpade(ToolMaterial material)
	{
		super(material);
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "shadowSpade");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.ShadowSpade_unlocalizedName);
	}
}
