package Eac.reference.Recipes;

import Eac.init.ModItems;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class EnderperliteR extends Recipes{
    public static void recipe(){
        GameRegistry.addRecipe(new ItemStack(benderperlite, 2), new Object[]{
                "xx",
                "xx",
                'x', ModItems.enderperlite});
    }

    public static void shapeless(){
    }
}
