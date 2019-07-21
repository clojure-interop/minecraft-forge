(ns net.minecraftforge.event.entity.living.LivingSpawnEvent$AllowDespawn
  "Fired each tick for despawnable mobs to allow control over despawning.
  Result#DEFAULT will pass the mob on to vanilla despawn mechanics.
  Result#ALLOW will force the mob to despawn.
  Result#DENY will force the mob to remain.
  This is fired every tick for every despawnable entity. Be efficient in your handlers.

  Note: this is not fired if the mob is definitely going to otherwise despawn. It is fired to check if
  the mob can be allowed to despawn. See EntityLiving.despawnEntity()"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingSpawnEvent$AllowDespawn]))

(defn ->allow-despawn
  "Constructor.

  entity - `net.minecraft.entity.EntityLiving`"
  (^LivingSpawnEvent$AllowDespawn [^net.minecraft.entity.EntityLiving entity]
    (new LivingSpawnEvent$AllowDespawn entity)))

