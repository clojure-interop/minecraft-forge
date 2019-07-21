(ns net.minecraft.scoreboard.IScoreCriteria
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.scoreboard IScoreCriteria]))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^IScoreCriteria this]
    (-> this (.getName))))

(defn read-only?
  "returns: `boolean`"
  (^Boolean [^IScoreCriteria this]
    (-> this (.isReadOnly))))

(defn get-render-type
  "returns: `net.minecraft.scoreboard.IScoreCriteria$EnumRenderType`"
  (^net.minecraft.scoreboard.IScoreCriteria$EnumRenderType [^IScoreCriteria this]
    (-> this (.getRenderType))))

