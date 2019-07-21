(ns net.minecraft.network.LegacyPingHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network LegacyPingHandler]))

(defn ->legacy-ping-handler
  "Constructor.

  network-system-in - `net.minecraft.network.NetworkSystem`"
  (^LegacyPingHandler [^net.minecraft.network.NetworkSystem network-system-in]
    (new LegacyPingHandler network-system-in)))

(defn channel-read
  "p-channel-read-1 - `io.netty.channel.ChannelHandlerContext`
  p-channel-read-2 - `java.lang.Object`

  throws: java.lang.Exception"
  ([^LegacyPingHandler this ^io.netty.channel.ChannelHandlerContext p-channel-read-1 ^java.lang.Object p-channel-read-2]
    (-> this (.channelRead p-channel-read-1 p-channel-read-2))))

