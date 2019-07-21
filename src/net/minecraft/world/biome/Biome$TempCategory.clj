(ns net.minecraft.world.biome.Biome$TempCategory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.biome Biome$TempCategory]))

(def OCEAN
  "Enum Constant.

  type: net.minecraft.world.biome.Biome$TempCategory"
  Biome$TempCategory/OCEAN)

(def COLD
  "Enum Constant.

  type: net.minecraft.world.biome.Biome$TempCategory"
  Biome$TempCategory/COLD)

(def MEDIUM
  "Enum Constant.

  type: net.minecraft.world.biome.Biome$TempCategory"
  Biome$TempCategory/MEDIUM)

(def WARM
  "Enum Constant.

  type: net.minecraft.world.biome.Biome$TempCategory"
  Biome$TempCategory/WARM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Biome.TempCategory c : Biome.TempCategory.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.biome.Biome$TempCategory[]`"
  ([]
    (Biome$TempCategory/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.biome.Biome$TempCategory`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.biome.Biome$TempCategory [^java.lang.String name]
    (Biome$TempCategory/valueOf name)))

