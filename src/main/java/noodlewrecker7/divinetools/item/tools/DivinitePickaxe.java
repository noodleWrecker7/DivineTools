package noodlewrecker7.divinetools.item.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import noodlewrecker7.divinetools.DivineTools;

public class DivinitePickaxe extends ItemPickaxe {

    public DivinitePickaxe() {
        super(DivineTools.DiviniteMaterial);
        setHarvestLevel("pickaxe", 5);
        setRegistryName(DivineTools.MODID, "divinitepickaxe");
        setUnlocalizedName(getRegistryName().toString());
    }

    @Override
    public CreativeTabs[] getCreativeTabs() {
        return new CreativeTabs[]{DivineTools.MOD_TAB, CreativeTabs.TOOLS};
    }

}
