package Eac.block.Shadow;

import Eac.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockIngotShadow extends Block {

    private String privateName = "blockIshadow";

    public BlockIngotShadow() {
        super(Material.rock);
        setBlockName(privateName);
        setBlockTextureName(Reference.MOD_ID.toLowerCase() + ":" + privateName);
        setStepSound(soundTypeMetal);
        setHardness(5.0F);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", 3);
        setCreativeTab(Eac.tabs.Main.tabEac);
        GameRegistry.registerBlock(this, privateName);
    }
}
