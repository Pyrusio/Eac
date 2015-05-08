package Eac.client.gui;

import Eac.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiActivator extends GuiScreen
{
    int guiWidth = 176;
    int guiHeight = 214;


    public void drawScreen(int x, int y, float ticks){
        int guiX = (width - guiWidth) / 2;
        int guiY = (height - guiHeight) / 2;
        GL11.glColor4f(1, 1, 1, 1);
        drawDefaultBackground();
        mc.renderEngine.bindTexture(new ResourceLocation(Reference.MOD_ID.toLowerCase(), "textures/gui/GuiActivator.png"));
        drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);

        super.drawScreen(x, y, ticks);
    }

    public boolean doesGuiPauseGame()
    {
        return false;
    }

}
