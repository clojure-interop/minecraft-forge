(ns net.minecraft.item.crafting.ShapedRecipes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item.crafting ShapedRecipes]))

(defn ->shaped-recipes
  "Constructor.

  width - `int`
  height - `int`
  ingredients-in - `net.minecraft.item.ItemStack[]`
  output - `net.minecraft.item.ItemStack`"
  (^ShapedRecipes [^Integer width ^Integer height ingredients-in ^net.minecraft.item.ItemStack output]
    (new ShapedRecipes width height ingredients-in output)))

(defn recipe-width
  "Instance Constant.

  type: int"
  (^Integer [^ShapedRecipes this]
    (-> this .-recipeWidth)))

(defn recipe-height
  "Instance Constant.

  type: int"
  (^Integer [^ShapedRecipes this]
    (-> this .-recipeHeight)))

(defn recipe-items
  "Instance Constant.

  type: net.minecraft.item.ItemStack[]"
  ([^ShapedRecipes this]
    (-> this .-recipeItems)))

(defn get-recipe-output
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ShapedRecipes this]
    (-> this (.getRecipeOutput))))

(defn get-remaining-items
  "inv - `net.minecraft.inventory.InventoryCrafting`

  returns: `net.minecraft.util.NonNullList<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.NonNullList [^ShapedRecipes this ^net.minecraft.inventory.InventoryCrafting inv]
    (-> this (.getRemainingItems inv))))

(defn matches
  "inv - `net.minecraft.inventory.InventoryCrafting`
  world-in - `net.minecraft.world.World`

  returns: `boolean`"
  (^Boolean [^ShapedRecipes this ^net.minecraft.inventory.InventoryCrafting inv ^net.minecraft.world.World world-in]
    (-> this (.matches inv world-in))))

(defn get-crafting-result
  "inv - `net.minecraft.inventory.InventoryCrafting`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ShapedRecipes this ^net.minecraft.inventory.InventoryCrafting inv]
    (-> this (.getCraftingResult inv))))

(defn get-recipe-size
  "returns: `int`"
  (^Integer [^ShapedRecipes this]
    (-> this (.getRecipeSize))))

