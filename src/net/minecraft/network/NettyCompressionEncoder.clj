(ns net.minecraft.network.NettyCompressionEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network NettyCompressionEncoder]))

(defn ->netty-compression-encoder
  "Constructor.

  threshold-in - `int`"
  (^NettyCompressionEncoder [^Integer threshold-in]
    (new NettyCompressionEncoder threshold-in)))

(defn set-compression-threshold
  "threshold-in - `int`"
  ([^NettyCompressionEncoder this ^Integer threshold-in]
    (-> this (.setCompressionThreshold threshold-in))))

