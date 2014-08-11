package Eac;

import Eac.handler.ConfigHandler;
import Eac.proxy.IProxy;
import Eac.reference.Reference;
import Eac.util.LogHelper;
import cpw.mods.fml.common.SidedProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import Eac.eacBlock.eacBlock;
import Eac.eacBlock.oregen;
import Eac.eacItem.eacItem;
import Eac.reference.Recipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = "Eac.client.gui.GuiFactory")
public class Eac
{
    @Mod.Instance("Eac")
    public static Eac instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

	protected static ToolMaterial aerial = EnumHelper.addToolMaterial("Aerial", 3, 1600, 12.0F, 8.5F, 30);
	protected static ToolMaterial airToolMaterial = EnumHelper.addToolMaterial("AirTool", 3, 1600, 12.0F, 3.0F, 13);
	protected static ToolMaterial shadowToolMaterial = EnumHelper.addToolMaterial("ShadowTool", 4, 1600, 12.0F, 4.0F, 13);
	protected static ToolMaterial enderblood = EnumHelper.addToolMaterial("EnderBlood", 3, 20000, 13.0F, 14.5F, 30);
	protected static ArmorMaterial airArmorMaterial = EnumHelper.addArmorMaterial("AirArmor", 45, new int[]
			{ 3, 8, 6, 3 }, 30);
	protected static ArmorMaterial shadowArmorMaterial = EnumHelper.addArmorMaterial("ShadowArmor", 45, new int[]
			{ 4, 8, 7, 3 }, 30);

	// Items
	public static Item enderstar;
	public static Item dustair;
	public static Item dustairact;
	public static Item ingotair;
	public static Item ingotshadow;
	// Misc Tools
	public static Item aersword;
	public static Item bladedblood;
	// Air Tools
	public static Item airpick;
	public static Item airaxe;
	public static Item airsword;
	public static Item airspade;
	public static Item airhoe;
	// Shadow Tools
	public static Item shadowpick;
	public static Item shadowaxe;
	public static Item shadowsword;
	public static Item shadowspade;
	public static Item shadowhoe;
	// Air Armor
	public static Item airHelmet;
	public static Item airChestPlate;
	public static Item airLegs;
	public static Item airBoots;
	// Shadow Armor
	public static Item shadowHelmet;
	public static Item shadowChestPlate;
	public static Item shadowLegs;
	public static Item shadowBoots;
	// Block
	public static Block airIngotBlock;
	public static Block shadowIngotBlock;
	public static Block airDustBlock;
	public static Block aAirDustBlock;
	// Ore
	public static Block oreAir;
	public static Block oreShadow;


    @EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        LogHelper.info("Pre Initialization Complete!");
        eacItem.init();
		eacBlock.init();
		Recipes.init();
		oregen.mainRegistry();

	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
        LogHelper.info("Initialization Complete!");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
        LogHelper.info("Post Initialization Complete!");
	}

}
