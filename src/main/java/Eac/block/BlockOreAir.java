package Eac.block;

import java.util.Random;

import Eac.init.ModItems;
import Eac.tools.ToolsEac;
import Eac.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class BlockOreAir extends Block
{

	public BlockOreAir()
	{
		super(Material.rock);
		setBlockName("oreAir");
		setBlockTextureName(Reference.MOD_ID.toLowerCase() + ":" + "oreAir");
		setStepSound(soundTypePiston);
		setHardness(3.0F);
		setResistance(5.0F);
		setLightLevel(0.5F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(Eac.tabs.Main.tabEac);
    }
}