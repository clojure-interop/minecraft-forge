(ns net.minecraft.inventory.ClickType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory ClickType]))

(def PICKUP
  "Enum Constant.

  type: net.minecraft.inventory.ClickType"
  ClickType/PICKUP)

(def QUICK_MOVE
  "Enum Constant.

  type: net.minecraft.inventory.ClickType"
  ClickType/QUICK_MOVE)

(def SWAP
  "Enum Constant.

  type: net.minecraft.inventory.ClickType"
  ClickType/SWAP)

(def CLONE
  "Enum Constant.

  type: net.minecraft.inventory.ClickType"
  ClickType/CLONE)

(def THROW
  "Enum Constant.

  type: net.minecraft.inventory.ClickType"
  ClickType/THROW)

(def QUICK_CRAFT
  "Enum Constant.

  type: net.minecraft.inventory.ClickType"
  ClickType/QUICK_CRAFT)

(def PICKUP_ALL
  "Enum Constant.

  type: net.minecraft.inventory.ClickType"
  ClickType/PICKUP_ALL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ClickType c : ClickType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.inventory.ClickType[]`"
  ([]
    (ClickType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.inventory.ClickType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.inventory.ClickType [^java.lang.String name]
    (ClickType/valueOf name)))

