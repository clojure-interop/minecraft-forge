(ns net.minecraft.network.play.client.CPacketUseEntity$Action
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketUseEntity$Action]))

(def INTERACT
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketUseEntity$Action"
  CPacketUseEntity$Action/INTERACT)

(def ATTACK
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketUseEntity$Action"
  CPacketUseEntity$Action/ATTACK)

(def INTERACT_AT
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketUseEntity$Action"
  CPacketUseEntity$Action/INTERACT_AT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (CPacketUseEntity.Action c : CPacketUseEntity.Action.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.network.play.client.CPacketUseEntity$Action[]`"
  ([]
    (CPacketUseEntity$Action/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.network.play.client.CPacketUseEntity$Action`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.network.play.client.CPacketUseEntity$Action [^java.lang.String name]
    (CPacketUseEntity$Action/valueOf name)))

