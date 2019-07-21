(ns net.minecraft.item.crafting.RecipesTools
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item.crafting RecipesTools]))

(defn ->recipes-tools
  "Constructor."
  (^RecipesTools []
    (new RecipesTools )))

(defn add-recipes
  "manager - `net.minecraft.item.crafting.CraftingManager`"
  ([^RecipesTools this ^net.minecraft.item.crafting.CraftingManager manager]
    (-> this (.addRecipes manager))))

