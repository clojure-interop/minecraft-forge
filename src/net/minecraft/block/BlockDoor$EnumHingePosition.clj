(ns net.minecraft.block.BlockDoor$EnumHingePosition
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockDoor$EnumHingePosition]))

(def LEFT
  "Enum Constant.

  type: net.minecraft.block.BlockDoor$EnumHingePosition"
  BlockDoor$EnumHingePosition/LEFT)

(def RIGHT
  "Enum Constant.

  type: net.minecraft.block.BlockDoor$EnumHingePosition"
  BlockDoor$EnumHingePosition/RIGHT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockDoor.EnumHingePosition c : BlockDoor.EnumHingePosition.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockDoor$EnumHingePosition[]`"
  ([]
    (BlockDoor$EnumHingePosition/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockDoor$EnumHingePosition`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockDoor$EnumHingePosition [^java.lang.String name]
    (BlockDoor$EnumHingePosition/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockDoor$EnumHingePosition this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockDoor$EnumHingePosition this]
    (-> this (.getName))))

