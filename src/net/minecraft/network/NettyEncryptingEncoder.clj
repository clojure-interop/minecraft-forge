(ns net.minecraft.network.NettyEncryptingEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network NettyEncryptingEncoder]))

(defn ->netty-encrypting-encoder
  "Constructor.

  cipher - `javax.crypto.Cipher`"
  (^NettyEncryptingEncoder [^javax.crypto.Cipher cipher]
    (new NettyEncryptingEncoder cipher)))

