(ns net.minecraft.item.crafting.RecipesCrafting
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item.crafting RecipesCrafting]))

(defn ->recipes-crafting
  "Constructor."
  (^RecipesCrafting []
    (new RecipesCrafting )))

(defn add-recipes
  "manager - `net.minecraft.item.crafting.CraftingManager`"
  ([^RecipesCrafting this ^net.minecraft.item.crafting.CraftingManager manager]
    (-> this (.addRecipes manager))))

