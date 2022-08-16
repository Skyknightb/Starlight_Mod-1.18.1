package net.godslayer.starlightmod;

import net.godslayer.starlightmod.block.ModBlocks;
import net.godslayer.starlightmod.item.ModItems;
import net.godslayer.starlightmod.painting.ModPaintings;
import net.godslayer.starlightmod.util.ModItemProperties;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Starlightmod.MOD_ID)
public class Starlightmod
{
    public static final String MOD_ID = "starlightmod";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public Starlightmod() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModPaintings.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LUMINARY_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LUMINARY_TRAPDOOR.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STARFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_STARFLOWER.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_DAHLIA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_BLACK_DAHLIA.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TWINFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_TWINFLOWER.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STELLAR_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CERIUM_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.AQUELLIUM_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SATELLA_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PYRELLIUM_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RUNITITE_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.AETHER_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ZOE_GLASS.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STARFLOWER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TWINFLOWER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACKDAHLIA_PLANT.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LUMINARY_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LUMINARY_SAPLING.get(), RenderType.cutout());

        ModItemProperties.addCustomItemProperties();
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork( () -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.STARFLOWER.getId(), ModBlocks.POTTED_STARFLOWER);
        });
        event.enqueueWork( () -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLACK_DAHLIA.getId(), ModBlocks.POTTED_BLACK_DAHLIA);
        });
        event.enqueueWork( () -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.TWINFLOWER.getId(), ModBlocks.POTTED_TWINFLOWER);
        });
    }
}
