(ns net.minecraft.client.renderer.block.model.BakedQuadRetextured
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model BakedQuadRetextured]))

(defn ->baked-quad-retextured
  "Constructor.

  quad - `net.minecraft.client.renderer.block.model.BakedQuad`
  texture-in - `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  (^BakedQuadRetextured [^net.minecraft.client.renderer.block.model.BakedQuad quad ^net.minecraft.client.renderer.texture.TextureAtlasSprite texture-in]
    (new BakedQuadRetextured quad texture-in)))

