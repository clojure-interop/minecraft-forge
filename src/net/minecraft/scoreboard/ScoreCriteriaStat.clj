(ns net.minecraft.scoreboard.ScoreCriteriaStat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.scoreboard ScoreCriteriaStat]))

(defn ->score-criteria-stat
  "Constructor.

  stat-in - `net.minecraft.stats.StatBase`"
  (^ScoreCriteriaStat [^net.minecraft.stats.StatBase stat-in]
    (new ScoreCriteriaStat stat-in)))

