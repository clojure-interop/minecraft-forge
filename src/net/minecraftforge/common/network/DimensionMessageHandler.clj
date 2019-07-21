(ns net.minecraftforge.common.network.DimensionMessageHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.network DimensionMessageHandler]))

(defn ->dimension-message-handler
  "Constructor."
  (^DimensionMessageHandler []
    (new DimensionMessageHandler )))

(defn exception-caught
  "ctx - `io.netty.channel.ChannelHandlerContext`
  cause - `java.lang.Throwable`

  throws: java.lang.Exception"
  ([^DimensionMessageHandler this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Throwable cause]
    (-> this (.exceptionCaught ctx cause))))

