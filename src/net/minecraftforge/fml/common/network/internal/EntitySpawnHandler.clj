(ns net.minecraftforge.fml.common.network.internal.EntitySpawnHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.internal EntitySpawnHandler]))

(defn ->entity-spawn-handler
  "Constructor."
  (^EntitySpawnHandler []
    (new EntitySpawnHandler )))

(defn exception-caught
  "ctx - `io.netty.channel.ChannelHandlerContext`
  cause - `java.lang.Throwable`

  throws: java.lang.Exception"
  ([^EntitySpawnHandler this ^io.netty.channel.ChannelHandlerContext ctx ^java.lang.Throwable cause]
    (-> this (.exceptionCaught ctx cause))))

