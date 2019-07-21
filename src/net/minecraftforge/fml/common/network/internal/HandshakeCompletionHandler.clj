(ns net.minecraftforge.fml.common.network.internal.HandshakeCompletionHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.internal HandshakeCompletionHandler]))

(defn ->handshake-completion-handler
  "Constructor."
  (^HandshakeCompletionHandler []
    (new HandshakeCompletionHandler )))

(defn exception-caught
  "ctx - `io.netty.channel.ChannelHandlerContext`
  cause - `java.lang.Throwable`

  throws: java.lang.Exception"
  ([^HandshakeCompletionHandler this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Throwable cause]
    (-> this (.exceptionCaught ctx cause))))

