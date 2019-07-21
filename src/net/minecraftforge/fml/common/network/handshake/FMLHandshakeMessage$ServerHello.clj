(ns net.minecraftforge.fml.common.network.handshake.FMLHandshakeMessage$ServerHello
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.handshake FMLHandshakeMessage$ServerHello]))

(defn ->server-hello
  "Constructor.

  override-dim - `int`"
  (^FMLHandshakeMessage$ServerHello [^Integer override-dim]
    (new FMLHandshakeMessage$ServerHello override-dim))
  (^FMLHandshakeMessage$ServerHello []
    (new FMLHandshakeMessage$ServerHello )))

(defn to-bytes
  "buffer - `io.netty.buffer.ByteBuf`"
  ([^FMLHandshakeMessage$ServerHello this ^io.netty.buffer.ByteBuf buffer]
    (-> this (.toBytes buffer))))

(defn from-bytes
  "buffer - `io.netty.buffer.ByteBuf`"
  ([^FMLHandshakeMessage$ServerHello this ^io.netty.buffer.ByteBuf buffer]
    (-> this (.fromBytes buffer))))

(defn protocol-version
  "returns: `byte`"
  (^Byte [^FMLHandshakeMessage$ServerHello this]
    (-> this (.protocolVersion))))

(defn override-dim
  "returns: `int`"
  (^Integer [^FMLHandshakeMessage$ServerHello this]
    (-> this (.overrideDim))))

