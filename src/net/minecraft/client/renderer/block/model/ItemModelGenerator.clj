(ns net.minecraft.client.renderer.block.model.ItemModelGenerator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model ItemModelGenerator]))

(defn ->item-model-generator
  "Constructor."
  (^ItemModelGenerator []
    (new ItemModelGenerator )))

(def *-layers
  "Static Constant.

  type: java.util.List<java.lang.String>"
  ItemModelGenerator/LAYERS)

(defn make-item-model
  "texture-map-in - `net.minecraft.client.renderer.texture.TextureMap`
  block-model - `net.minecraft.client.renderer.block.model.ModelBlock`

  returns: `net.minecraft.client.renderer.block.model.ModelBlock`"
  (^net.minecraft.client.renderer.block.model.ModelBlock [^ItemModelGenerator this ^net.minecraft.client.renderer.texture.TextureMap texture-map-in ^net.minecraft.client.renderer.block.model.ModelBlock block-model]
    (-> this (.makeItemModel texture-map-in block-model))))

