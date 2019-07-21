(ns net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen PopulateChunkEvent$Populate$EventType]))

(def DUNGEON
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType"
  PopulateChunkEvent$Populate$EventType/DUNGEON)

(def FIRE
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType"
  PopulateChunkEvent$Populate$EventType/FIRE)

(def GLOWSTONE
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType"
  PopulateChunkEvent$Populate$EventType/GLOWSTONE)

(def ICE
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType"
  PopulateChunkEvent$Populate$EventType/ICE)

(def LAKE
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType"
  PopulateChunkEvent$Populate$EventType/LAKE)

(def LAVA
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType"
  PopulateChunkEvent$Populate$EventType/LAVA)

(def NETHER_LAVA
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType"
  PopulateChunkEvent$Populate$EventType/NETHER_LAVA)

(def NETHER_LAVA2
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType"
  PopulateChunkEvent$Populate$EventType/NETHER_LAVA2)

(def NETHER_MAGMA
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType"
  PopulateChunkEvent$Populate$EventType/NETHER_MAGMA)

(def ANIMALS
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType"
  PopulateChunkEvent$Populate$EventType/ANIMALS)

(def CUSTOM
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType"
  PopulateChunkEvent$Populate$EventType/CUSTOM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (PopulateChunkEvent.Populate.EventType c : PopulateChunkEvent.Populate.EventType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType[]`"
  ([]
    (PopulateChunkEvent$Populate$EventType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType [^java.lang.String name]
    (PopulateChunkEvent$Populate$EventType/valueOf name)))

