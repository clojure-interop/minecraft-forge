(ns net.minecraftforge.fml.common.network.simpleimpl.IMessage
  "Implement this interface for each message you wish to define."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.simpleimpl IMessage]))

(defn from-bytes
  "Convert from the supplied buffer into your specific message type

  buf - `io.netty.buffer.ByteBuf`"
  ([^IMessage this ^io.netty.buffer.ByteBuf buf]
    (-> this (.fromBytes buf))))

(defn to-bytes
  "Deconstruct your message into the supplied byte buffer

  buf - `io.netty.buffer.ByteBuf`"
  ([^IMessage this ^io.netty.buffer.ByteBuf buf]
    (-> this (.toBytes buf))))

