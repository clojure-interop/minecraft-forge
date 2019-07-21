(ns net.minecraft.tileentity.TileEntityStructure$Mode
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityStructure$Mode]))

(def SAVE
  "Enum Constant.

  type: net.minecraft.tileentity.TileEntityStructure$Mode"
  TileEntityStructure$Mode/SAVE)

(def LOAD
  "Enum Constant.

  type: net.minecraft.tileentity.TileEntityStructure$Mode"
  TileEntityStructure$Mode/LOAD)

(def CORNER
  "Enum Constant.

  type: net.minecraft.tileentity.TileEntityStructure$Mode"
  TileEntityStructure$Mode/CORNER)

(def DATA
  "Enum Constant.

  type: net.minecraft.tileentity.TileEntityStructure$Mode"
  TileEntityStructure$Mode/DATA)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (TileEntityStructure.Mode c : TileEntityStructure.Mode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.tileentity.TileEntityStructure$Mode[]`"
  ([]
    (TileEntityStructure$Mode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.tileentity.TileEntityStructure$Mode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.tileentity.TileEntityStructure$Mode [^java.lang.String name]
    (TileEntityStructure$Mode/valueOf name)))

(defn *get-by-id
  "id - `int`

  returns: `net.minecraft.tileentity.TileEntityStructure$Mode`"
  (^net.minecraft.tileentity.TileEntityStructure$Mode [^Integer id]
    (TileEntityStructure$Mode/getById id)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TileEntityStructure$Mode this]
    (-> this (.getName))))

(defn get-mode-id
  "returns: `int`"
  (^Integer [^TileEntityStructure$Mode this]
    (-> this (.getModeId))))

