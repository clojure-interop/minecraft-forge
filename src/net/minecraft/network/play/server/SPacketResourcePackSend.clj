(ns net.minecraft.network.play.server.SPacketResourcePackSend
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketResourcePackSend]))

(defn ->s-packet-resource-pack-send
  "Constructor.

  url-in - `java.lang.String`
  hash-in - `java.lang.String`"
  (^SPacketResourcePackSend [^java.lang.String url-in ^java.lang.String hash-in]
    (new SPacketResourcePackSend url-in hash-in))
  (^SPacketResourcePackSend []
    (new SPacketResourcePackSend )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketResourcePackSend this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketResourcePackSend this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketResourcePackSend this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-url
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketResourcePackSend this]
    (-> this (.getURL))))

(defn get-hash
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketResourcePackSend this]
    (-> this (.getHash))))

