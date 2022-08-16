package net.godslayer.starlightmod.item;

import net.godslayer.starlightmod.Starlightmod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    STELLAR("stellar", 30, new int[]{6, 9, 10, 6}, 10, SoundEvents.ARMOR_EQUIP_IRON, 2.0F, 1.0F, () -> Ingredient.of(ModItems.STELLAR.get())),

    CERIUM("cerium", 30, new int[]{6, 9, 10, 6}, 10, SoundEvents.ARMOR_EQUIP_IRON, 2.0F, 1.0F, () -> Ingredient.of(ModItems.CERIUM.get())),

    AQUELLIUM("aquellium", 35, new int[]{9, 12, 13, 9}, 15, SoundEvents.ARMOR_EQUIP_IRON, 3.0F, 1.0F, () -> Ingredient.of(ModItems.AQUELLIUM.get())),

    SATELLA("satella", 35, new int[]{9, 12, 13, 9}, 15, SoundEvents.ARMOR_EQUIP_IRON, 3.0F, 1.0F, () -> Ingredient.of(ModItems.SATELLA.get())),

    PYRELLIUM("pyrellium", 50, new int[]{20, 23, 25, 20}, 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 5.0F, 5.0F, () -> Ingredient.of(ModItems.PYRELLIUM.get())),

    RUNITITE("runitite", 50, new int[]{20, 23, 25, 20}, 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 5.0F, 5.0F, () -> Ingredient.of(ModItems.RUNITITE.get())),

    AETHER("aether", 100, new int[]{300, 600, 800, 300}, 25, SoundEvents.ARMOR_EQUIP_NETHERITE, 50.0F, 10.0F, () -> Ingredient.of(ModItems.AETHER.get())),

    ZOE("zoe", 500, new int[]{500, 800, 1000, 500}, 25, SoundEvents.ARMOR_EQUIP_NETHERITE, 100.0F, 50.0F, () -> Ingredient.of(ModItems.ZOE.get()));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModArmorMaterials(String pName, int pDurabilityMultiplier, int[] pSlotProtections, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier<Ingredient> pRepairIngredient) {
        this.name = pName;
        this.durabilityMultiplier = pDurabilityMultiplier;
        this.slotProtections = pSlotProtections;
        this.enchantmentValue = pEnchantmentValue;
        this.sound = pSound;
        this.toughness = pToughness;
        this.knockbackResistance = pKnockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return Starlightmod.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    /**
     * Gets the percentage of knockback resistance provided by armor of the material.
     */
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
