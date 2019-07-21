(ns net.minecraft.world.border.EnumBorderStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.border EnumBorderStatus]))

(def GROWING
  "Enum Constant.

  type: net.minecraft.world.border.EnumBorderStatus"
  EnumBorderStatus/GROWING)

(def SHRINKING
  "Enum Constant.

  type: net.minecraft.world.border.EnumBorderStatus"
  EnumBorderStatus/SHRINKING)

(def STATIONARY
  "Enum Constant.

  type: net.minecraft.world.border.EnumBorderStatus"
  EnumBorderStatus/STATIONARY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumBorderStatus c : EnumBorderStatus.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.border.EnumBorderStatus[]`"
  ([]
    (EnumBorderStatus/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.border.EnumBorderStatus`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.border.EnumBorderStatus [^java.lang.String name]
    (EnumBorderStatus/valueOf name)))

(defn get-id
  "returns: `int`"
  (^Integer [^EnumBorderStatus this]
    (-> this (.getID))))

