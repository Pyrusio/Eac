package Eac.block.Air;

import Eac.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class BlockDustAir extends BlockFalling {

    private String privateName = "blockDair";

    public BlockDustAir() {
        super(Material.sand);
        setBlockName(privateName);
        setBlockTextureName(Reference.MOD_ID.toLowerCase() + ":" + privateName);
        setStepSound(soundTypeSand);
        setHardness(5.0F);
        setResistance(10.0F);
        setHarvestLevel("shovel", 2);
        setCreativeTab(Eac.tabs.Main.tabEac);
        GameRegistry.registerBlock(this, privateName);
    }
}
