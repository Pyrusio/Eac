package Eac;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import Eac.eacBlock.eacBlock;
import Eac.eacBlock.oregen;
import Eac.eacItem.eacItem;
import Eac.lib.ModInfo;
import Eac.lib.Recipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
public class Eac
{

	protected static ToolMaterial aerial = EnumHelper.addToolMaterial("Aerial", 3, 1600, 12.0F, 8.5F, 30);
	protected static ToolMaterial airToolMaterial = EnumHelper.addToolMaterial("AirTool", 3, 1600, 12.0F, 3.0F, 13);
	protected static ToolMaterial enderblood = EnumHelper.addToolMaterial("EnderBlood", 3, 20000, 13.0F, 14.5F, 30);
	protected static ArmorMaterial airArmorMaterial = EnumHelper.addArmorMaterial("AirArmor", 45, new int[]
	{ 3, 8, 6, 3 }, 30);

	// Items
	public static Item enderstar;
	public static Item dustair;
	public static Item dustairact;
	public static Item ingotair;
	public static Item ingotshadow;
	// tools
	public static Item aersword;
	public static Item bladedblood;
	public static Item airpick;
	public static Item airaxe;
	public static Item airsword;
	public static Item airspade;
	public static Item airhoe;
	// Armor
	public static Item airHelmet;
	public static Item airChest;
	public static Item airLegs;
	public static Item airBoots;
	// Block
	public static Block airIngotBlock;
	public static Block airDustBlock;
	public static Block aAirDustBlock;
	// Ore
	public static Block oreAir;
	public static Block oreShadow;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		eacItem.init();
		eacBlock.init();
		Recipes.init();
		oregen.mainRegistry();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}

}
