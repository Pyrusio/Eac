package Eac.eacItem;

import Eac.reference.Reference;
import Eac.reference.Names;
import net.minecraft.item.ItemPickaxe;

public class ItemShadowPick extends ItemPickaxe {
	protected ItemShadowPick(ToolMaterial material)
	{
		super(material);
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "shadowPick");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.ShadowPickaxe_unlocalizedName);
	}
}
