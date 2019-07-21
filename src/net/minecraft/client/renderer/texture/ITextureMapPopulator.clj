(ns net.minecraft.client.renderer.texture.ITextureMapPopulator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.texture ITextureMapPopulator]))

(defn register-sprites
  "texture-map-in - `net.minecraft.client.renderer.texture.TextureMap`"
  ([^ITextureMapPopulator this ^net.minecraft.client.renderer.texture.TextureMap texture-map-in]
    (-> this (.registerSprites texture-map-in))))

