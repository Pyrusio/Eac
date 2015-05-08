package Eac.tools.EnderPerlite;

import Eac.reference.Names;
import Eac.reference.Reference;
import Eac.tabs.Main;
import net.minecraft.item.ItemAxe;

public class ItemEndPerAxe extends ItemAxe
    {
        public ItemEndPerAxe(ToolMaterial material)
        {
            super(material);
            setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "endperAxe");
            setCreativeTab(Main.tabEac);
            setUnlocalizedName(Names.EndPerAxe_unlocalizedName);
        }
    }
