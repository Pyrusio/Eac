package Eac.tools.Air;

import Eac.reference.Names;
import Eac.reference.Reference;
import net.minecraft.item.ItemAxe;

public class ItemAirAxe extends ItemAxe {
    public ItemAirAxe(ToolMaterial material) {
        super(material);
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "airAxe");
        setCreativeTab(Eac.tabs.Main.tabEac);
        setUnlocalizedName(Names.AirAxe_unlocalizedName);
    }
}
