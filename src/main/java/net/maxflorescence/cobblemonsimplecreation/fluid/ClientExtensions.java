package net.maxflorescence.cobblemonsimplecreation.fluid;

import net.maxflorescence.cobblemonsimplecreation.CobblemonSimpleCreation;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.fluids.FluidType;

@EventBusSubscriber(modid = CobblemonSimpleCreation.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientExtensions {

        @SubscribeEvent
        public static void registerClientExtensions(RegisterClientExtensionsEvent event) {
                registerFluidTypeExtension(event, ModFluidTypes.MEDICINAL_BREW_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.POTION_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.SUPER_POTION_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.HYPER_POTION_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.MAX_POTION_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.FULL_RESTORE_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.BURN_HEAL_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.ICE_HEAL_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.PARALYZE_HEAL_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.ANTIDOTE_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.AWAKENING_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.FULL_HEAL_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.ETHER_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.ELIXIR_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.MAX_ETHER_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.MAX_ELIXIR_FLUID_TYPE.get());

                registerFluidTypeExtension(event, ModFluidTypes.PROTEIN_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.CALCIUM_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.IRON_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.ZINC_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.CARBOS_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.HP_UP_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.PP_UP_FLUID_TYPE.get());
                registerFluidTypeExtension(event, ModFluidTypes.PP_MAX_FLUID_TYPE.get());

                registerFluidTypeExtension(event, ModFluidTypes.BERRY_JUICE_FLUID_TYPE.get());
        }

        private static void registerFluidTypeExtension(RegisterClientExtensionsEvent event, FluidType type) {
            if (type instanceof BaseFluidType baseFluidType) {
                event.registerFluidType(new IClientFluidTypeExtensions() {
                    @Override
                    public ResourceLocation getStillTexture() {
                        return baseFluidType.getStillTextureResourceLocation();
                    }

                    @Override
                    public ResourceLocation getFlowingTexture() {
                        return baseFluidType.getFlowingTextureResourceLocation();
                    }

                    @Override
                    public int getTintColor() {
                        return baseFluidType.getTintColor();
                    }
                }, type);
            }
        }
}
