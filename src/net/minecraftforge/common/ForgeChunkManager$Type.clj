(ns net.minecraftforge.common.ForgeChunkManager$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common ForgeChunkManager$Type]))

(def NORMAL
  "Enum Constant.

  For non-entity registrations

  type: net.minecraftforge.common.ForgeChunkManager$Type"
  ForgeChunkManager$Type/NORMAL)

(def ENTITY
  "Enum Constant.

  For entity registrations

  type: net.minecraftforge.common.ForgeChunkManager$Type"
  ForgeChunkManager$Type/ENTITY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ForgeChunkManager.Type c : ForgeChunkManager.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.common.ForgeChunkManager$Type[]`"
  ([]
    (ForgeChunkManager$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.common.ForgeChunkManager$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.common.ForgeChunkManager$Type [^java.lang.String name]
    (ForgeChunkManager$Type/valueOf name)))

