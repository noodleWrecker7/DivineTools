package noodlewrecker7.divinetools.item.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import noodlewrecker7.divinetools.DivineTools;

public class DiviniteShovel extends ItemSpade {

    public DiviniteShovel() {
        super(DivineTools.DiviniteMaterial);
        setHarvestLevel("shovel", 5);
        setRegistryName(DivineTools.MODID, "diviniteshovel");
        setUnlocalizedName(getRegistryName().toString());
    }

    @Override
    public CreativeTabs[] getCreativeTabs() {
        return new CreativeTabs[]{DivineTools.MOD_TAB, CreativeTabs.TOOLS};
    }

}
