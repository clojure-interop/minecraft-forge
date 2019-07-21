(ns net.minecraft.item.crafting.RecipesArmorDyes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item.crafting RecipesArmorDyes]))

(defn ->recipes-armor-dyes
  "Constructor."
  (^RecipesArmorDyes []
    (new RecipesArmorDyes )))

(defn matches
  "inv - `net.minecraft.inventory.InventoryCrafting`
  world-in - `net.minecraft.world.World`

  returns: `boolean`"
  (^Boolean [^RecipesArmorDyes this ^net.minecraft.inventory.InventoryCrafting inv ^net.minecraft.world.World world-in]
    (-> this (.matches inv world-in))))

(defn get-crafting-result
  "inv - `net.minecraft.inventory.InventoryCrafting`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^RecipesArmorDyes this ^net.minecraft.inventory.InventoryCrafting inv]
    (-> this (.getCraftingResult inv))))

(defn get-recipe-size
  "returns: `int`"
  (^Integer [^RecipesArmorDyes this]
    (-> this (.getRecipeSize))))

(defn get-recipe-output
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^RecipesArmorDyes this]
    (-> this (.getRecipeOutput))))

(defn get-remaining-items
  "inv - `net.minecraft.inventory.InventoryCrafting`

  returns: `net.minecraft.util.NonNullList<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.NonNullList [^RecipesArmorDyes this ^net.minecraft.inventory.InventoryCrafting inv]
    (-> this (.getRemainingItems inv))))

