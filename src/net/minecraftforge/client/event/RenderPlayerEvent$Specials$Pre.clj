(ns net.minecraftforge.client.event.RenderPlayerEvent$Specials$Pre
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderPlayerEvent$Specials$Pre]))

(defn ->pre
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  renderer - `net.minecraft.client.renderer.entity.RenderPlayer`
  partial-ticks - `float`"
  (^RenderPlayerEvent$Specials$Pre [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.client.renderer.entity.RenderPlayer renderer ^Float partial-ticks]
    (new RenderPlayerEvent$Specials$Pre player renderer partial-ticks)))

(defn should-render-helmet?
  "returns: `boolean`"
  (^Boolean [^RenderPlayerEvent$Specials$Pre this]
    (-> this (.shouldRenderHelmet))))

(defn set-render-helmet
  "render-helmet - `boolean`"
  ([^RenderPlayerEvent$Specials$Pre this ^Boolean render-helmet]
    (-> this (.setRenderHelmet render-helmet))))

(defn should-render-cape?
  "returns: `boolean`"
  (^Boolean [^RenderPlayerEvent$Specials$Pre this]
    (-> this (.shouldRenderCape))))

(defn set-render-cape
  "render-cape - `boolean`"
  ([^RenderPlayerEvent$Specials$Pre this ^Boolean render-cape]
    (-> this (.setRenderCape render-cape))))

(defn should-render-item?
  "returns: `boolean`"
  (^Boolean [^RenderPlayerEvent$Specials$Pre this]
    (-> this (.shouldRenderItem))))

(defn set-render-item
  "render-item - `boolean`"
  ([^RenderPlayerEvent$Specials$Pre this ^Boolean render-item]
    (-> this (.setRenderItem render-item))))

