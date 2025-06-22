package net.maxflorescence.cobblemonsimplecreation.fluid;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.fluids.FluidType;

public class BaseFluidType extends FluidType {
    // Base fluid class for holding fluid properties that mod fluids will all extend.

    private final ResourceLocation stillTexture;
    private final ResourceLocation flowingTexture;
    private final int tintColor;

    public BaseFluidType(final ResourceLocation stillTexture, final ResourceLocation flowingTexture, 
                         final int tintColor, final Properties properties) {
        super(properties);
        this.stillTexture = stillTexture;
        this.flowingTexture = flowingTexture;
        this.tintColor = tintColor;
    }

    public ResourceLocation getStillTextureResourceLocation() {
        return stillTexture;
    }

    public ResourceLocation getFlowingTextureResourceLocation() {
        return flowingTexture;
    }

    public int getTintColor() {
        return tintColor;
    }
}
