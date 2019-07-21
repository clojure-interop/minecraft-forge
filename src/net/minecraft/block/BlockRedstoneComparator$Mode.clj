(ns net.minecraft.block.BlockRedstoneComparator$Mode
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockRedstoneComparator$Mode]))

(def COMPARE
  "Enum Constant.

  type: net.minecraft.block.BlockRedstoneComparator$Mode"
  BlockRedstoneComparator$Mode/COMPARE)

(def SUBTRACT
  "Enum Constant.

  type: net.minecraft.block.BlockRedstoneComparator$Mode"
  BlockRedstoneComparator$Mode/SUBTRACT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockRedstoneComparator.Mode c : BlockRedstoneComparator.Mode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockRedstoneComparator$Mode[]`"
  ([]
    (BlockRedstoneComparator$Mode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockRedstoneComparator$Mode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockRedstoneComparator$Mode [^java.lang.String name]
    (BlockRedstoneComparator$Mode/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockRedstoneComparator$Mode this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockRedstoneComparator$Mode this]
    (-> this (.getName))))

