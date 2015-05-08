package Eac.tools.EnderPerlite;

import Eac.reference.Names;
import Eac.reference.Reference;
import Eac.tabs.Main;
import net.minecraft.item.ItemSword;

public class ItemEndPerSword extends ItemSword
    {
        public ItemEndPerSword(ToolMaterial material)
        {
            super(material);
            setTextureName(Reference.MOD_ID.toLowerCase() + ":" + "endperSword");
            setCreativeTab(Main.tabEac);
            setUnlocalizedName(Names.EndPerSword_unlocalizedName);
        }
    }