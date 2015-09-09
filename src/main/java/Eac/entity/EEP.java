package Eac.entity;

import Eac.util.LogHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
/**
 * EEP: Extended Entity Properties
 */
public class EEP implements IExtendedEntityProperties {

    private static String EXT_PROP_NAME = "EEPisFalling";
    private long lastEffectTime;

    @Override
    public void saveNBTData(NBTTagCompound compound) {

    }

    @Override
    public void loadNBTData(NBTTagCompound compound) {

    }

    @Override
    public void init(Entity entity, World world) {

   }

    public EEP(EntityPlayer player) {
    }

    public static final void register(EntityPlayer player) {
        LogHelper.info("REGISTERED EEP");
        player.registerExtendedProperties(EEP.EXT_PROP_NAME, new EEP(player));
    }

    /*public boolean isFalling(LivingFallEvent event) {
        if (event.entityLiving instanceof EntityPlayer) {
            if (((EntityPlayer) event.entityLiving).isAirBorne) {
                return true;
            }
        }
        return false;
    }*/
}
