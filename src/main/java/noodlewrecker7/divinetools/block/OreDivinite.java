package noodlewrecker7.divinetools.block;

import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.RecipeItemHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import noodlewrecker7.divinetools.DivineTools;

import java.util.Random;

public class OreDivinite extends BlockOre {

    public OreDivinite() {
        super();
        setCreativeTab(DivineTools.MOD_TAB);
        setHardness(5f);
        setHarvestLevel("pickaxe", 2);
        setRegistryName(DivineTools.MODID, "oredivinite");
        setUnlocalizedName(getRegistryName().toString());

    }

    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
        Random rand = world instanceof World ? ((World) world).rand : new Random();
        return MathHelper.getInt(rand, 2, 6);
    }
}
