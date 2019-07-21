(ns net.minecraft.network.play.server.SPacketWorldBorder$Action
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketWorldBorder$Action]))

(def SET_SIZE
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketWorldBorder$Action"
  SPacketWorldBorder$Action/SET_SIZE)

(def LERP_SIZE
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketWorldBorder$Action"
  SPacketWorldBorder$Action/LERP_SIZE)

(def SET_CENTER
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketWorldBorder$Action"
  SPacketWorldBorder$Action/SET_CENTER)

(def INITIALIZE
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketWorldBorder$Action"
  SPacketWorldBorder$Action/INITIALIZE)

(def SET_WARNING_TIME
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketWorldBorder$Action"
  SPacketWorldBorder$Action/SET_WARNING_TIME)

(def SET_WARNING_BLOCKS
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketWorldBorder$Action"
  SPacketWorldBorder$Action/SET_WARNING_BLOCKS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SPacketWorldBorder.Action c : SPacketWorldBorder.Action.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.network.play.server.SPacketWorldBorder$Action[]`"
  ([]
    (SPacketWorldBorder$Action/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.network.play.server.SPacketWorldBorder$Action`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.network.play.server.SPacketWorldBorder$Action [^java.lang.String name]
    (SPacketWorldBorder$Action/valueOf name)))

