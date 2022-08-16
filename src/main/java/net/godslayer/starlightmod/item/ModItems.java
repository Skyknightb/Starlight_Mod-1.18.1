package net.godslayer.starlightmod.item;

import net.godslayer.starlightmod.Starlightmod;
import net.godslayer.starlightmod.block.ModBlocks;
import net.godslayer.starlightmod.item.custom.ModArmorItem;
import net.godslayer.starlightmod.item.custom.poison_sword_item;
import net.godslayer.starlightmod.item.custom.pyre_crystal;
import net.godslayer.starlightmod.item.custom.wither_sword_item;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Starlightmod.MOD_ID);

//Raw Crystals

    public static final RegistryObject<Item> STELLAR = ITEMS.register( "stellar",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> CERIUM = ITEMS.register( "cerium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AQUELLIUM = ITEMS.register( "aquellium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> SATELLA = ITEMS.register( "satella",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> PYRELLIUM = ITEMS.register( "pyrellium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> RUNITITE = ITEMS.register( "runitite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AETHER = ITEMS.register( "aether",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> ZOE = ITEMS.register( "zoe",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> STELLAR_CRYSTAL = ITEMS.register( "stellar_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> CERIUM_CRYSTAL = ITEMS.register( "cerium_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AQUELLIUM_CRYSTAL = ITEMS.register( "aquellium_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> SATELLA_CRYSTAL = ITEMS.register( "satella_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> PYRELLIUM_CRYSTAL = ITEMS.register( "pyrellium_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> RUNITITE_CRYSTAL = ITEMS.register( "runitite_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AETHER_CRYSTAL = ITEMS.register( "aether_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> ZOE_CRYSTAL = ITEMS.register( "zoe_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

//Fuel Items

    public static final RegistryObject<Item> PYRE_CRYSTAL = ITEMS.register( "pyre_crystal",
            () -> new pyre_crystal(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

//Pickaxe Items

    public static final RegistryObject<Item> STELLAR_PICKAXE = ITEMS.register( "stellar_pickaxe",
            () -> new PickaxeItem(ModTiers.STELLAR, 1, 1f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> CERIUM_PICKAXE = ITEMS.register( "cerium_pickaxe",
            () -> new PickaxeItem(ModTiers.CERIUM, 1, 1f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AQUELLIUM_PICKAXE = ITEMS.register( "aquellium_pickaxe",
            () -> new PickaxeItem(ModTiers.AQUELLIUM, 2, 2f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> SATELLA_PICKAXE = ITEMS.register( "satella_pickaxe",
            () -> new PickaxeItem(ModTiers.SATELLA, 2, 2f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> PYRELLIUM_PICKAXE = ITEMS.register( "pyrellium_pickaxe",
            () -> new PickaxeItem(ModTiers.PYRELLIUM, 2, 2f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> RUNITITE_PICKAXE = ITEMS.register( "runitite_pickaxe",
            () -> new PickaxeItem(ModTiers.RUNITITE, 3, 3f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AETHER_PICKAXE = ITEMS.register( "aether_pickaxe",
            () -> new PickaxeItem(ModTiers.AETHER, 3, 3f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> ZOE_PICKAXE = ITEMS.register( "zoe_pickaxe",
            () -> new PickaxeItem(ModTiers.ZOE, 4, 4f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

//Axe Items

    public static final RegistryObject<Item> STELLAR_AXE = ITEMS.register( "stellar_axe",
            () -> new AxeItem(ModTiers.STELLAR, 1, 1f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> CERIUM_AXE = ITEMS.register( "cerium_axe",
            () -> new AxeItem(ModTiers.CERIUM, 1, 1f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AQUELLIUM_AXE = ITEMS.register( "aquellium_axe",
            () -> new AxeItem(ModTiers.AQUELLIUM, 2, 2f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> SATELLA_AXE = ITEMS.register( "satella_axe",
            () -> new AxeItem(ModTiers.SATELLA, 2, 2f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> PYRELLIUM_AXE = ITEMS.register( "pyrellium_axe",
            () -> new AxeItem(ModTiers.PYRELLIUM, 2, 2f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> RUNITITE_AXE = ITEMS.register( "runitite_axe",
            () -> new AxeItem(ModTiers.RUNITITE, 3, 3f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AETHER_AXE = ITEMS.register( "aether_axe",
            () -> new AxeItem(ModTiers.AETHER, 3, 3f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> ZOE_AXE = ITEMS.register( "zoe_axe",
            () -> new AxeItem(ModTiers.ZOE, 4, 4f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

//Shovel Items

    public static final RegistryObject<Item> STELLAR_SHOVEL = ITEMS.register( "stellar_shovel",
            () -> new ShovelItem(ModTiers.STELLAR, 1, 1f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> CERIUM_SHOVEL = ITEMS.register( "cerium_shovel",
            () -> new ShovelItem(ModTiers.CERIUM, 1, 1f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AQUELLIUM_SHOVEL = ITEMS.register( "aquellium_shovel",
            () -> new ShovelItem(ModTiers.AQUELLIUM, 2, 2f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> SATELLA_SHOVEL = ITEMS.register( "satella_shovel",
            () -> new ShovelItem(ModTiers.SATELLA, 2, 2f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> PYRELLIUM_SHOVEL = ITEMS.register( "pyrellium_shovel",
            () -> new ShovelItem(ModTiers.PYRELLIUM, 2, 2f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> RUNITITE_SHOVEL = ITEMS.register( "runitite_shovel",
            () -> new ShovelItem(ModTiers.RUNITITE, 3, 3f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AETHER_SHOVEL = ITEMS.register( "aether_shovel",
            () -> new ShovelItem(ModTiers.AETHER, 3, 3f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> ZOE_SHOVEL = ITEMS.register( "zoe_shovel",
            () -> new ShovelItem(ModTiers.ZOE, 4, 4f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

//Hoe Items

    public static final RegistryObject<Item> STELLAR_HOE = ITEMS.register( "stellar_hoe",
            () -> new HoeItem(ModTiers.STELLAR, 1, 1f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> CERIUM_HOE = ITEMS.register( "cerium_hoe",
            () -> new HoeItem(ModTiers.CERIUM, 1, 1f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AQUELLIUM_HOE = ITEMS.register( "aquellium_hoe",
            () -> new HoeItem(ModTiers.AQUELLIUM, 2, 2f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> SATELLA_HOE = ITEMS.register( "satella_hoe",
            () -> new HoeItem(ModTiers.SATELLA, 2, 2f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> PYRELLIUM_HOE = ITEMS.register( "pyrellium_hoe",
            () -> new HoeItem(ModTiers.PYRELLIUM, 2, 2f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> RUNITITE_HOE = ITEMS.register( "runitite_hoe",
            () -> new HoeItem(ModTiers.RUNITITE, 3, 3f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AETHER_HOE = ITEMS.register( "aether_hoe",
            () -> new HoeItem(ModTiers.AETHER, 3, 3f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> ZOE_HOE = ITEMS.register( "zoe_hoe",
            () -> new HoeItem(ModTiers.ZOE, 4, 4f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

//Sword Items

    public static final RegistryObject<Item> STELLAR_SWORD = ITEMS.register( "stellar_sword",
            () -> new SwordItem(ModTiers.STELLAR, 1, 1f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> CERIUM_SWORD = ITEMS.register( "cerium_sword",
            () -> new poison_sword_item(ModTiers.CERIUM, 1, 1f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AQUELLIUM_SWORD = ITEMS.register( "aquellium_sword",
            () -> new SwordItem(ModTiers.AQUELLIUM, 2, 2f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> SATELLA_SWORD = ITEMS.register( "satella_sword",
            () -> new SwordItem(ModTiers.SATELLA, 2, 2f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> PYRELLIUM_SWORD = ITEMS.register( "pyrellium_sword",
            () -> new SwordItem(ModTiers.PYRELLIUM, 2, 2f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> RUNITITE_SWORD = ITEMS.register( "runitite_sword",
            () -> new poison_sword_item(ModTiers.RUNITITE, 3, 3f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AETHER_SWORD = ITEMS.register( "aether_sword",
            () -> new wither_sword_item(ModTiers.AETHER, 3, 3f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> ZOE_SWORD = ITEMS.register( "zoe_sword",
            () -> new wither_sword_item(ModTiers.ZOE, 4, 4f, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

//Armour Helmets

    public static final RegistryObject<Item> STELLAR_HELMET = ITEMS.register( "stellar_helmet",
            () -> new ArmorItem(ModArmorMaterials.STELLAR, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> CERIUM_HELMET = ITEMS.register( "cerium_helmet",
            () -> new ArmorItem(ModArmorMaterials.CERIUM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AQUELLIUM_HELMET = ITEMS.register( "aquellium_helmet",
            () -> new ModArmorItem(ModArmorMaterials.AQUELLIUM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> SATELLA_HELMET = ITEMS.register( "satella_helmet",
            () -> new ArmorItem(ModArmorMaterials.STELLAR, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> PYRELLIUM_HELMET = ITEMS.register( "pyrellium_helmet",
            () -> new ModArmorItem(ModArmorMaterials.PYRELLIUM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> RUNITITE_HELMET = ITEMS.register( "runitite_helmet",
            () -> new ArmorItem(ModArmorMaterials.RUNITITE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AETHER_HELMET = ITEMS.register( "aether_helmet",
            () -> new ModArmorItem(ModArmorMaterials.AETHER, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> ZOE_HELMET = ITEMS.register( "zoe_helmet",
            () -> new ModArmorItem(ModArmorMaterials.ZOE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

//Armour Chestplates

    public static final RegistryObject<Item> STELLAR_CHESTPLATE = ITEMS.register( "stellar_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STELLAR, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> CERIUM_CHESTPLATE = ITEMS.register( "cerium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CERIUM, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AQUELLIUM_CHESTPLATE = ITEMS.register( "aquellium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AQUELLIUM, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> SATELLA_CHESTPLATE = ITEMS.register( "satella_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SATELLA, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> PYRELLIUM_CHESTPLATE = ITEMS.register( "pyrellium_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.PYRELLIUM, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> RUNITITE_CHESTPLATE = ITEMS.register( "runitite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RUNITITE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AETHER_CHESTPLATE = ITEMS.register( "aether_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AETHER, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> ZOE_CHESTPLATE = ITEMS.register( "zoe_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ZOE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    //Armour Leggings

    public static final RegistryObject<Item> STELLAR_LEGGINGS = ITEMS.register( "stellar_leggings",
            () -> new ArmorItem(ModArmorMaterials.STELLAR, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> CERIUM_LEGGINGS = ITEMS.register( "cerium_leggings",
            () -> new ArmorItem(ModArmorMaterials.CERIUM, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AQUELLIUM_LEGGINGS = ITEMS.register( "aquellium_leggings",
            () -> new ArmorItem(ModArmorMaterials.AQUELLIUM, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> SATELLA_LEGGINGS = ITEMS.register( "satella_leggings",
            () -> new ArmorItem(ModArmorMaterials.SATELLA, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> PYRELLIUM_LEGGINGS = ITEMS.register( "pyrellium_leggings",
            () -> new ArmorItem(ModArmorMaterials.PYRELLIUM, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> RUNITITE_LEGGINGS = ITEMS.register( "runitite_leggings",
            () -> new ArmorItem(ModArmorMaterials.RUNITITE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AETHER_LEGGINGS = ITEMS.register( "aether_leggings",
            () -> new ArmorItem(ModArmorMaterials.AETHER, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> ZOE_LEGGINGS = ITEMS.register( "zoe_leggings",
            () -> new ArmorItem(ModArmorMaterials.ZOE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

//Armour Boots

    public static final RegistryObject<Item> STELLAR_BOOTS = ITEMS.register( "stellar_boots",
            () -> new ArmorItem(ModArmorMaterials.STELLAR, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> CERIUM_BOOTS = ITEMS.register( "cerium_boots",
            () -> new ArmorItem(ModArmorMaterials.CERIUM, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AQUELLIUM_BOOTS = ITEMS.register( "aquellium_boots",
            () -> new ArmorItem(ModArmorMaterials.AQUELLIUM, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> SATELLA_BOOTS = ITEMS.register( "satella_boots",
            () -> new ArmorItem(ModArmorMaterials.SATELLA, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> PYRELLIUM_BOOTS = ITEMS.register( "pyrellium_boots",
            () -> new ArmorItem(ModArmorMaterials.PYRELLIUM, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> RUNITITE_BOOTS = ITEMS.register( "runitite_boots",
            () -> new ArmorItem(ModArmorMaterials.RUNITITE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> AETHER_BOOTS = ITEMS.register( "aether_boots",
            () -> new ArmorItem(ModArmorMaterials.AETHER, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> ZOE_BOOTS = ITEMS.register( "zoe_boots",
            () -> new ArmorItem(ModArmorMaterials.ZOE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> RUNITITE_BOW = ITEMS.register( "runitite_bow",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB).durability(2500)));

    public static final RegistryObject<Item> ZOE_BOW = ITEMS.register( "zoe_bow",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB).durability(5000)));

    public static final RegistryObject<Item> STARFLOWER_SEEDS = ITEMS.register("starflower_seeds",
            () -> new ItemNameBlockItem(ModBlocks.STARFLOWER_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> TWINFLOWER_SEEDS = ITEMS.register("twinflower_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TWINFLOWER_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static final RegistryObject<Item> BLACKDAHLIA_SEEDS = ITEMS.register("blackdahlia_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BLACKDAHLIA_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.STARLIGHT_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
