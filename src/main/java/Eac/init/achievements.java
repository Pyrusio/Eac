package Eac.init;

import Eac.Eac;
import Eac.event.EacOnItemPickup;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;

public class achievements extends Eac
{
    public static void init()
    {
        airoremined = new Achievement("achievement.airoremined", "airoremined", 0, 0, oreAir, (Achievement)null).initIndependentStat().registerStat();
        shadoworemined = new Achievement("achievement.shadoworemined", "shadoworemined", 2, 0, oreShadow, airoremined).registerStat();

        AchievementPage.registerAchievementPage(new AchievementPage("Eac", new Achievement[]{airoremined, shadoworemined}));

        FMLCommonHandler.instance().bus().register(new EacOnItemPickup());
    }
}
