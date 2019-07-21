(ns net.minecraft.block.BlockPistonExtension$EnumPistonType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockPistonExtension$EnumPistonType]))

(def DEFAULT
  "Enum Constant.

  type: net.minecraft.block.BlockPistonExtension$EnumPistonType"
  BlockPistonExtension$EnumPistonType/DEFAULT)

(def STICKY
  "Enum Constant.

  type: net.minecraft.block.BlockPistonExtension$EnumPistonType"
  BlockPistonExtension$EnumPistonType/STICKY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockPistonExtension.EnumPistonType c : BlockPistonExtension.EnumPistonType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockPistonExtension$EnumPistonType[]`"
  ([]
    (BlockPistonExtension$EnumPistonType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockPistonExtension$EnumPistonType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockPistonExtension$EnumPistonType [^java.lang.String name]
    (BlockPistonExtension$EnumPistonType/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockPistonExtension$EnumPistonType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockPistonExtension$EnumPistonType this]
    (-> this (.getName))))

