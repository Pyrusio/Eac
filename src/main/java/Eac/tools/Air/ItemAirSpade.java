package Eac.tools.Air;

import Eac.reference.Names;
import Eac.reference.Reference;
import net.minecraft.item.ItemSpade;

public class ItemAirSpade extends ItemSpade {
    public ItemAirSpade(ToolMaterial material) {
        super(material);
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "airSpade");
        setCreativeTab(Eac.tabs.Main.tabEac);
        setUnlocalizedName(Names.AirSpade_unlocalizedName);
    }
}
