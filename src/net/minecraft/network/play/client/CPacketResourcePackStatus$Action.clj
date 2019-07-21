(ns net.minecraft.network.play.client.CPacketResourcePackStatus$Action
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketResourcePackStatus$Action]))

(def SUCCESSFULLY_LOADED
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketResourcePackStatus$Action"
  CPacketResourcePackStatus$Action/SUCCESSFULLY_LOADED)

(def DECLINED
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketResourcePackStatus$Action"
  CPacketResourcePackStatus$Action/DECLINED)

(def FAILED_DOWNLOAD
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketResourcePackStatus$Action"
  CPacketResourcePackStatus$Action/FAILED_DOWNLOAD)

(def ACCEPTED
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketResourcePackStatus$Action"
  CPacketResourcePackStatus$Action/ACCEPTED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (CPacketResourcePackStatus.Action c : CPacketResourcePackStatus.Action.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.network.play.client.CPacketResourcePackStatus$Action[]`"
  ([]
    (CPacketResourcePackStatus$Action/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.network.play.client.CPacketResourcePackStatus$Action`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.network.play.client.CPacketResourcePackStatus$Action [^java.lang.String name]
    (CPacketResourcePackStatus$Action/valueOf name)))

