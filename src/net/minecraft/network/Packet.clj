(ns net.minecraft.network.Packet
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network Packet]))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^Packet this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^Packet this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `T`"
  ([^Packet this handler]
    (-> this (.processPacket handler))))

