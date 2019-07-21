(ns net.minecraft.item.crafting.ShieldRecipes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item.crafting ShieldRecipes]))

(defn ->shield-recipes
  "Constructor."
  (^ShieldRecipes []
    (new ShieldRecipes )))

(defn add-recipes
  "manager - `net.minecraft.item.crafting.CraftingManager`"
  ([^ShieldRecipes this ^net.minecraft.item.crafting.CraftingManager manager]
    (-> this (.addRecipes manager))))

