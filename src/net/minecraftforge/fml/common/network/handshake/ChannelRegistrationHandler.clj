(ns net.minecraftforge.fml.common.network.handshake.ChannelRegistrationHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.handshake ChannelRegistrationHandler]))

(defn ->channel-registration-handler
  "Constructor."
  (^ChannelRegistrationHandler []
    (new ChannelRegistrationHandler )))

(defn exception-caught
  "ctx - `io.netty.channel.ChannelHandlerContext`
  cause - `java.lang.Throwable`

  throws: java.lang.Exception"
  ([^ChannelRegistrationHandler this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Throwable cause]
    (-> this (.exceptionCaught ctx cause))))

