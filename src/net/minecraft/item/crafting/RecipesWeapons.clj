(ns net.minecraft.item.crafting.RecipesWeapons
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item.crafting RecipesWeapons]))

(defn ->recipes-weapons
  "Constructor."
  (^RecipesWeapons []
    (new RecipesWeapons )))

(defn add-recipes
  "manager - `net.minecraft.item.crafting.CraftingManager`"
  ([^RecipesWeapons this ^net.minecraft.item.crafting.CraftingManager manager]
    (-> this (.addRecipes manager))))

