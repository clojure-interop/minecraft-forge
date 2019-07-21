(ns net.minecraft.network.NettyPacketEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network NettyPacketEncoder]))

(defn ->netty-packet-encoder
  "Constructor.

  direction - `net.minecraft.network.EnumPacketDirection`"
  (^NettyPacketEncoder [^net.minecraft.network.EnumPacketDirection direction]
    (new NettyPacketEncoder direction)))

