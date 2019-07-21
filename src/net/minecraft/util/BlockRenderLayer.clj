(ns net.minecraft.util.BlockRenderLayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util BlockRenderLayer]))

(def SOLID
  "Enum Constant.

  type: net.minecraft.util.BlockRenderLayer"
  BlockRenderLayer/SOLID)

(def CUTOUT_MIPPED
  "Enum Constant.

  type: net.minecraft.util.BlockRenderLayer"
  BlockRenderLayer/CUTOUT_MIPPED)

(def CUTOUT
  "Enum Constant.

  type: net.minecraft.util.BlockRenderLayer"
  BlockRenderLayer/CUTOUT)

(def TRANSLUCENT
  "Enum Constant.

  type: net.minecraft.util.BlockRenderLayer"
  BlockRenderLayer/TRANSLUCENT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockRenderLayer c : BlockRenderLayer.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.BlockRenderLayer[]`"
  ([]
    (BlockRenderLayer/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.BlockRenderLayer`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.BlockRenderLayer [^java.lang.String name]
    (BlockRenderLayer/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockRenderLayer this]
    (-> this (.toString))))

