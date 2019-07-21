(ns net.minecraftforge.client.event.RenderLivingEvent$Specials$Pre
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderLivingEvent$Specials$Pre]))

(defn ->pre
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  renderer - `net.minecraft.client.renderer.entity.RenderLivingBase`
  x - `double`
  y - `double`
  z - `double`"
  (^RenderLivingEvent$Specials$Pre [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.client.renderer.entity.RenderLivingBase renderer ^Double x ^Double y ^Double z]
    (new RenderLivingEvent$Specials$Pre entity renderer x y z)))

