package net.godslayer.starlightmod.painting;

import net.godslayer.starlightmod.Starlightmod;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<Motive> PAINTING_MOTIVES = DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, Starlightmod.MOD_ID);

    public static final RegistryObject<Motive> SPIRAL_GIRL = PAINTING_MOTIVES.register("spiral_girl", () -> new Motive(32,16));

    public static void register(IEventBus eventBus) {
        PAINTING_MOTIVES.register(eventBus);
    }
}
