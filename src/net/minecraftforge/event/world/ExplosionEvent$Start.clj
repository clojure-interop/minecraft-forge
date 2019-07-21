(ns net.minecraftforge.event.world.ExplosionEvent$Start
  "ExplosionEvent.Start is fired before the explosion actually occurs.  Canceling this event will stop the explosion.

  This event is Cancelable.
  This event does not use HasResult.
  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world ExplosionEvent$Start]))

(defn ->start
  "Constructor.

  world - `net.minecraft.world.World`
  explosion - `net.minecraft.world.Explosion`"
  (^ExplosionEvent$Start [^net.minecraft.world.World world ^net.minecraft.world.Explosion explosion]
    (new ExplosionEvent$Start world explosion)))

