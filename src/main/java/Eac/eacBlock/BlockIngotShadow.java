package Eac.eacBlock;

import Eac.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockIngotShadow extends Block
{
	public BlockIngotShadow()
	{
		super(Material.rock);
		setBlockName("blockIshadow");
		setBlockTextureName(Reference.MOD_ID.toLowerCase() + ":" + "blockIshadow");
		setStepSound(soundTypeMetal);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(Eac.tabs.Main.tabEac);
	}
}
