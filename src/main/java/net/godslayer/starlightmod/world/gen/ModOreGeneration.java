package net.godslayer.starlightmod.world.gen;

import net.godslayer.starlightmod.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeatures.STELLAR_ORE_PLACED);
        base.add(ModPlacedFeatures.CERIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.AQUELLIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.SATELLA_ORE_PLACED);

        if(event.getCategory() == Biome.BiomeCategory.NETHER) {
            base.add(ModPlacedFeatures.NETHER_PYRELLIUM_ORE_PLACED);
        }
        if(event.getCategory() == Biome.BiomeCategory.NETHER) {
            base.add(ModPlacedFeatures.NETHER_RUNITITE_ORE_PLACED);
        }

        if(event.getCategory() == Biome.BiomeCategory.THEEND) {
            base.add(ModPlacedFeatures.END_AETHER_ORE_PLACED);
        }
        if(event.getCategory() == Biome.BiomeCategory.THEEND) {
            base.add(ModPlacedFeatures.END_ZOE_ORE_PLACED);
        }
    }
}
