(ns net.minecraft.world.EnumSkyBlock
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world EnumSkyBlock]))

(def SKY
  "Enum Constant.

  type: net.minecraft.world.EnumSkyBlock"
  EnumSkyBlock/SKY)

(def BLOCK
  "Enum Constant.

  type: net.minecraft.world.EnumSkyBlock"
  EnumSkyBlock/BLOCK)

(defn default-light-value
  "Instance Constant.

  type: int"
  (^Integer [^EnumSkyBlock this]
    (-> this .-defaultLightValue)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumSkyBlock c : EnumSkyBlock.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.EnumSkyBlock[]`"
  ([]
    (EnumSkyBlock/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.EnumSkyBlock`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.EnumSkyBlock [^java.lang.String name]
    (EnumSkyBlock/valueOf name)))

