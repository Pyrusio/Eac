package Eac.tools.Shadow;

import Eac.reference.Names;
import Eac.reference.Reference;
import net.minecraft.item.ItemAxe;

public class ItemShadowAxe extends ItemAxe {

    public ItemShadowAxe(ToolMaterial material) {
        super(material);
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "shadowAxe");
        setCreativeTab(Eac.tabs.Main.tabEac);
        setUnlocalizedName(Names.ShadowAxe_unlocalizedName);
    }
}
