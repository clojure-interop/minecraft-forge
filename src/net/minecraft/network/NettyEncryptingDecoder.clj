(ns net.minecraft.network.NettyEncryptingDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network NettyEncryptingDecoder]))

(defn ->netty-encrypting-decoder
  "Constructor.

  cipher - `javax.crypto.Cipher`"
  (^NettyEncryptingDecoder [^javax.crypto.Cipher cipher]
    (new NettyEncryptingDecoder cipher)))

