(ns net.minecraft.network.play.server.SPacketChunkData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketChunkData]))

(defn ->s-packet-chunk-data
  "Constructor.

  p-i-47124-1 - `net.minecraft.world.chunk.Chunk`
  p-i-47124-2 - `int`"
  (^SPacketChunkData [^net.minecraft.world.chunk.Chunk p-i-47124-1 ^Integer p-i-47124-2]
    (new SPacketChunkData p-i-47124-1 p-i-47124-2))
  (^SPacketChunkData []
    (new SPacketChunkData )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketChunkData this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn extract-chunk-data
  "p-189555-1 - `net.minecraft.network.PacketBuffer`
  p-189555-2 - `net.minecraft.world.chunk.Chunk`
  p-189555-3 - `boolean`
  p-189555-4 - `int`

  returns: `int`"
  (^Integer [^SPacketChunkData this ^net.minecraft.network.PacketBuffer p-189555-1 ^net.minecraft.world.chunk.Chunk p-189555-2 ^Boolean p-189555-3 ^Integer p-189555-4]
    (-> this (.extractChunkData p-189555-1 p-189555-2 p-189555-3 p-189555-4))))

(defn get-extracted-size
  "returns: `int`"
  (^Integer [^SPacketChunkData this]
    (-> this (.getExtractedSize))))

(defn get-tile-entity-tags
  "returns: `java.util.List<net.minecraft.nbt.NBTTagCompound>`"
  (^java.util.List [^SPacketChunkData this]
    (-> this (.getTileEntityTags))))

(defn do-chunk-load
  "returns: `boolean`"
  (^Boolean [^SPacketChunkData this]
    (-> this (.doChunkLoad))))

(defn get-chunk-z
  "returns: `int`"
  (^Integer [^SPacketChunkData this]
    (-> this (.getChunkZ))))

(defn get-read-buffer
  "returns: `net.minecraft.network.PacketBuffer`"
  (^net.minecraft.network.PacketBuffer [^SPacketChunkData this]
    (-> this (.getReadBuffer))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketChunkData this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketChunkData this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-chunk-x
  "returns: `int`"
  (^Integer [^SPacketChunkData this]
    (-> this (.getChunkX))))

