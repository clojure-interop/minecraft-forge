(ns net.minecraft.tileentity.TileEntityShulkerBox$AnimationStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityShulkerBox$AnimationStatus]))

(def CLOSED
  "Enum Constant.

  type: net.minecraft.tileentity.TileEntityShulkerBox$AnimationStatus"
  TileEntityShulkerBox$AnimationStatus/CLOSED)

(def OPENING
  "Enum Constant.

  type: net.minecraft.tileentity.TileEntityShulkerBox$AnimationStatus"
  TileEntityShulkerBox$AnimationStatus/OPENING)

(def OPENED
  "Enum Constant.

  type: net.minecraft.tileentity.TileEntityShulkerBox$AnimationStatus"
  TileEntityShulkerBox$AnimationStatus/OPENED)

(def CLOSING
  "Enum Constant.

  type: net.minecraft.tileentity.TileEntityShulkerBox$AnimationStatus"
  TileEntityShulkerBox$AnimationStatus/CLOSING)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (TileEntityShulkerBox.AnimationStatus c : TileEntityShulkerBox.AnimationStatus.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.tileentity.TileEntityShulkerBox$AnimationStatus[]`"
  ([]
    (TileEntityShulkerBox$AnimationStatus/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.tileentity.TileEntityShulkerBox$AnimationStatus`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.tileentity.TileEntityShulkerBox$AnimationStatus [^java.lang.String name]
    (TileEntityShulkerBox$AnimationStatus/valueOf name)))

