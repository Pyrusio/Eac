package Eac.eacItem;

import Eac.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemAirArmor extends ItemArmor
{

	public ItemAirArmor(ArmorMaterial airArmorMaterial, int armorType, String name)
	{
		super(airArmorMaterial, 0, armorType);
		setTextureName(Reference.MOD_ID.toLowerCase() + ":" + name);
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabs.tabCombat);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == eacItem.airHelmet || stack.getItem() == eacItem.airChestPlate || stack.getItem() == eacItem.airBoots)
		{
			return Reference.MOD_ID.toLowerCase() + ":models/armor/airArmor1.png";
		}
		else
			if (stack.getItem() == eacItem.airLegs)
			{
				return Reference.MOD_ID.toLowerCase() + ":models/armor/airArmor2.png";
			}
		return null;
	}

}
