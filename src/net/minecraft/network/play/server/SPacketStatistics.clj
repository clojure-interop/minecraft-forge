(ns net.minecraft.network.play.server.SPacketStatistics
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketStatistics]))

(defn ->s-packet-statistics
  "Constructor.

  statistic-map-in - `java.util.Map`"
  (^SPacketStatistics [^java.util.Map statistic-map-in]
    (new SPacketStatistics statistic-map-in))
  (^SPacketStatistics []
    (new SPacketStatistics )))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketStatistics this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketStatistics this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketStatistics this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-statistic-map
  "returns: `java.util.Map<net.minecraft.stats.StatBase,java.lang.Integer>`"
  (^java.util.Map [^SPacketStatistics this]
    (-> this (.getStatisticMap))))

