package net.godslayer.starlightmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier STELLAR = new ForgeTier(2, 1500, 1.5f, 2f, 25, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.STELLAR.get()));
    public static final ForgeTier CERIUM = new ForgeTier(2, 1500, 1.5f, 2f, 25, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.CERIUM.get()));
    public static final ForgeTier AQUELLIUM = new ForgeTier(3, 2500, 2.5f, 4f, 25, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.AQUELLIUM.get()));
    public static final ForgeTier SATELLA = new ForgeTier(3, 2500, 2.5f, 4f, 25, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.SATELLA.get()));
    public static final ForgeTier PYRELLIUM = new ForgeTier(3, 2500, 2.5f, 5f, 25, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.PYRELLIUM.get()));
    public static final ForgeTier RUNITITE = new ForgeTier(4, 3500, 3.5f, 7f, 25, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.RUNITITE.get()));
    public static final ForgeTier AETHER = new ForgeTier(4, 4500, 4f, 8f, 25, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.AETHER.get()));
    public static final ForgeTier ZOE = new ForgeTier(4, 5500, 5f, 10f, 25, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.ZOE.get()));
}
