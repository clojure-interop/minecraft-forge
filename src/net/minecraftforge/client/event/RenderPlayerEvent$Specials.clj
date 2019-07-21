(ns net.minecraftforge.client.event.RenderPlayerEvent$Specials
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderPlayerEvent$Specials]))

(defn ->specials
  "Constructor.

  Deprecated.

  player - `net.minecraft.entity.player.EntityPlayer`
  renderer - `net.minecraft.client.renderer.entity.RenderPlayer`
  partial-ticks - `float`"
  (^RenderPlayerEvent$Specials [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.client.renderer.entity.RenderPlayer renderer ^Float partial-ticks]
    (new RenderPlayerEvent$Specials player renderer partial-ticks)))

