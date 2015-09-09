package Eac.block.Other.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.event.entity.living.LivingFallEvent;

public class TileEntitySoftFall extends TileEntity{


    public static final String publicName = "TileSoftFall";
    private String privateName = "TileSoftFall";

    public String getName() {

        return privateName;
    }

    public void fallingPlayer(LivingFallEvent event){
        if (event.entityLiving instanceof EntityPlayer){
            event.setCanceled(true);
        }
    }
}
