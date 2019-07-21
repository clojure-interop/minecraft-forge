(ns net.minecraftforge.client.event.TextureStitchEvent$Pre
  "Fired when the TextureMap is told to refresh it's stitched texture.
  Called after the Stitched list is cleared, but before any blocks or items
  add themselves to the list."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event TextureStitchEvent$Pre]))

(defn ->pre
  "Constructor.

  map - `net.minecraft.client.renderer.texture.TextureMap`"
  (^TextureStitchEvent$Pre [^net.minecraft.client.renderer.texture.TextureMap map]
    (new TextureStitchEvent$Pre map)))

