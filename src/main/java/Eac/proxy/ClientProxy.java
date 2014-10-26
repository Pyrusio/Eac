package Eac.proxy;

import Eac.block.tileentity.TileEntityActivationCatalyst;
import Eac.block.tileentity.TileEntityActivationCatalystRenderer;
import Eac.entity.EntityEnderGuard;
import Eac.entity.RenderEnderGuard;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
    public void registerRenderThings(){
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderGuard.class, new RenderEnderGuard());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityActivationCatalyst.class, new TileEntityActivationCatalystRenderer());
    };


}
