package net.godslayer.starlightmod.integration;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.godslayer.starlightmod.Starlightmod;
import net.minecraft.resources.ResourceLocation;

@JeiPlugin
public class JEIStarlightModPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Starlightmod.MOD_ID, "jei_plugin");
    }
}
