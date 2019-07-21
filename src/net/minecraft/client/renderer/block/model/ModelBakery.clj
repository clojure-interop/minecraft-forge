(ns net.minecraft.client.renderer.block.model.ModelBakery
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model ModelBakery]))

(defn ->model-bakery
  "Constructor.

  resource-manager-in - `net.minecraft.client.resources.IResourceManager`
  texture-map-in - `net.minecraft.client.renderer.texture.TextureMap`
  block-model-shapes-in - `net.minecraft.client.renderer.BlockModelShapes`"
  (^ModelBakery [^net.minecraft.client.resources.IResourceManager resource-manager-in ^net.minecraft.client.renderer.texture.TextureMap texture-map-in ^net.minecraft.client.renderer.BlockModelShapes block-model-shapes-in]
    (new ModelBakery resource-manager-in texture-map-in block-model-shapes-in)))

(defn *register-item-variants
  "item - `net.minecraft.item.Item`
  names - `net.minecraft.util.ResourceLocation`"
  ([^net.minecraft.item.Item item ^net.minecraft.util.ResourceLocation names]
    (ModelBakery/registerItemVariants item names)))

(defn setup-model-registry
  "returns: `net.minecraft.util.registry.IRegistry<net.minecraft.client.renderer.block.model.ModelResourceLocation,net.minecraft.client.renderer.block.model.IBakedModel>`"
  (^net.minecraft.util.registry.IRegistry [^ModelBakery this]
    (-> this (.setupModelRegistry))))

