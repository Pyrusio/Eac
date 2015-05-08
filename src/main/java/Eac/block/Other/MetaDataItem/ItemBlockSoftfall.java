package Eac.block.Other.MetaDataItem;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockSoftfall extends ItemBlock {

    public ItemBlockSoftfall(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {

        String name;
        switch (itemStack.getItemDamage()) {

            case 0:
                name = "t1";
                break;
            case 1:
                name = "t2";
                break;
            case 2:
                name = "t3";
                break;
            case 3:
                name = "t4";
                break;
            case 4:
                name = "t5";
                break;
            case 5:
                name = "t6";
                break;
            case 6:
                name = "t7";
                break;
            default:
                name = "t8";
        }
        return getUnlocalizedName() + "." + name;
    }

    @Override
    public int getMetadata(int meta) {

        return meta;
    }

}
