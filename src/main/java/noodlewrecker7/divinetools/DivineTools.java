package noodlewrecker7.divinetools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import noodlewrecker7.divinetools.init.registrationHandler;
import org.apache.logging.log4j.Logger;

@Mod(modid = DivineTools.MODID, name = DivineTools.NAME, version = DivineTools.VERSION)
public class DivineTools {
    public static final String MODID = "divinetools";
    public static final String NAME = "Divine Tools";
    public static final String VERSION = "1.0";


    private static Logger logger;

    public static final Item.ToolMaterial DiviniteMaterial = EnumHelper.addToolMaterial("DIVINITE", 5, 200, 20.f, 10f, 25);


    public static final CreativeTabs MOD_TAB = new DivineToolsCreativeTab();


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        OBJLoader.INSTANCE.addDomain(MODID);

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        //Block block = new TestBlock(Material.ROCK, "test");
        //ForgeRegistries.BLOCKS.register(block);
        //Item itemb = new Item();
//        ForgeRegistries.ITEMS.register(testItem)
        registrationHandler.initMisc();
    }

    /*@EventHandler
    public void postInit(FMLInitializationEvent initializationEvent) {
        logger.debug("POST INIT");

    }*/

    public static void logInfo(String message) {
        logger.info(message);
    }
    public static void logDebug(String message) {
        logger.debug(message);
    }

}

