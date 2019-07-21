(ns net.minecraft.network.play.client.CPacketSteerBoat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketSteerBoat]))

(defn ->c-packet-steer-boat
  "Constructor.

  p-i-46873-1 - `boolean`
  p-i-46873-2 - `boolean`"
  (^CPacketSteerBoat [^Boolean p-i-46873-1 ^Boolean p-i-46873-2]
    (new CPacketSteerBoat p-i-46873-1 p-i-46873-2))
  (^CPacketSteerBoat []
    (new CPacketSteerBoat )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketSteerBoat this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketSteerBoat this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketSteerBoat this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-left?
  "returns: `boolean`"
  (^Boolean [^CPacketSteerBoat this]
    (-> this (.getLeft))))

(defn get-right?
  "returns: `boolean`"
  (^Boolean [^CPacketSteerBoat this]
    (-> this (.getRight))))

