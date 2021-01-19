package noodlewrecker7.divinetools;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.GameRegistry;
import noodlewrecker7.divinetools.block.NewBlock;
import noodlewrecker7.divinetools.block.OreDivinite;
import noodlewrecker7.divinetools.entity.PetDragon;
import noodlewrecker7.divinetools.init.ModBlocks;
import noodlewrecker7.divinetools.init.ModItems;
import noodlewrecker7.divinetools.item.ItemGodBaguette;


@Mod.EventBusSubscriber(modid = DivineTools.MODID)
public class registrationHandler {

    private static int entityId = 0;

    public static void initRecipes() {
        GameRegistry.addSmelting(Item.getItemFromBlock(ModBlocks.oredivinite), new ItemStack(ModItems.itemingotdivinite, 1), 2f);

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        final Item[] items = {
                new Item().setRegistryName(DivineTools.MODID, "testitem").setCreativeTab(DivineTools.MOD_TAB).setUnlocalizedName(DivineTools.MODID + ".test_item"),
                new ItemGodBaguette(DivineTools.DiviniteMaterial)
        };

        final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.newblock).setRegistryName(ModBlocks.newblock.getRegistryName()),
                new ItemBlock(ModBlocks.oredivinite).setRegistryName(ModBlocks.oredivinite.getRegistryName())
        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }


    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        final Block[] blocks = {
                new NewBlock(),
                new OreDivinite()
        };
        event.getRegistry().registerAll(blocks);
    }

    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityEntry> event) {

        final ResourceLocation dragonRegistryName = new ResourceLocation(DivineTools.MODID, "pet");

        EntityEntry entry = EntityEntryBuilder.create()
                .entity(PetDragon.class)
                .id(dragonRegistryName, entityId++)
                .name(dragonRegistryName.getResourcePath())
                .egg(0xFFFFFF, 0xAAAAAA)
                .tracker(64, 20, false)
                .build();


        event.getRegistry().register(entry);
    }
}
