(ns net.minecraft.item.crafting.RecipesMapExtending
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item.crafting RecipesMapExtending]))

(defn ->recipes-map-extending
  "Constructor."
  (^RecipesMapExtending []
    (new RecipesMapExtending )))

(defn matches
  "inv - `net.minecraft.inventory.InventoryCrafting`
  world-in - `net.minecraft.world.World`

  returns: `boolean`"
  (^Boolean [^RecipesMapExtending this ^net.minecraft.inventory.InventoryCrafting inv ^net.minecraft.world.World world-in]
    (-> this (.matches inv world-in))))

(defn get-crafting-result
  "inv - `net.minecraft.inventory.InventoryCrafting`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^RecipesMapExtending this ^net.minecraft.inventory.InventoryCrafting inv]
    (-> this (.getCraftingResult inv))))

