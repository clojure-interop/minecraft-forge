(ns net.minecraftforge.common.brewing.VanillaBrewingRecipe
  "Used in BrewingRecipeRegistry to maintain the vanilla behaviour.

  Most of the code was simply adapted from net.minecraft.tileentity.TileEntityBrewingStand"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.brewing VanillaBrewingRecipe]))

(defn ->vanilla-brewing-recipe
  "Constructor."
  (^VanillaBrewingRecipe []
    (new VanillaBrewingRecipe )))

(defn input?
  "Code adapted from TileEntityBrewingStand.isItemValidForSlot(int index, ItemStack stack)

  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^VanillaBrewingRecipe this ^net.minecraft.item.ItemStack stack]
    (-> this (.isInput stack))))

(defn ingredient?
  "Code adapted from TileEntityBrewingStand.isItemValidForSlot(int index, ItemStack stack)

  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^VanillaBrewingRecipe this ^net.minecraft.item.ItemStack stack]
    (-> this (.isIngredient stack))))

(defn get-output
  "Code copied from TileEntityBrewingStand.brewPotions()
   It brews the potion by doing the bit-shifting magic and then checking if the new PotionEffect list is different to the old one,
   or if the new potion is a splash potion when the old one wasn't.

  input - `net.minecraft.item.ItemStack`
  ingredient - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^VanillaBrewingRecipe this ^net.minecraft.item.ItemStack input ^net.minecraft.item.ItemStack ingredient]
    (-> this (.getOutput input ingredient))))

