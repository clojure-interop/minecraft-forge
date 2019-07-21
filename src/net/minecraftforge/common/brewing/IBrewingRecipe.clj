(ns net.minecraftforge.common.brewing.IBrewingRecipe
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.brewing IBrewingRecipe]))

(defn input?
  "Returns true is the passed ItemStack is an input for this recipe. \"Input\"
   being the item that goes in one of the three bottom slots of the brewing
   stand (e.g: water bottle)

  input - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^IBrewingRecipe this ^net.minecraft.item.ItemStack input]
    (-> this (.isInput input))))

(defn ingredient?
  "Returns true if the passed ItemStack is an ingredient for this recipe.
   \"Ingredient\" being the item that goes in the top slot of the brewing
   stand (e.g: nether wart)

  ingredient - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^IBrewingRecipe this ^net.minecraft.item.ItemStack ingredient]
    (-> this (.isIngredient ingredient))))

(defn get-output
  "Returns the output when the passed input is brewed with the passed
   ingredient. Empty if invalid input or ingredient.

  input - `net.minecraft.item.ItemStack`
  ingredient - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^IBrewingRecipe this ^net.minecraft.item.ItemStack input ^net.minecraft.item.ItemStack ingredient]
    (-> this (.getOutput input ingredient))))

