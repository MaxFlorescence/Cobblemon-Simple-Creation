package net.maxflorescence.cobblemonsimplecreation.fluid;

import org.jetbrains.annotations.NotNull;

import net.maxflorescence.cobblemonsimplecreation.CobblemonSimpleCreation;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModFluidTypes {
    public static final ResourceLocation BREW_STILL_RESOURCE_LOCATION = ResourceLocation.fromNamespaceAndPath("cobblemonsimplecreation", "block/brew_still");
    public static final ResourceLocation BREW_FLOWING_RESOURCE_LOCATION = ResourceLocation.fromNamespaceAndPath("cobblemonsimplecreation", "block/brew_flow");

    // Create a Deferred Register to hold FluidTypes which will all be registered under the mod's namespace
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(
        NeoForgeRegistries.Keys.FLUID_TYPES, CobblemonSimpleCreation.MODID
    );

    public static final DeferredHolder<FluidType, BaseFluidType> MEDICINAL_BREW_FLUID_TYPE = registerFluidType(
        "medicinal_brew_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
                .descriptionId("fluid_type.cobblemonsimplecreation.medicinal_brew_fluid_type"),
        0xff_2b9986
    );

    public static final DeferredHolder<FluidType, BaseFluidType> POTION_FLUID_TYPE = registerFluidType(
        "potion_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
                .descriptionId("fluid_type.cobblemonsimplecreation.potion_fluid_type"),
        0xff_916db8
    );

    public static final DeferredHolder<FluidType, BaseFluidType> SUPER_POTION_FLUID_TYPE = registerFluidType(
        "super_potion_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
                .descriptionId("fluid_type.cobblemonsimplecreation.super_potion_fluid_type"),
        0xff_ce7b6b
    );

    public static final DeferredHolder<FluidType, BaseFluidType> HYPER_POTION_FLUID_TYPE = registerFluidType(
        "hyper_potion_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
                .descriptionId("fluid_type.cobblemonsimplecreation.hyper_potion_fluid_type"),
        0xff_e47ab9
    );

    public static final DeferredHolder<FluidType, BaseFluidType> MAX_POTION_FLUID_TYPE = registerFluidType(
        "max_potion_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
                .descriptionId("fluid_type.cobblemonsimplecreation.max_potion_fluid_type"),
        0xff_2078c0
    );

    public static final DeferredHolder<FluidType, BaseFluidType> FULL_RESTORE_FLUID_TYPE = registerFluidType(
        "full_restore_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
                .descriptionId("fluid_type.cobblemonsimplecreation.full_restore_fluid_type"),
        0xff_62aa36
    );

    public static final DeferredHolder<FluidType, BaseFluidType> BURN_HEAL_FLUID_TYPE = registerFluidType(
        "burn_heal_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
                .descriptionId("fluid_type.cobblemonsimplecreation.burn_heal_fluid_type"),
        0xff_97ffb8
    );

    public static final DeferredHolder<FluidType, BaseFluidType> ICE_HEAL_FLUID_TYPE = registerFluidType(
        "ice_heal_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.ice_heal_fluid_type"),
        0xff_ffd0cc
    );

    public static final DeferredHolder<FluidType, BaseFluidType> PARALYZE_HEAL_FLUID_TYPE = registerFluidType(
        "paralyze_heal_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.paralyze_heal_fluid_type"),
        0xff_d2ea42
    );

    public static final DeferredHolder<FluidType, BaseFluidType> ANTIDOTE_FLUID_TYPE = registerFluidType(
        "antidote_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.antidote_fluid_type"),
        0xff_fffa8d
    );

    public static final DeferredHolder<FluidType, BaseFluidType> AWAKENING_FLUID_TYPE = registerFluidType(
        "awakening_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.awakening_fluid_type"),
        0xff_71d9e9
    );

    public static final DeferredHolder<FluidType, BaseFluidType> FULL_HEAL_FLUID_TYPE = registerFluidType(
        "full_heal_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.full_heal_fluid_type"),
        0xff_f7ef3f
    );

    public static final DeferredHolder<FluidType, BaseFluidType> ETHER_FLUID_TYPE = registerFluidType(
        "ether_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.ether_fluid_type"),
        0xff_d8a8e0
    );

    public static final DeferredHolder<FluidType, BaseFluidType> ELIXIR_FLUID_TYPE = registerFluidType(
        "elixir_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.elixir_fluid_type"),
        0xff_f1b097
    );

    public static final DeferredHolder<FluidType, BaseFluidType> MAX_ETHER_FLUID_TYPE = registerFluidType(
        "max_ether_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.max_ether_fluid_type"),
        0xff_b9f197
    );

    public static final DeferredHolder<FluidType, BaseFluidType> MAX_ELIXIR_FLUID_TYPE = registerFluidType(
        "max_elixir_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.max_elixir_fluid_type"),
        0xff_97f1e4
    );

    public static final DeferredHolder<FluidType, BaseFluidType> PROTEIN_FLUID_TYPE = registerFluidType(
        "protein_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.protein_fluid_type"),
        0xff_e48f0b
    );

    public static final DeferredHolder<FluidType, BaseFluidType> CALCIUM_FLUID_TYPE = registerFluidType(
        "calcium_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.calcium_fluid_type"),
        0xff_df432a
    );

    public static final DeferredHolder<FluidType, BaseFluidType> IRON_FLUID_TYPE = registerFluidType(
        "iron_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.iron_fluid_type"),
        0xff_269b27
    );

    public static final DeferredHolder<FluidType, BaseFluidType> ZINC_FLUID_TYPE = registerFluidType(
        "zinc_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.zinc_fluid_type"),
        0xff_72ca2a
    );

    public static final DeferredHolder<FluidType, BaseFluidType> CARBOS_FLUID_TYPE = registerFluidType(
        "carbos_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.carbos_fluid_type"),
        0xff_1d90df
    );

    public static final DeferredHolder<FluidType, BaseFluidType> HP_UP_FLUID_TYPE = registerFluidType(
        "hp_up_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.hp_up_fluid_type"),
        0xff_6eabff
    );

    public static final DeferredHolder<FluidType, BaseFluidType> PP_UP_FLUID_TYPE = registerFluidType(
        "pp_up_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.pp_up_fluid_type"),
        0xff_3ea3a1
    );

    public static final DeferredHolder<FluidType, BaseFluidType> PP_MAX_FLUID_TYPE = registerFluidType(
        "pp_max_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.pp_max_fluid_type"),
        0xff_b26cb8
    );
    
    public static final DeferredHolder<FluidType, BaseFluidType> BERRY_JUICE_FLUID_TYPE = registerFluidType(
        "berry_juice_fluid_type",
        FluidType.Properties.create().density(1000).viscosity(1000)
        .descriptionId("fluid_type.cobblemonsimplecreation.berry_juice_fluid_type"),
        0xff_e8b870
    );

    private static @NotNull DeferredHolder<FluidType, BaseFluidType> registerFluidType(String name, FluidType.Properties properties, int tintColor) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(
                BREW_STILL_RESOURCE_LOCATION,
                BREW_FLOWING_RESOURCE_LOCATION,
                tintColor,
                properties
        ));
    }

    public static void register(IEventBus modEventBus) {
        // Register the Deferred Register to the mod event bus so fluid types get registered
        FLUID_TYPES.register(modEventBus);
    }
}
