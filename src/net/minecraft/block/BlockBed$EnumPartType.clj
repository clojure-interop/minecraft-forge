(ns net.minecraft.block.BlockBed$EnumPartType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockBed$EnumPartType]))

(def HEAD
  "Enum Constant.

  type: net.minecraft.block.BlockBed$EnumPartType"
  BlockBed$EnumPartType/HEAD)

(def FOOT
  "Enum Constant.

  type: net.minecraft.block.BlockBed$EnumPartType"
  BlockBed$EnumPartType/FOOT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BlockBed.EnumPartType c : BlockBed.EnumPartType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.block.BlockBed$EnumPartType[]`"
  ([]
    (BlockBed$EnumPartType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.block.BlockBed$EnumPartType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.block.BlockBed$EnumPartType [^java.lang.String name]
    (BlockBed$EnumPartType/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockBed$EnumPartType this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^BlockBed$EnumPartType this]
    (-> this (.getName))))

