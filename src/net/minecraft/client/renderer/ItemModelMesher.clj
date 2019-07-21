(ns net.minecraft.client.renderer.ItemModelMesher
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer ItemModelMesher]))

(defn ->item-model-mesher
  "Constructor.

  model-manager - `net.minecraft.client.renderer.block.model.ModelManager`"
  (^ItemModelMesher [^net.minecraft.client.renderer.block.model.ModelManager model-manager]
    (new ItemModelMesher model-manager)))

(defn get-particle-icon
  "item - `net.minecraft.item.Item`
  meta - `int`

  returns: `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  (^net.minecraft.client.renderer.texture.TextureAtlasSprite [^ItemModelMesher this ^net.minecraft.item.Item item ^Integer meta]
    (-> this (.getParticleIcon item meta)))
  (^net.minecraft.client.renderer.texture.TextureAtlasSprite [^ItemModelMesher this ^net.minecraft.item.Item item]
    (-> this (.getParticleIcon item))))

(defn get-item-model
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^ItemModelMesher this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemModel stack))))

(defn register
  "item - `net.minecraft.item.Item`
  meta - `int`
  location - `net.minecraft.client.renderer.block.model.ModelResourceLocation`"
  ([^ItemModelMesher this ^net.minecraft.item.Item item ^Integer meta ^net.minecraft.client.renderer.block.model.ModelResourceLocation location]
    (-> this (.register item meta location)))
  ([^ItemModelMesher this ^net.minecraft.item.Item item ^net.minecraft.client.renderer.ItemMeshDefinition definition]
    (-> this (.register item definition))))

(defn get-model-manager
  "returns: `net.minecraft.client.renderer.block.model.ModelManager`"
  (^net.minecraft.client.renderer.block.model.ModelManager [^ItemModelMesher this]
    (-> this (.getModelManager))))

(defn rebuild-cache
  ""
  ([^ItemModelMesher this]
    (-> this (.rebuildCache))))

