package Eac.reference;

import Eac.Eac;
import Eac.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes extends Eac {
    public static void init() {
        GameRegistry.addRecipe(new ItemStack(aersword, 1), new Object[]{
                "DBD",
                "GBG",
                "ENE",
                'D', Items.diamond, 'B', Blocks.diamond_block, 'G', Items.gold_ingot, 'E', Items.ender_eye, 'N', Items.nether_star});
        GameRegistry.addRecipe(new ItemStack(bladedblood, 1), new Object[]{
                "B",
                "A",
                "C",
                'B', Blocks.diamond_block, 'A', ModItems.enderstar, 'C', Items.blaze_rod});
        GameRegistry.addRecipe(new ItemStack(ModItems.enderstar, 1), new Object[]{
                "DND",
                "NEN",
                "DND",
                'D', Blocks.diamond_block, 'N', Items.nether_star, 'E', Blocks.dragon_egg});
        GameRegistry.addRecipe(new ItemStack(airpick, 1), new Object[]{
                "III",
                " S ",
                " S ",
                'I', ModItems.ingotair, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(airaxe, 1), new Object[]{
                "II",
                "IS",
                " S",
                'I', ModItems.ingotair, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(airaxe, 1), new Object[]{
                "II",
                "SI",
                "S ",
                'I', ModItems.ingotair, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(airsword, 1), new Object[]{
                "I",
                "I",
                "S",
                'I', ModItems.ingotair, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(airspade, 1), new Object[]{
                "I",
                "S",
                "S",
                'I', ModItems.ingotair, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(airhoe, 1), new Object[]{
                "II",
                "S ",
                "S ",
                'I', ModItems.ingotair, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(airhoe, 1), new Object[]{
                "II",
                " S",
                " S",
                'I', ModItems.ingotair, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(airHelmet, 1), new Object[]{
                "III",
                "I I",
                "   ",
                'I', ModItems.ingotair});
        GameRegistry.addRecipe(new ItemStack(airHelmet, 1), new Object[]{
                "   ",
                "III",
                "I I",
                'I', ModItems.ingotair});
        GameRegistry.addRecipe(new ItemStack(airChestPlate, 1), new Object[]{
                "I I",
                "III",
                "III",
                'I', ModItems.ingotair});
        GameRegistry.addRecipe(new ItemStack(airLegs, 1), new Object[]{
                "III",
                "I I",
                "I I",
                'I', ModItems.ingotair});
        GameRegistry.addRecipe(new ItemStack(airBoots, 1), new Object[]{
                "I I",
                "I I",
                "   ",
                'I', ModItems.ingotair});
        GameRegistry.addRecipe(new ItemStack(airBoots, 1), new Object[]{
                "   ",
                "I I",
                "I I",
                'I', ModItems.ingotair});
        GameRegistry.addRecipe(new ItemStack(airDustBlock, 1), new Object[]{
                "DDD",
                "DDD",
                "DDD",
                'D', ModItems.dustAir});
        GameRegistry.addRecipe(new ItemStack(aAirDustBlock, 1), new Object[]{
                "DDD",
                "DDD",
                "DDD",
                'D', ModItems.dustAirAct});
        GameRegistry.addRecipe(new ItemStack(aAirDustBlock, 1), new Object[]{
                "FFF",
                "FDF",
                "FFF",
                'D', airDustBlock, 'F', Items.feather});
        GameRegistry.addRecipe(new ItemStack(airIngotBlock, 1), new Object[]{
                "III",
                "III",
                "III",
                'I', ModItems.ingotair});
        GameRegistry.addRecipe(new ItemStack(shadowpick, 1), new Object[]{
                "III",
                " S ",
                " S ",
                'I', ModItems.ingotShadow, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(shadowaxe, 1), new Object[]{
                "II",
                "IS",
                " S",
                'I', ModItems.ingotShadow, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(shadowaxe, 1), new Object[]{
                "II",
                "SI",
                "S ",
                'I', ModItems.ingotShadow, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(shadowsword, 1), new Object[]{
                "I",
                "I",
                "S",
                'I', ModItems.ingotShadow, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(shadowspade, 1), new Object[]{
                "I",
                "S",
                "S",
                'I', ModItems.ingotShadow, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(shadowhoe, 1), new Object[]{
                "II",
                "S ",
                "S ",
                'I', ModItems.ingotShadow, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(shadowhoe, 1), new Object[]{
                "II",
                " S",
                " S",
                'I', ModItems.ingotShadow, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(shadowHelmet, 1), new Object[]{
                "III",
                "I I",
                "   ",
                'I', ModItems.ingotShadow});
        GameRegistry.addRecipe(new ItemStack(shadowHelmet, 1), new Object[]{
                "   ",
                "III",
                "I I",
                'I', ModItems.ingotShadow});
        GameRegistry.addRecipe(new ItemStack(shadowChestPlate, 1), new Object[]{
                "I I",
                "III",
                "III",
                'I', ModItems.ingotShadow});
        GameRegistry.addRecipe(new ItemStack(shadowLegs, 1), new Object[]{
                "III",
                "I I",
                "I I",
                'I', ModItems.ingotShadow});
        GameRegistry.addRecipe(new ItemStack(shadowBoots, 1), new Object[]{
                "I I",
                "I I",
                "   ",
                'I', ModItems.ingotShadow});
        GameRegistry.addRecipe(new ItemStack(shadowBoots, 1), new Object[]{
                "   ",
                "I I",
                "I I",
                'I', ModItems.ingotShadow});
        GameRegistry.addRecipe(new ItemStack(shadowIngotBlock, 1), new Object[]{
                "III",
                "III",
                "III",
                'I', ModItems.ingotShadow});
        GameRegistry.addRecipe(new ItemStack(benderperlite, 2), new Object[]{
                "xx",
                "xx",
                'x', ModItems.enderperlite});
        GameRegistry.addRecipe(new ItemStack(activationcatalyst, 1), new Object[]{
                "DXF",
                " B ",
                "III",
                'D', ModItems.dustAir, 'X', featherblock, 'F', Items.feather, 'B', Blocks.iron_block, 'I', Items.iron_ingot});
        GameRegistry.addRecipe(new ItemStack(activationcatalyst, 1), new Object[]{
                "FXD",
                " B ",
                "III",
                'D', ModItems.dustAir, 'X', featherblock, 'F', Items.feather, 'B', Blocks.iron_block, 'I', Items.iron_ingot});
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 0), new Object[]{
                " F ",
                "FBF",
                " F ",
                'B', featherblock, 'F', Items.feather});
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 1), new Object[]{
                " B ",
                "BTB",
                " B ",
                'B', featherblock, 'T', new ItemStack(softfaller, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 2), new Object[]{
                " Y ",
                "XTX",
                " B ",
                'B', featherblock, 'X', new ItemStack(softfaller, 1, 0), 'Y', ModItems.dustAir, 'T', new ItemStack(softfaller, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 2), new Object[]{
                " B ",
                "XTX",
                " Y ",
                'B', featherblock, 'X', new ItemStack(softfaller, 1, 0), 'Y', ModItems.dustAir, 'T', new ItemStack(softfaller, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 3), new Object[]{
                "XXX",
                "XYX",
                "XXX",
                'X', new ItemStack(softfaller, 1, 0), 'Y', new ItemStack(softfaller, 1, 2)});
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 4), new Object[]{
                "YXY",
                "YZY",
                " A ",
                'X', new ItemStack(softfaller, 1, 3), 'Y', new ItemStack(softfaller, 1, 1), 'Z', ModItems.dustAir, 'A', ModItems.cdustShadow});
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 5), new Object[]{
                "YZY",
                "YAY",
                "XXX",
                'X', new ItemStack(softfaller, 1, 4), 'Y', ModItems.dustAirAct, 'Z', Items.feather, 'A', ModItems.pdustShadow});
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 6), new Object[]{
                "YZY",
                "BXB",
                "YAY",
                'X', new ItemStack(softfaller, 1, 5), 'Y', new ItemStack(softfaller, 1, 1), 'Z', Items.feather, 'A', Blocks.anvil, 'B', featherblock});
        GameRegistry.addRecipe(new ItemStack(softfaller, 1, 7), new Object[]{
                "YYY",
                "ZXZ",
                "ABA",
                'X', new ItemStack(softfaller, 1, 6), 'Y', ModItems.ingotShadow, 'Z', ModItems.enderperlite, 'A', Items.feather, 'B', Items.cooked_chicken});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustAirAct, 1), new Object[]{ModItems.dustAir, Items.feather});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustAir, 9), new Object[]{airDustBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustAirAct, 9), new Object[]{aAirDustBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotShadow, 9), new Object[]{shadowIngotBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotair, 9), new Object[]{airIngotBlock});
        GameRegistry.addSmelting(new ItemStack(ModItems.dustAirAct), new ItemStack(ModItems.ingotair), 1.0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.dustShadow), new ItemStack(ModItems.ingotShadow), 2.0F);
    }
}