(ns net.minecraft.item.crafting.CraftingManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item.crafting CraftingManager]))

(defn *get-instance
  "returns: `net.minecraft.item.crafting.CraftingManager`"
  (^net.minecraft.item.crafting.CraftingManager []
    (CraftingManager/getInstance )))

(defn add-recipe
  "stack - `net.minecraft.item.ItemStack`
  recipe-components - `java.lang.Object`

  returns: `net.minecraft.item.crafting.ShapedRecipes`"
  (^net.minecraft.item.crafting.ShapedRecipes [^CraftingManager this ^net.minecraft.item.ItemStack stack ^java.lang.Object recipe-components]
    (-> this (.addRecipe stack recipe-components)))
  ([^CraftingManager this ^net.minecraft.item.crafting.IRecipe recipe]
    (-> this (.addRecipe recipe))))

(defn add-shapeless-recipe
  "stack - `net.minecraft.item.ItemStack`
  recipe-components - `java.lang.Object`"
  ([^CraftingManager this ^net.minecraft.item.ItemStack stack ^java.lang.Object recipe-components]
    (-> this (.addShapelessRecipe stack recipe-components))))

(defn find-matching-recipe
  "craft-matrix - `net.minecraft.inventory.InventoryCrafting`
  world-in - `net.minecraft.world.World`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^CraftingManager this ^net.minecraft.inventory.InventoryCrafting craft-matrix ^net.minecraft.world.World world-in]
    (-> this (.findMatchingRecipe craft-matrix world-in))))

(defn get-remaining-items
  "craft-matrix - `net.minecraft.inventory.InventoryCrafting`
  world-in - `net.minecraft.world.World`

  returns: `net.minecraft.util.NonNullList<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.NonNullList [^CraftingManager this ^net.minecraft.inventory.InventoryCrafting craft-matrix ^net.minecraft.world.World world-in]
    (-> this (.getRemainingItems craft-matrix world-in))))

(defn get-recipe-list
  "returns: `java.util.List<net.minecraft.item.crafting.IRecipe>`"
  (^java.util.List [^CraftingManager this]
    (-> this (.getRecipeList))))

