(ns net.minecraftforge.event.entity.living.ZombieEvent
  "ZombieEvent is fired whenever a zombie is spawned for aid.
  If a method utilizes this Event as its parameter, the method will
  receive every child event of this class.

  All children of this event are fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living ZombieEvent]))

(defn ->zombie-event
  "Constructor.

  entity - `net.minecraft.entity.monster.EntityZombie`"
  (^ZombieEvent [^net.minecraft.entity.monster.EntityZombie entity]
    (new ZombieEvent entity)))

(defn get-summoner
  "returns: `net.minecraft.entity.monster.EntityZombie`"
  (^net.minecraft.entity.monster.EntityZombie [^ZombieEvent this]
    (-> this (.getSummoner))))

