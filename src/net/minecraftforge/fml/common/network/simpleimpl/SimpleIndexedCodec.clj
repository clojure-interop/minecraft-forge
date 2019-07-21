(ns net.minecraftforge.fml.common.network.simpleimpl.SimpleIndexedCodec
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.simpleimpl SimpleIndexedCodec]))

(defn ->simple-indexed-codec
  "Constructor."
  (^SimpleIndexedCodec []
    (new SimpleIndexedCodec )))

(defn encode-into
  "ctx - `io.netty.channel.ChannelHandlerContext`
  msg - `net.minecraftforge.fml.common.network.simpleimpl.IMessage`
  target - `io.netty.buffer.ByteBuf`

  throws: java.lang.Exception"
  ([^SimpleIndexedCodec this ^io.netty.channel.ChannelHandlerContext ctx ^net.minecraftforge.fml.common.network.simpleimpl.IMessage msg ^io.netty.buffer.ByteBuf target]
    (-> this (.encodeInto ctx msg target))))

(defn decode-into
  "ctx - `io.netty.channel.ChannelHandlerContext`
  source - `io.netty.buffer.ByteBuf`
  msg - `net.minecraftforge.fml.common.network.simpleimpl.IMessage`"
  ([^SimpleIndexedCodec this ^io.netty.channel.ChannelHandlerContext ctx ^io.netty.buffer.ByteBuf source ^net.minecraftforge.fml.common.network.simpleimpl.IMessage msg]
    (-> this (.decodeInto ctx source msg))))

