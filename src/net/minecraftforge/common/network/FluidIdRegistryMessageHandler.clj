(ns net.minecraftforge.common.network.FluidIdRegistryMessageHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.network FluidIdRegistryMessageHandler]))

(defn ->fluid-id-registry-message-handler
  "Constructor."
  (^FluidIdRegistryMessageHandler []
    (new FluidIdRegistryMessageHandler )))

(defn exception-caught
  "ctx - `io.netty.channel.ChannelHandlerContext`
  cause - `java.lang.Throwable`

  throws: java.lang.Exception"
  ([^FluidIdRegistryMessageHandler this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Throwable cause]
    (-> this (.exceptionCaught ctx cause))))

