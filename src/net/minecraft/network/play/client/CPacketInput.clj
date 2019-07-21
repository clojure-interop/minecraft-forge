(ns net.minecraft.network.play.client.CPacketInput
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketInput]))

(defn ->c-packet-input
  "Constructor.

  strafe-speed-in - `float`
  forward-speed-in - `float`
  jumping-in - `boolean`
  sneaking-in - `boolean`"
  (^CPacketInput [^Float strafe-speed-in ^Float forward-speed-in ^Boolean jumping-in ^Boolean sneaking-in]
    (new CPacketInput strafe-speed-in forward-speed-in jumping-in sneaking-in))
  (^CPacketInput []
    (new CPacketInput )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketInput this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketInput this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketInput this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-strafe-speed
  "returns: `float`"
  (^Float [^CPacketInput this]
    (-> this (.getStrafeSpeed))))

(defn get-forward-speed
  "returns: `float`"
  (^Float [^CPacketInput this]
    (-> this (.getForwardSpeed))))

(defn jumping?
  "returns: `boolean`"
  (^Boolean [^CPacketInput this]
    (-> this (.isJumping))))

(defn sneaking?
  "returns: `boolean`"
  (^Boolean [^CPacketInput this]
    (-> this (.isSneaking))))

