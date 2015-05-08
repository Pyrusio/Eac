package Eac.block.Other;

import Eac.block.Other.tileentity.TileEntityActivationCatalyst;
import Eac.client.gui.GuiActivator;
import Eac.reference.Reference;
import Eac.util.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class BlockActivationCatalyst extends Block implements ITileEntityProvider {

    private String privateName = "activation_catalyst";

    public BlockActivationCatalyst() {
        super(Material.rock);
        setBlockName(privateName);
        setBlockTextureName(Reference.MOD_ID.toLowerCase() + ":" + privateName);
        setHardness(5.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(Eac.tabs.Main.tabEac);
        GameRegistry.registerBlock(this, privateName);

    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityActivationCatalyst();
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }

    public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l) {
        return false;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
        player.openGui(Reference.MOD_ID, 0, world, x, y, z);
        LogHelper.info("GUI");
        if (!world.isRemote) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiActivator());
        }
        return true;
    }

}

