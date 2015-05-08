package Eac.tools.Shadow;

import Eac.reference.Names;
import Eac.reference.Reference;
import net.minecraft.item.ItemSpade;

public class ItemShadowSpade extends ItemSpade {
    public ItemShadowSpade(ToolMaterial material) {
        super(material);
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "shadowSpade");
        setCreativeTab(Eac.tabs.Main.tabEac);
        setUnlocalizedName(Names.ShadowSpade_unlocalizedName);
    }
}
