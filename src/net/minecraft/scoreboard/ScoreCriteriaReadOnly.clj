(ns net.minecraft.scoreboard.ScoreCriteriaReadOnly
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.scoreboard ScoreCriteriaReadOnly]))

(defn ->score-criteria-read-only
  "Constructor.

  name - `java.lang.String`"
  (^ScoreCriteriaReadOnly [^java.lang.String name]
    (new ScoreCriteriaReadOnly name)))

(defn read-only?
  "returns: `boolean`"
  (^Boolean [^ScoreCriteriaReadOnly this]
    (-> this (.isReadOnly))))

