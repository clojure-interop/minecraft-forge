(ns net.minecraft.network.play.server.SPacketEntityMetadata
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketEntityMetadata]))

(defn ->s-packet-entity-metadata
  "Constructor.

  entity-id-in - `int`
  data-manager-in - `net.minecraft.network.datasync.EntityDataManager`
  send-all - `boolean`"
  (^SPacketEntityMetadata [^Integer entity-id-in ^net.minecraft.network.datasync.EntityDataManager data-manager-in ^Boolean send-all]
    (new SPacketEntityMetadata entity-id-in data-manager-in send-all))
  (^SPacketEntityMetadata []
    (new SPacketEntityMetadata )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityMetadata this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityMetadata this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketEntityMetadata this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-data-manager-entries
  "returns: `java.util.List<net.minecraft.network.datasync.EntityDataManager$DataEntry<?>>`"
  (^java.util.List [^SPacketEntityMetadata this]
    (-> this (.getDataManagerEntries))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^SPacketEntityMetadata this]
    (-> this (.getEntityId))))

