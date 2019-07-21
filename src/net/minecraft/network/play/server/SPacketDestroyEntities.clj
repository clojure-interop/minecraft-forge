(ns net.minecraft.network.play.server.SPacketDestroyEntities
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketDestroyEntities]))

(defn ->s-packet-destroy-entities
  "Constructor.

  entity-ids-in - `int`"
  (^SPacketDestroyEntities [^Integer entity-ids-in]
    (new SPacketDestroyEntities entity-ids-in))
  (^SPacketDestroyEntities []
    (new SPacketDestroyEntities )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketDestroyEntities this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketDestroyEntities this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketDestroyEntities this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-entity-i-ds
  "returns: `int[]`"
  ([^SPacketDestroyEntities this]
    (-> this (.getEntityIDs))))

