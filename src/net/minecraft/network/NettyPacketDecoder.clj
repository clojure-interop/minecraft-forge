(ns net.minecraft.network.NettyPacketDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network NettyPacketDecoder]))

(defn ->netty-packet-decoder
  "Constructor.

  direction - `net.minecraft.network.EnumPacketDirection`"
  (^NettyPacketDecoder [^net.minecraft.network.EnumPacketDirection direction]
    (new NettyPacketDecoder direction)))

