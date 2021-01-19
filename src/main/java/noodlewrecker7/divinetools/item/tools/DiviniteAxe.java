package noodlewrecker7.divinetools.item.tools;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import noodlewrecker7.divinetools.DivineTools;

import java.util.Set;

public class DiviniteAxe extends ItemTool {

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);

    @Override
    public CreativeTabs[] getCreativeTabs() {
        return new CreativeTabs[]{DivineTools.MOD_TAB, CreativeTabs.TOOLS};
    }

    public DiviniteAxe() {
        //super(material);
        super(5f, -2f, DivineTools.DiviniteMaterial, EFFECTIVE_ON);
        setHarvestLevel("axe", 5);
        setRegistryName(DivineTools.MODID, "diviniteaxe");
        setUnlocalizedName(getRegistryName().toString());

    }



    @Override
    public Set<String> getToolClasses(ItemStack stack) {
        return com.google.common.collect.ImmutableSet.of("axe");
    }

}
