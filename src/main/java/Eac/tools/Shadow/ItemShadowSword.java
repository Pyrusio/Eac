package Eac.tools.Shadow;

import Eac.reference.Names;
import Eac.reference.Reference;
import net.minecraft.item.ItemSword;

public class ItemShadowSword extends ItemSword {
    public ItemShadowSword(ToolMaterial material) {
        super(material);
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "shadowSword");
        setCreativeTab(Eac.tabs.Main.tabEac);
        setUnlocalizedName(Names.ShadowSword_unlocalizedName);
    }
}
