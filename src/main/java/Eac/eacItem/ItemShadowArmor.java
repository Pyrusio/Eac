package Eac.eacItem;

import Eac.reference.Reference;
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
		if (stack.getItem() == eacItem.shadowHelmet || stack.getItem() == eacItem.shadowChestPlate || stack.getItem() == eacItem.shadowBoots)
		{
			return Reference.MOD_ID.toLowerCase() + ":models/armor/shadowArmor1.png";
		}
		else
			if (stack.getItem() == eacItem.shadowLegs)
			{
				return Reference.MOD_ID.toLowerCase() + ":models/armor/shadowArmor2.png";
			}
		return null;
	}
}
