(ns net.minecraft.block.BlockLever$EnumOrientation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockLever$EnumOrientation]))

(def DOWN_X
  "Enum Constant.

  type: net.minecraft.block.BlockLever$EnumOrientation"
  BlockLever$EnumOrientation/DOWN_X)

(def EAST
  "Enum Constant.

  type: net.minecraft.block.BlockLever$EnumOrientation"
  BlockLever$EnumOrientation/EAST)

(def WEST
  "Enum Constant.

  type: net.minecraft.block.BlockLever$EnumOrientation"
  BlockLever$EnumOrientation/WEST)

(def SOUTH
  "Enum Constant.

  type: net.minecraft.block.BlockLever$EnumOrientation"
  BlockLever$EnumOrientation/SOUTH)

(def NORTH
  "Enum Constant.

  type: net.minecraft.block.BlockLever$EnumOrientation"
  BlockLever$EnumOrientation/NORTH)

(def UP_Z
  "Enum Constant.

  type: net.minecraft.block.BlockLever$EnumOrientation"
  BlockLever$EnumOrientation/UP_Z)

(def UP_X
  "Enum Constant.

  type: net.minecraft.block.BlockLever$EnumOrientation"
  BlockLever$EnumOrientation/UP_X)

(def DOWN_Z
  "Enum Constant.

  type: net.minecraft.block.BlockLever$EnumOrientation"
  BlockLever$EnumOrientation/DOWN_Z)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockLever.EnumOrientation c : BlockLever.EnumOrientation.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockLever$EnumOrientation[]`"
  ([]
    (BlockLever$EnumOrientation/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockLever$EnumOrientation`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockLever$EnumOrientation [^java.lang.String name]
    (BlockLever$EnumOrientation/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.block.BlockLever$EnumOrientation`"
  (^net.minecraft.block.BlockLever$EnumOrientation [^Integer meta]
    (BlockLever$EnumOrientation/byMetadata meta)))

(defn *for-facings
  "clicked-side - `net.minecraft.util.EnumFacing`
  entity-facing - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.block.BlockLever$EnumOrientation`"
  (^net.minecraft.block.BlockLever$EnumOrientation [^net.minecraft.util.EnumFacing clicked-side ^net.minecraft.util.EnumFacing entity-facing]
    (BlockLever$EnumOrientation/forFacings clicked-side entity-facing)))

(defn get-metadata
  "returns: `int`"
  (^Integer [^BlockLever$EnumOrientation this]
    (-> this (.getMetadata))))

(defn get-facing
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^BlockLever$EnumOrientation this]
    (-> this (.getFacing))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockLever$EnumOrientation this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockLever$EnumOrientation this]
    (-> this (.getName))))

