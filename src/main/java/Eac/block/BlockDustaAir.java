package Eac.block;

import Eac.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class BlockDustaAir extends BlockFalling {
    private String privateName = "blockaDair";

    public BlockDustaAir() {
        super(Material.sand);
        setBlockName(privateName);
        setBlockTextureName(Reference.MOD_ID.toLowerCase() + ":" + "blockaDair");
        setStepSound(soundTypeSand);
        setHardness(5.0F);
        setResistance(10.0F);
        setHarvestLevel("shovel", 2);
        setCreativeTab(Eac.tabs.Main.tabEac);
        setLightLevel(0.75F);
        GameRegistry.registerBlock(this, privateName);
    }
}
