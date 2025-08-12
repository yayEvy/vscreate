package com.yayevy.vscreate.index;

import com.tterrag.registrate.util.entry.BlockEntry;
import com.yayevy.vscreate.VSCreate;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MapColor;

import static com.simibubi.create.foundation.data.BlockStateGen.simpleCubeAll;
import static com.simibubi.create.foundation.data.TagGen.pickaxeOnly;
import static com.simibubi.create.foundation.data.TagGen.tagBlockAndItem;

public class VSCBlocks {

    static {
        VSCreate.REGISTRATE.setCreativeTab(VSCCreativeTabs.VSC_MAIN_TAB);
    }

    public static final BlockEntry<Block> GILDED_OBSIDIAN = VSCreate.REGISTRATE.block("gilded_obsidian", Block::new)
            .initialProperties(() -> Blocks.OBSIDIAN)
            .properties(p -> p.mapColor(MapColor.TERRACOTTA_BLACK)
                    .requiresCorrectToolForDrops())
            .transform(pickaxeOnly())
            .tag(BlockTags.NEEDS_DIAMOND_TOOL)
            .transform(tagBlockAndItem("obsidians"))
            .build()
            .register();


    public static void register() {

    }
}
