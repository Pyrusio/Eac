package Eac.reference;

import Eac.block.BlockEac;
import Eac.init.ModItems;
import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ic2Recipes {
    public static void init()
    {
        NBTTagCompound oreWashData = new NBTTagCompound();
        oreWashData.setInteger("amount", 1000);
        NBTTagCompound oreThermData = new NBTTagCompound();
        oreThermData.setInteger("minHeat", 1500);

        Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(BlockEac.oreShadow)), null, new ItemStack(ModItems.cdustShadow, 2));
        Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(BlockEac.oreAir)), null, new ItemStack(ModItems.dustAir, 2));
        Recipes.oreWashing.addRecipe(new RecipeInputItemStack(new ItemStack(ModItems.cdustShadow)), oreWashData, new ItemStack(ModItems.pdustShadow));
        Recipes.centrifuge.addRecipe(new RecipeInputItemStack(new ItemStack(ModItems.pdustShadow)), oreThermData, new ItemStack(ModItems.dustShadow));

    }
}
