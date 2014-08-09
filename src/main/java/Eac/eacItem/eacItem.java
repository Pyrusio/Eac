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
		// Tools
		bladedblood = new ItemBladedBlood(enderblood);
		aersword = new ItemAerSword(aerial);
		airpick = new ItemAirPick(airToolMaterial);
		airaxe = new ItemAirAxe(airToolMaterial);
		airsword = new ItemAirSword(airToolMaterial);
		airspade = new ItemAirSpade(airToolMaterial);
		airhoe = new ItemAirHoe(airToolMaterial);
		// Armor
		airHelmet = new ItemAirArmor(airArmorMaterial, 0, "airHelmet");
		airChest = new ItemAirArmor(airArmorMaterial, 1, "airChest");
		airLegs = new ItemAirArmor(airArmorMaterial, 2, "airLegs");
		airBoots = new ItemAirArmor(airArmorMaterial, 3, "airBoots");

		// Items
		GameRegistry.registerItem(enderstar, "Enderstar");
		GameRegistry.registerItem(dustair, "Air_Dust");
		GameRegistry.registerItem(dustairact, "Active_Air_Dust");
		GameRegistry.registerItem(ingotair, "Air_Ingot");
		GameRegistry.registerItem(ingotshadow, "Shadow_Ingot");
		// Tools
		GameRegistry.registerItem(bladedblood, "Dead_Blood_Blade");
		GameRegistry.registerItem(aersword, "Aerial_Sword");
		GameRegistry.registerItem(airpick, "Air_Pickaxe");
		GameRegistry.registerItem(airaxe, "Air_Axe");
		GameRegistry.registerItem(airsword, "Air_Sword");
		GameRegistry.registerItem(airspade, "Air_Shovel");
		GameRegistry.registerItem(airhoe, "Air_Hoe");
		// Armor
		GameRegistry.registerItem(airHelmet, "Air_Helmet");
		GameRegistry.registerItem(airChest, "Air_Chestplate");
		GameRegistry.registerItem(airLegs, "Air_Leggings");
		GameRegistry.registerItem(airBoots, "Air_Boots");

	}

}
