(ns net.minecraftforge.common.BiomeManager$BiomeType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common BiomeManager$BiomeType]))

(def DESERT
  "Enum Constant.

  type: net.minecraftforge.common.BiomeManager$BiomeType"
  BiomeManager$BiomeType/DESERT)

(def WARM
  "Enum Constant.

  type: net.minecraftforge.common.BiomeManager$BiomeType"
  BiomeManager$BiomeType/WARM)

(def COOL
  "Enum Constant.

  type: net.minecraftforge.common.BiomeManager$BiomeType"
  BiomeManager$BiomeType/COOL)

(def ICY
  "Enum Constant.

  type: net.minecraftforge.common.BiomeManager$BiomeType"
  BiomeManager$BiomeType/ICY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BiomeManager.BiomeType c : BiomeManager.BiomeType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.common.BiomeManager$BiomeType[]`"
  ([]
    (BiomeManager$BiomeType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.common.BiomeManager$BiomeType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.common.BiomeManager$BiomeType [^java.lang.String name]
    (BiomeManager$BiomeType/valueOf name)))

(defn *get-type
  "name - `java.lang.String`

  returns: `net.minecraftforge.common.BiomeManager$BiomeType`"
  (^net.minecraftforge.common.BiomeManager$BiomeType [^java.lang.String name]
    (BiomeManager$BiomeType/getType name)))

