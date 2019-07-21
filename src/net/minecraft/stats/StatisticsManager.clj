(ns net.minecraft.stats.StatisticsManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.stats StatisticsManager]))

(defn ->statistics-manager
  "Constructor."
  (^StatisticsManager []
    (new StatisticsManager )))

(defn has-achievement-unlocked?
  "achievement-in - `net.minecraft.stats.Achievement`

  returns: `boolean`"
  (^Boolean [^StatisticsManager this ^net.minecraft.stats.Achievement achievement-in]
    (-> this (.hasAchievementUnlocked achievement-in))))

(defn can-unlock-achievement?
  "achievement-in - `net.minecraft.stats.Achievement`

  returns: `boolean`"
  (^Boolean [^StatisticsManager this ^net.minecraft.stats.Achievement achievement-in]
    (-> this (.canUnlockAchievement achievement-in))))

(defn increase-stat
  "player - `net.minecraft.entity.player.EntityPlayer`
  stat - `net.minecraft.stats.StatBase`
  amount - `int`"
  ([^StatisticsManager this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.stats.StatBase stat ^Integer amount]
    (-> this (.increaseStat player stat amount))))

(defn count-requirements-until-available
  "achievement-in - `net.minecraft.stats.Achievement`

  returns: `int`"
  (^Integer [^StatisticsManager this ^net.minecraft.stats.Achievement achievement-in]
    (-> this (.countRequirementsUntilAvailable achievement-in))))

(defn unlock-achievement
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  stat-in - `net.minecraft.stats.StatBase`
  p-150873-3 - `int`"
  ([^StatisticsManager this ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.stats.StatBase stat-in ^Integer p-150873-3]
    (-> this (.unlockAchievement player-in stat-in p-150873-3))))

(defn read-stat
  "stat - `net.minecraft.stats.StatBase`

  returns: `int`"
  (^Integer [^StatisticsManager this ^net.minecraft.stats.StatBase stat]
    (-> this (.readStat stat))))

(defn get-progress
  "p-150870-1 - `net.minecraft.stats.StatBase`

  returns: `<T extends net.minecraft.util.IJsonSerializable> T`"
  ([^StatisticsManager this ^net.minecraft.stats.StatBase p-150870-1]
    (-> this (.getProgress p-150870-1))))

(defn set-progress
  "p-150872-1 - `net.minecraft.stats.StatBase`
  p-150872-2 - `T`

  returns: `<T extends net.minecraft.util.IJsonSerializable> T`"
  ([^StatisticsManager this ^net.minecraft.stats.StatBase p-150872-1 p-150872-2]
    (-> this (.setProgress p-150872-1 p-150872-2))))

