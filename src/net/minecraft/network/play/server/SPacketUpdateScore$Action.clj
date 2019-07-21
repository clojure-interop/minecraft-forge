(ns net.minecraft.network.play.server.SPacketUpdateScore$Action
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketUpdateScore$Action]))

(def CHANGE
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketUpdateScore$Action"
  SPacketUpdateScore$Action/CHANGE)

(def REMOVE
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketUpdateScore$Action"
  SPacketUpdateScore$Action/REMOVE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SPacketUpdateScore.Action c : SPacketUpdateScore.Action.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.network.play.server.SPacketUpdateScore$Action[]`"
  ([]
    (SPacketUpdateScore$Action/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.network.play.server.SPacketUpdateScore$Action`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.network.play.server.SPacketUpdateScore$Action [^java.lang.String name]
    (SPacketUpdateScore$Action/valueOf name)))

