(ns net.minecraft.scoreboard.ScoreObjective
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.scoreboard ScoreObjective]))

(defn ->score-objective
  "Constructor.

  the-scoreboard-in - `net.minecraft.scoreboard.Scoreboard`
  name-in - `java.lang.String`
  objective-criteria-in - `net.minecraft.scoreboard.IScoreCriteria`"
  (^ScoreObjective [^net.minecraft.scoreboard.Scoreboard the-scoreboard-in ^java.lang.String name-in ^net.minecraft.scoreboard.IScoreCriteria objective-criteria-in]
    (new ScoreObjective the-scoreboard-in name-in objective-criteria-in)))

(defn get-scoreboard
  "returns: `net.minecraft.scoreboard.Scoreboard`"
  (^net.minecraft.scoreboard.Scoreboard [^ScoreObjective this]
    (-> this (.getScoreboard))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ScoreObjective this]
    (-> this (.getName))))

(defn get-criteria
  "returns: `net.minecraft.scoreboard.IScoreCriteria`"
  (^net.minecraft.scoreboard.IScoreCriteria [^ScoreObjective this]
    (-> this (.getCriteria))))

(defn get-display-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ScoreObjective this]
    (-> this (.getDisplayName))))

(defn set-display-name
  "name-in - `java.lang.String`"
  ([^ScoreObjective this ^java.lang.String name-in]
    (-> this (.setDisplayName name-in))))

(defn get-render-type
  "returns: `net.minecraft.scoreboard.IScoreCriteria$EnumRenderType`"
  (^net.minecraft.scoreboard.IScoreCriteria$EnumRenderType [^ScoreObjective this]
    (-> this (.getRenderType))))

(defn set-render-type
  "type - `net.minecraft.scoreboard.IScoreCriteria$EnumRenderType`"
  ([^ScoreObjective this ^net.minecraft.scoreboard.IScoreCriteria$EnumRenderType type]
    (-> this (.setRenderType type))))

