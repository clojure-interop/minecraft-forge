(ns net.minecraftforge.oredict.ShapelessOreRecipe
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.oredict ShapelessOreRecipe]))

(defn ->shapeless-ore-recipe
  "Constructor.

  result - `net.minecraft.block.Block`
  recipe - `java.lang.Object`"
  (^ShapelessOreRecipe [^net.minecraft.block.Block result ^java.lang.Object recipe]
    (new ShapelessOreRecipe result recipe)))

(defn get-recipe-size
  "returns: `int`"
  (^Integer [^ShapelessOreRecipe this]
    (-> this (.getRecipeSize))))

(defn get-recipe-output
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ShapelessOreRecipe this]
    (-> this (.getRecipeOutput))))

(defn get-crafting-result
  "var-1 - `net.minecraft.inventory.InventoryCrafting`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ShapelessOreRecipe this ^net.minecraft.inventory.InventoryCrafting var-1]
    (-> this (.getCraftingResult var-1))))

(defn matches
  "var-1 - `net.minecraft.inventory.InventoryCrafting`
  world - `net.minecraft.world.World`

  returns: `boolean`"
  (^Boolean [^ShapelessOreRecipe this ^net.minecraft.inventory.InventoryCrafting var-1 ^net.minecraft.world.World world]
    (-> this (.matches var-1 world))))

(defn get-input
  "Returns the input for this recipe, any mod accessing this value should never
   manipulate the values in this array as it will effect the recipe itself.

  returns: The recipes input vales. - `net.minecraft.util.NonNullList<java.lang.Object>`"
  (^net.minecraft.util.NonNullList [^ShapelessOreRecipe this]
    (-> this (.getInput))))

(defn get-remaining-items
  "inv - `net.minecraft.inventory.InventoryCrafting`

  returns: `net.minecraft.util.NonNullList<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.NonNullList [^ShapelessOreRecipe this ^net.minecraft.inventory.InventoryCrafting inv]
    (-> this (.getRemainingItems inv))))

