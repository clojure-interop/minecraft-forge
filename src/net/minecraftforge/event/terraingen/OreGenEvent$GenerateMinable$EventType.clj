(ns net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen OreGenEvent$GenerateMinable$EventType]))

(def COAL
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType"
  OreGenEvent$GenerateMinable$EventType/COAL)

(def DIAMOND
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType"
  OreGenEvent$GenerateMinable$EventType/DIAMOND)

(def DIRT
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType"
  OreGenEvent$GenerateMinable$EventType/DIRT)

(def GOLD
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType"
  OreGenEvent$GenerateMinable$EventType/GOLD)

(def GRAVEL
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType"
  OreGenEvent$GenerateMinable$EventType/GRAVEL)

(def IRON
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType"
  OreGenEvent$GenerateMinable$EventType/IRON)

(def LAPIS
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType"
  OreGenEvent$GenerateMinable$EventType/LAPIS)

(def REDSTONE
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType"
  OreGenEvent$GenerateMinable$EventType/REDSTONE)

(def QUARTZ
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType"
  OreGenEvent$GenerateMinable$EventType/QUARTZ)

(def DIORITE
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType"
  OreGenEvent$GenerateMinable$EventType/DIORITE)

(def GRANITE
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType"
  OreGenEvent$GenerateMinable$EventType/GRANITE)

(def ANDESITE
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType"
  OreGenEvent$GenerateMinable$EventType/ANDESITE)

(def EMERALD
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType"
  OreGenEvent$GenerateMinable$EventType/EMERALD)

(def SILVERFISH
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType"
  OreGenEvent$GenerateMinable$EventType/SILVERFISH)

(def CUSTOM
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType"
  OreGenEvent$GenerateMinable$EventType/CUSTOM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (OreGenEvent.GenerateMinable.EventType c : OreGenEvent.GenerateMinable.EventType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType[]`"
  ([]
    (OreGenEvent$GenerateMinable$EventType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.event.terraingen.OreGenEvent$GenerateMinable$EventType [^java.lang.String name]
    (OreGenEvent$GenerateMinable$EventType/valueOf name)))

