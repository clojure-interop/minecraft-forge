(ns net.minecraftforge.fml.common.network.handshake.FMLHandshakeCodec
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.handshake FMLHandshakeCodec]))

(defn ->fml-handshake-codec
  "Constructor."
  (^FMLHandshakeCodec []
    (new FMLHandshakeCodec )))

(defn encode-into
  "ctx - `io.netty.channel.ChannelHandlerContext`
  msg - `net.minecraftforge.fml.common.network.handshake.FMLHandshakeMessage`
  target - `io.netty.buffer.ByteBuf`

  throws: java.lang.Exception"
  ([^FMLHandshakeCodec this ^io.netty.channel.ChannelHandlerContext ctx ^net.minecraftforge.fml.common.network.handshake.FMLHandshakeMessage msg ^io.netty.buffer.ByteBuf target]
    (-> this (.encodeInto ctx msg target))))

(defn decode-into
  "ctx - `io.netty.channel.ChannelHandlerContext`
  source - `io.netty.buffer.ByteBuf`
  msg - `net.minecraftforge.fml.common.network.handshake.FMLHandshakeMessage`"
  ([^FMLHandshakeCodec this ^io.netty.channel.ChannelHandlerContext ctx ^io.netty.buffer.ByteBuf source ^net.minecraftforge.fml.common.network.handshake.FMLHandshakeMessage msg]
    (-> this (.decodeInto ctx source msg))))

