package net.maxflorescence.cobblemonsimplecreation.fluid;

import net.maxflorescence.cobblemonsimplecreation.CobblemonSimpleCreation;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModFluids {
    // Create a Deferred Register to hold FluidTypes which will all be registered under the mod's namespace
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(
        Registries.FLUID, CobblemonSimpleCreation.MODID
    );

    // Medicinal Brew
    public static final DeferredHolder<Fluid, FlowingFluid> MEDICINAL_BREW_SOURCE = FLUIDS.register(
            "medicinal_brew_source",
            () -> new BaseFlowingFluid.Source(ModFluids.MEDICINAL_BREW_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> MEDICINAL_BREW_FLOWING = FLUIDS.register(
            "medicinal_brew_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.MEDICINAL_BREW_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties MEDICINAL_BREW_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.MEDICINAL_BREW_FLUID_TYPE,
            MEDICINAL_BREW_SOURCE,
            MEDICINAL_BREW_FLOWING
    );

    // Potion
    public static final DeferredHolder<Fluid, FlowingFluid> POTION_SOURCE = FLUIDS.register(
            "potion_source",
            () -> new BaseFlowingFluid.Source(ModFluids.POTION_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> POTION_FLOWING = FLUIDS.register(
            "potion_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.POTION_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties POTION_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.POTION_FLUID_TYPE,
            POTION_SOURCE,
            POTION_FLOWING
    );

    // Super Potion
    public static final DeferredHolder<Fluid, FlowingFluid> SUPER_POTION_SOURCE = FLUIDS.register(
            "super_potion_source",
            () -> new BaseFlowingFluid.Source(ModFluids.SUPER_POTION_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> SUPER_POTION_FLOWING = FLUIDS.register(
            "super_potion_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.SUPER_POTION_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties SUPER_POTION_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.SUPER_POTION_FLUID_TYPE,
            SUPER_POTION_SOURCE,
            SUPER_POTION_FLOWING
    );

    // Hyper Potion
    public static final DeferredHolder<Fluid, FlowingFluid> HYPER_POTION_SOURCE = FLUIDS.register(
            "hyper_potion_source",
            () -> new BaseFlowingFluid.Source(ModFluids.HYPER_POTION_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> HYPER_POTION_FLOWING = FLUIDS.register(
            "hyper_potion_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.HYPER_POTION_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties HYPER_POTION_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.HYPER_POTION_FLUID_TYPE,
            HYPER_POTION_SOURCE,
            HYPER_POTION_FLOWING
    );

    // Max Potion
    public static final DeferredHolder<Fluid, FlowingFluid> MAX_POTION_SOURCE = FLUIDS.register(
            "max_potion_source",
            () -> new BaseFlowingFluid.Source(ModFluids.MAX_POTION_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> MAX_POTION_FLOWING = FLUIDS.register(
            "max_potion_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.MAX_POTION_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties MAX_POTION_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.MAX_POTION_FLUID_TYPE,
            MAX_POTION_SOURCE,
            MAX_POTION_FLOWING
    );

    // Full Restore
    public static final DeferredHolder<Fluid, FlowingFluid> FULL_RESTORE_SOURCE = FLUIDS.register(
            "full_restore_source",
            () -> new BaseFlowingFluid.Source(ModFluids.FULL_RESTORE_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> FULL_RESTORE_FLOWING = FLUIDS.register(
            "full_restore_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.FULL_RESTORE_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties FULL_RESTORE_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.FULL_RESTORE_FLUID_TYPE,
            FULL_RESTORE_SOURCE,
            FULL_RESTORE_FLOWING
    );

    // Burn Heal
    public static final DeferredHolder<Fluid, FlowingFluid> BURN_HEAL_SOURCE = FLUIDS.register(
            "burn_heal_source",
            () -> new BaseFlowingFluid.Source(ModFluids.BURN_HEAL_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> BURN_HEAL_FLOWING = FLUIDS.register(
            "burn_heal_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.BURN_HEAL_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties BURN_HEAL_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.BURN_HEAL_FLUID_TYPE,
            BURN_HEAL_SOURCE,
            BURN_HEAL_FLOWING
    );

    // Ice Heal
    public static final DeferredHolder<Fluid, FlowingFluid> ICE_HEAL_SOURCE = FLUIDS.register(
        "ice_heal_source",
        () -> new BaseFlowingFluid.Source(ModFluids.ICE_HEAL_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> ICE_HEAL_FLOWING = FLUIDS.register(
        "ice_heal_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.ICE_HEAL_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties ICE_HEAL_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.ICE_HEAL_FLUID_TYPE,
        ICE_HEAL_SOURCE,
        ICE_HEAL_FLOWING
    );

    // Paralyze Heal
    public static final DeferredHolder<Fluid, FlowingFluid> PARALYZE_HEAL_SOURCE = FLUIDS.register(
        "paralyze_heal_source",
        () -> new BaseFlowingFluid.Source(ModFluids.PARALYZE_HEAL_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> PARALYZE_HEAL_FLOWING = FLUIDS.register(
        "paralyze_heal_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.PARALYZE_HEAL_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties PARALYZE_HEAL_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.PARALYZE_HEAL_FLUID_TYPE,
        PARALYZE_HEAL_SOURCE,
        PARALYZE_HEAL_FLOWING
    );

    // Antidote
    public static final DeferredHolder<Fluid, FlowingFluid> ANTIDOTE_SOURCE = FLUIDS.register(
        "antidote_source",
        () -> new BaseFlowingFluid.Source(ModFluids.ANTIDOTE_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> ANTIDOTE_FLOWING = FLUIDS.register(
        "antidote_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.ANTIDOTE_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties ANTIDOTE_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.ANTIDOTE_FLUID_TYPE,
        ANTIDOTE_SOURCE,
        ANTIDOTE_FLOWING
    );

    // Awakening
    public static final DeferredHolder<Fluid, FlowingFluid> AWAKENING_SOURCE = FLUIDS.register(
        "awakening_source",
        () -> new BaseFlowingFluid.Source(ModFluids.AWAKENING_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> AWAKENING_FLOWING = FLUIDS.register(
        "awakening_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.AWAKENING_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties AWAKENING_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.AWAKENING_FLUID_TYPE,
        AWAKENING_SOURCE,
        AWAKENING_FLOWING
    );

    // Full Heal
    public static final DeferredHolder<Fluid, FlowingFluid> FULL_HEAL_SOURCE = FLUIDS.register(
        "full_heal_source",
        () -> new BaseFlowingFluid.Source(ModFluids.FULL_HEAL_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> FULL_HEAL_FLOWING = FLUIDS.register(
        "full_heal_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.FULL_HEAL_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties FULL_HEAL_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.FULL_HEAL_FLUID_TYPE,
        FULL_HEAL_SOURCE,
        FULL_HEAL_FLOWING
    );

    // Ether
    public static final DeferredHolder<Fluid, FlowingFluid> ETHER_SOURCE = FLUIDS.register(
        "ether_source",
        () -> new BaseFlowingFluid.Source(ModFluids.ETHER_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> ETHER_FLOWING = FLUIDS.register(
        "ether_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.ETHER_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties ETHER_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.ETHER_FLUID_TYPE,
        ETHER_SOURCE,
        ETHER_FLOWING
    );

    // Elixir
    public static final DeferredHolder<Fluid, FlowingFluid> ELIXIR_SOURCE = FLUIDS.register(
        "elixir_source",
        () -> new BaseFlowingFluid.Source(ModFluids.ELIXIR_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> ELIXIR_FLOWING = FLUIDS.register(
        "elixir_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.ELIXIR_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties ELIXIR_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.ELIXIR_FLUID_TYPE,
        ELIXIR_SOURCE,
        ELIXIR_FLOWING
    );

    // Max Ether
    public static final DeferredHolder<Fluid, FlowingFluid> MAX_ETHER_SOURCE = FLUIDS.register(
        "max_ether_source",
        () -> new BaseFlowingFluid.Source(ModFluids.MAX_ETHER_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> MAX_ETHER_FLOWING = FLUIDS.register(
        "max_ether_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.MAX_ETHER_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties MAX_ETHER_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.MAX_ETHER_FLUID_TYPE,
        MAX_ETHER_SOURCE,
        MAX_ETHER_FLOWING
    );

    // Max Elixir
    public static final DeferredHolder<Fluid, FlowingFluid> MAX_ELIXIR_SOURCE = FLUIDS.register(
        "max_elixir_source",
        () -> new BaseFlowingFluid.Source(ModFluids.MAX_ELIXIR_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> MAX_ELIXIR_FLOWING = FLUIDS.register(
        "max_elixir_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.MAX_ELIXIR_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties MAX_ELIXIR_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.MAX_ELIXIR_FLUID_TYPE,
        MAX_ELIXIR_SOURCE,
        MAX_ELIXIR_FLOWING
    );

    // Protein
    public static final DeferredHolder<Fluid, FlowingFluid> PROTEIN_SOURCE = FLUIDS.register(
        "protein_source",
        () -> new BaseFlowingFluid.Source(ModFluids.PROTEIN_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> PROTEIN_FLOWING = FLUIDS.register(
        "protein_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.PROTEIN_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties PROTEIN_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.PROTEIN_FLUID_TYPE,
        PROTEIN_SOURCE,
        PROTEIN_FLOWING
    );

    // Calcium
    public static final DeferredHolder<Fluid, FlowingFluid> CALCIUM_SOURCE = FLUIDS.register(
        "calcium_source",
        () -> new BaseFlowingFluid.Source(ModFluids.CALCIUM_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> CALCIUM_FLOWING = FLUIDS.register(
        "calcium_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.CALCIUM_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties CALCIUM_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.CALCIUM_FLUID_TYPE,
        CALCIUM_SOURCE,
        CALCIUM_FLOWING
    );

    // Iron
    public static final DeferredHolder<Fluid, FlowingFluid> IRON_SOURCE = FLUIDS.register(
        "iron_source",
        () -> new BaseFlowingFluid.Source(ModFluids.IRON_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> IRON_FLOWING = FLUIDS.register(
        "iron_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.IRON_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties IRON_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.IRON_FLUID_TYPE,
        IRON_SOURCE,
        IRON_FLOWING
    );

    // Zinc
    public static final DeferredHolder<Fluid, FlowingFluid> ZINC_SOURCE = FLUIDS.register(
        "zinc_source",
        () -> new BaseFlowingFluid.Source(ModFluids.ZINC_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> ZINC_FLOWING = FLUIDS.register(
        "zinc_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.ZINC_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties ZINC_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.ZINC_FLUID_TYPE,
        ZINC_SOURCE,
        ZINC_FLOWING
    );

    // Carbos
    public static final DeferredHolder<Fluid, FlowingFluid> CARBOS_SOURCE = FLUIDS.register(
        "carbos_source",
        () -> new BaseFlowingFluid.Source(ModFluids.CARBOS_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> CARBOS_FLOWING = FLUIDS.register(
        "carbos_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.CARBOS_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties CARBOS_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.CARBOS_FLUID_TYPE,
        CARBOS_SOURCE,
        CARBOS_FLOWING
    );

    // HP Up
    public static final DeferredHolder<Fluid, FlowingFluid> HP_UP_SOURCE = FLUIDS.register(
        "hp_up_source",
        () -> new BaseFlowingFluid.Source(ModFluids.HP_UP_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> HP_UP_FLOWING = FLUIDS.register(
        "hp_up_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.HP_UP_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties HP_UP_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.HP_UP_FLUID_TYPE,
        HP_UP_SOURCE,
        HP_UP_FLOWING
    );

    // PP Up
    public static final DeferredHolder<Fluid, FlowingFluid> PP_UP_SOURCE = FLUIDS.register(
        "pp_up_source",
        () -> new BaseFlowingFluid.Source(ModFluids.PP_UP_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> PP_UP_FLOWING = FLUIDS.register(
        "pp_up_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.PP_UP_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties PP_UP_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.PP_UP_FLUID_TYPE,
        PP_UP_SOURCE,
        PP_UP_FLOWING
    );

    // PP Max
    public static final DeferredHolder<Fluid, FlowingFluid> PP_MAX_SOURCE = FLUIDS.register(
        "pp_max_source",
        () -> new BaseFlowingFluid.Source(ModFluids.PP_MAX_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> PP_MAX_FLOWING = FLUIDS.register(
        "pp_max_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.PP_MAX_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties PP_MAX_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.PP_MAX_FLUID_TYPE,
        PP_MAX_SOURCE,
        PP_MAX_FLOWING
    );

    // Berry Juice
    public static final DeferredHolder<Fluid, FlowingFluid> BERRY_JUICE_SOURCE = FLUIDS.register(
        "berry_juice_source",
        () -> new BaseFlowingFluid.Source(ModFluids.BERRY_JUICE_FLUID_PROPERTIES)
    );
    public static final DeferredHolder<Fluid, FlowingFluid> BERRY_JUICE_FLOWING = FLUIDS.register(
        "berry_juice_flowing",
        () -> new BaseFlowingFluid.Flowing(ModFluids.BERRY_JUICE_FLUID_PROPERTIES)
    );
    private static final BaseFlowingFluid.Properties BERRY_JUICE_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
        ModFluidTypes.BERRY_JUICE_FLUID_TYPE,
        BERRY_JUICE_SOURCE,
        BERRY_JUICE_FLOWING
    );

    public static void register(IEventBus modEventBus) {
        // Register the Deferred Register to the mod event bus so fluid types get registered
        FLUIDS.register(modEventBus);
    }

    private ModFluids() {}
}
