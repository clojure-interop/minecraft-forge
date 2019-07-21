(ns net.minecraft.stats.StatisticsManagerServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.stats StatisticsManagerServer]))

(defn ->statistics-manager-server
  "Constructor.

  server-in - `net.minecraft.server.MinecraftServer`
  stats-file-in - `java.io.File`"
  (^StatisticsManagerServer [^net.minecraft.server.MinecraftServer server-in ^java.io.File stats-file-in]
    (new StatisticsManagerServer server-in stats-file-in)))

(defn *dump-json
  "p-150880-0 - `java.util.Map`

  returns: `java.lang.String`"
  (^java.lang.String [^java.util.Map p-150880-0]
    (StatisticsManagerServer/dumpJson p-150880-0)))

(defn parse-json
  "p-150881-1 - `java.lang.String`

  returns: `java.util.Map<net.minecraft.stats.StatBase,net.minecraft.util.TupleIntJsonSerializable>`"
  (^java.util.Map [^StatisticsManagerServer this ^java.lang.String p-150881-1]
    (-> this (.parseJson p-150881-1))))

(defn has-unsent-achievement?
  "returns: `boolean`"
  (^Boolean [^StatisticsManagerServer this]
    (-> this (.hasUnsentAchievement))))

(defn send-stats
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^StatisticsManagerServer this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.sendStats player))))

(defn read-stat-file
  ""
  ([^StatisticsManagerServer this]
    (-> this (.readStatFile))))

(defn send-achievements
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^StatisticsManagerServer this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.sendAchievements player))))

(defn save-stat-file
  ""
  ([^StatisticsManagerServer this]
    (-> this (.saveStatFile))))

(defn get-dirty
  "returns: `java.util.Set<net.minecraft.stats.StatBase>`"
  (^java.util.Set [^StatisticsManagerServer this]
    (-> this (.getDirty))))

(defn mark-all-dirty
  ""
  ([^StatisticsManagerServer this]
    (-> this (.markAllDirty))))

(defn unlock-achievement
  "player-in - `net.minecraft.entity.player.EntityPlayer`
  stat-in - `net.minecraft.stats.StatBase`
  p-150873-3 - `int`"
  ([^StatisticsManagerServer this ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.stats.StatBase stat-in ^Integer p-150873-3]
    (-> this (.unlockAchievement player-in stat-in p-150873-3))))

