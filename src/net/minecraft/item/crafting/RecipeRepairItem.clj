(ns net.minecraft.item.crafting.RecipeRepairItem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item.crafting RecipeRepairItem]))

(defn ->recipe-repair-item
  "Constructor."
  (^RecipeRepairItem []
    (new RecipeRepairItem )))

(defn matches
  "inv - `net.minecraft.inventory.InventoryCrafting`
  world-in - `net.minecraft.world.World`

  returns: `boolean`"
  (^Boolean [^RecipeRepairItem this ^net.minecraft.inventory.InventoryCrafting inv ^net.minecraft.world.World world-in]
    (-> this (.matches inv world-in))))

(defn get-crafting-result
  "inv - `net.minecraft.inventory.InventoryCrafting`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^RecipeRepairItem this ^net.minecraft.inventory.InventoryCrafting inv]
    (-> this (.getCraftingResult inv))))

(defn get-recipe-size
  "returns: `int`"
  (^Integer [^RecipeRepairItem this]
    (-> this (.getRecipeSize))))

(defn get-recipe-output
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^RecipeRepairItem this]
    (-> this (.getRecipeOutput))))

(defn get-remaining-items
  "inv - `net.minecraft.inventory.InventoryCrafting`

  returns: `net.minecraft.util.NonNullList<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.NonNullList [^RecipeRepairItem this ^net.minecraft.inventory.InventoryCrafting inv]
    (-> this (.getRemainingItems inv))))

