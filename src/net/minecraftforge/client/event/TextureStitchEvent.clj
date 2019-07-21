(ns net.minecraftforge.client.event.TextureStitchEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event TextureStitchEvent]))

(defn ->texture-stitch-event
  "Constructor.

  map - `net.minecraft.client.renderer.texture.TextureMap`"
  (^TextureStitchEvent [^net.minecraft.client.renderer.texture.TextureMap map]
    (new TextureStitchEvent map)))

(defn get-map
  "returns: `net.minecraft.client.renderer.texture.TextureMap`"
  (^net.minecraft.client.renderer.texture.TextureMap [^TextureStitchEvent this]
    (-> this (.getMap))))

