package Eac.eacBlock;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import Eac.lib.ModInfo;

public class BlockDustAir extends BlockFalling
{
	public BlockDustAir()
	{
		super(Material.sand);
		setBlockName("blockDair");
		setBlockTextureName(ModInfo.ID.toLowerCase() + ":" + "blockDair");
		setStepSound(soundTypeSand);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("shovel", 2);
		setCreativeTab(Eac.tabs.Main.tabEac);
	}
}
