package Eac.eacItem;

import net.minecraft.item.Item;
import Eac.Eac;
import cpw.mods.fml.common.registry.GameRegistry;

public class eacItem extends Eac
{
	public static void init()
	{
		// Items
		enderstar = new ItemEnderStar();
		dustair = new ItemDustAir();
		dustairact = new ItemDustAirActiv();
		ingotair = new ItemIngotAir();
		ingotshadow = new ItemIngotShadow();
		// Misc Tools
		bladedblood = new ItemBladedBlood(enderblood);
		aersword = new ItemAerSword(aerial);
		// Air Tools
		airpick = new ItemAirPick(airToolMaterial);
		airaxe = new ItemAirAxe(airToolMaterial);
		airsword = new ItemAirSword(airToolMaterial);
		airspade = new ItemAirSpade(airToolMaterial);
		airhoe = new ItemAirHoe(airToolMaterial);
		// Shadow Tools
		shadowpick = new ItemShadowPick(shadowToolMaterial);
		shadowaxe = new ItemShadowAxe(shadowToolMaterial);
		shadowsword = new ItemShadowSword(shadowToolMaterial);
		shadowspade = new ItemShadowSpade(shadowToolMaterial);
		shadowhoe = new ItemShadowHoe(shadowToolMaterial);
		// Air Armor
		airHelmet = new ItemAirArmor(airArmorMaterial, 0, "airHelmet");
		airChestPlate = new ItemAirArmor(airArmorMaterial, 1, "airChestPlate");
		airLegs = new ItemAirArmor(airArmorMaterial, 2, "airLegs");
		airBoots = new ItemAirArmor(airArmorMaterial, 3, "airBoots");
		// Shadow Armor
		shadowHelmet = new ItemShadowArmor(shadowArmorMaterial, 0, "shadowHelmet");
		shadowChestPlate = new ItemShadowArmor(shadowArmorMaterial, 1, "shadowChestPlate");
		shadowLegs = new ItemShadowArmor(shadowArmorMaterial, 2, "shadowLegs");
		shadowBoots = new ItemShadowArmor(shadowArmorMaterial, 3, "shadowBoots");

		// Items
		GameRegistry.registerItem(enderstar, "Enderstar");
		GameRegistry.registerItem(dustair, "Air_Dust");
		GameRegistry.registerItem(dustairact, "Active_Air_Dust");
		GameRegistry.registerItem(ingotair, "Air_Ingot");
		GameRegistry.registerItem(ingotshadow, "Shadow_Ingot");
		// Misc Tools
		GameRegistry.registerItem(bladedblood, "Dead_Blood_Blade");
		GameRegistry.registerItem(aersword, "Aerial_Sword");
		// Air Tools
		GameRegistry.registerItem(airpick, "Air_Pickaxe");
		GameRegistry.registerItem(airaxe, "Air_Axe");
		GameRegistry.registerItem(airsword, "Air_Sword");
		GameRegistry.registerItem(airspade, "Air_Shovel");
		GameRegistry.registerItem(airhoe, "Air_Hoe");
		// Shadow Tools
		GameRegistry.registerItem(shadowpick, "Shadow_Pickaxe");
		GameRegistry.registerItem(shadowaxe, "Shadow_Axe");
		GameRegistry.registerItem(shadowsword, "Shadow_Sword");
		GameRegistry.registerItem(shadowspade, "Shadow_Shovel");
		GameRegistry.registerItem(shadowhoe, "Shadow_Hoe");
		// Air Armor
		GameRegistry.registerItem(airHelmet, "Air_Helmet");
		GameRegistry.registerItem(airChestPlate, "Air_Chestplate");
		GameRegistry.registerItem(airLegs, "Air_Leggings");
		GameRegistry.registerItem(airBoots, "Air_Boots");
		// Shadow Armor
		GameRegistry.registerItem(shadowHelmet, "Shadow_Helmet");
		GameRegistry.registerItem(shadowChestPlate, "Shadow_Chestplate");
		GameRegistry.registerItem(shadowLegs, "Shadow_Leggings");
		GameRegistry.registerItem(shadowBoots, "Shadow_Boots");

	}

}
