package Eac.tools.Air;

import Eac.reference.Names;
import Eac.reference.Reference;
import net.minecraft.item.ItemHoe;

public class ItemAirHoe extends ItemHoe {
    public ItemAirHoe(ToolMaterial material) {
        super(material);
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "airHoe");
        setCreativeTab(Eac.tabs.Main.tabEac);
        setUnlocalizedName(Names.AirHoe_unlocalizedName);
    }
}
