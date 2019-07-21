(ns net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen DecorateBiomeEvent$Decorate$EventType]))

(def BIG_SHROOM
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/BIG_SHROOM)

(def CACTUS
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/CACTUS)

(def CLAY
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/CLAY)

(def DEAD_BUSH
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/DEAD_BUSH)

(def DESERT_WELL
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/DESERT_WELL)

(def LILYPAD
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/LILYPAD)

(def FLOWERS
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/FLOWERS)

(def FOSSIL
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/FOSSIL)

(def GRASS
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/GRASS)

(def ICE
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/ICE)

(def LAKE_WATER
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/LAKE_WATER)

(def LAKE_LAVA
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/LAKE_LAVA)

(def PUMPKIN
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/PUMPKIN)

(def REED
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/REED)

(def ROCK
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/ROCK)

(def SAND
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/SAND)

(def SAND_PASS2
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/SAND_PASS2)

(def SHROOM
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/SHROOM)

(def TREE
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/TREE)

(def CUSTOM
  "Enum Constant.

  type: net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType"
  DecorateBiomeEvent$Decorate$EventType/CUSTOM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (DecorateBiomeEvent.Decorate.EventType c : DecorateBiomeEvent.Decorate.EventType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType[]`"
  ([]
    (DecorateBiomeEvent$Decorate$EventType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.event.terraingen.DecorateBiomeEvent$Decorate$EventType [^java.lang.String name]
    (DecorateBiomeEvent$Decorate$EventType/valueOf name)))

