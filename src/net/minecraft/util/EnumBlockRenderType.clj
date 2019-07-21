(ns net.minecraft.util.EnumBlockRenderType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util EnumBlockRenderType]))

(def INVISIBLE
  "Enum Constant.

  type: net.minecraft.util.EnumBlockRenderType"
  EnumBlockRenderType/INVISIBLE)

(def LIQUID
  "Enum Constant.

  type: net.minecraft.util.EnumBlockRenderType"
  EnumBlockRenderType/LIQUID)

(def ENTITYBLOCK_ANIMATED
  "Enum Constant.

  type: net.minecraft.util.EnumBlockRenderType"
  EnumBlockRenderType/ENTITYBLOCK_ANIMATED)

(def MODEL
  "Enum Constant.

  type: net.minecraft.util.EnumBlockRenderType"
  EnumBlockRenderType/MODEL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumBlockRenderType c : EnumBlockRenderType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.EnumBlockRenderType[]`"
  ([]
    (EnumBlockRenderType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.EnumBlockRenderType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.EnumBlockRenderType [^java.lang.String name]
    (EnumBlockRenderType/valueOf name)))

