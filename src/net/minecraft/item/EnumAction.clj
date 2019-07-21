(ns net.minecraft.item.EnumAction
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item EnumAction]))

(def NONE
  "Enum Constant.

  type: net.minecraft.item.EnumAction"
  EnumAction/NONE)

(def EAT
  "Enum Constant.

  type: net.minecraft.item.EnumAction"
  EnumAction/EAT)

(def DRINK
  "Enum Constant.

  type: net.minecraft.item.EnumAction"
  EnumAction/DRINK)

(def BLOCK
  "Enum Constant.

  type: net.minecraft.item.EnumAction"
  EnumAction/BLOCK)

(def BOW
  "Enum Constant.

  type: net.minecraft.item.EnumAction"
  EnumAction/BOW)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumAction c : EnumAction.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.item.EnumAction[]`"
  ([]
    (EnumAction/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.item.EnumAction`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.item.EnumAction [^java.lang.String name]
    (EnumAction/valueOf name)))

