package Eac.reference.Recipes;

import Eac.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class EnderperliteR extends Recipes{
    public static void recipe(){
        GameRegistry.addRecipe(new ItemStack(benderperlite, 2), new Object[]{
                "xx",
                "xx",
                'x', ModItems.enderperlite});
        //Tools
        GameRegistry.addRecipe(new ItemStack(endperaxe), new Object[]{
                "EE",
                "SE",
                "S ",
                'E', ModItems.enderperlite, 'S', Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(endperaxe), new Object[]{
                "EE",
                "ES",
                " S",
                'E', ModItems.enderperlite, 'S', Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(endperpick), new Object[]{
                "EEE",
                " S ",
                " S ",
                'E', ModItems.enderperlite, 'S', Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(endperspade), new Object[]{
                "E",
                "S",
                "S",
                'E', ModItems.enderperlite, 'S', Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(endpersword), new Object[]{
                "E",
                "E",
                "S",
                'E', ModItems.enderperlite, 'S', Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(endperhoe), new Object[]{
                "EE",
                "S ",
                "S ",
                'E', ModItems.enderperlite, 'S', Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(endperhoe), new Object[]{
                "EE",
                " S",
                " S",
                'E', ModItems.enderperlite, 'S', Items.stick
        });
        //armour
        GameRegistry.addRecipe(new ItemStack(endperHelmet), new Object[]{
                "EEE",
                "E E",
                'E', ModItems.enderperlite
        });
        GameRegistry.addRecipe(new ItemStack(endperChestPlate), new Object[]{
                "E E",
                "EEE",
                "EEE",
                'E', ModItems.enderperlite
        });
        GameRegistry.addRecipe(new ItemStack(endperLegs), new Object[]{
                "EEE",
                "E E",
                "E E",
                'E', ModItems.enderperlite
        });
        GameRegistry.addRecipe(new ItemStack(endperBoots), new Object[]{
                "E E",
                "E E",
                'E', ModItems.enderperlite
        });
        GameRegistry.addRecipe(new ItemStack(ModItems.cEnderperlite), new Object[]{
                "FDF",
                "DMX",
                "GSD",
                'F', Items.flint_and_steel, 'D', Items.diamond, 'M', ModItems.mEnderperlite, 'X', Items.flint, 'G', Blocks.gold_block, 'S', Items.diamond_sword
        });
        GameRegistry.addRecipe(new ItemStack(ModItems.cEnderperlite), new Object[]{
                "FDF",
                "XMD",
                "GSD",
                'F', Items.flint_and_steel, 'D', Items.diamond, 'M', ModItems.mEnderperlite, 'X', Items.flint, 'G', Blocks.gold_block, 'S', Items.diamond_sword
        });
        //TODO Should only be when ic2 is missing
        GameRegistry.addRecipe(new ItemStack(ModItems.ingotEnderperlite), new Object[]{
                "IWI",
                "CCC",
                "IWI",
                'I', Blocks.ice , 'W', Items.water_bucket, 'C', ModItems.cEnderperlite
        });

    }
    public static void shapeless(){




        //Smelting
        GameRegistry.addSmelting(new ItemStack(ModItems.enderperlite), new ItemStack(ModItems.mEnderperlite), 8.0F);
    }
}