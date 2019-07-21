(ns net.minecraft.scoreboard.ScoreCriteria
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.scoreboard ScoreCriteria]))

(defn ->score-criteria
  "Constructor.

  name - `java.lang.String`"
  (^ScoreCriteria [^java.lang.String name]
    (new ScoreCriteria name)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ScoreCriteria this]
    (-> this (.getName))))

(defn read-only?
  "returns: `boolean`"
  (^Boolean [^ScoreCriteria this]
    (-> this (.isReadOnly))))

(defn get-render-type
  "returns: `net.minecraft.scoreboard.IScoreCriteria$EnumRenderType`"
  (^net.minecraft.scoreboard.IScoreCriteria$EnumRenderType [^ScoreCriteria this]
    (-> this (.getRenderType))))

