(ns net.minecraftforge.fml.common.network.FMLOutboundHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network FMLOutboundHandler]))

(defn ->fml-outbound-handler
  "Constructor."
  (^FMLOutboundHandler []
    (new FMLOutboundHandler )))

(def *-fml-messagetarget
  "Static Constant.

  type: io.netty.util.AttributeKey<net.minecraftforge.fml.common.network.FMLOutboundHandler$OutboundTarget>"
  FMLOutboundHandler/FML_MESSAGETARGET)

(def *-fml-messagetargetargs
  "Static Constant.

  type: io.netty.util.AttributeKey<java.lang.Object>"
  FMLOutboundHandler/FML_MESSAGETARGETARGS)

(defn write
  "ctx - `io.netty.channel.ChannelHandlerContext`
  msg - `java.lang.Object`
  promise - `io.netty.channel.ChannelPromise`

  throws: java.lang.Exception"
  ([^FMLOutboundHandler this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Object msg ^io.netty.channel.ChannelPromise promise]
    (-> this (.write ctx msg promise))))

