package net.godslayer.starlightmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class StarlightModCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> STELLAR_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> STELLAR_ORE_VEIN_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> CERIUM_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> CERIUM_ORE_VEIN_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> AQUELLIUM_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> AQUELLIUM_ORE_VEIN_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> SATELLA_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> SATELLA_ORE_VEIN_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> PYRELLIUM_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> PYRELLIUM_ORE_VEIN_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> RUNITITE_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> RUNITITE_ORE_VEIN_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> AETHER_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> AETHER_ORE_VEIN_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> ZOE_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> ZOE_ORE_VEIN_SIZE;

    static {
        BUILDER.push("Configs for Starlight Mod");

        STELLAR_ORE_VEINS_PER_CHUNK = BUILDER.comment("Number of Stellar Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 7);
        STELLAR_ORE_VEIN_SIZE = BUILDER.comment("Number of Stellar Ore Blocks spawn in one Vein!")
                .defineInRange("Vein Size", 9, 4, 20);

        CERIUM_ORE_VEINS_PER_CHUNK = BUILDER.comment("Number of Cerium Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 7);
        CERIUM_ORE_VEIN_SIZE = BUILDER.comment("Number of Cerium Ore Blocks spawn in one Vein!")
                .defineInRange("Vein Size", 9, 4, 20);

        AQUELLIUM_ORE_VEINS_PER_CHUNK = BUILDER.comment("Number of Aquellium Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 7);
        AQUELLIUM_ORE_VEIN_SIZE = BUILDER.comment("Number of Aquellium Ore Blocks spawn in one Vein!")
                .defineInRange("Vein Size", 9, 4, 20);

        SATELLA_ORE_VEINS_PER_CHUNK = BUILDER.comment("Number of Aquellium Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 7);
        SATELLA_ORE_VEIN_SIZE = BUILDER.comment("Number of Aquellium Ore Blocks spawn in one Vein!")
                .defineInRange("Vein Size", 9, 4, 20);

        PYRELLIUM_ORE_VEINS_PER_CHUNK = BUILDER.comment("Number of Pyrellium Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 7);
        PYRELLIUM_ORE_VEIN_SIZE = BUILDER.comment("Number of Pyrellium Ore Blocks spawn in one Vein!")
                .defineInRange("Vein Size", 9, 4, 20);

        RUNITITE_ORE_VEINS_PER_CHUNK = BUILDER.comment("Number of Runitite Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 7);
        RUNITITE_ORE_VEIN_SIZE = BUILDER.comment("Number of Runitite Ore Blocks spawn in one Vein!")
                .defineInRange("Vein Size", 9, 4, 20);

        AETHER_ORE_VEINS_PER_CHUNK = BUILDER.comment("Number of Aether Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 7);
        AETHER_ORE_VEIN_SIZE = BUILDER.comment("Number of Aether Ore Blocks spawn in one Vein!")
                .defineInRange("Vein Size", 9, 4, 20);

        ZOE_ORE_VEINS_PER_CHUNK = BUILDER.comment("Number of Zoe Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 7);
        ZOE_ORE_VEIN_SIZE = BUILDER.comment("Number of Zoe Ore Blocks spawn in one Vein!")
                .defineInRange("Vein Size", 9, 4, 20);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
