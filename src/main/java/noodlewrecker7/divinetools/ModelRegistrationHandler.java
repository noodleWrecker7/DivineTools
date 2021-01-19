package noodlewrecker7.divinetools;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import noodlewrecker7.divinetools.init.ModBlocks;
import noodlewrecker7.divinetools.init.ModItems;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = DivineTools.MODID)

public class ModelRegistrationHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        DivineTools.logInfo("Registering models");
        registerModel(ModItems.testitem, 0);
        registerModel(ModItems.itemgodbaguette, 0);


        registerModel(Item.getItemFromBlock(ModBlocks.newblock), 0);
        registerModel(Item.getItemFromBlock(ModBlocks.oredivinite), 0);

    }

    private static void registerModel(Item item, int meta) {
        System.out.println(item.getRegistryName());

        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }


}
