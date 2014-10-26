package Eac.block;

import Eac.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class BlockOreShadow extends Block {

    private String privateName = "oreShadow";

    public BlockOreShadow() {
        super(Material.rock);
        setBlockName(privateName);
        setBlockTextureName(Reference.MOD_ID.toLowerCase() + ":" + privateName);
        setStepSound(soundTypePiston);
        setHardness(20.0F);
        setResistance(10000.0F);
        setLightLevel(0.0F);
        setHarvestLevel("pickaxe", 3);
        setCreativeTab(Eac.tabs.Main.tabEac);
        GameRegistry.registerBlock(this, privateName);
    }
}
