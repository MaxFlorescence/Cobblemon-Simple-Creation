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

    // Apricorn Shell Pieces
    public static final DeferredItem<Item> RED_APRICORN_SHELL_PIECE = ITEMS.register("red_apricorn_shell_piece", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GREEN_APRICORN_SHELL_PIECE = ITEMS.register("green_apricorn_shell_piece", () -> new Item(new Item.Properties()));

    // Ball Lids
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

    // Sequenced Assembly Items
    public static final DeferredItem<Item> TEMPLATE_BALL = ITEMS.register("template_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_AZURE_BALL = ITEMS.register("incomplete_ancient_azure_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_CITRINE_BALL = ITEMS.register("incomplete_ancient_citrine_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_FEATHER_BALL = ITEMS.register("incomplete_ancient_feather_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_GIGATON_BALL = ITEMS.register("incomplete_ancient_gigaton_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_GREAT_BALL = ITEMS.register("incomplete_ancient_great_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_HEAVY_BALL = ITEMS.register("incomplete_ancient_heavy_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_IVORY_BALL = ITEMS.register("incomplete_ancient_ivory_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_JET_BALL = ITEMS.register("incomplete_ancient_jet_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_LEADEN_BALL = ITEMS.register("incomplete_ancient_leaden_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_POKE_BALL = ITEMS.register("incomplete_ancient_poke_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_ROSEATE_BALL = ITEMS.register("incomplete_ancient_roseate_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_SLATE_BALL = ITEMS.register("incomplete_ancient_slate_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_ULTRA_BALL = ITEMS.register("incomplete_ancient_ultra_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_VERDANT_BALL = ITEMS.register("incomplete_ancient_verdant_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ANCIENT_WING_BALL = ITEMS.register("incomplete_ancient_wing_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_AZURE_BALL = ITEMS.register("incomplete_azure_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_BEAST_BALL = ITEMS.register("incomplete_beast_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_CITRINE_BALL = ITEMS.register("incomplete_citrine_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_DIVE_BALL = ITEMS.register("incomplete_dive_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_DREAM_BALL = ITEMS.register("incomplete_dream_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_DUSK_BALL = ITEMS.register("incomplete_dusk_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_FAST_BALL = ITEMS.register("incomplete_fast_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_FRIEND_BALL = ITEMS.register("incomplete_friend_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_GREAT_BALL = ITEMS.register("incomplete_great_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_HEAL_BALL = ITEMS.register("incomplete_heal_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_HEAVY_BALL = ITEMS.register("incomplete_heavy_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_LEVEL_BALL = ITEMS.register("incomplete_level_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_LOVE_BALL = ITEMS.register("incomplete_love_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_LURE_BALL = ITEMS.register("incomplete_lure_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_LUXURY_BALL = ITEMS.register("incomplete_luxury_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_MASTER_BALL = ITEMS.register("incomplete_master_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_MOON_BALL = ITEMS.register("incomplete_moon_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_NEST_BALL = ITEMS.register("incomplete_nest_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_NET_BALL = ITEMS.register("incomplete_net_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_PARK_BALL = ITEMS.register("incomplete_park_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_POKE_BALL = ITEMS.register("incomplete_poke_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_PREMIER_BALL = ITEMS.register("incomplete_premier_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_QUICK_BALL = ITEMS.register("incomplete_quick_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_REPEAT_BALL = ITEMS.register("incomplete_repeat_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ROSEATE_BALL = ITEMS.register("incomplete_roseate_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_SAFARI_BALL = ITEMS.register("incomplete_safari_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_SLATE_BALL = ITEMS.register("incomplete_slate_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_SPORT_BALL = ITEMS.register("incomplete_sport_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_TIMER_BALL = ITEMS.register("incomplete_timer_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ULTRA_BALL = ITEMS.register("incomplete_ultra_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_VERDANT_BALL = ITEMS.register("incomplete_verdant_ball", () -> new Item(new Item.Properties()));

    // Misc Ingredients
    public static final DeferredItem<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_CHUNK = ITEMS.register("netherite_chunk", () -> new Item(new Item.Properties()));

    public static void register(IEventBus modEventBus) {
        // Register the Deferred Register to the mod event bus so blocks get registered
        ITEMS.register(modEventBus);
    }
}
