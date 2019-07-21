(ns net.minecraft.scoreboard.ScoreCriteriaColored
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.scoreboard ScoreCriteriaColored]))

(defn ->score-criteria-colored
  "Constructor.

  name - `java.lang.String`
  format - `net.minecraft.util.text.TextFormatting`"
  (^ScoreCriteriaColored [^java.lang.String name ^net.minecraft.util.text.TextFormatting format]
    (new ScoreCriteriaColored name format)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ScoreCriteriaColored this]
    (-> this (.getName))))

(defn read-only?
  "returns: `boolean`"
  (^Boolean [^ScoreCriteriaColored this]
    (-> this (.isReadOnly))))

(defn get-render-type
  "returns: `net.minecraft.scoreboard.IScoreCriteria$EnumRenderType`"
  (^net.minecraft.scoreboard.IScoreCriteria$EnumRenderType [^ScoreCriteriaColored this]
    (-> this (.getRenderType))))

