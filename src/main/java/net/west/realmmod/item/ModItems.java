package net.west.realmmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.west.realmmod.RealmMod;

public class ModItems {
    public static final Item MITHIRL = registerItem("mithirl", new Item(new Item.Settings()));
    public static final Item RAW_MITHIRL = registerItem("raw_mithirl", new Item(new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RealmMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RealmMod.LOGGER.info("Registering Mod Items for " + RealmMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MITHIRL);
            entries.add(RAW_MITHIRL);
        });
    }
}
