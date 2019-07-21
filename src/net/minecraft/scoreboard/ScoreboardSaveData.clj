(ns net.minecraft.scoreboard.ScoreboardSaveData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.scoreboard ScoreboardSaveData]))

(defn ->scoreboard-save-data
  "Constructor.

  name - `java.lang.String`"
  (^ScoreboardSaveData [^java.lang.String name]
    (new ScoreboardSaveData name))
  (^ScoreboardSaveData []
    (new ScoreboardSaveData )))

(defn set-scoreboard
  "scoreboard-in - `net.minecraft.scoreboard.Scoreboard`"
  ([^ScoreboardSaveData this ^net.minecraft.scoreboard.Scoreboard scoreboard-in]
    (-> this (.setScoreboard scoreboard-in))))

(defn read-from-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^ScoreboardSaveData this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.readFromNBT nbt))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ScoreboardSaveData this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

