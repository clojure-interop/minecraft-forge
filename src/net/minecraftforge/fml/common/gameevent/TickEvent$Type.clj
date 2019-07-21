(ns net.minecraftforge.fml.common.gameevent.TickEvent$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.gameevent TickEvent$Type]))

(def WORLD
  "Enum Constant.

  type: net.minecraftforge.fml.common.gameevent.TickEvent$Type"
  TickEvent$Type/WORLD)

(def PLAYER
  "Enum Constant.

  type: net.minecraftforge.fml.common.gameevent.TickEvent$Type"
  TickEvent$Type/PLAYER)

(def CLIENT
  "Enum Constant.

  type: net.minecraftforge.fml.common.gameevent.TickEvent$Type"
  TickEvent$Type/CLIENT)

(def SERVER
  "Enum Constant.

  type: net.minecraftforge.fml.common.gameevent.TickEvent$Type"
  TickEvent$Type/SERVER)

(def RENDER
  "Enum Constant.

  type: net.minecraftforge.fml.common.gameevent.TickEvent$Type"
  TickEvent$Type/RENDER)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (TickEvent.Type c : TickEvent.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.fml.common.gameevent.TickEvent$Type[]`"
  ([]
    (TickEvent$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.fml.common.gameevent.TickEvent$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.fml.common.gameevent.TickEvent$Type [^java.lang.String name]
    (TickEvent$Type/valueOf name)))

