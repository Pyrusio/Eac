package Eac.eacItem;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import Eac.lib.ModInfo;
import Eac.lib.Names;

public class ItemShadowSpade extends ItemSpade
{
	protected ItemShadowSpade(ToolMaterial material)
	{
		super(material);
		setTextureName(ModInfo.ID.toLowerCase() + ":" + "shadowSpade");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.ShadowSpade_unlocalizedName);
	}
}
