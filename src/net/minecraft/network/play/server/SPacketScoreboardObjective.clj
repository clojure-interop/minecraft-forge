(ns net.minecraft.network.play.server.SPacketScoreboardObjective
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketScoreboardObjective]))

(defn ->s-packet-scoreboard-objective
  "Constructor.

  objective - `net.minecraft.scoreboard.ScoreObjective`
  action-in - `int`"
  (^SPacketScoreboardObjective [^net.minecraft.scoreboard.ScoreObjective objective ^Integer action-in]
    (new SPacketScoreboardObjective objective action-in))
  (^SPacketScoreboardObjective []
    (new SPacketScoreboardObjective )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketScoreboardObjective this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketScoreboardObjective this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketScoreboardObjective this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-objective-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketScoreboardObjective this]
    (-> this (.getObjectiveName))))

(defn get-objective-value
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketScoreboardObjective this]
    (-> this (.getObjectiveValue))))

(defn get-action
  "returns: `int`"
  (^Integer [^SPacketScoreboardObjective this]
    (-> this (.getAction))))

(defn get-render-type
  "returns: `net.minecraft.scoreboard.IScoreCriteria$EnumRenderType`"
  (^net.minecraft.scoreboard.IScoreCriteria$EnumRenderType [^SPacketScoreboardObjective this]
    (-> this (.getRenderType))))

