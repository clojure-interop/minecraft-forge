(ns net.minecraft.network.play.server.SPacketMultiBlockChange
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketMultiBlockChange]))

(defn ->s-packet-multi-block-change
  "Constructor.

  p-i-46959-1 - `int`
  p-i-46959-2 - `short[]`
  p-i-46959-3 - `net.minecraft.world.chunk.Chunk`"
  (^SPacketMultiBlockChange [^Integer p-i-46959-1 p-i-46959-2 ^net.minecraft.world.chunk.Chunk p-i-46959-3]
    (new SPacketMultiBlockChange p-i-46959-1 p-i-46959-2 p-i-46959-3))
  (^SPacketMultiBlockChange []
    (new SPacketMultiBlockChange )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketMultiBlockChange this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketMultiBlockChange this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketMultiBlockChange this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-changed-blocks
  "returns: `net.minecraft.network.play.server.SPacketMultiBlockChange$BlockUpdateData[]`"
  ([^SPacketMultiBlockChange this]
    (-> this (.getChangedBlocks))))

