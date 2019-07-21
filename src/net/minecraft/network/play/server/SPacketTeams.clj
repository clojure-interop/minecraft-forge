(ns net.minecraft.network.play.server.SPacketTeams
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketTeams]))

(defn ->s-packet-teams
  "Constructor.

  team-in - `net.minecraft.scoreboard.ScorePlayerTeam`
  players-in - `java.util.Collection`
  action-in - `int`"
  (^SPacketTeams [^net.minecraft.scoreboard.ScorePlayerTeam team-in ^java.util.Collection players-in ^Integer action-in]
    (new SPacketTeams team-in players-in action-in))
  (^SPacketTeams [^net.minecraft.scoreboard.ScorePlayerTeam team-in ^Integer action-in]
    (new SPacketTeams team-in action-in))
  (^SPacketTeams []
    (new SPacketTeams )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketTeams this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn get-players
  "returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^SPacketTeams this]
    (-> this (.getPlayers))))

(defn get-name-tag-visibility
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketTeams this]
    (-> this (.getNameTagVisibility))))

(defn get-suffix
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketTeams this]
    (-> this (.getSuffix))))

(defn get-action
  "returns: `int`"
  (^Integer [^SPacketTeams this]
    (-> this (.getAction))))

(defn get-display-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketTeams this]
    (-> this (.getDisplayName))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketTeams this]
    (-> this (.getName))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketTeams this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-friendly-flags
  "returns: `int`"
  (^Integer [^SPacketTeams this]
    (-> this (.getFriendlyFlags))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketTeams this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-color
  "returns: `int`"
  (^Integer [^SPacketTeams this]
    (-> this (.getColor))))

(defn get-prefix
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketTeams this]
    (-> this (.getPrefix))))

(defn get-collision-rule
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketTeams this]
    (-> this (.getCollisionRule))))

