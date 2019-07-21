(ns net.minecraft.network.play.server.SPacketPlayerListItem$Action
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketPlayerListItem$Action]))

(def ADD_PLAYER
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketPlayerListItem$Action"
  SPacketPlayerListItem$Action/ADD_PLAYER)

(def UPDATE_GAME_MODE
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketPlayerListItem$Action"
  SPacketPlayerListItem$Action/UPDATE_GAME_MODE)

(def UPDATE_LATENCY
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketPlayerListItem$Action"
  SPacketPlayerListItem$Action/UPDATE_LATENCY)

(def UPDATE_DISPLAY_NAME
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketPlayerListItem$Action"
  SPacketPlayerListItem$Action/UPDATE_DISPLAY_NAME)

(def REMOVE_PLAYER
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketPlayerListItem$Action"
  SPacketPlayerListItem$Action/REMOVE_PLAYER)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SPacketPlayerListItem.Action c : SPacketPlayerListItem.Action.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.network.play.server.SPacketPlayerListItem$Action[]`"
  ([]
    (SPacketPlayerListItem$Action/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.network.play.server.SPacketPlayerListItem$Action`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.network.play.server.SPacketPlayerListItem$Action [^java.lang.String name]
    (SPacketPlayerListItem$Action/valueOf name)))

