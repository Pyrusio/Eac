package Eac.eacBlock;

import Eac.Eac;
import Eac.reference.RegisterHelper;

public class eacBlock extends Eac
{
	public static void init()
	{
		oreAir = new BlockOreAir();
		oreShadow = new BlockOreShadow();
		airIngotBlock = new BlockIngotAir();
		shadowIngotBlock = new BlockIngotShadow();
		airDustBlock = new BlockDustAir();
		aAirDustBlock = new BlockDustaAir();

		RegisterHelper.registerBlock(oreAir);
		RegisterHelper.registerBlock(oreShadow);
		RegisterHelper.registerBlock(airIngotBlock);
		RegisterHelper.registerBlock(shadowIngotBlock);
		RegisterHelper.registerBlock(airDustBlock);
		RegisterHelper.registerBlock(aAirDustBlock);
	}

}
