(ns net.minecraft.client.renderer.BlockModelRenderer$Orientation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer BlockModelRenderer$Orientation]))

(def DOWN
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$Orientation"
  BlockModelRenderer$Orientation/DOWN)

(def UP
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$Orientation"
  BlockModelRenderer$Orientation/UP)

(def NORTH
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$Orientation"
  BlockModelRenderer$Orientation/NORTH)

(def SOUTH
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$Orientation"
  BlockModelRenderer$Orientation/SOUTH)

(def WEST
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$Orientation"
  BlockModelRenderer$Orientation/WEST)

(def EAST
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$Orientation"
  BlockModelRenderer$Orientation/EAST)

(def FLIP_DOWN
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$Orientation"
  BlockModelRenderer$Orientation/FLIP_DOWN)

(def FLIP_UP
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$Orientation"
  BlockModelRenderer$Orientation/FLIP_UP)

(def FLIP_NORTH
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$Orientation"
  BlockModelRenderer$Orientation/FLIP_NORTH)

(def FLIP_SOUTH
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$Orientation"
  BlockModelRenderer$Orientation/FLIP_SOUTH)

(def FLIP_WEST
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$Orientation"
  BlockModelRenderer$Orientation/FLIP_WEST)

(def FLIP_EAST
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$Orientation"
  BlockModelRenderer$Orientation/FLIP_EAST)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockModelRenderer.Orientation c : BlockModelRenderer.Orientation.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.renderer.BlockModelRenderer$Orientation[]`"
  ([]
    (BlockModelRenderer$Orientation/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.renderer.BlockModelRenderer$Orientation`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.renderer.BlockModelRenderer$Orientation [^java.lang.String name]
    (BlockModelRenderer$Orientation/valueOf name)))

