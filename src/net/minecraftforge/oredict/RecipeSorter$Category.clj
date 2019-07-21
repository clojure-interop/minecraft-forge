(ns net.minecraftforge.oredict.RecipeSorter$Category
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.oredict RecipeSorter$Category]))

(def UNKNOWN
  "Enum Constant.

  Do not use UNKNOWN - it is for recipe types with no clear driver

  type: net.minecraftforge.oredict.RecipeSorter$Category"
  RecipeSorter$Category/UNKNOWN)

(def SHAPELESS
  "Enum Constant.

  type: net.minecraftforge.oredict.RecipeSorter$Category"
  RecipeSorter$Category/SHAPELESS)

(def SHAPED
  "Enum Constant.

  type: net.minecraftforge.oredict.RecipeSorter$Category"
  RecipeSorter$Category/SHAPED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (RecipeSorter.Category c : RecipeSorter.Category.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.oredict.RecipeSorter$Category[]`"
  ([]
    (RecipeSorter$Category/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.oredict.RecipeSorter$Category`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.oredict.RecipeSorter$Category [^java.lang.String name]
    (RecipeSorter$Category/valueOf name)))

