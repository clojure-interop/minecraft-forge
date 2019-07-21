(ns net.minecraft.item.crafting.FurnaceRecipes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item.crafting FurnaceRecipes]))

(defn *instance
  "returns: `net.minecraft.item.crafting.FurnaceRecipes`"
  (^net.minecraft.item.crafting.FurnaceRecipes []
    (FurnaceRecipes/instance )))

(defn add-smelting-recipe-for-block
  "input - `net.minecraft.block.Block`
  stack - `net.minecraft.item.ItemStack`
  experience - `float`"
  ([^FurnaceRecipes this ^net.minecraft.block.Block input ^net.minecraft.item.ItemStack stack ^Float experience]
    (-> this (.addSmeltingRecipeForBlock input stack experience))))

(defn add-smelting
  "input - `net.minecraft.item.Item`
  stack - `net.minecraft.item.ItemStack`
  experience - `float`"
  ([^FurnaceRecipes this ^net.minecraft.item.Item input ^net.minecraft.item.ItemStack stack ^Float experience]
    (-> this (.addSmelting input stack experience))))

(defn add-smelting-recipe
  "input - `net.minecraft.item.ItemStack`
  stack - `net.minecraft.item.ItemStack`
  experience - `float`"
  ([^FurnaceRecipes this ^net.minecraft.item.ItemStack input ^net.minecraft.item.ItemStack stack ^Float experience]
    (-> this (.addSmeltingRecipe input stack experience))))

(defn get-smelting-result
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^FurnaceRecipes this ^net.minecraft.item.ItemStack stack]
    (-> this (.getSmeltingResult stack))))

(defn get-smelting-list
  "returns: `java.util.Map<net.minecraft.item.ItemStack,net.minecraft.item.ItemStack>`"
  (^java.util.Map [^FurnaceRecipes this]
    (-> this (.getSmeltingList))))

(defn get-smelting-experience
  "stack - `net.minecraft.item.ItemStack`

  returns: `float`"
  (^Float [^FurnaceRecipes this ^net.minecraft.item.ItemStack stack]
    (-> this (.getSmeltingExperience stack))))

