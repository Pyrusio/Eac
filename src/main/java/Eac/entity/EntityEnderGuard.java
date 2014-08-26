package Eac.entity;

import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityEnderGuard extends EntityEnderman {

    public EntityEnderGuard(World par1World)
    {
        super(par1World);
    }

    @Override
    protected Item getDropItem()
    {
        return Item.getItemFromBlock(Blocks.end_stone);
    }

    @Override
    public boolean getCanSpawnHere(){
        return this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && this.isValidLightLevel() && super.getCanSpawnHere();
    }
}