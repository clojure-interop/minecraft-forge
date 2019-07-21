(ns net.minecraftforge.fml.common.network.internal.FMLRuntimeCodec
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.internal FMLRuntimeCodec]))

(defn ->fml-runtime-codec
  "Constructor."
  (^FMLRuntimeCodec []
    (new FMLRuntimeCodec )))

(defn encode-into
  "ctx - `io.netty.channel.ChannelHandlerContext`
  msg - `net.minecraftforge.fml.common.network.internal.FMLMessage`
  target - `io.netty.buffer.ByteBuf`

  throws: java.lang.Exception"
  ([^FMLRuntimeCodec this ^io.netty.channel.ChannelHandlerContext ctx ^net.minecraftforge.fml.common.network.internal.FMLMessage msg ^io.netty.buffer.ByteBuf target]
    (-> this (.encodeInto ctx msg target))))

(defn decode-into
  "ctx - `io.netty.channel.ChannelHandlerContext`
  source - `io.netty.buffer.ByteBuf`
  msg - `net.minecraftforge.fml.common.network.internal.FMLMessage`"
  ([^FMLRuntimeCodec this ^io.netty.channel.ChannelHandlerContext ctx ^io.netty.buffer.ByteBuf source ^net.minecraftforge.fml.common.network.internal.FMLMessage msg]
    (-> this (.decodeInto ctx source msg))))

