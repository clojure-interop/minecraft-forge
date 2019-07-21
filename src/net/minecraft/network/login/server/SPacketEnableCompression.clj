(ns net.minecraft.network.login.server.SPacketEnableCompression
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.login.server SPacketEnableCompression]))

(defn ->s-packet-enable-compression
  "Constructor.

  threshold-in - `int`"
  (^SPacketEnableCompression [^Integer threshold-in]
    (new SPacketEnableCompression threshold-in))
  (^SPacketEnableCompression []
    (new SPacketEnableCompression )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEnableCompression this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEnableCompression this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.login.INetHandlerLoginClient`"
  ([^SPacketEnableCompression this ^net.minecraft.network.login.INetHandlerLoginClient handler]
    (-> this (.processPacket handler))))

(defn get-compression-threshold
  "returns: `int`"
  (^Integer [^SPacketEnableCompression this]
    (-> this (.getCompressionThreshold))))

