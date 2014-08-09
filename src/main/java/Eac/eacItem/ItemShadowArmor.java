package Eac.eacItem;

import Eac.lib.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemShadowArmor extends ItemArmor
{

	public ItemShadowArmor(ArmorMaterial shadowArmorMaterial, int armorType, String name)
	{
		super(shadowArmorMaterial, 0, armorType);
		setTextureName(ModInfo.ID.toLowerCase() + ":" + name);
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabs.tabCombat);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == eacItem.shadowHelmet || stack.getItem() == eacItem.shadowChestPlate || stack.getItem() == eacItem.shadowBoots)
		{
			return ModInfo.ID.toLowerCase() + ":models/armor/shadowArmor1.png";
		}
		else
			if (stack.getItem() == eacItem.shadowLegs)
			{
				return ModInfo.ID.toLowerCase() + ":models/armor/shadowArmor2.png";
			}
		return null;
	}
}
