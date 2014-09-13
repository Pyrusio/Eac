package Eac.block;

import Eac.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockEnderPerlite extends Block
{
    public BlockEnderPerlite()
    {
        super(Material.rock);
        setBlockName("enderperlite");
        setBlockTextureName(Reference.MOD_ID.toLowerCase() + ":" + "enderperliteblock");
        setStepSound(soundTypePiston);
        setHardness(3.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(Eac.tabs.Main.tabEac);
    }
}
