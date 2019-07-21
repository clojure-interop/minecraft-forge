(ns net.minecraftforge.common.brewing.BrewingRecipeRegistry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.brewing BrewingRecipeRegistry]))

(defn ->brewing-recipe-registry
  "Constructor."
  (^BrewingRecipeRegistry []
    (new BrewingRecipeRegistry )))

(defn *add-recipe
  "Adds a recipe to the registry. Due to the nature of the brewing stand
   inputs that stack (a.k.a max stack size > 1) are not allowed.

  input - The ItemStack that goes in same slots as the water bottles would. - `net.minecraft.item.ItemStack`
  ingredient - The ItemStack that goes in the same slot as nether wart would. - `net.minecraft.item.ItemStack`
  output - The ItemStack that will replace the input once the brewing is done. - `net.minecraft.item.ItemStack`

  returns: true if the recipe was added. - `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack input ^net.minecraft.item.ItemStack ingredient ^net.minecraft.item.ItemStack output]
    (BrewingRecipeRegistry/addRecipe input ingredient output))
  (^Boolean [^net.minecraftforge.common.brewing.IBrewingRecipe recipe]
    (BrewingRecipeRegistry/addRecipe recipe)))

(defn *get-output
  "Returns the output ItemStack obtained by brewing the passed input and
   ingredient.

  input - `net.minecraft.item.ItemStack`
  ingredient - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^net.minecraft.item.ItemStack input ^net.minecraft.item.ItemStack ingredient]
    (BrewingRecipeRegistry/getOutput input ingredient)))

(defn *has-output?
  "Returns true if the passed input and ingredient have an output

  input - `net.minecraft.item.ItemStack`
  ingredient - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack input ^net.minecraft.item.ItemStack ingredient]
    (BrewingRecipeRegistry/hasOutput input ingredient)))

(defn *can-brew?
  "Used by the brewing stand to determine if its contents can be brewed.
   Extra parameters exist to allow modders to create bigger brewing stands
   without much hassle

  inputs - `net.minecraft.util.NonNullList`
  ingredient - `net.minecraft.item.ItemStack`
  input-indexes - `int[]`

  returns: `boolean`"
  (^Boolean [^net.minecraft.util.NonNullList inputs ^net.minecraft.item.ItemStack ingredient input-indexes]
    (BrewingRecipeRegistry/canBrew inputs ingredient input-indexes)))

(defn *brew-potions
  "Used by the brewing stand to brew its inventory Extra parameters exist to
   allow modders to create bigger brewing stands without much hassle

  inputs - `net.minecraft.util.NonNullList`
  ingredient - `net.minecraft.item.ItemStack`
  input-indexes - `int[]`"
  ([^net.minecraft.util.NonNullList inputs ^net.minecraft.item.ItemStack ingredient input-indexes]
    (BrewingRecipeRegistry/brewPotions inputs ingredient input-indexes)))

(defn *valid-ingredient?
  "Returns true if the passed ItemStack is a valid ingredient for any of the
   recipes in the registry.

  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack stack]
    (BrewingRecipeRegistry/isValidIngredient stack)))

(defn *valid-input?
  "Returns true if the passed ItemStack is a valid input for any of the
   recipes in the registry.

  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack stack]
    (BrewingRecipeRegistry/isValidInput stack)))

(defn *get-recipes
  "Returns an unmodifiable list containing all the recipes in the registry

  returns: `java.util.List<net.minecraftforge.common.brewing.IBrewingRecipe>`"
  (^java.util.List []
    (BrewingRecipeRegistry/getRecipes )))

