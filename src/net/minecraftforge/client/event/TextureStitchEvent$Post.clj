(ns net.minecraftforge.client.event.TextureStitchEvent$Post
  "This event is fired once the texture map has loaded all textures and
  stitched them together. All Icons should have there locations defined
  by the time this is fired."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event TextureStitchEvent$Post]))

(defn ->post
  "Constructor.

  map - `net.minecraft.client.renderer.texture.TextureMap`"
  (^TextureStitchEvent$Post [^net.minecraft.client.renderer.texture.TextureMap map]
    (new TextureStitchEvent$Post map)))

