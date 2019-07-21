(ns net.minecraftforge.event.world.WorldEvent
  "WorldEvent is fired when an event involving the world occurs.
  If a method utilizes this Event as its parameter, the method will
  receive every child event of this class.

  world contains the World this event is occurring in.

  All children of this event are fired on the MinecraftForge#EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world WorldEvent]))

(defn ->world-event
  "Constructor.

  world - `net.minecraft.world.World`"
  (^WorldEvent [^net.minecraft.world.World world]
    (new WorldEvent world)))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^WorldEvent this]
    (-> this (.getWorld))))

