package Eac.eacBlock;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import Eac.lib.ModInfo;

public class BlockDustaAir extends BlockFalling
{
	public BlockDustaAir()
	{
		super(Material.sand);
		setBlockName("blockaDair");
		setBlockTextureName(ModInfo.ID.toLowerCase() + ":" + "blockaDair");
		setStepSound(soundTypeSand);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("shovel", 2);
		setCreativeTab(Eac.tabs.Main.tabEac);
		setLightLevel(0.75F);
	}
}
