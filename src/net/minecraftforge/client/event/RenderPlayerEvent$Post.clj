(ns net.minecraftforge.client.event.RenderPlayerEvent$Post
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderPlayerEvent$Post]))

(defn ->post
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  renderer - `net.minecraft.client.renderer.entity.RenderPlayer`
  tick - `float`
  x - `double`
  y - `double`
  z - `double`"
  (^RenderPlayerEvent$Post [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.client.renderer.entity.RenderPlayer renderer ^Float tick ^Double x ^Double y ^Double z]
    (new RenderPlayerEvent$Post player renderer tick x y z))
  (^RenderPlayerEvent$Post [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.client.renderer.entity.RenderPlayer renderer ^Float tick]
    (new RenderPlayerEvent$Post player renderer tick)))

