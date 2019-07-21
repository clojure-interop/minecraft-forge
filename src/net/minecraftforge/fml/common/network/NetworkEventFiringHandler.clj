(ns net.minecraftforge.fml.common.network.NetworkEventFiringHandler
  "Use this handler as the only thing in your channel, to receive network events
  whenever your channel receives a message.
  Note: it will not forward on to other handlers."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network NetworkEventFiringHandler]))

(defn user-event-triggered
  "ctx - `io.netty.channel.ChannelHandlerContext`
  evt - `java.lang.Object`

  throws: java.lang.Exception"
  ([^NetworkEventFiringHandler this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Object evt]
    (-> this (.userEventTriggered ctx evt))))

(defn exception-caught
  "ctx - `io.netty.channel.ChannelHandlerContext`
  cause - `java.lang.Throwable`

  throws: java.lang.Exception"
  ([^NetworkEventFiringHandler this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Throwable cause]
    (-> this (.exceptionCaught ctx cause))))

