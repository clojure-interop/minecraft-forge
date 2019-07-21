(ns net.minecraft.tileentity.TileEntityCommandBlock$Mode
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityCommandBlock$Mode]))

(def SEQUENCE
  "Enum Constant.

  type: net.minecraft.tileentity.TileEntityCommandBlock$Mode"
  TileEntityCommandBlock$Mode/SEQUENCE)

(def AUTO
  "Enum Constant.

  type: net.minecraft.tileentity.TileEntityCommandBlock$Mode"
  TileEntityCommandBlock$Mode/AUTO)

(def REDSTONE
  "Enum Constant.

  type: net.minecraft.tileentity.TileEntityCommandBlock$Mode"
  TileEntityCommandBlock$Mode/REDSTONE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (TileEntityCommandBlock.Mode c : TileEntityCommandBlock.Mode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.tileentity.TileEntityCommandBlock$Mode[]`"
  ([]
    (TileEntityCommandBlock$Mode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.tileentity.TileEntityCommandBlock$Mode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.tileentity.TileEntityCommandBlock$Mode [^java.lang.String name]
    (TileEntityCommandBlock$Mode/valueOf name)))

