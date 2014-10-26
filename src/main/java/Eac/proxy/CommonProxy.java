package Eac.proxy;

import Eac.block.tileentity.TileEntityActivationCatalyst;
import cpw.mods.fml.common.registry.GameRegistry;

public abstract class CommonProxy implements IProxy
{
    public void registerRenderThings(){};
    public void registerTileEntities() {
    GameRegistry.registerTileEntity(TileEntityActivationCatalyst.class, TileEntityActivationCatalyst.publicName);
    };
}
