(ns net.minecraftforge.fml.common.network.simpleimpl.SimpleChannelHandlerWrapper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.simpleimpl SimpleChannelHandlerWrapper]))

(defn ->simple-channel-handler-wrapper
  "Constructor.

  handler - `java.lang.Class`
  side - `net.minecraftforge.fml.relauncher.Side`
  request-type - `java.lang.Class`"
  (^SimpleChannelHandlerWrapper [^java.lang.Class handler ^net.minecraftforge.fml.relauncher.Side side ^java.lang.Class request-type]
    (new SimpleChannelHandlerWrapper handler side request-type)))

(defn exception-caught
  "ctx - `io.netty.channel.ChannelHandlerContext`
  cause - `java.lang.Throwable`

  throws: java.lang.Exception"
  ([^SimpleChannelHandlerWrapper this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Throwable cause]
    (-> this (.exceptionCaught ctx cause))))

