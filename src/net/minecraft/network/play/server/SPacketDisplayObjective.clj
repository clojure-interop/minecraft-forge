(ns net.minecraft.network.play.server.SPacketDisplayObjective
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketDisplayObjective]))

(defn ->s-packet-display-objective
  "Constructor.

  position-in - `int`
  objective - `net.minecraft.scoreboard.ScoreObjective`"
  (^SPacketDisplayObjective [^Integer position-in ^net.minecraft.scoreboard.ScoreObjective objective]
    (new SPacketDisplayObjective position-in objective))
  (^SPacketDisplayObjective []
    (new SPacketDisplayObjective )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketDisplayObjective this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketDisplayObjective this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketDisplayObjective this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-position
  "returns: `int`"
  (^Integer [^SPacketDisplayObjective this]
    (-> this (.getPosition))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketDisplayObjective this]
    (-> this (.getName))))

