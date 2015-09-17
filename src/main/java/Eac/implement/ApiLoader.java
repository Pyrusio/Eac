package Eac.implement;

import Eac.reference.ic2Recipes;
import Eac.util.LogHelper;
import cpw.mods.fml.common.Loader;

public class ApiLoader{

    public static void preInit() {
        if (Loader.isModLoaded("EE3")){
            EE3.preInit();
            LogHelper.info("Equivalent Exchange Compatibility loaded.");
        }
    }

    public static void init() {
        if (Loader.isModLoaded("IC2")){ic2Recipes.init();}
        else {LogHelper.fatal("IC2 Not Found. You really didn't want a challenge did you? For an added challenge, you should add it!");}
        if (Loader.isModLoaded("test")){LogHelper.info("test successfull");}
    }

    public static void postInit() {

    }

    public static void clientSide() {

    }

    public static void clientInit() {

    }
}
