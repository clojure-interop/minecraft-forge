(ns net.minecraft.network.play.server.SPacketTimeUpdate
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketTimeUpdate]))

(defn ->s-packet-time-update
  "Constructor.

  total-world-time-in - `long`
  world-time-in - `long`
  p-i-46902-5 - `boolean`"
  (^SPacketTimeUpdate [^Long total-world-time-in ^Long world-time-in ^Boolean p-i-46902-5]
    (new SPacketTimeUpdate total-world-time-in world-time-in p-i-46902-5))
  (^SPacketTimeUpdate []
    (new SPacketTimeUpdate )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketTimeUpdate this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketTimeUpdate this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketTimeUpdate this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-total-world-time
  "returns: `long`"
  (^Long [^SPacketTimeUpdate this]
    (-> this (.getTotalWorldTime))))

(defn get-world-time
  "returns: `long`"
  (^Long [^SPacketTimeUpdate this]
    (-> this (.getWorldTime))))

