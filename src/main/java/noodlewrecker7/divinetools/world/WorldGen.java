package noodlewrecker7.divinetools.world;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import noodlewrecker7.divinetools.Configs;
import noodlewrecker7.divinetools.init.ModBlocks;

import java.util.Random;

public class WorldGen implements IWorldGenerator {

    private final WorldGenMinable overworldGen;

    public WorldGen() {
        overworldGen = new WorldGenMinable(ModBlocks.oredivinite.getDefaultState(), Configs.oreGen.veinSize, BlockMatcher.forBlock(Blocks.STONE));
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.getDimensionType() == DimensionType.OVERWORLD) {
            genStandard(overworldGen, world, random, chunkX, chunkZ, Configs.oreGen.spawnTries, Configs.oreGen.minY, Configs.oreGen.maxY);
        }
    }

    private void genStandard(WorldGenerator generator,
                             World world,
                             Random random,
                             int chunkX,
                             int chunkZ,
                             int spawnTries,
                             int minHeight,
                             int maxHeight) {

        // checks min/max heights are valid
        if (minHeight < 0) minHeight = 0;
        if (maxHeight > 255) maxHeight = 255;

        if (maxHeight < minHeight) {
            int i = minHeight;
            minHeight = maxHeight;
            maxHeight = i;
        } else if (maxHeight == minHeight) {
            if (maxHeight < 255) {
                maxHeight++;
            } else minHeight--;
        }


        BlockPos chunkPosAsBlockPos = new BlockPos(chunkX << 4, 0, chunkZ << 4); // gets chunk pos as block pos
        int heightDiff = maxHeight - minHeight + 1;

        for (int i = 0; i < spawnTries; i++) {
            generator.generate(world, random,
                    chunkPosAsBlockPos.add(
                            random.nextInt(16),
                            minHeight + random.nextInt(heightDiff),
                            random.nextInt(16)
                    )
            );
        }

    }
}
