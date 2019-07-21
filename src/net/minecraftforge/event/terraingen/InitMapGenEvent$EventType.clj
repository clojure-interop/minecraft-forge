(ns net.minecraftforge.event.terraingen.InitMapGenEvent$EventType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen InitMapGenEvent$EventType]))

(def CAVE
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.InitMapGenEvent$EventType"
  InitMapGenEvent$EventType/CAVE)

(def MINESHAFT
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.InitMapGenEvent$EventType"
  InitMapGenEvent$EventType/MINESHAFT)

(def NETHER_BRIDGE
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.InitMapGenEvent$EventType"
  InitMapGenEvent$EventType/NETHER_BRIDGE)

(def NETHER_CAVE
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.InitMapGenEvent$EventType"
  InitMapGenEvent$EventType/NETHER_CAVE)

(def RAVINE
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.InitMapGenEvent$EventType"
  InitMapGenEvent$EventType/RAVINE)

(def SCATTERED_FEATURE
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.InitMapGenEvent$EventType"
  InitMapGenEvent$EventType/SCATTERED_FEATURE)

(def STRONGHOLD
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.InitMapGenEvent$EventType"
  InitMapGenEvent$EventType/STRONGHOLD)

(def VILLAGE
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.InitMapGenEvent$EventType"
  InitMapGenEvent$EventType/VILLAGE)

(def OCEAN_MONUMENT
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.InitMapGenEvent$EventType"
  InitMapGenEvent$EventType/OCEAN_MONUMENT)

(def CUSTOM
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.InitMapGenEvent$EventType"
  InitMapGenEvent$EventType/CUSTOM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (InitMapGenEvent.EventType c : InitMapGenEvent.EventType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.event.terraingen.InitMapGenEvent$EventType[]`"
  ([]
    (InitMapGenEvent$EventType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.event.terraingen.InitMapGenEvent$EventType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.event.terraingen.InitMapGenEvent$EventType [^java.lang.String name]
    (InitMapGenEvent$EventType/valueOf name)))

