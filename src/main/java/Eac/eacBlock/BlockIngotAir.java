package Eac.eacBlock;

import Eac.lib.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockIngotAir extends Block
{
	public BlockIngotAir()
	{
		super(Material.rock);
		setBlockName("blockIair");
		setBlockTextureName(ModInfo.ID.toLowerCase() + ":" + "blockIair");
		setStepSound(soundTypeMetal);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(Eac.tabs.Main.tabEac);
	}

}
