package Eac.reference;

import Eac.Eac;
import Eac.handler.ConfigHandler;
import Eac.init.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict extends Eac {


    public static void init(){
        OreDictionary.registerOre(ConfigHandler.oreAirC, oreAir);
        OreDictionary.registerOre(ConfigHandler.oreShadowC, oreShadow);
        OreDictionary.registerOre(ConfigHandler.itemPerliteC, ModItems.enderperlite);
        OreDictionary.registerOre(ConfigHandler.ingotAirC, ModItems.ingotair);
    }

}
