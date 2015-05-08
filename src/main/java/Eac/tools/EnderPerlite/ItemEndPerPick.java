package Eac.tools.EnderPerlite;

import Eac.reference.Names;
import Eac.reference.Reference;
import Eac.tabs.Main;
import net.minecraft.item.ItemPickaxe;

public class ItemEndPerPick extends ItemPickaxe
{
    public ItemEndPerPick(ToolMaterial material)
    {
        super(material);
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "endperPick");
        setCreativeTab(Main.tabEac);
        setUnlocalizedName(Names.EndPerPickaxe_unlocalizedName);
    }
}
