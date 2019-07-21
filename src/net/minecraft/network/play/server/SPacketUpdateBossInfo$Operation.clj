(ns net.minecraft.network.play.server.SPacketUpdateBossInfo$Operation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketUpdateBossInfo$Operation]))

(def ADD
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketUpdateBossInfo$Operation"
  SPacketUpdateBossInfo$Operation/ADD)

(def REMOVE
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketUpdateBossInfo$Operation"
  SPacketUpdateBossInfo$Operation/REMOVE)

(def UPDATE_PCT
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketUpdateBossInfo$Operation"
  SPacketUpdateBossInfo$Operation/UPDATE_PCT)

(def UPDATE_NAME
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketUpdateBossInfo$Operation"
  SPacketUpdateBossInfo$Operation/UPDATE_NAME)

(def UPDATE_STYLE
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketUpdateBossInfo$Operation"
  SPacketUpdateBossInfo$Operation/UPDATE_STYLE)

(def UPDATE_PROPERTIES
  "Enum Constant.

  type: net.minecraft.network.play.server.SPacketUpdateBossInfo$Operation"
  SPacketUpdateBossInfo$Operation/UPDATE_PROPERTIES)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SPacketUpdateBossInfo.Operation c : SPacketUpdateBossInfo.Operation.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.network.play.server.SPacketUpdateBossInfo$Operation[]`"
  ([]
    (SPacketUpdateBossInfo$Operation/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.network.play.server.SPacketUpdateBossInfo$Operation`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.network.play.server.SPacketUpdateBossInfo$Operation [^java.lang.String name]
    (SPacketUpdateBossInfo$Operation/valueOf name)))

