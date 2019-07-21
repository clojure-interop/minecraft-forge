(ns net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData
  "A interface for Entities that need extra information to be communicated
  between the server and client when they are spawned."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry IEntityAdditionalSpawnData]))

(defn write-spawn-data
  "Called by the server when constructing the spawn packet.
   Data should be added to the provided stream.

  buffer - The packet data stream - `io.netty.buffer.ByteBuf`"
  ([^IEntityAdditionalSpawnData this ^io.netty.buffer.ByteBuf buffer]
    (-> this (.writeSpawnData buffer))))

(defn read-spawn-data
  "Called by the client when it receives a Entity spawn packet.
   Data should be read out of the stream in the same way as it was written.

  additional-data - The packet data stream - `io.netty.buffer.ByteBuf`"
  ([^IEntityAdditionalSpawnData this ^io.netty.buffer.ByteBuf additional-data]
    (-> this (.readSpawnData additional-data))))

