(ns net.minecraftforge.common.network.ServerToClientConnectionEstablishedHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.network ServerToClientConnectionEstablishedHandler]))

(defn ->server-to-client-connection-established-handler
  "Constructor."
  (^ServerToClientConnectionEstablishedHandler []
    (new ServerToClientConnectionEstablishedHandler )))

(defn user-event-triggered
  "ctx - `io.netty.channel.ChannelHandlerContext`
  evt - `java.lang.Object`

  throws: java.lang.Exception"
  ([^ServerToClientConnectionEstablishedHandler this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Object evt]
    (-> this (.userEventTriggered ctx evt))))

