(ns net.minecraft.util.datafix.FixTypes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix FixTypes]))

(def LEVEL
  "Enum Constant.

  type: net.minecraft.util.datafix.FixTypes"
  FixTypes/LEVEL)

(def PLAYER
  "Enum Constant.

  type: net.minecraft.util.datafix.FixTypes"
  FixTypes/PLAYER)

(def CHUNK
  "Enum Constant.

  type: net.minecraft.util.datafix.FixTypes"
  FixTypes/CHUNK)

(def BLOCK_ENTITY
  "Enum Constant.

  type: net.minecraft.util.datafix.FixTypes"
  FixTypes/BLOCK_ENTITY)

(def ENTITY
  "Enum Constant.

  type: net.minecraft.util.datafix.FixTypes"
  FixTypes/ENTITY)

(def ITEM_INSTANCE
  "Enum Constant.

  type: net.minecraft.util.datafix.FixTypes"
  FixTypes/ITEM_INSTANCE)

(def OPTIONS
  "Enum Constant.

  type: net.minecraft.util.datafix.FixTypes"
  FixTypes/OPTIONS)

(def STRUCTURE
  "Enum Constant.

  type: net.minecraft.util.datafix.FixTypes"
  FixTypes/STRUCTURE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (FixTypes c : FixTypes.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.datafix.FixTypes[]`"
  ([]
    (FixTypes/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.datafix.FixTypes`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.datafix.FixTypes [^java.lang.String name]
    (FixTypes/valueOf name)))

