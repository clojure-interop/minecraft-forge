(ns net.minecraft.network.EnumConnectionState
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network EnumConnectionState]))

(def HANDSHAKING
  "Enum Constant.

  type: net.minecraft.network.EnumConnectionState"
  EnumConnectionState/HANDSHAKING)

(def PLAY
  "Enum Constant.

  type: net.minecraft.network.EnumConnectionState"
  EnumConnectionState/PLAY)

(def STATUS
  "Enum Constant.

  type: net.minecraft.network.EnumConnectionState"
  EnumConnectionState/STATUS)

(def LOGIN
  "Enum Constant.

  type: net.minecraft.network.EnumConnectionState"
  EnumConnectionState/LOGIN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumConnectionState c : EnumConnectionState.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.network.EnumConnectionState[]`"
  ([]
    (EnumConnectionState/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.network.EnumConnectionState`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.network.EnumConnectionState [^java.lang.String name]
    (EnumConnectionState/valueOf name)))

(defn *get-by-id
  "state-id - `int`

  returns: `net.minecraft.network.EnumConnectionState`"
  (^net.minecraft.network.EnumConnectionState [^Integer state-id]
    (EnumConnectionState/getById state-id)))

(defn *get-from-packet
  "packet-in - `net.minecraft.network.Packet`

  returns: `net.minecraft.network.EnumConnectionState`"
  (^net.minecraft.network.EnumConnectionState [^net.minecraft.network.Packet packet-in]
    (EnumConnectionState/getFromPacket packet-in)))

(defn get-packet-id
  "direction - `net.minecraft.network.EnumPacketDirection`
  packet-in - `net.minecraft.network.Packet`

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^EnumConnectionState this ^net.minecraft.network.EnumPacketDirection direction ^net.minecraft.network.Packet packet-in]
    (-> this (.getPacketId direction packet-in))))

(defn get-packet
  "direction - `net.minecraft.network.EnumPacketDirection`
  packet-id - `int`

  returns: `net.minecraft.network.Packet<?>`

  throws: java.lang.InstantiationException"
  (^net.minecraft.network.Packet [^EnumConnectionState this ^net.minecraft.network.EnumPacketDirection direction ^Integer packet-id]
    (-> this (.getPacket direction packet-id))))

(defn get-id
  "returns: `int`"
  (^Integer [^EnumConnectionState this]
    (-> this (.getId))))

