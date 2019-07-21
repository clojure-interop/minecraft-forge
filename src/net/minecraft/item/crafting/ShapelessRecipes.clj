(ns net.minecraft.item.crafting.ShapelessRecipes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item.crafting ShapelessRecipes]))

(defn ->shapeless-recipes
  "Constructor.

  output - `net.minecraft.item.ItemStack`
  input-list - `java.util.List`"
  (^ShapelessRecipes [^net.minecraft.item.ItemStack output ^java.util.List input-list]
    (new ShapelessRecipes output input-list)))

(defn recipe-items
  "Instance Constant.

  type: java.util.List<net.minecraft.item.ItemStack>"
  (^java.util.List [^ShapelessRecipes this]
    (-> this .-recipeItems)))

(defn get-recipe-output
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ShapelessRecipes this]
    (-> this (.getRecipeOutput))))

(defn get-remaining-items
  "inv - `net.minecraft.inventory.InventoryCrafting`

  returns: `net.minecraft.util.NonNullList<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.NonNullList [^ShapelessRecipes this ^net.minecraft.inventory.InventoryCrafting inv]
    (-> this (.getRemainingItems inv))))

(defn matches
  "inv - `net.minecraft.inventory.InventoryCrafting`
  world-in - `net.minecraft.world.World`

  returns: `boolean`"
  (^Boolean [^ShapelessRecipes this ^net.minecraft.inventory.InventoryCrafting inv ^net.minecraft.world.World world-in]
    (-> this (.matches inv world-in))))

(defn get-crafting-result
  "inv - `net.minecraft.inventory.InventoryCrafting`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ShapelessRecipes this ^net.minecraft.inventory.InventoryCrafting inv]
    (-> this (.getCraftingResult inv))))

(defn get-recipe-size
  "returns: `int`"
  (^Integer [^ShapelessRecipes this]
    (-> this (.getRecipeSize))))

