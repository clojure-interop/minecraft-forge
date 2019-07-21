(ns net.minecraft.item.crafting.RecipesIngots
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item.crafting RecipesIngots]))

(defn ->recipes-ingots
  "Constructor."
  (^RecipesIngots []
    (new RecipesIngots )))

(defn add-recipes
  "manager - `net.minecraft.item.crafting.CraftingManager`"
  ([^RecipesIngots this ^net.minecraft.item.crafting.CraftingManager manager]
    (-> this (.addRecipes manager))))

