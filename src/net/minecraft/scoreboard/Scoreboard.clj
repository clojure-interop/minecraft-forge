(ns net.minecraft.scoreboard.Scoreboard
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.scoreboard Scoreboard]))

(defn ->scoreboard
  "Constructor."
  (^Scoreboard []
    (new Scoreboard )))

(defn *get-objective-display-slot
  "id - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Integer id]
    (Scoreboard/getObjectiveDisplaySlot id)))

(defn *get-objective-display-slot-number
  "name - `java.lang.String`

  returns: `int`"
  (^Integer [^java.lang.String name]
    (Scoreboard/getObjectiveDisplaySlotNumber name)))

(defn *get-display-slot-strings
  "returns: `java.lang.String[]`"
  ([]
    (Scoreboard/getDisplaySlotStrings )))

(defn remove-objective
  "objective - `net.minecraft.scoreboard.ScoreObjective`"
  ([^Scoreboard this ^net.minecraft.scoreboard.ScoreObjective objective]
    (-> this (.removeObjective objective))))

(defn add-score-objective
  "name - `java.lang.String`
  criteria - `net.minecraft.scoreboard.IScoreCriteria`

  returns: `net.minecraft.scoreboard.ScoreObjective`"
  (^net.minecraft.scoreboard.ScoreObjective [^Scoreboard this ^java.lang.String name ^net.minecraft.scoreboard.IScoreCriteria criteria]
    (-> this (.addScoreObjective name criteria))))

(defn get-objective-names
  "returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^Scoreboard this]
    (-> this (.getObjectiveNames))))

(defn remove-player-from-teams
  "player-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^Scoreboard this ^java.lang.String player-name]
    (-> this (.removePlayerFromTeams player-name))))

(defn get-objective
  "name - `java.lang.String`

  returns: `net.minecraft.scoreboard.ScoreObjective`"
  (^net.minecraft.scoreboard.ScoreObjective [^Scoreboard this ^java.lang.String name]
    (-> this (.getObjective name))))

(defn on-score-objective-removed
  "objective - `net.minecraft.scoreboard.ScoreObjective`"
  ([^Scoreboard this ^net.minecraft.scoreboard.ScoreObjective objective]
    (-> this (.onScoreObjectiveRemoved objective))))

(defn entity-has-objective
  "name - `java.lang.String`
  objective - `net.minecraft.scoreboard.ScoreObjective`

  returns: `boolean`"
  (^Boolean [^Scoreboard this ^java.lang.String name ^net.minecraft.scoreboard.ScoreObjective objective]
    (-> this (.entityHasObjective name objective))))

(defn get-objectives-from-criteria
  "criteria - `net.minecraft.scoreboard.IScoreCriteria`

  returns: `java.util.Collection<net.minecraft.scoreboard.ScoreObjective>`"
  (^java.util.Collection [^Scoreboard this ^net.minecraft.scoreboard.IScoreCriteria criteria]
    (-> this (.getObjectivesFromCriteria criteria))))

(defn broadcast-score-update
  "score-name - `java.lang.String`
  objective - `net.minecraft.scoreboard.ScoreObjective`"
  ([^Scoreboard this ^java.lang.String score-name ^net.minecraft.scoreboard.ScoreObjective objective]
    (-> this (.broadcastScoreUpdate score-name objective)))
  ([^Scoreboard this ^java.lang.String score-name]
    (-> this (.broadcastScoreUpdate score-name))))

(defn get-sorted-scores
  "objective - `net.minecraft.scoreboard.ScoreObjective`

  returns: `java.util.Collection<net.minecraft.scoreboard.Score>`"
  (^java.util.Collection [^Scoreboard this ^net.minecraft.scoreboard.ScoreObjective objective]
    (-> this (.getSortedScores objective))))

(defn get-team-names
  "returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^Scoreboard this]
    (-> this (.getTeamNames))))

(defn on-score-updated
  "score-in - `net.minecraft.scoreboard.Score`"
  ([^Scoreboard this ^net.minecraft.scoreboard.Score score-in]
    (-> this (.onScoreUpdated score-in))))

(defn remove-team
  "player-team - `net.minecraft.scoreboard.ScorePlayerTeam`"
  ([^Scoreboard this ^net.minecraft.scoreboard.ScorePlayerTeam player-team]
    (-> this (.removeTeam player-team))))

(defn get-objectives-for-entity
  "name - `java.lang.String`

  returns: `java.util.Map<net.minecraft.scoreboard.ScoreObjective,net.minecraft.scoreboard.Score>`"
  (^java.util.Map [^Scoreboard this ^java.lang.String name]
    (-> this (.getObjectivesForEntity name))))

(defn get-objective-in-display-slot
  "slot-in - `int`

  returns: `net.minecraft.scoreboard.ScoreObjective`"
  (^net.minecraft.scoreboard.ScoreObjective [^Scoreboard this ^Integer slot-in]
    (-> this (.getObjectiveInDisplaySlot slot-in))))

