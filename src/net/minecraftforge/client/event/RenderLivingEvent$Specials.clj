(ns net.minecraftforge.client.event.RenderLivingEvent$Specials
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderLivingEvent$Specials]))

(defn ->specials
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  renderer - `net.minecraft.client.renderer.entity.RenderLivingBase`
  x - `double`
  y - `double`
  z - `double`"
  (^RenderLivingEvent$Specials [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.client.renderer.entity.RenderLivingBase renderer ^Double x ^Double y ^Double z]
    (new RenderLivingEvent$Specials entity renderer x y z)))

