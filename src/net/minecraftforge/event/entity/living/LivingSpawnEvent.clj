(ns net.minecraftforge.event.entity.living.LivingSpawnEvent
  "LivingSpawnEvent is fired for any events associated with Living Enttnies spawn status.
  If a method utilizes this Event as its parameter, the method will
  receive every child event of this class.

  world contains the world in which this living Entity is being spawned.
  x contains the x-coordinate this entity is being spawned at.
  y contains the y-coordinate this entity is being spawned at.
  z contains the z-coordinate this entity is being spawned at.

  All children of this event are fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingSpawnEvent]))

(defn ->living-spawn-event
  "Constructor.

  entity - `net.minecraft.entity.EntityLiving`
  world - `net.minecraft.world.World`
  x - `float`
  y - `float`
  z - `float`"
  (^LivingSpawnEvent [^net.minecraft.entity.EntityLiving entity ^net.minecraft.world.World world ^Float x ^Float y ^Float z]
    (new LivingSpawnEvent entity world x y z)))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^LivingSpawnEvent this]
    (-> this (.getWorld))))

(defn get-x
  "returns: `float`"
  (^Float [^LivingSpawnEvent this]
    (-> this (.getX))))

(defn get-y
  "returns: `float`"
  (^Float [^LivingSpawnEvent this]
    (-> this (.getY))))

(defn get-z
  "returns: `float`"
  (^Float [^LivingSpawnEvent this]
    (-> this (.getZ))))

