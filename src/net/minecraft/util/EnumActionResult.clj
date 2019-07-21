(ns net.minecraft.util.EnumActionResult
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util EnumActionResult]))

(def SUCCESS
  "Enum Constant.

  type: net.minecraft.util.EnumActionResult"
  EnumActionResult/SUCCESS)

(def PASS
  "Enum Constant.

  type: net.minecraft.util.EnumActionResult"
  EnumActionResult/PASS)

(def FAIL
  "Enum Constant.

  type: net.minecraft.util.EnumActionResult"
  EnumActionResult/FAIL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumActionResult c : EnumActionResult.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.EnumActionResult[]`"
  ([]
    (EnumActionResult/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.EnumActionResult`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.EnumActionResult [^java.lang.String name]
    (EnumActionResult/valueOf name)))

