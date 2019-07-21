(ns net.minecraft.scoreboard.ScoreCriteriaHealth
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.scoreboard ScoreCriteriaHealth]))

(defn ->score-criteria-health
  "Constructor.

  name - `java.lang.String`"
  (^ScoreCriteriaHealth [^java.lang.String name]
    (new ScoreCriteriaHealth name)))

(defn read-only?
  "returns: `boolean`"
  (^Boolean [^ScoreCriteriaHealth this]
    (-> this (.isReadOnly))))

(defn get-render-type
  "returns: `net.minecraft.scoreboard.IScoreCriteria$EnumRenderType`"
  (^net.minecraft.scoreboard.IScoreCriteria$EnumRenderType [^ScoreCriteriaHealth this]
    (-> this (.getRenderType))))

