(ns net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer BlockModelRenderer$EnumNeighborInfo]))

(def DOWN
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo"
  BlockModelRenderer$EnumNeighborInfo/DOWN)

(def UP
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo"
  BlockModelRenderer$EnumNeighborInfo/UP)

(def NORTH
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo"
  BlockModelRenderer$EnumNeighborInfo/NORTH)

(def SOUTH
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo"
  BlockModelRenderer$EnumNeighborInfo/SOUTH)

(def WEST
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo"
  BlockModelRenderer$EnumNeighborInfo/WEST)

(def EAST
  "Enum Constant.

  type: net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo"
  BlockModelRenderer$EnumNeighborInfo/EAST)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockModelRenderer.EnumNeighborInfo c : BlockModelRenderer.EnumNeighborInfo.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo[]`"
  ([]
    (BlockModelRenderer$EnumNeighborInfo/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo [^java.lang.String name]
    (BlockModelRenderer$EnumNeighborInfo/valueOf name)))

(defn *get-neighbour-info
  "p-178273-0 - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo`"
  (^net.minecraft.client.renderer.BlockModelRenderer$EnumNeighborInfo [^net.minecraft.util.EnumFacing p-178273-0]
    (BlockModelRenderer$EnumNeighborInfo/getNeighbourInfo p-178273-0)))

