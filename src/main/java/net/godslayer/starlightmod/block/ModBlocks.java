package net.godslayer.starlightmod.block;

import net.godslayer.starlightmod.Starlightmod;
import net.godslayer.starlightmod.block.custom.BlackDahliaPlantBlock;
import net.godslayer.starlightmod.block.custom.ModFlammableRotatedPillarBlock;
import net.godslayer.starlightmod.block.custom.StarflowerPlantBlock;
import net.godslayer.starlightmod.block.custom.TwinflowerPlantBlock;
import net.godslayer.starlightmod.item.ModCreativeModeTab;
import net.godslayer.starlightmod.item.ModItems;
import net.godslayer.starlightmod.world.feature.tree.LuminaryTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Starlightmod.MOD_ID);

    public static final RegistryObject<Block> STELLAR_BLOCK = registerBlock("stellar_block", () -> new OreBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> CERIUM_BLOCK = registerBlock("cerium_block", () -> new OreBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(4f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AQUELLIUM_BLOCK = registerBlock("aquellium_block", () -> new OreBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(4f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> SATELLA_BLOCK = registerBlock("satella_block", () -> new OreBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(5f).requiresCorrectToolForDrops(), UniformInt.of(4, 7)), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> PYRELLIUM_BLOCK = registerBlock("pyrellium_block", () -> new OreBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(7f).requiresCorrectToolForDrops(), UniformInt.of(4, 8)), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> RUNITITE_BLOCK = registerBlock("runitite_block", () -> new OreBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(7f).requiresCorrectToolForDrops(), UniformInt.of(4, 8)), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AETHER_BLOCK = registerBlock("aether_block", () -> new OreBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(9f).requiresCorrectToolForDrops(), UniformInt.of(5, 9)), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> ZOE_BLOCK = registerBlock("zoe_block", () -> new OreBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(9f).requiresCorrectToolForDrops(), UniformInt.of(5, 9)), ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> STELLAR_RAW = registerBlock("stellar_raw", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> CERIUM_RAW = registerBlock("cerium_raw", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AQUELLIUM_RAW = registerBlock("aquellium_raw", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> SATELLA_RAW = registerBlock("satella_raw", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> PYRELLIUM_RAW = registerBlock("pyrellium_raw", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> RUNITITE_RAW = registerBlock("runitite_raw", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AETHER_RAW = registerBlock("aether_raw", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> ZOE_RAW = registerBlock("zoe_raw", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> STELLAR_STAIRS = registerBlock("stellar_stairs", () -> new StairBlock(() -> ModBlocks.STELLAR_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> CERIUM_STAIRS = registerBlock("cerium_stairs", () -> new StairBlock(() -> ModBlocks.CERIUM_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AQUELLIUM_STAIRS = registerBlock("aquellium_stairs", () -> new StairBlock(() -> ModBlocks.AQUELLIUM_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> SATELLA_STAIRS = registerBlock("satella_stairs", () -> new StairBlock(() -> ModBlocks.SATELLA_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> PYRELLIUM_STAIRS = registerBlock("pyrellium_stairs", () -> new StairBlock(() -> ModBlocks.PYRELLIUM_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> RUNITITE_STAIRS = registerBlock("runitite_stairs", () -> new StairBlock(() -> ModBlocks.RUNITITE_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AETHER_STAIRS = registerBlock("aether_stairs", () -> new StairBlock(() -> ModBlocks.AETHER_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> ZOE_STAIRS = registerBlock("zoe_stairs", () -> new StairBlock(() -> ModBlocks.ZOE_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> STELLAR_SLAB = registerBlock("stellar_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> CERIUM_SLAB = registerBlock("cerium_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AQUELLIUM_SLAB = registerBlock("aquellium_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> SATELLA_SLAB = registerBlock("satella_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> PYRELLIUM_SLAB = registerBlock("pyrellium_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> RUNITITE_SLAB = registerBlock("runitite_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AETHER_SLAB = registerBlock("aether_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> ZOE_SLAB = registerBlock("zoe_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> STELLAR_FENCE = registerBlock("stellar_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> CERIUM_FENCE = registerBlock("cerium_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AQUELLIUM_FENCE = registerBlock("aquellium_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> SATELLA_FENCE = registerBlock("satella_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> PYRELLIUM_FENCE = registerBlock("pyrellium_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> RUNITITE_FENCE = registerBlock("runitite_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AETHER_FENCE = registerBlock("aether_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> ZOE_FENCE = registerBlock("zoe_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> STELLAR_FENCE_GATE = registerBlock("stellar_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> CERIUM_FENCE_GATE = registerBlock("cerium_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AQUELLIUM_FENCE_GATE = registerBlock("aquellium_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> SATELLA_FENCE_GATE = registerBlock("satella_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> PYRELLIUM_FENCE_GATE = registerBlock("pyrellium_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> RUNITITE_FENCE_GATE = registerBlock("runitite_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AETHER_FENCE_GATE = registerBlock("aether_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> ZOE_FENCE_GATE = registerBlock("zoe_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> STELLAR_WALL = registerBlock("stellar_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> CERIUM_WALL = registerBlock("cerium_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AQUELLIUM_WALL = registerBlock("aquellium_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> SATELLA_WALL = registerBlock("satella_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> PYRELLIUM_WALL = registerBlock("pyrellium_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> RUNITITE_WALL = registerBlock("runitite_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AETHER_WALL = registerBlock("aether_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> ZOE_WALL = registerBlock("zoe_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> STELLAR_BUTTON = registerBlock("stellar_button", () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> CERIUM_BUTTON = registerBlock("cerium_button", () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AQUELLIUM_BUTTON = registerBlock("aquellium_button", () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> SATELLA_BUTTON = registerBlock("satella_button", () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> PYRELLIUM_BUTTON = registerBlock("pyrellium_button", () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> RUNITITE_BUTTON = registerBlock("runitite_button", () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AETHER_BUTTON = registerBlock("aether_button", () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> ZOE_BUTTON = registerBlock("zoe_button", () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> LUMINARY_BUTTON = registerBlock("luminary_button", () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> LUMINARY_PRESSURE_PLATE = registerBlock("luminary_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> STELLAR_PRESSURE_PLATE = registerBlock("stellar_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> CERIUM_PRESSURE_PLATE = registerBlock("cerium_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AQUELLIUM_PRESSURE_PLATE = registerBlock("aquellium_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> SATELLA_PRESSURE_PLATE = registerBlock("satella_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> PYRELLIUM_PRESSURE_PLATE = registerBlock("pyrellium_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> RUNITITE_PRESSURE_PLATE = registerBlock("runitite_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AETHER_PRESSURE_PLATE = registerBlock("aether_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> ZOE_PRESSURE_PLATE = registerBlock("zoe_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> LUMINARY_DOOR = registerBlock("luminary_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> LUMINARY_TRAPDOOR = registerBlock("luminary_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> STARFLOWER = registerBlock("starflower", () -> new FlowerBlock(MobEffects.LUCK, 10, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noOcclusion()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> POTTED_STARFLOWER = registerBlockWithoutBlockItem("potted_starflower", () -> new FlowerPotBlock(null, ModBlocks.STARFLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));

    public static final RegistryObject<Block> BLACK_DAHLIA = registerBlock("black_dahlia", () -> new FlowerBlock(MobEffects.GLOWING, 10, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noOcclusion()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> POTTED_BLACK_DAHLIA = registerBlockWithoutBlockItem("potted_black_dahlia", () -> new FlowerPotBlock(null, ModBlocks.BLACK_DAHLIA, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));

    public static final RegistryObject<Block> TWINFLOWER = registerBlock("twinflower", () -> new FlowerBlock(MobEffects.REGENERATION, 10, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noOcclusion()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> POTTED_TWINFLOWER = registerBlockWithoutBlockItem("potted_twinflower", () -> new FlowerPotBlock(null, ModBlocks.TWINFLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));

    public static final RegistryObject<Block> STELLAR_GLASS = registerBlock("stellar_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS).noOcclusion()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> CERIUM_GLASS = registerBlock("cerium_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS).noOcclusion()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AQUELLIUM_GLASS = registerBlock("aquellium_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS).noOcclusion()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> SATELLA_GLASS = registerBlock("satella_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS).noOcclusion()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> PYRELLIUM_GLASS = registerBlock("pyrellium_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS).noOcclusion()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> RUNITITE_GLASS = registerBlock("runitite_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS).noOcclusion()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> AETHER_GLASS = registerBlock("aether_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS).noOcclusion()), ModCreativeModeTab.STARLIGHT_TAB);
    public static final RegistryObject<Block> ZOE_GLASS = registerBlock("zoe_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS).noOcclusion()), ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> STARFLOWER_PLANT = registerBlockWithoutBlockItem("starflower_plant", () -> new StarflowerPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> TWINFLOWER_PLANT = registerBlockWithoutBlockItem("twinflower_plant", () -> new TwinflowerPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> BLACKDAHLIA_PLANT = registerBlockWithoutBlockItem("blackdahlia_plant", () -> new BlackDahliaPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> LUMINARY_LOG = registerBlock("luminary_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG)), ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> LUMINARY_WOOD = registerBlock("luminary_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD)), ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> STRIPPED_LUMINARY_LOG = registerBlock("stripped_luminary_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG)), ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> STRIPPED_LUMINARY_WOOD = registerBlock("stripped_luminary_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_WOOD)), ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> LUMINARY_PLANKS = registerBlock("luminary_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> LUMINARY_LEAVES = registerBlock("luminary_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES)) {
        @Override
        public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return true;
        }

        @Override
        public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return 60;
        }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return 30;
        }
    }, ModCreativeModeTab.STARLIGHT_TAB);

    public static final RegistryObject<Block> LUMINARY_SAPLING = registerBlock("luminary_sapling", () -> new SaplingBlock(new LuminaryTreeGrower(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_SAPLING)), ModCreativeModeTab.STARLIGHT_TAB);

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
