package Eac.tools.EnderPerlite;

import Eac.reference.Names;
import Eac.reference.Reference;
import Eac.tabs.Main;
import net.minecraft.item.ItemHoe;

public class ItemEndPerHoe extends ItemHoe
    {
        public ItemEndPerHoe(ToolMaterial material)
        {
            super(material);
            setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "endperHoe");
            setCreativeTab(Main.tabEac);
            setUnlocalizedName(Names.EndPerHoe_unlocalizedName);
        }
    }
