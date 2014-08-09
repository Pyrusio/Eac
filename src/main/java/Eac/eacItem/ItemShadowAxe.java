package Eac.eacItem;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import Eac.lib.ModInfo;
import Eac.lib.Names;

public class ItemShadowAxe extends ItemAxe {
	
	protected ItemShadowAxe(ToolMaterial material)
	{
		super(material);
		setTextureName(ModInfo.ID.toLowerCase() + ":" + "shadowAxe");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.ShadowAxe_unlocalizedName);
	}
}
