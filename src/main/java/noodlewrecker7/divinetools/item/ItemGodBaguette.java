package noodlewrecker7.divinetools.item;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import noodlewrecker7.divinetools.DivineTools;

import java.util.Set;

public class ItemGodBaguette extends ItemTool {


    protected float efficiency = 20f;
    //    final private java.util.Map<String, Integer> toolClasses = new java.util.HashMap<String, Integer>();
    final private ImmutableSet<String> toolClassesSet = ImmutableSet.of("hoe", "pickaxe", "spade", "axe", "sword");
    protected int harvestLevel = 5;
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet();

    public ItemGodBaguette(ToolMaterial material) {
        super(material, Sets.newHashSet());
        setRegistryName(DivineTools.MODID, "itemgodbaguette");
        setUnlocalizedName(DivineTools.MODID + ".itemgodbaguette");
        setCreativeTab(DivineTools.MOD_TAB);


        for (String tool : toolClassesSet) {
            setHarvestLevel(tool, harvestLevel);
        }

    }

    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state) {
        if (state.getBlock().getHarvestLevel(state) <= harvestLevel) {
            return efficiency;
        }
        return super.getDestroySpeed(stack, state);
    }

    @Override
    public int getHarvestLevel(ItemStack stack, String toolClass, @javax.annotation.Nullable net.minecraft.entity.player.EntityPlayer player, @javax.annotation.Nullable IBlockState blockState) {
        return harvestLevel;
     /*   if (toolClassesSet.contains(toolClass)) {
            return harvestLevel;
        }
        return super.getHarvestLevel(stack, toolClass, player, blockState);*/
    }

    @Override
    public Set<String> getToolClasses(ItemStack stack) {
        return toolClassesSet != null ? toolClassesSet : super.getToolClasses(stack);

    }

    @Override
    public boolean canHarvestBlock(IBlockState state, ItemStack stack) {
        return this.canHarvestBlock(state);
    }

    @Override
    public boolean canHarvestBlock(IBlockState state) {
        return true;
        // todo work this out using state.getMaterial and state.getblock.getHarvest levels  ex - https://github.com/MelanX/aiotbotania/blob/1.12.2/src/main/java/de/melanx/aiotbotania/items/base/ItemAIOTBase.java
        /*DivineTools.logInfo("HARVESTING BLOCK w/ TOOL:" + state.getBlock().getHarvestTool(state));
        if (toolClassesSet.contains(state.getBlock().getHarvestTool(state))) {
            return true;
        } else return super.canHarvestBlock(state);*/
    }


}
