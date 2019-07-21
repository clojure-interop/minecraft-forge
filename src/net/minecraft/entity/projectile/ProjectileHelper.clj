(ns net.minecraft.entity.projectile.ProjectileHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile ProjectileHelper]))

(defn ->projectile-helper
  "Constructor."
  (^ProjectileHelper []
    (new ProjectileHelper )))

(defn *forwards-raycast
  "p-188802-0 - `net.minecraft.entity.Entity`
  include-entities - `boolean`
  p-188802-2 - `boolean`
  excluded-entity - `net.minecraft.entity.Entity`

  returns: `net.minecraft.util.math.RayTraceResult`"
  (^net.minecraft.util.math.RayTraceResult [^net.minecraft.entity.Entity p-188802-0 ^Boolean include-entities ^Boolean p-188802-2 ^net.minecraft.entity.Entity excluded-entity]
    (ProjectileHelper/forwardsRaycast p-188802-0 include-entities p-188802-2 excluded-entity)))

(defn *rotate-towards-movement
  "p-188803-0 - `net.minecraft.entity.Entity`
  p-188803-1 - `float`"
  ([^net.minecraft.entity.Entity p-188803-0 ^Float p-188803-1]
    (ProjectileHelper/rotateTowardsMovement p-188803-0 p-188803-1)))

