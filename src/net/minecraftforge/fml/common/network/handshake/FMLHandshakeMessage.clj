(ns net.minecraftforge.fml.common.network.handshake.FMLHandshakeMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.handshake FMLHandshakeMessage]))

(defn ->fml-handshake-message
  "Constructor."
  (^FMLHandshakeMessage []
    (new FMLHandshakeMessage )))

(defn *make-custom-channel-registration
  "channels - `java.util.Set`

  returns: `net.minecraftforge.fml.common.network.internal.FMLProxyPacket`"
  (^net.minecraftforge.fml.common.network.internal.FMLProxyPacket [^java.util.Set channels]
    (FMLHandshakeMessage/makeCustomChannelRegistration channels)))

(defn from-bytes
  "buffer - `io.netty.buffer.ByteBuf`"
  ([^FMLHandshakeMessage this ^io.netty.buffer.ByteBuf buffer]
    (-> this (.fromBytes buffer))))

(defn to-bytes
  "buffer - `io.netty.buffer.ByteBuf`"
  ([^FMLHandshakeMessage this ^io.netty.buffer.ByteBuf buffer]
    (-> this (.toBytes buffer))))

(defn to-string
  "side - `java.lang.Class`

  returns: `java.lang.String`"
  (^java.lang.String [^FMLHandshakeMessage this ^java.lang.Class side]
    (-> this (.toString side))))

