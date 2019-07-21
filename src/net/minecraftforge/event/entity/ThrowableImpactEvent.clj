(ns net.minecraftforge.event.entity.ThrowableImpactEvent
  "This event is fired before an EntityThrowable calls its EntityThrowable.onImpact(net.minecraft.util.math.RayTraceResult) method.
  This event is fired via ForgeHooks.onThrowableImpact(net.minecraft.entity.projectile.EntityThrowable, net.minecraft.util.math.RayTraceResult).
  This event is cancelable. When canceled, EntityThrowable.onImpact(net.minecraft.util.math.RayTraceResult) will not be called.
  Killing or other handling of the entity after event cancellation is up to the modder.
  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity ThrowableImpactEvent]))

(defn ->throwable-impact-event
  "Constructor.

  throwable - `net.minecraft.entity.projectile.EntityThrowable`
  ray - `net.minecraft.util.math.RayTraceResult`"
  (^ThrowableImpactEvent [^net.minecraft.entity.projectile.EntityThrowable throwable ^net.minecraft.util.math.RayTraceResult ray]
    (new ThrowableImpactEvent throwable ray)))

(defn get-entity-throwable
  "returns: `net.minecraft.entity.projectile.EntityThrowable`"
  (^net.minecraft.entity.projectile.EntityThrowable [^ThrowableImpactEvent this]
    (-> this (.getEntityThrowable))))

(defn get-ray-trace-result
  "returns: `net.minecraft.util.math.RayTraceResult`"
  (^net.minecraft.util.math.RayTraceResult [^ThrowableImpactEvent this]
    (-> this (.getRayTraceResult))))

