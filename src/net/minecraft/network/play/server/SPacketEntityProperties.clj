(ns net.minecraft.network.play.server.SPacketEntityProperties
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketEntityProperties]))

(defn ->s-packet-entity-properties
  "Constructor.

  entity-id-in - `int`
  instances - `java.util.Collection`"
  (^SPacketEntityProperties [^Integer entity-id-in ^java.util.Collection instances]
    (new SPacketEntityProperties entity-id-in instances))
  (^SPacketEntityProperties []
    (new SPacketEntityProperties )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityProperties this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityProperties this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketEntityProperties this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^SPacketEntityProperties this]
    (-> this (.getEntityId))))

(defn get-snapshots
  "returns: `java.util.List<net.minecraft.network.play.server.SPacketEntityProperties$Snapshot>`"
  (^java.util.List [^SPacketEntityProperties this]
    (-> this (.getSnapshots))))

