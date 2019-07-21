(ns net.minecraft.item.crafting.RecipesArmor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item.crafting RecipesArmor]))

(defn ->recipes-armor
  "Constructor."
  (^RecipesArmor []
    (new RecipesArmor )))

(defn add-recipes
  "craft-manager - `net.minecraft.item.crafting.CraftingManager`"
  ([^RecipesArmor this ^net.minecraft.item.crafting.CraftingManager craft-manager]
    (-> this (.addRecipes craft-manager))))

