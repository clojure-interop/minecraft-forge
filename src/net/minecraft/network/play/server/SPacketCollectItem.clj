(ns net.minecraft.network.play.server.SPacketCollectItem
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketCollectItem]))

(defn ->s-packet-collect-item
  "Constructor.

  p-i-47316-1 - `int`
  p-i-47316-2 - `int`
  p-i-47316-3 - `int`"
  (^SPacketCollectItem [^Integer p-i-47316-1 ^Integer p-i-47316-2 ^Integer p-i-47316-3]
    (new SPacketCollectItem p-i-47316-1 p-i-47316-2 p-i-47316-3))
  (^SPacketCollectItem []
    (new SPacketCollectItem )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketCollectItem this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketCollectItem this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketCollectItem this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-collected-item-entity-id
  "returns: `int`"
  (^Integer [^SPacketCollectItem this]
    (-> this (.getCollectedItemEntityID))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^SPacketCollectItem this]
    (-> this (.getEntityID))))

(defn get-amount
  "returns: `int`"
  (^Integer [^SPacketCollectItem this]
    (-> this (.getAmount))))

