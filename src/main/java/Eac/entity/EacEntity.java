package Eac.entity;

import Eac.Eac;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EacEntity {
    public static void init() {
        registerEntity();
    }

    public static void registerEntity() {
        createEntity(EntityEnderGuard.class, "EnderGuardian", 0xD5CADB, 0x970AF0);
    }

    public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
        int randomId = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
        EntityRegistry.registerModEntity(entityClass, entityName, randomId, Eac.mobInstance, 64, 1, true);
        EntityRegistry.addSpawn(entityClass, 2, 0, 7, EnumCreatureType.monster, BiomeGenBase.extremeHills.jungle.forest.desert.sky.plains);
        createEgg(randomId, solidColor, spotColor);
    }

    private static void createEgg(int randomId, int solidColor, int spotColor) {
        EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
    }
}
