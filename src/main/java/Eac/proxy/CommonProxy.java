package Eac.proxy;

import Eac.Eac;
import Eac.block.Other.tileentity.TileEntityActivationCatalyst;
import Eac.handler.EacGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public abstract class CommonProxy implements IProxy
{
    public void registerRenderThings(){}
    public void registerTileEntities() {
    GameRegistry.registerTileEntity(TileEntityActivationCatalyst.class, TileEntityActivationCatalyst.publicName);
    }
    public void registerNetworkStuff(){
        NetworkRegistry.INSTANCE.registerGuiHandler(Eac.guiInstance, new EacGuiHandler());
    }

}
