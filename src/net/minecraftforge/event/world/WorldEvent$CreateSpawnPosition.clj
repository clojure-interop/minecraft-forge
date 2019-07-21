(ns net.minecraftforge.event.world.WorldEvent$CreateSpawnPosition
  "Called by WorldServer when it attempts to create a spawnpoint for a dimension.
  Canceling the event will prevent the vanilla code from running."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world WorldEvent$CreateSpawnPosition]))

(defn ->create-spawn-position
  "Constructor.

  world - `net.minecraft.world.World`
  settings - `net.minecraft.world.WorldSettings`"
  (^WorldEvent$CreateSpawnPosition [^net.minecraft.world.World world ^net.minecraft.world.WorldSettings settings]
    (new WorldEvent$CreateSpawnPosition world settings)))

(defn get-settings
  "returns: `net.minecraft.world.WorldSettings`"
  (^net.minecraft.world.WorldSettings [^WorldEvent$CreateSpawnPosition this]
    (-> this (.getSettings))))

