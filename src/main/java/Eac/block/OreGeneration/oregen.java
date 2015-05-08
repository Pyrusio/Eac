package Eac.block.OreGeneration;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class oregen {

    public static void init() {
        initWorldGen();
    }

    public static void initWorldGen() {
        registerWorldGen(new WorldGenEac(), 1);
    }

    public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbabaility) {
        GameRegistry.registerWorldGenerator(worldGenClass, weightedProbabaility);
    }
}
