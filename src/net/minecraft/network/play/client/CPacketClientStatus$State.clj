(ns net.minecraft.network.play.client.CPacketClientStatus$State
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketClientStatus$State]))

(def PERFORM_RESPAWN
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketClientStatus$State"
  CPacketClientStatus$State/PERFORM_RESPAWN)

(def REQUEST_STATS
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketClientStatus$State"
  CPacketClientStatus$State/REQUEST_STATS)

(def OPEN_INVENTORY_ACHIEVEMENT
  "Enum Constant.

  type: net.minecraft.network.play.client.CPacketClientStatus$State"
  CPacketClientStatus$State/OPEN_INVENTORY_ACHIEVEMENT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (CPacketClientStatus.State c : CPacketClientStatus.State.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.network.play.client.CPacketClientStatus$State[]`"
  ([]
    (CPacketClientStatus$State/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.network.play.client.CPacketClientStatus$State`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.network.play.client.CPacketClientStatus$State [^java.lang.String name]
    (CPacketClientStatus$State/valueOf name)))

