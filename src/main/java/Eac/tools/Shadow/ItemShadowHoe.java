package Eac.tools.Shadow;

import Eac.reference.Names;
import Eac.reference.Reference;
import net.minecraft.item.ItemHoe;

public class ItemShadowHoe extends ItemHoe {
    public ItemShadowHoe(ToolMaterial material) {
        super(material);
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "shadowHoe");
        setCreativeTab(Eac.tabs.Main.tabEac);
        setUnlocalizedName(Names.ShadowHoe_unlocalizedName);
    }
}
