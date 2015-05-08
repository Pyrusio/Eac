package Eac.block.Other;

import Eac.block.Other.MetaDataItem.ItemBlockSoftfall;
import Eac.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockSoftfall extends Block {

    private String privateName = "softFaller";
    private int maxMeta = 8;

    private IIcon[] icons;

    public BlockSoftfall() {
        super(Material.rock);
        setBlockName(privateName);
        setBlockTextureName(Reference.MOD_ID.toLowerCase() + ":" + privateName);
        setStepSound(soundTypePiston);
        setHardness(3.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe", 2);
        icons = new IIcon[maxMeta];
        GameRegistry.registerBlock(this, ItemBlockSoftfall.class, privateName);
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {

        for (int i = 0; i < icons.length; i++) {

            icons[i] = iconRegister.registerIcon(Reference.MOD_ID + ":" + privateName + i);
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {

        switch (meta) {
            case 0:
                return icons[0];
            case 1:
                return icons[1];
            case 2:
                return icons[2];
            case 3:
                return icons[3];
            case 4:
                return icons[4];
            case 5:
                return icons[5];
            case 6:
                return icons[6];
            case 7:
                return icons[7];
            default: {
                return icons[0];
            }
        }
    }

    @Override
    public int damageDropped(int meta) {

        return meta;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {

        for (int i = 0; i < maxMeta; i++) {

            list.add(new ItemStack(item, 1, i));
        }
    }
}
