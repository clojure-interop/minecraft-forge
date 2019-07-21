(ns net.minecraft.scoreboard.Score
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.scoreboard Score]))

(defn ->score
  "Constructor.

  the-scoreboard-in - `net.minecraft.scoreboard.Scoreboard`
  the-score-objective-in - `net.minecraft.scoreboard.ScoreObjective`
  score-player-name-in - `java.lang.String`"
  (^Score [^net.minecraft.scoreboard.Scoreboard the-scoreboard-in ^net.minecraft.scoreboard.ScoreObjective the-score-objective-in ^java.lang.String score-player-name-in]
    (new Score the-scoreboard-in the-score-objective-in score-player-name-in)))

(def *-score-comparator
  "Static Constant.

  type: java.util.Comparator<net.minecraft.scoreboard.Score>"
  Score/SCORE_COMPARATOR)

(defn locked?
  "returns: `boolean`"
  (^Boolean [^Score this]
    (-> this (.isLocked))))

(defn get-objective
  "returns: `net.minecraft.scoreboard.ScoreObjective`"
  (^net.minecraft.scoreboard.ScoreObjective [^Score this]
    (-> this (.getObjective))))

(defn set-locked
  "locked - `boolean`"
  ([^Score this ^Boolean locked]
    (-> this (.setLocked locked))))

(defn get-player-name
  "returns: `java.lang.String`"
  (^java.lang.String [^Score this]
    (-> this (.getPlayerName))))

(defn get-score-scoreboard
  "returns: `net.minecraft.scoreboard.Scoreboard`"
  (^net.minecraft.scoreboard.Scoreboard [^Score this]
    (-> this (.getScoreScoreboard))))

(defn increase-score
  "amount - `int`"
  ([^Score this ^Integer amount]
    (-> this (.increaseScore amount))))

(defn set-score-points
  "points - `int`"
  ([^Score this ^Integer points]
    (-> this (.setScorePoints points))))

(defn get-score-points
  "returns: `int`"
  (^Integer [^Score this]
    (-> this (.getScorePoints))))

(defn increment-score
  ""
  ([^Score this]
    (-> this (.incrementScore))))

(defn decrease-score
  "amount - `int`"
  ([^Score this ^Integer amount]
    (-> this (.decreaseScore amount))))

