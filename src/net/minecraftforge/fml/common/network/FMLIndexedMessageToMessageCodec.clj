(ns net.minecraftforge.fml.common.network.FMLIndexedMessageToMessageCodec
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network FMLIndexedMessageToMessageCodec]))

(defn ->fml-indexed-message-to-message-codec
  "Constructor."
  (^FMLIndexedMessageToMessageCodec []
    (new FMLIndexedMessageToMessageCodec )))

(def *-inboundpackettracker
  "Static Constant.

  Make this accessible to subclasses

  type: io.netty.util.AttributeKey<java.lang.ThreadLocal<java.lang.ref.WeakReference<net.minecraftforge.fml.common.network.internal.FMLProxyPacket>>>"
  FMLIndexedMessageToMessageCodec/INBOUNDPACKETTRACKER)

(defn handler-added
  "ctx - `io.netty.channel.ChannelHandlerContext`

  throws: java.lang.Exception"
  ([^FMLIndexedMessageToMessageCodec this ^io.netty.channel.ChannelHandlerContext ctx]
    (-> this (.handlerAdded ctx))))

(defn add-discriminator
  "discriminator - `int`
  type - `java.lang.Class`

  returns: `net.minecraftforge.fml.common.network.FMLIndexedMessageToMessageCodec<A>`"
  (^net.minecraftforge.fml.common.network.FMLIndexedMessageToMessageCodec [^FMLIndexedMessageToMessageCodec this ^Integer discriminator ^java.lang.Class type]
    (-> this (.addDiscriminator discriminator type))))

(defn encode-into
  "ctx - `io.netty.channel.ChannelHandlerContext`
  msg - `A`
  target - `io.netty.buffer.ByteBuf`

  throws: java.lang.Exception"
  ([^FMLIndexedMessageToMessageCodec this ^io.netty.channel.ChannelHandlerContext ctx msg ^io.netty.buffer.ByteBuf target]
    (-> this (.encodeInto ctx msg target))))

(defn decode-into
  "ctx - `io.netty.channel.ChannelHandlerContext`
  source - `io.netty.buffer.ByteBuf`
  msg - `A`"
  ([^FMLIndexedMessageToMessageCodec this ^io.netty.channel.ChannelHandlerContext ctx ^io.netty.buffer.ByteBuf source msg]
    (-> this (.decodeInto ctx source msg))))

(defn exception-caught
  "ctx - `io.netty.channel.ChannelHandlerContext`
  cause - `java.lang.Throwable`

  throws: java.lang.Exception"
  ([^FMLIndexedMessageToMessageCodec this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Throwable cause]
    (-> this (.exceptionCaught ctx cause))))

