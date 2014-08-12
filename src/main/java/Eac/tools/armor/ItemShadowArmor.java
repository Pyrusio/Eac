package Eac.tools.armor;

import Eac.reference.Reference;
import Eac.tools.ToolsEac;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemShadowArmor extends ItemArmor
{

	public ItemShadowArmor(ArmorMaterial shadowArmorMaterial, int armorType, String name)
	{
		super(shadowArmorMaterial, 0, armorType);
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + name);
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabs.tabCombat);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == ToolsEac.shadowHelmet || stack.getItem() == ToolsEac.shadowChestPlate || stack.getItem() == ToolsEac.shadowBoots)
		{
			return Reference.MOD_ID.toLowerCase() + ":models/armor/shadowArmor1.png";
		}
		else
			if (stack.getItem() == ToolsEac.shadowLegs)
			{
				return Reference.MOD_ID.toLowerCase() + ":models/armor/shadowArmor2.png";
			}
		return null;
	}
}
