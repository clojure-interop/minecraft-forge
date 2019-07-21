(ns net.minecraft.scoreboard.ServerScoreboard
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.scoreboard ServerScoreboard]))

(defn ->server-scoreboard
  "Constructor.

  mc-server - `net.minecraft.server.MinecraftServer`"
  (^ServerScoreboard [^net.minecraft.server.MinecraftServer mc-server]
    (new ServerScoreboard mc-server)))

(defn add-dirty-runnable
  "runnable - `java.lang.Runnable`"
  ([^ServerScoreboard this ^java.lang.Runnable runnable]
    (-> this (.addDirtyRunnable runnable))))

(defn send-display-slot-removal-packets
  "p-96546-1 - `net.minecraft.scoreboard.ScoreObjective`"
  ([^ServerScoreboard this ^net.minecraft.scoreboard.ScoreObjective p-96546-1]
    (-> this (.sendDisplaySlotRemovalPackets p-96546-1))))

(defn get-objective-display-slot-count
  "p-96552-1 - `net.minecraft.scoreboard.ScoreObjective`

  returns: `int`"
  (^Integer [^ServerScoreboard this ^net.minecraft.scoreboard.ScoreObjective p-96552-1]
    (-> this (.getObjectiveDisplaySlotCount p-96552-1))))

(defn on-score-objective-removed
  "objective - `net.minecraft.scoreboard.ScoreObjective`"
  ([^ServerScoreboard this ^net.minecraft.scoreboard.ScoreObjective objective]
    (-> this (.onScoreObjectiveRemoved objective))))

(defn add-objective
  "objective - `net.minecraft.scoreboard.ScoreObjective`"
  ([^ServerScoreboard this ^net.minecraft.scoreboard.ScoreObjective objective]
    (-> this (.addObjective objective))))

(defn broadcast-score-update
  "score-name - `java.lang.String`
  objective - `net.minecraft.scoreboard.ScoreObjective`"
  ([^ServerScoreboard this ^java.lang.String score-name ^net.minecraft.scoreboard.ScoreObjective objective]
    (-> this (.broadcastScoreUpdate score-name objective)))
  ([^ServerScoreboard this ^java.lang.String score-name]
    (-> this (.broadcastScoreUpdate score-name))))

(defn on-score-updated
  "score-in - `net.minecraft.scoreboard.Score`"
  ([^ServerScoreboard this ^net.minecraft.scoreboard.Score score-in]
    (-> this (.onScoreUpdated score-in))))

(defn get-destroy-packets
  "p-96548-1 - `net.minecraft.scoreboard.ScoreObjective`

  returns: `java.util.List<net.minecraft.network.Packet<?>>`"
  (^java.util.List [^ServerScoreboard this ^net.minecraft.scoreboard.ScoreObjective p-96548-1]
    (-> this (.getDestroyPackets p-96548-1))))

(defn broadcast-team-created
  "player-team - `net.minecraft.scoreboard.ScorePlayerTeam`"
  ([^ServerScoreboard this ^net.minecraft.scoreboard.ScorePlayerTeam player-team]
    (-> this (.broadcastTeamCreated player-team))))

(defn broadcast-team-remove
  "player-team - `net.minecraft.scoreboard.ScorePlayerTeam`"
  ([^ServerScoreboard this ^net.minecraft.scoreboard.ScorePlayerTeam player-team]
    (-> this (.broadcastTeamRemove player-team))))

(defn broadcast-team-info-update
  "player-team - `net.minecraft.scoreboard.ScorePlayerTeam`"
  ([^ServerScoreboard this ^net.minecraft.scoreboard.ScorePlayerTeam player-team]
    (-> this (.broadcastTeamInfoUpdate player-team))))

(defn on-objective-display-name-changed
  "objective - `net.minecraft.scoreboard.ScoreObjective`"
  ([^ServerScoreboard this ^net.minecraft.scoreboard.ScoreObjective objective]
    (-> this (.onObjectiveDisplayNameChanged objective))))

(defn on-score-objective-added
  "score-objective-in - `net.minecraft.scoreboard.ScoreObjective`"
  ([^ServerScoreboard this ^net.minecraft.scoreboard.ScoreObjective score-objective-in]
    (-> this (.onScoreObjectiveAdded score-objective-in))))

(defn add-player-to-team
  "player - `java.lang.String`
  new-team - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^ServerScoreboard this ^java.lang.String player ^java.lang.String new-team]
    (-> this (.addPlayerToTeam player new-team))))

(defn remove-player-from-team
  "username - `java.lang.String`
  player-team - `net.minecraft.scoreboard.ScorePlayerTeam`"
  ([^ServerScoreboard this ^java.lang.String username ^net.minecraft.scoreboard.ScorePlayerTeam player-team]
    (-> this (.removePlayerFromTeam username player-team))))

(defn set-objective-in-display-slot
  "objective-slot - `int`
  objective - `net.minecraft.scoreboard.ScoreObjective`"
  ([^ServerScoreboard this ^Integer objective-slot ^net.minecraft.scoreboard.ScoreObjective objective]
    (-> this (.setObjectiveInDisplaySlot objective-slot objective))))

(defn get-create-packets
  "objective - `net.minecraft.scoreboard.ScoreObjective`

  returns: `java.util.List<net.minecraft.network.Packet<?>>`"
  (^java.util.List [^ServerScoreboard this ^net.minecraft.scoreboard.ScoreObjective objective]
    (-> this (.getCreatePackets objective))))

