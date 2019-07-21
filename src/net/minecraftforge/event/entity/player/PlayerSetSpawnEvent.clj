(ns net.minecraftforge.event.entity.player.PlayerSetSpawnEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerSetSpawnEvent]))

(defn ->player-set-spawn-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  new-spawn - `net.minecraft.util.math.BlockPos`
  forced - `boolean`"
  (^PlayerSetSpawnEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.BlockPos new-spawn ^Boolean forced]
    (new PlayerSetSpawnEvent player new-spawn forced)))

(defn forced?
  "This event is called before a player's spawn point is changed.
   The event can be canceled, and no further processing will be done.

  returns: `boolean`"
  (^Boolean [^PlayerSetSpawnEvent this]
    (-> this (.isForced))))

(defn get-new-spawn
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^PlayerSetSpawnEvent this]
    (-> this (.getNewSpawn))))

