(ns net.minecraft.item.crafting.RecipesFood
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item.crafting RecipesFood]))

(defn ->recipes-food
  "Constructor."
  (^RecipesFood []
    (new RecipesFood )))

(defn add-recipes
  "manager - `net.minecraft.item.crafting.CraftingManager`"
  ([^RecipesFood this ^net.minecraft.item.crafting.CraftingManager manager]
    (-> this (.addRecipes manager))))

