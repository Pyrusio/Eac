package Eac.implement;

import Eac.init.ModItems;
import com.pahimar.ee3.api.exchange.EnergyValueRegistryProxy;

public class EE3 {
    public static void preInit() {
        EnergyValueRegistryProxy.addPreAssignedEnergyValue(ModItems.ingotair, 8192);
        // TODO Add more EE3 EMC Values
    }

    public static void init() {

    }

    public static void postInit() {

    }

    public static void clientSide() {

    }

    public static void clientInit() {

    }
}
