package noodlewrecker7.divinetools;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.RangeInt;

@Config(modid = DivineTools.MODID, name = "divinetools")
public class Configs {

    public static OreGenSubCat oreGen = new OreGenSubCat();

    public static class OreGenSubCat {

        @RangeInt(min = 0, max = 255)
        public int minY = 0;

        @RangeInt(min = 0, max = 255)
        public int maxY = 30;

        @RangeInt(min = 0, max = 50)
        public int veinSize = 10;

        @RangeInt(min = 0, max = 50)
        public int spawnTries = 6;
    }
}
