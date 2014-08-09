package Eac.eacBlock;

import java.util.Random;

import Eac.eacItem.eacItem;
import Eac.lib.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockOreAir extends Block
{

	public BlockOreAir()
	{
		super(Material.rock);
		setBlockName("oreAir");
		setBlockTextureName(ModInfo.ID.toLowerCase() + ":" + "oreAir");
		setStepSound(soundTypePiston);
		setHardness(3.0F);
		setResistance(5.0F);
		setLightLevel(0.5F);
		setHarvestLevel("pickaxe", 2);

	}

	@Override
	public Item getItemDropped(int metadata, Random random, int fortune)
	{
		return eacItem.dustair;
	}
}