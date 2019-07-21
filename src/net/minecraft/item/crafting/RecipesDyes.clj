(ns net.minecraft.item.crafting.RecipesDyes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item.crafting RecipesDyes]))

(defn ->recipes-dyes
  "Constructor."
  (^RecipesDyes []
    (new RecipesDyes )))

(defn add-recipes
  "manager - `net.minecraft.item.crafting.CraftingManager`"
  ([^RecipesDyes this ^net.minecraft.item.crafting.CraftingManager manager]
    (-> this (.addRecipes manager))))

