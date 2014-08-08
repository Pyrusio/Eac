package Eac.tabs;

import Eac.Eac;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class Main extends Eac
{

	public static CreativeTabs tabEac = new CreativeTabs("tabEac")
	{
		public Item getTabIconItem()
		{
			return enderstar;
		}
	};
}
