package Eac.block;

import Eac.reference.Reference;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class BlockDustAir extends BlockFalling
{
	public BlockDustAir()
	{
		super(Material.sand);
		setBlockName("blockDair");
		setBlockTextureName(Reference.MOD_ID.toLowerCase() + ":" + "blockDair");
		setStepSound(soundTypeSand);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("shovel", 2);
		setCreativeTab(Eac.tabs.Main.tabEac);
	}
}
