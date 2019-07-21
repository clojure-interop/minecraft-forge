(ns net.minecraft.network.play.server.SPacketSpawnGlobalEntity
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketSpawnGlobalEntity]))

(defn ->s-packet-spawn-global-entity
  "Constructor.

  entity-in - `net.minecraft.entity.Entity`"
  (^SPacketSpawnGlobalEntity [^net.minecraft.entity.Entity entity-in]
    (new SPacketSpawnGlobalEntity entity-in))
  (^SPacketSpawnGlobalEntity []
    (new SPacketSpawnGlobalEntity )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSpawnGlobalEntity this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSpawnGlobalEntity this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketSpawnGlobalEntity this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^SPacketSpawnGlobalEntity this]
    (-> this (.getEntityId))))

(defn get-x
  "returns: `double`"
  (^Double [^SPacketSpawnGlobalEntity this]
    (-> this (.getX))))

(defn get-y
  "returns: `double`"
  (^Double [^SPacketSpawnGlobalEntity this]
    (-> this (.getY))))

(defn get-z
  "returns: `double`"
  (^Double [^SPacketSpawnGlobalEntity this]
    (-> this (.getZ))))

(defn get-type
  "returns: `int`"
  (^Integer [^SPacketSpawnGlobalEntity this]
    (-> this (.getType))))

