(ns net.minecraft.block.BlockDoor$EnumDoorHalf
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockDoor$EnumDoorHalf]))

(def UPPER
  "Enum Constant.

  type: net.minecraft.block.BlockDoor$EnumDoorHalf"
  BlockDoor$EnumDoorHalf/UPPER)

(def LOWER
  "Enum Constant.

  type: net.minecraft.block.BlockDoor$EnumDoorHalf"
  BlockDoor$EnumDoorHalf/LOWER)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockDoor.EnumDoorHalf c : BlockDoor.EnumDoorHalf.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockDoor$EnumDoorHalf[]`"
  ([]
    (BlockDoor$EnumDoorHalf/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockDoor$EnumDoorHalf`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockDoor$EnumDoorHalf [^java.lang.String name]
    (BlockDoor$EnumDoorHalf/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockDoor$EnumDoorHalf this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockDoor$EnumDoorHalf this]
    (-> this (.getName))))

