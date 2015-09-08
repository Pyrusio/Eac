package Eac.reference.Recipes;

import Eac.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class EnderperliteR extends Recipes{
    public static void recipe(){
        GameRegistry.addRecipe(new ItemStack(benderperlite, 2), new Object[]{
                "xx",
                "xx",
                'x', ModItems.enderperlite});

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
    }
    public static void shapeless(){
    }
}