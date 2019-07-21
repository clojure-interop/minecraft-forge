(ns net.minecraftforge.client.event.RenderPlayerEvent$Pre
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderPlayerEvent$Pre]))

(defn ->pre
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  renderer - `net.minecraft.client.renderer.entity.RenderPlayer`
  tick - `float`
  x - `double`
  y - `double`
  z - `double`"
  (^RenderPlayerEvent$Pre [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.client.renderer.entity.RenderPlayer renderer ^Float tick ^Double x ^Double y ^Double z]
    (new RenderPlayerEvent$Pre player renderer tick x y z))
  (^RenderPlayerEvent$Pre [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.client.renderer.entity.RenderPlayer renderer ^Float tick]
    (new RenderPlayerEvent$Pre player renderer tick)))

