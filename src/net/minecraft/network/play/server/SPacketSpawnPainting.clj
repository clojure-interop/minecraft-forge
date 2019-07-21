(ns net.minecraft.network.play.server.SPacketSpawnPainting
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketSpawnPainting]))

(defn ->s-packet-spawn-painting
  "Constructor.

  painting - `net.minecraft.entity.item.EntityPainting`"
  (^SPacketSpawnPainting [^net.minecraft.entity.item.EntityPainting painting]
    (new SPacketSpawnPainting painting))
  (^SPacketSpawnPainting []
    (new SPacketSpawnPainting )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSpawnPainting this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSpawnPainting this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketSpawnPainting this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^SPacketSpawnPainting this]
    (-> this (.getEntityID))))

(defn get-unique-id
  "returns: `java.util.UUID`"
  (^java.util.UUID [^SPacketSpawnPainting this]
    (-> this (.getUniqueId))))

(defn get-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^SPacketSpawnPainting this]
    (-> this (.getPosition))))

(defn get-facing
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^SPacketSpawnPainting this]
    (-> this (.getFacing))))

(defn get-title
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketSpawnPainting this]
    (-> this (.getTitle))))

