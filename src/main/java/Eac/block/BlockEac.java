package Eac.block;

import Eac.Eac;
import Eac.reference.RegisterHelper;

public class BlockEac extends Eac {
    public static void init() {
        oreAir = new BlockOreAir();
        oreShadow = new BlockOreShadow();
        airIngotBlock = new BlockIngotAir();
        shadowIngotBlock = new BlockIngotShadow();
        airDustBlock = new BlockDustAir();
        aAirDustBlock = new BlockDustaAir();
        benderperlite = new BlockEnderPerlite();
        featherblock = new BlockFeather();
        activationcatalyst = new BlockActivationCatalyst();
        softfaller = new BlockSoftfall();
    }

}
