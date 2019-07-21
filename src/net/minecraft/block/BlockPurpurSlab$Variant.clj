(ns net.minecraft.block.BlockPurpurSlab$Variant
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockPurpurSlab$Variant]))

(def DEFAULT
  "Enum Constant.

  type: net.minecraft.block.BlockPurpurSlab$Variant"
  BlockPurpurSlab$Variant/DEFAULT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockPurpurSlab.Variant c : BlockPurpurSlab.Variant.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockPurpurSlab$Variant[]`"
  ([]
    (BlockPurpurSlab$Variant/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockPurpurSlab$Variant`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockPurpurSlab$Variant [^java.lang.String name]
    (BlockPurpurSlab$Variant/valueOf name)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockPurpurSlab$Variant this]
    (-> this (.getName))))

