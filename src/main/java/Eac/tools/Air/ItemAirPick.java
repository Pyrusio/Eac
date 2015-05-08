package Eac.tools.Air;

import Eac.reference.Names;
import Eac.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemAirPick extends ItemPickaxe {
    public ItemAirPick(ToolMaterial material) {
        super(material);
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "airPick");
        setCreativeTab(Eac.tabs.Main.tabEac);
        setUnlocalizedName(Names.AirPickaxe_unlocalizedName);
    }

}
