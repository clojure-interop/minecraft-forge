(ns net.minecraft.command.CommandResultStats
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command CommandResultStats]))

(defn ->command-result-stats
  "Constructor."
  (^CommandResultStats []
    (new CommandResultStats )))

(defn *set-score-board-stat
  "stats - `net.minecraft.command.CommandResultStats`
  result-type - `net.minecraft.command.CommandResultStats$Type`
  entity-id - `java.lang.String`
  objective-name - `java.lang.String`"
  ([^net.minecraft.command.CommandResultStats stats ^net.minecraft.command.CommandResultStats$Type result-type ^java.lang.String entity-id ^java.lang.String objective-name]
    (CommandResultStats/setScoreBoardStat stats result-type entity-id objective-name)))

(defn set-command-stat-for-sender
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  type-in - `net.minecraft.command.CommandResultStats$Type`
  p-184932-4 - `int`"
  ([^CommandResultStats this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender ^net.minecraft.command.CommandResultStats$Type type-in ^Integer p-184932-4]
    (-> this (.setCommandStatForSender server sender type-in p-184932-4))))

(defn read-stats-from-nbt
  "tagcompound - `net.minecraft.nbt.NBTTagCompound`"
  ([^CommandResultStats this ^net.minecraft.nbt.NBTTagCompound tagcompound]
    (-> this (.readStatsFromNBT tagcompound))))

(defn write-stats-to-nbt
  "tagcompound - `net.minecraft.nbt.NBTTagCompound`"
  ([^CommandResultStats this ^net.minecraft.nbt.NBTTagCompound tagcompound]
    (-> this (.writeStatsToNBT tagcompound))))

(defn add-all-stats
  "result-stats-in - `net.minecraft.command.CommandResultStats`"
  ([^CommandResultStats this ^net.minecraft.command.CommandResultStats result-stats-in]
    (-> this (.addAllStats result-stats-in))))

