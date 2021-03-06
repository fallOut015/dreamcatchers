package io.github.fallOut015.dreamcatchers.block.trees;

import io.github.fallOut015.dreamcatchers.world.gen.feature.FeaturesDreamcatchers;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class GhostwoodTree extends Tree {
    @Nullable
    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getConfiguredFeature(Random rand, boolean beehive) {
        return FeaturesDreamcatchers.Features.GHOSTWOOD;
    }
}