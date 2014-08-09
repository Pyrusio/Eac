package Eac.eacItem;

import Eac.lib.ModInfo;
import Eac.lib.Names;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemShadowPick extends ItemPickaxe {
	protected ItemShadowPick(ToolMaterial material)
	{
		super(material);
		setTextureName(ModInfo.ID.toLowerCase() + ":" + "shadowPick");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.ShadowPickaxe_unlocalizedName);
	}
}