(defn get-score-objectives
  "returns: `java.util.Collection<net.minecraft.scoreboard.ScoreObjective>`"
  (^java.util.Collection [^Scoreboard this]
    (-> this (.getScoreObjectives))))

(defn broadcast-team-created
  "player-team - `net.minecraft.scoreboard.ScorePlayerTeam`"
  ([^Scoreboard this ^net.minecraft.scoreboard.ScorePlayerTeam player-team]
    (-> this (.broadcastTeamCreated player-team))))

(defn remove-objective-from-entity
  "name - `java.lang.String`
  objective - `net.minecraft.scoreboard.ScoreObjective`"
  ([^Scoreboard this ^java.lang.String name ^net.minecraft.scoreboard.ScoreObjective objective]
    (-> this (.removeObjectiveFromEntity name objective))))

(defn create-team
  "name - `java.lang.String`

  returns: `net.minecraft.scoreboard.ScorePlayerTeam`"
  (^net.minecraft.scoreboard.ScorePlayerTeam [^Scoreboard this ^java.lang.String name]
    (-> this (.createTeam name))))

(defn broadcast-team-remove
  "player-team - `net.minecraft.scoreboard.ScorePlayerTeam`"
  ([^Scoreboard this ^net.minecraft.scoreboard.ScorePlayerTeam player-team]
    (-> this (.broadcastTeamRemove player-team))))

(defn broadcast-team-info-update
  "player-team - `net.minecraft.scoreboard.ScorePlayerTeam`"
  ([^Scoreboard this ^net.minecraft.scoreboard.ScorePlayerTeam player-team]
    (-> this (.broadcastTeamInfoUpdate player-team))))

(defn on-objective-display-name-changed
  "objective - `net.minecraft.scoreboard.ScoreObjective`"
  ([^Scoreboard this ^net.minecraft.scoreboard.ScoreObjective objective]
    (-> this (.onObjectiveDisplayNameChanged objective))))

(defn on-score-objective-added
  "score-objective-in - `net.minecraft.scoreboard.ScoreObjective`"
  ([^Scoreboard this ^net.minecraft.scoreboard.ScoreObjective score-objective-in]
    (-> this (.onScoreObjectiveAdded score-objective-in))))

(defn get-players-team
  "username - `java.lang.String`

  returns: `net.minecraft.scoreboard.ScorePlayerTeam`"
  (^net.minecraft.scoreboard.ScorePlayerTeam [^Scoreboard this ^java.lang.String username]
    (-> this (.getPlayersTeam username))))

(defn get-teams
  "returns: `java.util.Collection<net.minecraft.scoreboard.ScorePlayerTeam>`"
  (^java.util.Collection [^Scoreboard this]
    (-> this (.getTeams))))

(defn get-or-create-score
  "username - `java.lang.String`
  objective - `net.minecraft.scoreboard.ScoreObjective`

  returns: `net.minecraft.scoreboard.Score`"
  (^net.minecraft.scoreboard.Score [^Scoreboard this ^java.lang.String username ^net.minecraft.scoreboard.ScoreObjective objective]
    (-> this (.getOrCreateScore username objective))))

(defn get-team
  "team-name - `java.lang.String`

  returns: `net.minecraft.scoreboard.ScorePlayerTeam`"
  (^net.minecraft.scoreboard.ScorePlayerTeam [^Scoreboard this ^java.lang.String team-name]
    (-> this (.getTeam team-name))))

(defn remove-entity
  "entity-in - `net.minecraft.entity.Entity`"
  ([^Scoreboard this ^net.minecraft.entity.Entity entity-in]
    (-> this (.removeEntity entity-in))))

(defn add-player-to-team
  "player - `java.lang.String`
  new-team - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^Scoreboard this ^java.lang.String player ^java.lang.String new-team]
    (-> this (.addPlayerToTeam player new-team))))

(defn remove-player-from-team
  "username - `java.lang.String`
  player-team - `net.minecraft.scoreboard.ScorePlayerTeam`"
  ([^Scoreboard this ^java.lang.String username ^net.minecraft.scoreboard.ScorePlayerTeam player-team]
    (-> this (.removePlayerFromTeam username player-team))))

(defn set-objective-in-display-slot
  "objective-slot - `int`
  objective - `net.minecraft.scoreboard.ScoreObjective`"
  ([^Scoreboard this ^Integer objective-slot ^net.minecraft.scoreboard.ScoreObjective objective]
    (-> this (.setObjectiveInDisplaySlot objective-slot objective))))

(defn get-scores
  "returns: `java.util.Collection<net.minecraft.scoreboard.Score>`"
  (^java.util.Collection [^Scoreboard this]
    (-> this (.getScores))))

