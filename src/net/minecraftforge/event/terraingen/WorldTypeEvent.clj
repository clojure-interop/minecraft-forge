(ns net.minecraftforge.event.terraingen.WorldTypeEvent
  "WorldTypeEvent is fired when an event involving the world occurs.
  If a method utilizes this Event as its parameter, the method will
  receive every child event of this class.

  worldType contains the WorldType of the world this event is occurring in.

  All children of this event are fired on the MinecraftForge.TERRAIN_GEN_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen WorldTypeEvent]))

(defn ->world-type-event
  "Constructor.

  world-type - `net.minecraft.world.WorldType`"
  (^WorldTypeEvent [^net.minecraft.world.WorldType world-type]
    (new WorldTypeEvent world-type)))

(defn get-world-type
  "returns: `net.minecraft.world.WorldType`"
  (^net.minecraft.world.WorldType [^WorldTypeEvent this]
    (-> this (.getWorldType))))

