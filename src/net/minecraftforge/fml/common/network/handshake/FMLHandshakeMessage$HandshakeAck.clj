(ns net.minecraftforge.fml.common.network.handshake.FMLHandshakeMessage$HandshakeAck
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.handshake FMLHandshakeMessage$HandshakeAck]))

(defn ->handshake-ack
  "Constructor."
  (^FMLHandshakeMessage$HandshakeAck []
    (new FMLHandshakeMessage$HandshakeAck )))

(defn from-bytes
  "buffer - `io.netty.buffer.ByteBuf`"
  ([^FMLHandshakeMessage$HandshakeAck this ^io.netty.buffer.ByteBuf buffer]
    (-> this (.fromBytes buffer))))

(defn to-bytes
  "buffer - `io.netty.buffer.ByteBuf`"
  ([^FMLHandshakeMessage$HandshakeAck this ^io.netty.buffer.ByteBuf buffer]
    (-> this (.toBytes buffer))))

(defn to-string
  "side - `java.lang.Class`

  returns: `java.lang.String`"
  (^java.lang.String [^FMLHandshakeMessage$HandshakeAck this ^java.lang.Class side]
    (-> this (.toString side))))

