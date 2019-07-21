(ns net.minecraftforge.common.brewing.AbstractBrewingRecipe
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.brewing AbstractBrewingRecipe]))

(defn input?
  "Description copied from interface: IBrewingRecipe

  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^AbstractBrewingRecipe this ^net.minecraft.item.ItemStack stack]
    (-> this (.isInput stack))))

(defn get-output
  "Description copied from interface: IBrewingRecipe

  input - `net.minecraft.item.ItemStack`
  ingredient - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^AbstractBrewingRecipe this ^net.minecraft.item.ItemStack input ^net.minecraft.item.ItemStack ingredient]
    (-> this (.getOutput input ingredient)))
  (^net.minecraft.item.ItemStack [^AbstractBrewingRecipe this]
    (-> this (.getOutput))))

(defn get-input
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^AbstractBrewingRecipe this]
    (-> this (.getInput))))

(defn get-ingredient
  "returns: `T`"
  ([^AbstractBrewingRecipe this]
    (-> this (.getIngredient))))

