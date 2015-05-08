package Eac.tools.Air;

import Eac.reference.Names;
import Eac.reference.Reference;
import net.minecraft.item.ItemSword;

public class ItemAirSword extends ItemSword {
    public ItemAirSword(ToolMaterial material) {
        super(material);
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "airSword");
        setCreativeTab(Eac.tabs.Main.tabEac);
        setUnlocalizedName(Names.AirSword_unlocalizedName);
    }
}
