package fr.steakmans.ww3mod.items;

import fr.steakmans.ww3mod.Main;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    //money
    public static final RegistryObject<Item> BILLET_5 = ITEMS.register("billet_5", () -> new Item(new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> BILLET_10 = ITEMS.register("billet_10", () -> new Item(new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> BILLET_20 = ITEMS.register("billet_20", () -> new Item(new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> BILLET_50 = ITEMS.register("billet_50", () -> new Item(new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> BILLET_100 = ITEMS.register("billet_100", () -> new Item(new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> BILLET_200 = ITEMS.register("billet_200", () -> new Item(new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> BILLET_500 = ITEMS.register("billet_500", () -> new Item(new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<Item> BILLET_1000 = ITEMS.register("billet_1000", () -> new Item(new Item.Properties().group(Main.TAB)));

    //drugs

}
