(ns net.minecraftforge.oredict.ShapedOreRecipe
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.oredict ShapedOreRecipe]))

(defn ->shaped-ore-recipe
  "Constructor.

  result - `net.minecraft.block.Block`
  recipe - `java.lang.Object`"
  (^ShapedOreRecipe [^net.minecraft.block.Block result ^java.lang.Object recipe]
    (new ShapedOreRecipe result recipe)))

(def *-max-craft-grid-width
  "Static Constant.

  type: int"
  ShapedOreRecipe/MAX_CRAFT_GRID_WIDTH)

(def *-max-craft-grid-height
  "Static Constant.

  type: int"
  ShapedOreRecipe/MAX_CRAFT_GRID_HEIGHT)

(defn get-width
  "returns: `int`"
  (^Integer [^ShapedOreRecipe this]
    (-> this (.getWidth))))

(defn get-input
  "Returns the input for this recipe, any mod accessing this value should never
   manipulate the values in this array as it will effect the recipe itself.

  returns: The recipes input vales. - `java.lang.Object[]`"
  ([^ShapedOreRecipe this]
    (-> this (.getInput))))

(defn get-height
  "returns: `int`"
  (^Integer [^ShapedOreRecipe this]
    (-> this (.getHeight))))

(defn matches
  "inv - `net.minecraft.inventory.InventoryCrafting`
  world - `net.minecraft.world.World`

  returns: `boolean`"
  (^Boolean [^ShapedOreRecipe this ^net.minecraft.inventory.InventoryCrafting inv ^net.minecraft.world.World world]
    (-> this (.matches inv world))))

(defn get-recipe-size
  "returns: `int`"
  (^Integer [^ShapedOreRecipe this]
    (-> this (.getRecipeSize))))

(defn get-crafting-result
  "var-1 - `net.minecraft.inventory.InventoryCrafting`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ShapedOreRecipe this ^net.minecraft.inventory.InventoryCrafting var-1]
    (-> this (.getCraftingResult var-1))))

(defn set-mirrored
  "mirror - `boolean`

  returns: `net.minecraftforge.oredict.ShapedOreRecipe`"
  (^net.minecraftforge.oredict.ShapedOreRecipe [^ShapedOreRecipe this ^Boolean mirror]
    (-> this (.setMirrored mirror))))

(defn get-recipe-output
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ShapedOreRecipe this]
    (-> this (.getRecipeOutput))))

(defn get-remaining-items
  "inv - `net.minecraft.inventory.InventoryCrafting`

  returns: `net.minecraft.util.NonNullList<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.NonNullList [^ShapedOreRecipe this ^net.minecraft.inventory.InventoryCrafting inv]
    (-> this (.getRemainingItems inv))))

