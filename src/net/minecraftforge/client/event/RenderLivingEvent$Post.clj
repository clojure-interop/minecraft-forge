(ns net.minecraftforge.client.event.RenderLivingEvent$Post
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderLivingEvent$Post]))

(defn ->post
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  renderer - `net.minecraft.client.renderer.entity.RenderLivingBase`
  x - `double`
  y - `double`
  z - `double`"
  (^RenderLivingEvent$Post [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.client.renderer.entity.RenderLivingBase renderer ^Double x ^Double y ^Double z]
    (new RenderLivingEvent$Post entity renderer x y z)))

