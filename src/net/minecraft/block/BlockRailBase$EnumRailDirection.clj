(ns net.minecraft.block.BlockRailBase$EnumRailDirection
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockRailBase$EnumRailDirection]))

(def NORTH_SOUTH
  "Enum Constant.

  type: net.minecraft.block.BlockRailBase$EnumRailDirection"
  BlockRailBase$EnumRailDirection/NORTH_SOUTH)

(def EAST_WEST
  "Enum Constant.

  type: net.minecraft.block.BlockRailBase$EnumRailDirection"
  BlockRailBase$EnumRailDirection/EAST_WEST)

(def ASCENDING_EAST
  "Enum Constant.

  type: net.minecraft.block.BlockRailBase$EnumRailDirection"
  BlockRailBase$EnumRailDirection/ASCENDING_EAST)

(def ASCENDING_WEST
  "Enum Constant.

  type: net.minecraft.block.BlockRailBase$EnumRailDirection"
  BlockRailBase$EnumRailDirection/ASCENDING_WEST)

(def ASCENDING_NORTH
  "Enum Constant.

  type: net.minecraft.block.BlockRailBase$EnumRailDirection"
  BlockRailBase$EnumRailDirection/ASCENDING_NORTH)

(def ASCENDING_SOUTH
  "Enum Constant.

  type: net.minecraft.block.BlockRailBase$EnumRailDirection"
  BlockRailBase$EnumRailDirection/ASCENDING_SOUTH)

(def SOUTH_EAST
  "Enum Constant.

  type: net.minecraft.block.BlockRailBase$EnumRailDirection"
  BlockRailBase$EnumRailDirection/SOUTH_EAST)

(def SOUTH_WEST
  "Enum Constant.

  type: net.minecraft.block.BlockRailBase$EnumRailDirection"
  BlockRailBase$EnumRailDirection/SOUTH_WEST)

(def NORTH_WEST
  "Enum Constant.

  type: net.minecraft.block.BlockRailBase$EnumRailDirection"
  BlockRailBase$EnumRailDirection/NORTH_WEST)

(def NORTH_EAST
  "Enum Constant.

  type: net.minecraft.block.BlockRailBase$EnumRailDirection"
  BlockRailBase$EnumRailDirection/NORTH_EAST)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockRailBase.EnumRailDirection c : BlockRailBase.EnumRailDirection.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockRailBase$EnumRailDirection[]`"
  ([]
    (BlockRailBase$EnumRailDirection/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockRailBase$EnumRailDirection`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockRailBase$EnumRailDirection [^java.lang.String name]
    (BlockRailBase$EnumRailDirection/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.block.BlockRailBase$EnumRailDirection`"
  (^net.minecraft.block.BlockRailBase$EnumRailDirection [^Integer meta]
    (BlockRailBase$EnumRailDirection/byMetadata meta)))

(defn get-metadata
  "returns: `int`"
  (^Integer [^BlockRailBase$EnumRailDirection this]
    (-> this (.getMetadata))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockRailBase$EnumRailDirection this]
    (-> this (.toString))))

(defn ascending?
  "returns: `boolean`"
  (^Boolean [^BlockRailBase$EnumRailDirection this]
    (-> this (.isAscending))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockRailBase$EnumRailDirection this]
    (-> this (.getName))))

