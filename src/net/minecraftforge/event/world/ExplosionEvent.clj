(ns net.minecraftforge.event.world.ExplosionEvent
  "ExplosionEvent triggers when an explosion happens in the world.

  ExplosionEvent.Start is fired before the explosion actually occurs.
  ExplosionEvent.Detonate is fired once the explosion has a list of affected blocks and entities.

  ExplosionEvent.Start is Cancelable.
  ExplosionEvent.Detonate can modify the affected blocks and entities.
  Children do not use HasResult.
  Children of this event are fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world ExplosionEvent]))

(defn ->explosion-event
  "Constructor.

  world - `net.minecraft.world.World`
  explosion - `net.minecraft.world.Explosion`"
  (^ExplosionEvent [^net.minecraft.world.World world ^net.minecraft.world.Explosion explosion]
    (new ExplosionEvent world explosion)))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^ExplosionEvent this]
    (-> this (.getWorld))))

(defn get-explosion
  "returns: `net.minecraft.world.Explosion`"
  (^net.minecraft.world.Explosion [^ExplosionEvent this]
    (-> this (.getExplosion))))

