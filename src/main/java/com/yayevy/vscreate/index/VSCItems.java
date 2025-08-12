package com.yayevy.vscreate.index;

import com.tterrag.registrate.util.entry.ItemEntry;
import com.yayevy.vscreate.VSCreate;
import net.minecraft.world.item.Item;

public class VSCItems {
    static {
        VSCreate.REGISTRATE.setCreativeTab(VSCCreativeTabs.VSC_MAIN_TAB);
    }

    public static final ItemEntry<Item> COPPER_WHISK =
            VSCreate.REGISTRATE.item("copper_whisk", Item::new)
                    .register();


    public static void register() {

    }
}
