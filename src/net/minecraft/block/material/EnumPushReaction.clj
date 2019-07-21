(ns net.minecraft.block.material.EnumPushReaction
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.material EnumPushReaction]))

(def NORMAL
  "Enum Constant.

  type: net.minecraft.block.material.EnumPushReaction"
  EnumPushReaction/NORMAL)

(def DESTROY
  "Enum Constant.

  type: net.minecraft.block.material.EnumPushReaction"
  EnumPushReaction/DESTROY)

(def BLOCK
  "Enum Constant.

  type: net.minecraft.block.material.EnumPushReaction"
  EnumPushReaction/BLOCK)

(def IGNORE
  "Enum Constant.

  type: net.minecraft.block.material.EnumPushReaction"
  EnumPushReaction/IGNORE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumPushReaction c : EnumPushReaction.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.material.EnumPushReaction[]`"
  ([]
    (EnumPushReaction/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.material.EnumPushReaction`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.material.EnumPushReaction [^java.lang.String name]
    (EnumPushReaction/valueOf name)))

