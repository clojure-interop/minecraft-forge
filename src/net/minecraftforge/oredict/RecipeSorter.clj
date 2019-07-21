(ns net.minecraftforge.oredict.RecipeSorter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.oredict RecipeSorter]))

(def *-instance
  "Static Constant.

  type: net.minecraftforge.oredict.RecipeSorter"
  RecipeSorter/INSTANCE)

(defn *sort-craft-manager
  ""
  ([]
    (RecipeSorter/sortCraftManager )))

(defn *register
  "name - `java.lang.String`
  recipe - `java.lang.Class`
  category - `net.minecraftforge.oredict.RecipeSorter$Category`
  dependencies - `java.lang.String`"
  ([^java.lang.String name ^java.lang.Class recipe ^net.minecraftforge.oredict.RecipeSorter$Category category ^java.lang.String dependencies]
    (RecipeSorter/register name recipe category dependencies)))

(defn *set-category
  "recipe - `java.lang.Class`
  category - `net.minecraftforge.oredict.RecipeSorter$Category`"
  ([^java.lang.Class recipe ^net.minecraftforge.oredict.RecipeSorter$Category category]
    (RecipeSorter/setCategory recipe category)))

(defn *get-category
  "recipe - `net.minecraft.item.crafting.IRecipe`

  returns: `net.minecraftforge.oredict.RecipeSorter$Category`"
  (^net.minecraftforge.oredict.RecipeSorter$Category [^net.minecraft.item.crafting.IRecipe recipe]
    (RecipeSorter/getCategory recipe)))

(defn compare
  "r-1 - `net.minecraft.item.crafting.IRecipe`
  r-2 - `net.minecraft.item.crafting.IRecipe`

  returns: `int`"
  (^Integer [^RecipeSorter this ^net.minecraft.item.crafting.IRecipe r-1 ^net.minecraft.item.crafting.IRecipe r-2]
    (-> this (.compare r-1 r-2))))

