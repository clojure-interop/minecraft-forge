(ns net.minecraftforge.common.network.ForgeRuntimeCodec
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.network ForgeRuntimeCodec]))

(defn ->forge-runtime-codec
  "Constructor."
  (^ForgeRuntimeCodec []
    (new ForgeRuntimeCodec )))

(defn encode-into
  "ctx - `io.netty.channel.ChannelHandlerContext`
  msg - `net.minecraftforge.common.network.ForgeMessage`
  target - `io.netty.buffer.ByteBuf`

  throws: java.lang.Exception"
  ([^ForgeRuntimeCodec this ^io.netty.channel.ChannelHandlerContext ctx ^net.minecraftforge.common.network.ForgeMessage msg ^io.netty.buffer.ByteBuf target]
    (-> this (.encodeInto ctx msg target))))

(defn decode-into
  "ctx - `io.netty.channel.ChannelHandlerContext`
  source - `io.netty.buffer.ByteBuf`
  msg - `net.minecraftforge.common.network.ForgeMessage`"
  ([^ForgeRuntimeCodec this ^io.netty.channel.ChannelHandlerContext ctx ^io.netty.buffer.ByteBuf source ^net.minecraftforge.common.network.ForgeMessage msg]
    (-> this (.decodeInto ctx source msg))))

