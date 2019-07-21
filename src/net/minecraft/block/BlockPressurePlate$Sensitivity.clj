(ns net.minecraft.block.BlockPressurePlate$Sensitivity
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockPressurePlate$Sensitivity]))

(def EVERYTHING
  "Enum Constant.

  type: net.minecraft.block.BlockPressurePlate$Sensitivity"
  BlockPressurePlate$Sensitivity/EVERYTHING)

(def MOBS
  "Enum Constant.

  type: net.minecraft.block.BlockPressurePlate$Sensitivity"
  BlockPressurePlate$Sensitivity/MOBS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockPressurePlate.Sensitivity c : BlockPressurePlate.Sensitivity.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockPressurePlate$Sensitivity[]`"
  ([]
    (BlockPressurePlate$Sensitivity/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockPressurePlate$Sensitivity`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockPressurePlate$Sensitivity [^java.lang.String name]
    (BlockPressurePlate$Sensitivity/valueOf name)))

