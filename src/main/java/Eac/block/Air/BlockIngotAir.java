package Eac.block.Air;

import Eac.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockIngotAir extends Block {

    private String privateName = "blockIair";

    public BlockIngotAir() {
        super(Material.rock);
        setBlockName(privateName);
        setBlockTextureName(Reference.MOD_ID.toLowerCase() + ":" + privateName);
        setStepSound(soundTypeMetal);
        setHardness(5.0F);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(Eac.tabs.Main.tabEac);
        GameRegistry.registerBlock(this, privateName);
    }

}
