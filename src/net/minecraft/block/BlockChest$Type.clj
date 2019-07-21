(ns net.minecraft.block.BlockChest$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockChest$Type]))

(def BASIC
  "Enum Constant.

  type: net.minecraft.block.BlockChest$Type"
  BlockChest$Type/BASIC)

(def TRAP
  "Enum Constant.

  type: net.minecraft.block.BlockChest$Type"
  BlockChest$Type/TRAP)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockChest.Type c : BlockChest.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockChest$Type[]`"
  ([]
    (BlockChest$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockChest$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockChest$Type [^java.lang.String name]
    (BlockChest$Type/valueOf name)))

