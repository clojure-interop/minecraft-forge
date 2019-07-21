(ns net.minecraft.item.crafting.RecipesBanners$RecipeAddPattern
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item.crafting RecipesBanners$RecipeAddPattern]))

(defn matches
  "inv - `net.minecraft.inventory.InventoryCrafting`
  world-in - `net.minecraft.world.World`

  returns: `boolean`"
  (^Boolean [^RecipesBanners$RecipeAddPattern this ^net.minecraft.inventory.InventoryCrafting inv ^net.minecraft.world.World world-in]
    (-> this (.matches inv world-in))))

(defn get-crafting-result
  "inv - `net.minecraft.inventory.InventoryCrafting`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^RecipesBanners$RecipeAddPattern this ^net.minecraft.inventory.InventoryCrafting inv]
    (-> this (.getCraftingResult inv))))

(defn get-recipe-size
  "returns: `int`"
  (^Integer [^RecipesBanners$RecipeAddPattern this]
    (-> this (.getRecipeSize))))

(defn get-recipe-output
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^RecipesBanners$RecipeAddPattern this]
    (-> this (.getRecipeOutput))))

(defn get-remaining-items
  "inv - `net.minecraft.inventory.InventoryCrafting`

  returns: `net.minecraft.util.NonNullList<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.NonNullList [^RecipesBanners$RecipeAddPattern this ^net.minecraft.inventory.InventoryCrafting inv]
    (-> this (.getRemainingItems inv))))

