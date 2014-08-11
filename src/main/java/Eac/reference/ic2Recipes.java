package Eac.reference;

import Eac.eacItem.eacItem;
import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ic2Recipes {
    public static void init()
    {
        NBTTagCompound oreWashData = new NBTTagCompound();
        oreWashData.setInteger("amount", 1000);
        NBTTagCompound oreThermData = new NBTTagCompound();
        oreThermData.setInteger("minHeat", 1500);

        Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(eacItem.oreShadow)), null, new ItemStack(eacItem.cdustshadow, 2));
        Recipes.oreWashing.addRecipe(new RecipeInputItemStack(new ItemStack(eacItem.cdustshadow)), oreWashData, new ItemStack(eacItem.pdustshadow));
        Recipes.centrifuge.addRecipe(new RecipeInputItemStack(new ItemStack(eacItem.pdustshadow)), oreThermData, new ItemStack(eacItem.dustshadow));

    }
}
