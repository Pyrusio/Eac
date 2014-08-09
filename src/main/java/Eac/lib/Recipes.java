package Eac.lib;

import Eac.Eac;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes extends Eac
{
	public static void init() {
		GameRegistry.addRecipe(new ItemStack (aersword, 1), new Object[] {
			"DBD", 
			"GBG", 
			"ENE", 
			'D', Items.diamond, 'B', Blocks.diamond_block, 'G', Items.gold_ingot, 'E', Items.ender_eye, 'N', Items.nether_star});
		GameRegistry.addRecipe(new ItemStack (bladedblood, 1), new Object[] {
			"B",
			"A",
			"C",
			'B', Blocks.diamond_block, 'A', enderstar, 'C', Items.blaze_rod });
		GameRegistry.addRecipe(new ItemStack (enderstar, 1), new Object[]{
			"DND",
			"NEN",
			"DND",
			'D', Blocks.diamond_block, 'N', Items.nether_star, 'E', Blocks.dragon_egg });
		GameRegistry.addRecipe(new ItemStack (airpick, 1), new Object[]{
			"III",
			" S ",
			" S ",
			'I', ingotair, 'S', Items.stick	});
		GameRegistry.addRecipe(new ItemStack (airaxe, 1), new Object[]{
			"II",
			"IS",
			" S",
			'I', ingotair, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack (airaxe, 1), new Object[]{
			"II",
			"SI",
			"S ",
			'I', ingotair, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack (airsword, 1), new Object[]{
			"I",
			"I",
			"S",
			'I', ingotair, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack (airspade, 1), new Object[]{
			"I",
			"S",
			"S",
			'I', ingotair, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack (airhoe, 1), new Object[]{
			"II",
			"S ",
			"S ",
			'I', ingotair, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack (airhoe, 1), new Object[]{
			"II",
			" S",
			" S",
			'I', ingotair, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack (airHelmet, 1), new Object[]{
			"III",
			"I I",
			"   ",
			'I', ingotair });
		GameRegistry.addRecipe(new ItemStack (airHelmet, 1), new Object[]{
			"   ",
			"III",
			"I I",
			'I', ingotair });
		GameRegistry.addRecipe(new ItemStack (airChestPlate, 1), new Object[]{
			"I I",
			"III",
			"III",
			'I', ingotair });
		GameRegistry.addRecipe(new ItemStack (airLegs, 1), new Object[]{
			"III",
			"I I",
			"I I",
			'I', ingotair });
		GameRegistry.addRecipe(new ItemStack (airBoots, 1), new Object[]{
			"I I",
			"I I",
			"   ",
			'I', ingotair });
		GameRegistry.addRecipe(new ItemStack (airBoots, 1), new Object[]{
			"   ",
			"I I",
			"I I",
			'I', ingotair });
		GameRegistry.addRecipe(new ItemStack (airDustBlock, 1), new Object[]{
			"DDD",
			"DDD",
			"DDD",
			'D', dustair });
		GameRegistry.addRecipe(new ItemStack (aAirDustBlock, 1), new Object[]{
			"DDD",
			"DDD",
			"DDD",
			'D', dustairact });
		GameRegistry.addRecipe(new ItemStack (aAirDustBlock, 1), new Object[]{
			"DDD",
			"DFD",
			"DDD",
			'F', airDustBlock, 'D', Items.feather });
		GameRegistry.addRecipe(new ItemStack (airIngotBlock, 1), new Object[]{
			"III",
			"III",
			"III",
			'I', ingotair });
		GameRegistry.addRecipe(new ItemStack (shadowpick, 1), new Object[]{
			"III",
			" S ",
			" S ",
			'I', ingotshadow, 'S', Items.stick	});
		GameRegistry.addRecipe(new ItemStack (shadowaxe, 1), new Object[]{
			"II",
			"IS",
			" S",
			'I', ingotshadow, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack (shadowaxe, 1), new Object[]{
			"II",
			"SI",
			"S ",
			'I', ingotshadow, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack (shadowsword, 1), new Object[]{
			"I",
			"I",
			"S",
			'I', ingotshadow, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack (shadowspade, 1), new Object[]{
			"I",
			"S",
			"S",
			'I', ingotshadow, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack (shadowhoe, 1), new Object[]{
			"II",
			"S ",
			"S ",
			'I', ingotshadow, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack (shadowhoe, 1), new Object[]{
			"II",
			" S",
			" S",
			'I', ingotshadow, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack (shadowHelmet, 1), new Object[]{
			"III",
			"I I",
			"   ",
			'I', ingotshadow });
		GameRegistry.addRecipe(new ItemStack (shadowHelmet, 1), new Object[]{
			"   ",
			"III",
			"I I",
			'I', ingotshadow });
		GameRegistry.addRecipe(new ItemStack (shadowChestPlate, 1), new Object[]{
			"I I",
			"III",
			"III",
			'I', ingotshadow });
		GameRegistry.addRecipe(new ItemStack (shadowLegs, 1), new Object[]{
			"III",
			"I I",
			"I I",
			'I', ingotshadow });
		GameRegistry.addRecipe(new ItemStack (shadowBoots, 1), new Object[]{
			"I I",
			"I I",
			"   ",
			'I', ingotshadow });
		GameRegistry.addRecipe(new ItemStack (shadowBoots, 1), new Object[]{
			"   ",
			"I I",
			"I I",
			'I', ingotshadow });
		GameRegistry.addRecipe(new ItemStack (shadowIngotBlock, 1), new Object[]{
			"III",
			"III",
			"III",
			'I', ingotshadow });
		GameRegistry.addShapelessRecipe(new ItemStack(dustairact, 1), new Object[]{dustair, Items.feather});
		GameRegistry.addShapelessRecipe(new ItemStack(dustair, 9), new Object[]{airDustBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(dustairact, 9), new Object[]{aAirDustBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(ingotair, 9), new Object[]{airIngotBlock});
		GameRegistry.addSmelting(new ItemStack(dustairact), new ItemStack(ingotair), 1.0F);
		GameRegistry.addSmelting(new ItemStack(oreShadow), new ItemStack(ingotshadow), 2.0F);
	}
}
