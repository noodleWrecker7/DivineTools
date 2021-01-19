package noodlewrecker7.divinetools.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import noodlewrecker7.divinetools.DivineTools;

public class NewBlock extends Block {

    PropertyDirection facing;

    public NewBlock() {
        super(Material.ROCK);
        setRegistryName(DivineTools.MODID, "newblock");
        setUnlocalizedName(getRegistryName().toString());
        setCreativeTab(DivineTools.MOD_TAB);
        setHardness(1f);
        setHarvestLevel("pickaxe", 2);

    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        super.breakBlock(worldIn, pos, state);

    }
}
