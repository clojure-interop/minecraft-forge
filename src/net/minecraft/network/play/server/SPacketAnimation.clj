(ns net.minecraft.network.play.server.SPacketAnimation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketAnimation]))

(defn ->s-packet-animation
  "Constructor.

  entity-in - `net.minecraft.entity.Entity`
  type-in - `int`"
  (^SPacketAnimation [^net.minecraft.entity.Entity entity-in ^Integer type-in]
    (new SPacketAnimation entity-in type-in))
  (^SPacketAnimation []
    (new SPacketAnimation )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketAnimation this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketAnimation this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketAnimation this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^SPacketAnimation this]
    (-> this (.getEntityID))))

(defn get-animation-type
  "returns: `int`"
  (^Integer [^SPacketAnimation this]
    (-> this (.getAnimationType))))

