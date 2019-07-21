(ns net.minecraftforge.client.event.RenderPlayerEvent$Specials$Post
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderPlayerEvent$Specials$Post]))

(defn ->post
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  renderer - `net.minecraft.client.renderer.entity.RenderPlayer`
  partial-ticks - `float`"
  (^RenderPlayerEvent$Specials$Post [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.client.renderer.entity.RenderPlayer renderer ^Float partial-ticks]
    (new RenderPlayerEvent$Specials$Post player renderer partial-ticks)))

