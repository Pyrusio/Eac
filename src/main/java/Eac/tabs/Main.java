package Eac.tabs;

import Eac.Eac;
import Eac.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Main extends Eac
{

	public static CreativeTabs tabEac = new CreativeTabs("tabEac")
	{
		public Item getTabIconItem()
		{
			return ModItems.ingotShadow;
		}
	};
}
