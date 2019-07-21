(ns net.minecraft.util.EnumHandSide
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util EnumHandSide]))

(def LEFT
  "Enum Constant.

  type: net.minecraft.util.EnumHandSide"
  EnumHandSide/LEFT)

(def RIGHT
  "Enum Constant.

  type: net.minecraft.util.EnumHandSide"
  EnumHandSide/RIGHT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumHandSide c : EnumHandSide.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.EnumHandSide[]`"
  ([]
    (EnumHandSide/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.EnumHandSide`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.EnumHandSide [^java.lang.String name]
    (EnumHandSide/valueOf name)))

(defn opposite
  "returns: `net.minecraft.util.EnumHandSide`"
  (^net.minecraft.util.EnumHandSide [^EnumHandSide this]
    (-> this (.opposite))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^EnumHandSide this]
    (-> this (.toString))))

