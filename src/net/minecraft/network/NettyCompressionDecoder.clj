(ns net.minecraft.network.NettyCompressionDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network NettyCompressionDecoder]))

(defn ->netty-compression-decoder
  "Constructor.

  threshold-in - `int`"
  (^NettyCompressionDecoder [^Integer threshold-in]
    (new NettyCompressionDecoder threshold-in)))

(defn set-compression-threshold
  "threshold-in - `int`"
  ([^NettyCompressionDecoder this ^Integer threshold-in]
    (-> this (.setCompressionThreshold threshold-in))))

