package Eac.block;

import Eac.block.tileentity.TileEntityActivationCatalyst;
import Eac.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockActivationCatalyst extends Block implements ITileEntityProvider{

    private String privateName = "activation_catalyst";

    public BlockActivationCatalyst() {
        super(Material.rock);
        setBlockName(privateName);
        setHardness(5.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(Eac.tabs.Main.tabEac);
        GameRegistry.registerBlock(this, privateName);

    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return  new TileEntityActivationCatalyst();
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }

    public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        return false;
    }

        public boolean isOpaqueCube()
    {
        return false;
    }

}
