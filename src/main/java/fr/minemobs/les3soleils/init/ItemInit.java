package fr.minemobs.les3soleils.init;

import fr.minemobs.les3soleils.Main;
import fr.minemobs.les3soleils.object.item.PufferCoin;
import fr.minemobs.les3soleils.object.item.RefinedIron;
import fr.minemobs.les3soleils.utils.enums.ItemTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.modId);

    public static final RegistryObject<Item> refined_iron_ingot = ITEMS.register("refined_iron_ingot",
            () -> new RefinedIron(new Item.Properties().group(Main.ModItemGroup.instance)
                    .maxStackSize(63)));

    public static final RegistryObject<Item> puffer_coins = ITEMS.register("puffer_coins",
            () -> new PufferCoin(new Item.Properties().group(Main.ModItemGroup.instance)
                    .rarity(Rarity.EPIC).maxStackSize(4)));

    //// TODO: 22/08/2020 02h du mat, add some refined iron items
    //// TODO: (fini le 22/08/2020 à 15h)

    //tools
    //sword
    public static final RegistryObject<SwordItem> refined_iron_sword = ITEMS.register("refined_iron_sword",
            () -> new SwordItem(ItemTier.REFINED_IRON, 3, -2.4F,
                    new Item.Properties().group(Main.ModItemGroup.instance)));

    //pickaxe
    public static final RegistryObject<PickaxeItem> refined_iron_pickaxe = ITEMS.register("refined_iron_pickaxe",
            () -> new PickaxeItem(ItemTier.REFINED_IRON, 1, -2.8F,
                    new Item.Properties().group(Main.ModItemGroup.instance).rarity(Rarity.EPIC)));

    //shovel
    public static final RegistryObject<ShovelItem> refined_iron_shovel = ITEMS.register("refined_iron_shovel",
            () -> new ShovelItem(ItemTier.REFINED_IRON, 1.5F, -3.0F,
                    new Item.Properties().group(Main.ModItemGroup.instance).rarity(Rarity.EPIC)));

    //axe
    public static final RegistryObject<AxeItem> refined_iron_axe = ITEMS.register("refined_iron_axe",
            () -> new AxeItem(ItemTier.REFINED_IRON, 6.0F, -3.1F,
                    new Item.Properties().rarity(Rarity.EPIC).group(Main.ModItemGroup.instance)));

    //hoe
    public static final RegistryObject<HoeItem> refined_iron_hoe = ITEMS.register("refined_iron_hoe",
            () -> new HoeItem(ItemTier.REFINED_IRON, -1.0F,
                    new Item.Properties().group(Main.ModItemGroup.instance)));

}