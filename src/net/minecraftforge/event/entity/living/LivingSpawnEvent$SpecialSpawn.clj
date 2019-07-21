(ns net.minecraftforge.event.entity.living.LivingSpawnEvent$SpecialSpawn
  "SpecialSpawn is fired when an Entity is to be spawned.
  This allows you to do special inializers in the new entity.

  This event is fired via the ForgeEventFactory.doSpecialSpawn(EntityLiving, World, float, float, float).

  This event is Cancelable.
  If this event is canceled, the Entity is not spawned.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingSpawnEvent$SpecialSpawn]))

(defn ->special-spawn
  "Constructor.

  entity - `net.minecraft.entity.EntityLiving`
  world - `net.minecraft.world.World`
  x - `float`
  y - `float`
  z - `float`"
  (^LivingSpawnEvent$SpecialSpawn [^net.minecraft.entity.EntityLiving entity ^net.minecraft.world.World world ^Float x ^Float y ^Float z]
    (new LivingSpawnEvent$SpecialSpawn entity world x y z)))

