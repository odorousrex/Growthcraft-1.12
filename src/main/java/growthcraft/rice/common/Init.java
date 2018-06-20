package growthcraft.rice.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class Init {
    private Init() {
    }

    ////////////
    // Blocks
    ////////////

    public static void preInitBlocks() {

    }

    public static void registerBlocks(IForgeRegistry<Block> registry) {

    }

    @SideOnly(Side.CLIENT)
    public static void registerBlockRenders() {

    }

    ////////////
    // Items
    ////////////

    public static void preInitItems() {

    }

    public static void registerItemOres() {

    }

    public static void registerItems(IForgeRegistry<Item> registry) {

    }

    @SideOnly(Side.CLIENT)
    public static void registerItemRenders() {

    }

    @SideOnly(Side.CLIENT)
    public static void registerItemColorHandlers() {

    }

    @SideOnly(Side.CLIENT)
    public static void registerItemVariants() {

    }

    ////////////
    // Fluids
    ////////////

    public static void preInitFluids() {

    }

    public static void registerFluidBlocks(IForgeRegistry<Block> registry) {

    }

    public static void initBoozes() {

    }

    @SideOnly(Side.CLIENT)
    public static void registerFluidRenders() {

    }

    private static void registerFermentations() {

    }

    ////////////
    // Recipes
    ////////////

    public static void initRecipes() {

    }

    public static void registerRecipes() {
        registerCraftingRecipes();
    }

    private static void registerCraftingRecipes() {
        // TODO: RECIPE_REGISTER!
    }

    ////////////
    // Loot
    ////////////

    public static void lootLoad(LootTableLoadEvent evt) {

    }

}



