(ns net.minecraft.network.handshake.client.C00Handshake
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.handshake.client C00Handshake]))

(defn ->c-00-handshake
  "Constructor.

  protocol - `int`
  address - `java.lang.String`
  port - `int`
  state - `net.minecraft.network.EnumConnectionState`
  add-fml-marker - `boolean`"
  (^C00Handshake [^Integer protocol ^java.lang.String address ^Integer port ^net.minecraft.network.EnumConnectionState state ^Boolean add-fml-marker]
    (new C00Handshake protocol address port state add-fml-marker))
  (^C00Handshake [^Integer version ^java.lang.String ip ^Integer port ^net.minecraft.network.EnumConnectionState requested-state]
    (new C00Handshake version ip port requested-state))
  (^C00Handshake []
    (new C00Handshake )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^C00Handshake this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^C00Handshake this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.handshake.INetHandlerHandshakeServer`"
  ([^C00Handshake this ^net.minecraft.network.handshake.INetHandlerHandshakeServer handler]
    (-> this (.processPacket handler))))

(defn get-requested-state
  "returns: `net.minecraft.network.EnumConnectionState`"
  (^net.minecraft.network.EnumConnectionState [^C00Handshake this]
    (-> this (.getRequestedState))))

(defn get-protocol-version
  "returns: `int`"
  (^Integer [^C00Handshake this]
    (-> this (.getProtocolVersion))))

(defn has-fml-marker?
  "returns: `boolean`"
  (^Boolean [^C00Handshake this]
    (-> this (.hasFMLMarker))))

