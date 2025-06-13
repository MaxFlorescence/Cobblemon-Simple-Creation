package net.maxflorescence.mcmods.item;

import net.maxflorescence.mcmods.CobblemonSimpleCreation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // Create a Deferred Register to hold Items which will all be registered under the mod's namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(
        CobblemonSimpleCreation.MODID
    );

    // Create new items
    public static final DeferredItem<Item> INCOMPLETE_BALL_LID = ITEMS.register("incomplete_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_AZURE_BALL_LID = ITEMS.register("ancient_azure_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_CITRINE_BALL_LID = ITEMS.register("ancient_citrine_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_FEATHER_BALL_LID = ITEMS.register("ancient_feather_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_GIGATON_BALL_LID = ITEMS.register("ancient_gigaton_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_GREAT_BALL_LID = ITEMS.register("ancient_great_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_HEAVY_BALL_LID = ITEMS.register("ancient_heavy_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_IVORY_BALL_LID = ITEMS.register("ancient_ivory_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_JET_BALL_LID = ITEMS.register("ancient_jet_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_LEADEN_BALL_LID = ITEMS.register("ancient_leaden_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_POKE_BALL_LID = ITEMS.register("ancient_poke_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_ROSEATE_BALL_LID = ITEMS.register("ancient_roseate_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_SLATE_BALL_LID = ITEMS.register("ancient_slate_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_ULTRA_BALL_LID = ITEMS.register("ancient_ultra_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_VERDANT_BALL_LID = ITEMS.register("ancient_verdant_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_WING_BALL_LID = ITEMS.register("ancient_wing_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AZURE_BALL_LID = ITEMS.register("azure_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BEAST_BALL_LID = ITEMS.register("beast_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CITRINE_BALL_LID = ITEMS.register("citrine_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIVE_BALL_LID = ITEMS.register("dive_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DREAM_BALL_LID = ITEMS.register("dream_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DUSK_BALL_LID = ITEMS.register("dusk_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FAST_BALL_LID = ITEMS.register("fast_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FRIEND_BALL_LID = ITEMS.register("friend_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GREAT_BALL_LID = ITEMS.register("great_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEAL_BALL_LID = ITEMS.register("heal_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEAVY_BALL_LID = ITEMS.register("heavy_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEVEL_BALL_LID = ITEMS.register("level_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LOVE_BALL_LID = ITEMS.register("love_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LURE_BALL_LID = ITEMS.register("lure_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LUXURY_BALL_LID = ITEMS.register("luxury_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MASTER_BALL_LID = ITEMS.register("master_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOON_BALL_LID = ITEMS.register("moon_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NEST_BALL_LID = ITEMS.register("nest_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NET_BALL_LID = ITEMS.register("net_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PARK_BALL_LID = ITEMS.register("park_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POKE_BALL_LID = ITEMS.register("poke_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PREMIER_BALL_LID = ITEMS.register("premier_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> QUICK_BALL_LID = ITEMS.register("quick_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REPEAT_BALL_LID = ITEMS.register("repeat_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSEATE_BALL_LID = ITEMS.register("roseate_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SAFARI_BALL_LID = ITEMS.register("safari_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SLATE_BALL_LID = ITEMS.register("slate_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPORT_BALL_LID = ITEMS.register("sport_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIMER_BALL_LID = ITEMS.register("timer_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ULTRA_BALL_LID = ITEMS.register("ultra_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VERDANT_BALL_LID = ITEMS.register("verdant_ball_lid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_HEMISPHERE = ITEMS.register("zinc_hemisphere", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_BALL_BASE = ITEMS.register("incomplete_ball_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIER_1_BALL_BASE = ITEMS.register("tier_1_ball_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIER_2_BALL_BASE = ITEMS.register("tier_2_ball_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIER_3_BALL_BASE = ITEMS.register("tier_3_ball_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIER_4_BALL_BASE = ITEMS.register("tier_4_ball_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIER_5_BALL_BASE = ITEMS.register("tier_5_ball_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RED_APRICORN_SHELL = ITEMS.register("red_apricorn_shell", () -> new Item(new Item.Properties()));

    public static void register(IEventBus modEventBus) {
        // Register the Deferred Register to the mod event bus so blocks get registered
        ITEMS.register(modEventBus);
    }
}
