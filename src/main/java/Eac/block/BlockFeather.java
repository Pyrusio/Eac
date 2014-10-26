package Eac.block;

import Eac.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFeather extends Block {

    private String privateName = "featherblock";

    public BlockFeather() {
        super(Material.cloth);
        setBlockName(privateName);
        setBlockTextureName(Reference.MOD_ID.toLowerCase() + ":" + privateName);
        setStepSound(soundTypeCloth);
        setHardness(0.8F);
        setResistance(1.0F);
        setCreativeTab(Eac.tabs.Main.tabEac);
        GameRegistry.registerBlock(this, privateName);

    }
}
