(ns net.minecraftforge.event.entity.living.LivingSpawnEvent$CheckSpawn
  "Fires before mob spawn events.

  Result is significant:
     DEFAULT: use vanilla spawn rules
     ALLOW:   allow the spawn
     DENY:    deny the spawn"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingSpawnEvent$CheckSpawn]))

(defn ->check-spawn
  "Constructor.

  entity - `net.minecraft.entity.EntityLiving`
  world - `net.minecraft.world.World`
  x - `float`
  y - `float`
  z - `float`"
  (^LivingSpawnEvent$CheckSpawn [^net.minecraft.entity.EntityLiving entity ^net.minecraft.world.World world ^Float x ^Float y ^Float z]
    (new LivingSpawnEvent$CheckSpawn entity world x y z)))

