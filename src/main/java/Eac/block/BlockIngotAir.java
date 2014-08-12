package Eac.block;

import Eac.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockIngotAir extends Block
{
	public BlockIngotAir()
	{
		super(Material.rock);
		setBlockName("blockIair");
		setBlockTextureName(Reference.MOD_ID.toLowerCase() + ":" + "blockIair");
		setStepSound(soundTypeMetal);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(Eac.tabs.Main.tabEac);
	}

}
