package net.godslayer.starlightmod.world;

import net.godslayer.starlightmod.Starlightmod;
import net.godslayer.starlightmod.world.gen.ModFlowerGeneration;
import net.godslayer.starlightmod.world.gen.ModOreGeneration;
import net.godslayer.starlightmod.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Starlightmod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);

        ModTreeGeneration.generateTrees(event);
        ModFlowerGeneration.generateFlowers(event);
    }
}
