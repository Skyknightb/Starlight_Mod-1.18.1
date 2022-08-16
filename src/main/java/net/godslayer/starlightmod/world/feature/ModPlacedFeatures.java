package net.godslayer.starlightmod.world.feature;

import net.godslayer.starlightmod.config.StarlightModCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;


public class ModPlacedFeatures {
        public static final Holder<PlacedFeature> LUMINARY_PLACED = PlacementUtils.register("ebony_placed", ModConfiguredFeatures.LUMINARY_SPAWN, VegetationPlacements.treePlacement(
                        PlacementUtils.countExtra(1, 0.2f, 1)));

        public static final Holder<PlacedFeature> STARFLOWER_PLACED = PlacementUtils.register("starflower_placed",
                ModConfiguredFeatures.STARFLOWER, RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        public static final Holder<PlacedFeature> TWINFLOWER_PLACED = PlacementUtils.register("twinflower_placed",
                ModConfiguredFeatures.TWINFLOWER, RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        public static final Holder<PlacedFeature> BLACK_DAHLIA_PLACED = PlacementUtils.register("black_dahlia_placed",
                ModConfiguredFeatures.BLACK_DAHLIA, RarityFilter.onAverageOnceEvery(16),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

        public static final Holder<PlacedFeature> STELLAR_ORE_PLACED = PlacementUtils.register("stellar_ore_placed",
                ModConfiguredFeatures.STELLAR_ORE, ModOrePlacement.commonOrePlacement( StarlightModCommonConfigs.STELLAR_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(160))));

        public static final Holder<PlacedFeature> CERIUM_ORE_PLACED = PlacementUtils.register("cerium_ore_placed",
                ModConfiguredFeatures.CERIUM_ORE, ModOrePlacement.commonOrePlacement( StarlightModCommonConfigs.CERIUM_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(160))));

        public static final Holder<PlacedFeature> AQUELLIUM_ORE_PLACED = PlacementUtils.register("aquellium_ore_placed",
                ModConfiguredFeatures.AQUELLIUM_ORE, ModOrePlacement.commonOrePlacement( StarlightModCommonConfigs.AQUELLIUM_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(160))));

        public static final Holder<PlacedFeature> SATELLA_ORE_PLACED = PlacementUtils.register("satella_ore_placed",
                ModConfiguredFeatures.SATELLA_ORE, ModOrePlacement.commonOrePlacement( StarlightModCommonConfigs.SATELLA_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(160))));

        public static final Holder<PlacedFeature> NETHER_PYRELLIUM_ORE_PLACED = PlacementUtils.register("nether_pyrellium_ore_placed",
                ModConfiguredFeatures.NETHER_PYRELLIUM_ORE, ModOrePlacement.commonOrePlacement( StarlightModCommonConfigs.PYRELLIUM_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(160))));

        public static final Holder<PlacedFeature> NETHER_RUNITITE_ORE_PLACED = PlacementUtils.register("nether_runitite_ore_placed",
                ModConfiguredFeatures.NETHER_RUNITITE_ORE, ModOrePlacement.commonOrePlacement( StarlightModCommonConfigs.RUNITITE_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(160))));

        public static final Holder<PlacedFeature> END_AETHER_ORE_PLACED = PlacementUtils.register("end_aether_ore_placed",
                ModConfiguredFeatures.END_AETHER_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

        public static final Holder<PlacedFeature> END_ZOE_ORE_PLACED = PlacementUtils.register("end_zoe_ore_placed",
                ModConfiguredFeatures.END_ZOE_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
}
