(ns net.minecraft.world.storage.IPlayerFileData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage IPlayerFileData]))

(defn write-player-data
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^IPlayerFileData this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.writePlayerData player))))

(defn read-player-data
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^IPlayerFileData this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.readPlayerData player))))

(defn get-available-player-dat
  "returns: `java.lang.String[]`"
  ([^IPlayerFileData this]
    (-> this (.getAvailablePlayerDat))))

