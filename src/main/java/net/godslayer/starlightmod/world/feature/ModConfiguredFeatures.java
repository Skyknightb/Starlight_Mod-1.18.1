package net.godslayer.starlightmod.world.feature;

import net.godslayer.starlightmod.block.ModBlocks;
import net.godslayer.starlightmod.config.StarlightModCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> LUMINARY_TREE = FeatureUtils.register("luminary", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(ModBlocks.LUMINARY_LOG.get()),
            new StraightTrunkPlacer(5, 6, 3),
            BlockStateProvider.simple(ModBlocks.LUMINARY_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 4),
            new TwoLayersFeatureSize(2, 0, 2)).build());

    public static final Holder<PlacedFeature> LUMINARY_CHECKED = PlacementUtils.register("luminary_checked", LUMINARY_TREE, PlacementUtils.filteredByBlockSurvival(ModBlocks.LUMINARY_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> LUMINARY_SPAWN = FeatureUtils.register("luminary_spawn", Feature.RANDOM_SELECTOR,
            new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(LUMINARY_CHECKED, 0.5f)), LUMINARY_CHECKED));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> STARFLOWER = FeatureUtils.register("starflower", Feature.FLOWER,
                    new RandomPatchConfiguration(24, 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.STARFLOWER.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> TWINFLOWER = FeatureUtils.register("twinflower", Feature.FLOWER,
            new RandomPatchConfiguration(24, 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.TWINFLOWER.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> BLACK_DAHLIA = FeatureUtils.register("black_dahlia", Feature.FLOWER,
            new RandomPatchConfiguration(24, 4, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BLACK_DAHLIA.get())))));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_STELLAR_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.STELLAR_BLOCK.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> STELLAR_ORE = FeatureUtils.register("stellar_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_STELLAR_ORES, StarlightModCommonConfigs.STELLAR_ORE_VEIN_SIZE.get()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_CERIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CERIUM_BLOCK.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CERIUM_ORE = FeatureUtils.register("cerium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_CERIUM_ORES, StarlightModCommonConfigs.CERIUM_ORE_VEIN_SIZE.get()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_AQUELLIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.AQUELLIUM_BLOCK.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> AQUELLIUM_ORE = FeatureUtils.register("aquellium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_AQUELLIUM_ORES, StarlightModCommonConfigs.AQUELLIUM_ORE_VEIN_SIZE.get()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SATELLA_ORES = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.SATELLA_BLOCK.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SATELLA_ORE = FeatureUtils.register("satella_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_SATELLA_ORES, StarlightModCommonConfigs.SATELLA_ORE_VEIN_SIZE.get()));

    public static final List<OreConfiguration.TargetBlockState> NETHER_PYRELLIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.PYRELLIUM_BLOCK.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_PYRELLIUM_ORE = FeatureUtils.register("nether_pyrellium_ore",
            Feature.ORE, new OreConfiguration(NETHER_PYRELLIUM_ORES, 9));

    public static final List<OreConfiguration.TargetBlockState> NETHER_RUNITITE_ORES = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.RUNITITE_BLOCK.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_RUNITITE_ORE = FeatureUtils.register("nether_runitite_ore",
            Feature.ORE, new OreConfiguration(NETHER_RUNITITE_ORES, 9));

    public static final List<OreConfiguration.TargetBlockState> END_AETHER_ORES = List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.AETHER_BLOCK.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> END_AETHER_ORE = FeatureUtils.register("end_aether_ore",
            Feature.ORE, new OreConfiguration(END_AETHER_ORES, 9));

    public static final List<OreConfiguration.TargetBlockState> END_ZOE_ORES = List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.ZOE_BLOCK.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> END_ZOE_ORE = FeatureUtils.register("end_zoe_ore",
            Feature.ORE, new OreConfiguration(END_ZOE_ORES, 9));
}
