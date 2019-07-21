(ns net.minecraftforge.common.brewing.BrewingRecipe
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.brewing BrewingRecipe]))

(defn ->brewing-recipe
  "Constructor.

  input - `net.minecraft.item.ItemStack`
  ingredient - `net.minecraft.item.ItemStack`
  output - `net.minecraft.item.ItemStack`"
  (^BrewingRecipe [^net.minecraft.item.ItemStack input ^net.minecraft.item.ItemStack ingredient ^net.minecraft.item.ItemStack output]
    (new BrewingRecipe input ingredient output)))

(defn ingredient?
  "Description copied from interface: IBrewingRecipe

  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^BrewingRecipe this ^net.minecraft.item.ItemStack stack]
    (-> this (.isIngredient stack))))

