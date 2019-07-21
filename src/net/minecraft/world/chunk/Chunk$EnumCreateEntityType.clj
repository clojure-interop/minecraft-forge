(ns net.minecraft.world.chunk.Chunk$EnumCreateEntityType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk Chunk$EnumCreateEntityType]))

(def IMMEDIATE
  "Enum Constant.

  type: net.minecraft.world.chunk.Chunk$EnumCreateEntityType"
  Chunk$EnumCreateEntityType/IMMEDIATE)

(def QUEUED
  "Enum Constant.

  type: net.minecraft.world.chunk.Chunk$EnumCreateEntityType"
  Chunk$EnumCreateEntityType/QUEUED)

(def CHECK
  "Enum Constant.

  type: net.minecraft.world.chunk.Chunk$EnumCreateEntityType"
  Chunk$EnumCreateEntityType/CHECK)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Chunk.EnumCreateEntityType c : Chunk.EnumCreateEntityType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.chunk.Chunk$EnumCreateEntityType[]`"
  ([]
    (Chunk$EnumCreateEntityType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.chunk.Chunk$EnumCreateEntityType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.chunk.Chunk$EnumCreateEntityType [^java.lang.String name]
    (Chunk$EnumCreateEntityType/valueOf name)))

