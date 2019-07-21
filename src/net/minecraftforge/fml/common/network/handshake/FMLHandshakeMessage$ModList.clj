(ns net.minecraftforge.fml.common.network.handshake.FMLHandshakeMessage$ModList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.handshake FMLHandshakeMessage$ModList]))

(defn ->mod-list
  "Constructor.

  mod-list - `java.util.List`"
  (^FMLHandshakeMessage$ModList [^java.util.List mod-list]
    (new FMLHandshakeMessage$ModList mod-list))
  (^FMLHandshakeMessage$ModList []
    (new FMLHandshakeMessage$ModList )))

(defn to-bytes
  "buffer - `io.netty.buffer.ByteBuf`"
  ([^FMLHandshakeMessage$ModList this ^io.netty.buffer.ByteBuf buffer]
    (-> this (.toBytes buffer))))

(defn from-bytes
  "buffer - `io.netty.buffer.ByteBuf`"
  ([^FMLHandshakeMessage$ModList this ^io.netty.buffer.ByteBuf buffer]
    (-> this (.fromBytes buffer))))

(defn mod-list-as-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLHandshakeMessage$ModList this]
    (-> this (.modListAsString))))

(defn mod-list-size
  "returns: `int`"
  (^Integer [^FMLHandshakeMessage$ModList this]
    (-> this (.modListSize))))

(defn mod-list
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^FMLHandshakeMessage$ModList this]
    (-> this (.modList))))

(defn to-string
  "side - `java.lang.Class`

  returns: `java.lang.String`"
  (^java.lang.String [^FMLHandshakeMessage$ModList this ^java.lang.Class side]
    (-> this (.toString side))))

