(ns net.minecraftforge.fml.common.network.internal.OpenGuiHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.internal OpenGuiHandler]))

(defn ->open-gui-handler
  "Constructor."
  (^OpenGuiHandler []
    (new OpenGuiHandler )))

(defn exception-caught
  "ctx - `io.netty.channel.ChannelHandlerContext`
  cause - `java.lang.Throwable`

  throws: java.lang.Exception"
  ([^OpenGuiHandler this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Throwable cause]
    (-> this (.exceptionCaught ctx cause))))

