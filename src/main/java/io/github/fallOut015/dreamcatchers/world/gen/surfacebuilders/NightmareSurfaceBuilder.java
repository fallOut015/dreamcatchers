package io.github.fallOut015.dreamcatchers.world.gen.surfacebuilders;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import java.util.Random;

public class NightmareSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig> {
    public NightmareSurfaceBuilder(Codec<SurfaceBuilderConfig> codec) {
        super(codec);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void apply(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
		/*
		BlockState blockstate = SurfaceBuilderTwo.GAULT;
	    BlockState blockstate1 = SurfaceBuilderTwo.NIGHTSTONE;
	    BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();
	    int i = -1;
	    int j = (int)(noise / 3.0D + 3.0D + random.nextDouble() * 0.25D);
	    int k = x & 15;
	    int l = z & 15;
	    int sealevel = 0;

	    for(int i1 = startHeight; i1 >= 0; --i1) {
	    	blockpos$mutable.setPos(k, i1, l);
	        BlockState blockstate2 = chunkIn.getBlockState(blockpos$mutable);
	        if (blockstate2.isAir()) {
	        	i = -1;
	        } else if (blockstate2.getBlock() == defaultBlock.getBlock()) {
	            if (i == -1) {
	            	if (j <= 0) {
	            		blockstate = Blocks.AIR.getDefaultState();
	            		blockstate1 = defaultBlock;
	            	} else if (i1 >= sealevel - 4 && i1 <= sealevel + 1) {
	            		blockstate = SurfaceBuilderTwo.GAULT;
	            		blockstate1 = SurfaceBuilderTwo.NIGHTSTONE;
	            	}

	            	if (i1 < sealevel && (blockstate == null || blockstate.isAir())) {
	            		if (biomeIn.getTemperature(blockpos$mutable.setPos(x, i1, z)) < 0.15F) {
	            			blockstate = Blocks.ICE.getDefaultState();
	            		} else {
	            			blockstate = defaultFluid;
	            		}

	            		blockpos$mutable.setPos(k, i1, l);
	            	}

	            	i = j;
	            	if (i1 >= sealevel - 1) {
	            		chunkIn.setBlockState(blockpos$mutable, blockstate, false);
	            	} else if (i1 < sealevel - 7 - j) {
	            		blockstate = Blocks.AIR.getDefaultState();
	            		blockstate1 = defaultBlock;
	            		chunkIn.setBlockState(blockpos$mutable, SurfaceBuilderTwo.NIGHTSTONE, false);
	            	} else {
	            		chunkIn.setBlockState(blockpos$mutable, blockstate1, false);
	            	}
	            } else if (i > 0) {
	            	--i;
	            	chunkIn.setBlockState(blockpos$mutable, blockstate1, false);
	            	if (i == 0 && blockstate1.getBlock() == Blocks.SAND && j > 1) {
	            		i = random.nextInt(4) + Math.max(0, i1 - 63);
	            		blockstate1 = blockstate1.getBlock() == Blocks.RED_SAND ? Blocks.RED_SANDSTONE.getDefaultState() : Blocks.SANDSTONE.getDefaultState();
	            	}
	            }
	        }
	    }
		 */
    }
}