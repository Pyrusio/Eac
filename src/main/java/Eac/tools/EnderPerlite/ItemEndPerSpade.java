package Eac.tools.EnderPerlite;

import Eac.reference.Names;
import Eac.reference.Reference;
import Eac.tabs.Main;
import net.minecraft.item.ItemSpade;

public class ItemEndPerSpade extends ItemSpade
    {
        public ItemEndPerSpade(ToolMaterial material)
        {
            super(material);
            setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "endperSpade");
            setCreativeTab(Main.tabEac);
            setUnlocalizedName(Names.EndPerSpade_unlocalizedName);
        }
    }