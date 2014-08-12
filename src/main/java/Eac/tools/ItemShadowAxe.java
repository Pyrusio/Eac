package Eac.tools;

import Eac.reference.Reference;
import net.minecraft.item.ItemAxe;
import Eac.reference.Names;

public class ItemShadowAxe extends ItemAxe {
	
	protected ItemShadowAxe(ToolMaterial material)
	{
		super(material);
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "shadowAxe");
		setCreativeTab(Eac.tabs.Main.tabEac);
		setUnlocalizedName(Names.ShadowAxe_unlocalizedName);
	}
}
