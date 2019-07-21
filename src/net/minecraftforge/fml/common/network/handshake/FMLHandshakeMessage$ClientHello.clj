(ns net.minecraftforge.fml.common.network.handshake.FMLHandshakeMessage$ClientHello
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.handshake FMLHandshakeMessage$ClientHello]))

(defn ->client-hello
  "Constructor."
  (^FMLHandshakeMessage$ClientHello []
    (new FMLHandshakeMessage$ClientHello )))

(defn to-bytes
  "buffer - `io.netty.buffer.ByteBuf`"
  ([^FMLHandshakeMessage$ClientHello this ^io.netty.buffer.ByteBuf buffer]
    (-> this (.toBytes buffer))))

(defn from-bytes
  "buffer - `io.netty.buffer.ByteBuf`"
  ([^FMLHandshakeMessage$ClientHello this ^io.netty.buffer.ByteBuf buffer]
    (-> this (.fromBytes buffer))))

(defn protocol-version
  "returns: `byte`"
  (^Byte [^FMLHandshakeMessage$ClientHello this]
    (-> this (.protocolVersion))))

