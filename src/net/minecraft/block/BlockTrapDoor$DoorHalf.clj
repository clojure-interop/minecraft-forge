(ns net.minecraft.block.BlockTrapDoor$DoorHalf
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockTrapDoor$DoorHalf]))

(def TOP
  "Enum Constant.

  type: net.minecraft.block.BlockTrapDoor$DoorHalf"
  BlockTrapDoor$DoorHalf/TOP)

(def BOTTOM
  "Enum Constant.

  type: net.minecraft.block.BlockTrapDoor$DoorHalf"
  BlockTrapDoor$DoorHalf/BOTTOM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockTrapDoor.DoorHalf c : BlockTrapDoor.DoorHalf.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockTrapDoor$DoorHalf[]`"
  ([]
    (BlockTrapDoor$DoorHalf/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockTrapDoor$DoorHalf`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockTrapDoor$DoorHalf [^java.lang.String name]
    (BlockTrapDoor$DoorHalf/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockTrapDoor$DoorHalf this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockTrapDoor$DoorHalf this]
    (-> this (.getName))))

