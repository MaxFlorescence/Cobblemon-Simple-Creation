package net.maxflorescence.mcmods;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.maxflorescence.mcmods.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CobblemonSimpleCreation.MODID)
public class CobblemonSimpleCreation
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "cobblemonsimplecreation";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

/* Custom block/item template code
    // Create a Deferred Register to hold Blocks which will all be registered under the "cobblemonsimplecreation" namespace
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    // Create a Deferred Register to hold Items which will all be registered under the "cobblemonsimplecreation" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    // Creates a new Block with the id "cobblemonsimplecreation:example_block", combining the namespace and path
    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    // Creates a new BlockItem with the id "cobblemonsimplecreation:example_block", combining the namespace and path
    public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("example_block", EXAMPLE_BLOCK);

    // Creates a new food item with the id "cobblemonsimplecreation:example_id", nutrition 1 and saturation 2
    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerSimpleItem("example_item", new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(2f).build()));
*/

    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "cobblemonsimplecreation" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // Creates a creative tab that is placed after the combat tab
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MOD_TAB = CREATIVE_MODE_TABS.register("cobblemon_simple_creation", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.cobblemonsimplecreation")) //The language key for the title of your CreativeModeTab
            // .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.TEMPLATE_BALL.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                // Apricorn Shell Pieces
                output.accept(ModItems.RED_APRICORN_SHELL_PIECE.get());
                output.accept(ModItems.GREEN_APRICORN_SHELL_PIECE.get());

                // Ball Lids
                output.accept(ModItems.ANCIENT_AZURE_BALL_LID.get());
                output.accept(ModItems.ANCIENT_CITRINE_BALL_LID.get());
                output.accept(ModItems.ANCIENT_FEATHER_BALL_LID.get());
                output.accept(ModItems.ANCIENT_GIGATON_BALL_LID.get());
                output.accept(ModItems.ANCIENT_GREAT_BALL_LID.get());
                output.accept(ModItems.ANCIENT_HEAVY_BALL_LID.get());
                output.accept(ModItems.ANCIENT_IVORY_BALL_LID.get());
                output.accept(ModItems.ANCIENT_JET_BALL_LID.get());
                output.accept(ModItems.ANCIENT_LEADEN_BALL_LID.get());
                output.accept(ModItems.ANCIENT_POKE_BALL_LID.get());
                output.accept(ModItems.ANCIENT_ROSEATE_BALL_LID.get());
                output.accept(ModItems.ANCIENT_SLATE_BALL_LID.get());
                output.accept(ModItems.ANCIENT_ULTRA_BALL_LID.get());
                output.accept(ModItems.ANCIENT_VERDANT_BALL_LID.get());
                output.accept(ModItems.ANCIENT_WING_BALL_LID.get());
                output.accept(ModItems.AZURE_BALL_LID.get());
                output.accept(ModItems.BEAST_BALL_LID.get());
                output.accept(ModItems.CITRINE_BALL_LID.get());
                output.accept(ModItems.DIVE_BALL_LID.get());
                output.accept(ModItems.DREAM_BALL_LID.get());
                output.accept(ModItems.DUSK_BALL_LID.get());
                output.accept(ModItems.FAST_BALL_LID.get());
                output.accept(ModItems.FRIEND_BALL_LID.get());
                output.accept(ModItems.GREAT_BALL_LID.get());
                output.accept(ModItems.HEAL_BALL_LID.get());
                output.accept(ModItems.HEAVY_BALL_LID.get());
                output.accept(ModItems.LEVEL_BALL_LID.get());
                output.accept(ModItems.LOVE_BALL_LID.get());
                output.accept(ModItems.LURE_BALL_LID.get());
                output.accept(ModItems.LUXURY_BALL_LID.get());
                output.accept(ModItems.MASTER_BALL_LID.get());
                output.accept(ModItems.MOON_BALL_LID.get());
                output.accept(ModItems.NEST_BALL_LID.get());
                output.accept(ModItems.NET_BALL_LID.get());
                output.accept(ModItems.PARK_BALL_LID.get());
                output.accept(ModItems.POKE_BALL_LID.get());
                output.accept(ModItems.PREMIER_BALL_LID.get());
                output.accept(ModItems.QUICK_BALL_LID.get());
                output.accept(ModItems.REPEAT_BALL_LID.get());
                output.accept(ModItems.ROSEATE_BALL_LID.get());
                output.accept(ModItems.SAFARI_BALL_LID.get());
                output.accept(ModItems.SLATE_BALL_LID.get());
                output.accept(ModItems.SPORT_BALL_LID.get());
                output.accept(ModItems.TIMER_BALL_LID.get());
                output.accept(ModItems.ULTRA_BALL_LID.get());
                output.accept(ModItems.VERDANT_BALL_LID.get());

                // Sequenced Assembly Items
                output.accept(ModItems.TEMPLATE_BALL.get());

                // Misc Ingredients
                output.accept(ModItems.DIAMOND_SHARD.get());
                output.accept(ModItems.NETHERITE_CHUNK.get());
                // output.accept(ModItems.ECHO_FRAGMENT.get());
            }).build());

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public CobblemonSimpleCreation(IEventBus modEventBus, ModContainer modContainer)
    {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        
/* Custom block/item template code
        // Register the Deferred Register to the mod event bus so blocks get registered
        BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);
*/

        // Register the Deferred Register to the mod event bus so tabs get registered
        CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (CobblemonSimpleCreation) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
/* Common setup template code
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
*/

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
/* Add creative template code
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
            event.accept(EXAMPLE_BLOCK_ITEM);
*/

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
/* On server starting template code
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
*/

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
/* On client setup template code
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
*/

        }
    }
}
