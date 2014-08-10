package Eac.eacBlock;

import Eac.lib.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOreShadow extends Block {

	public BlockOreShadow() {
		super(Material.rock);
		setBlockName("oreShadow");
		setBlockTextureName(ModInfo.ID.toLowerCase() + ":" + "oreShadow");
		setStepSound(soundTypePiston);
		setHardness(20.0F);
		setResistance(10000.0F);
		setLightLevel(0.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(Eac.tabs.Main.tabEac);
	}
}
