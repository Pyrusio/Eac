package Eac.tools.Shadow;

import Eac.reference.Names;
import Eac.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemShadowPick extends ItemPickaxe {
    public ItemShadowPick(ToolMaterial material) {
        super(material);
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "shadowPick");
        setCreativeTab(Eac.tabs.Main.tabEac);
        setUnlocalizedName(Names.ShadowPickaxe_unlocalizedName);
    }
}
