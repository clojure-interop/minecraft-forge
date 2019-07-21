(ns net.minecraft.network.play.server.SPacketUpdateScore
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketUpdateScore]))

(defn ->s-packet-update-score
  "Constructor.

  name-in - `java.lang.String`
  objective-in - `net.minecraft.scoreboard.ScoreObjective`"
  (^SPacketUpdateScore [^java.lang.String name-in ^net.minecraft.scoreboard.ScoreObjective objective-in]
    (new SPacketUpdateScore name-in objective-in))
  (^SPacketUpdateScore [^net.minecraft.scoreboard.Score score-in]
    (new SPacketUpdateScore score-in))
  (^SPacketUpdateScore []
    (new SPacketUpdateScore )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketUpdateScore this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketUpdateScore this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketUpdateScore this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-player-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketUpdateScore this]
    (-> this (.getPlayerName))))

(defn get-objective-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketUpdateScore this]
    (-> this (.getObjectiveName))))

(defn get-score-value
  "returns: `int`"
  (^Integer [^SPacketUpdateScore this]
    (-> this (.getScoreValue))))

(defn get-score-action
  "returns: `net.minecraft.network.play.server.SPacketUpdateScore$Action`"
  (^net.minecraft.network.play.server.SPacketUpdateScore$Action [^SPacketUpdateScore this]
    (-> this (.getScoreAction))))

