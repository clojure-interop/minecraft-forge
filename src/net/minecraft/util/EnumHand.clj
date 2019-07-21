(ns net.minecraft.util.EnumHand
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util EnumHand]))

(def MAIN_HAND
  "Enum Constant.

  type: net.minecraft.util.EnumHand"
  EnumHand/MAIN_HAND)

(def OFF_HAND
  "Enum Constant.

  type: net.minecraft.util.EnumHand"
  EnumHand/OFF_HAND)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumHand c : EnumHand.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.EnumHand[]`"
  ([]
    (EnumHand/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.EnumHand`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.EnumHand [^java.lang.String name]
    (EnumHand/valueOf name)))

