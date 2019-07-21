(ns net.minecraftforge.client.model.pipeline.VertexLighterSmoothAo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.pipeline VertexLighterSmoothAo]))

(defn ->vertex-lighter-smooth-ao
  "Constructor.

  colors - `net.minecraft.client.renderer.color.BlockColors`"
  (^VertexLighterSmoothAo [^net.minecraft.client.renderer.color.BlockColors colors]
    (new VertexLighterSmoothAo colors)))

(defn update-block-info
  ""
  ([^VertexLighterSmoothAo this]
    (-> this (.updateBlockInfo))))

