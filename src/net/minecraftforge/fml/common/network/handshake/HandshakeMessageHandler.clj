(ns net.minecraftforge.fml.common.network.handshake.HandshakeMessageHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.handshake HandshakeMessageHandler]))

(defn ->handshake-message-handler
  "Constructor.

  state-type - `java.lang.Class`"
  (^HandshakeMessageHandler [^java.lang.Class state-type]
    (new HandshakeMessageHandler state-type)))

(defn channel-active
  "ctx - `io.netty.channel.ChannelHandlerContext`

  throws: java.lang.Exception"
  ([^HandshakeMessageHandler this ^io.netty.channel.ChannelHandlerContext ctx]
    (-> this (.channelActive ctx))))

(defn user-event-triggered
  "ctx - `io.netty.channel.ChannelHandlerContext`
  evt - `java.lang.Object`

  throws: java.lang.Exception"
  ([^HandshakeMessageHandler this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Object evt]
    (-> this (.userEventTriggered ctx evt))))

(defn exception-caught
  "ctx - `io.netty.channel.ChannelHandlerContext`
  cause - `java.lang.Throwable`

  throws: java.lang.Exception"
  ([^HandshakeMessageHandler this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Throwable cause]
    (-> this (.exceptionCaught ctx cause))))

