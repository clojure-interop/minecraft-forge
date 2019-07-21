(ns net.minecraftforge.common.brewing.BrewingOreRecipe
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.brewing BrewingOreRecipe]))

(defn ->brewing-ore-recipe
  "Constructor.

  input - `net.minecraft.item.ItemStack`
  ingredient - `java.lang.String`
  output - `net.minecraft.item.ItemStack`"
  (^BrewingOreRecipe [^net.minecraft.item.ItemStack input ^java.lang.String ingredient ^net.minecraft.item.ItemStack output]
    (new BrewingOreRecipe input ingredient output)))

(defn ingredient?
  "Description copied from interface: IBrewingRecipe

  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^BrewingOreRecipe this ^net.minecraft.item.ItemStack stack]
    (-> this (.isIngredient stack))))

