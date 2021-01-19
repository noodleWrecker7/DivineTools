package noodlewrecker7.divinetools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import noodlewrecker7.divinetools.init.ModBlocks;

public class DivineToolsCreativeTab extends CreativeTabs {

    public DivineToolsCreativeTab() {
        super(DivineTools.MODID);
    }


    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.newblock);
    }

}
