(ns net.minecraft.network.play.server.SPacketTabComplete
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketTabComplete]))

(defn ->s-packet-tab-complete
  "Constructor.

  matches-in - `java.lang.String[]`"
  (^SPacketTabComplete [matches-in]
    (new SPacketTabComplete matches-in))
  (^SPacketTabComplete []
    (new SPacketTabComplete )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketTabComplete this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketTabComplete this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketTabComplete this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-matches
  "returns: `java.lang.String[]`"
  ([^SPacketTabComplete this]
    (-> this (.getMatches))))

