(ns net.minecraft.client.renderer.BlockRendererDispatcher
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer BlockRendererDispatcher]))

(defn ->block-renderer-dispatcher
  "Constructor.

  p-i-46577-1 - `net.minecraft.client.renderer.BlockModelShapes`
  p-i-46577-2 - `net.minecraft.client.renderer.color.BlockColors`"
  (^BlockRendererDispatcher [^net.minecraft.client.renderer.BlockModelShapes p-i-46577-1 ^net.minecraft.client.renderer.color.BlockColors p-i-46577-2]
    (new BlockRendererDispatcher p-i-46577-1 p-i-46577-2)))

(defn get-block-model-shapes
  "returns: `net.minecraft.client.renderer.BlockModelShapes`"
  (^net.minecraft.client.renderer.BlockModelShapes [^BlockRendererDispatcher this]
    (-> this (.getBlockModelShapes))))

(defn render-block-damage
  "state - `net.minecraft.block.state.IBlockState`
  pos - `net.minecraft.util.math.BlockPos`
  texture - `net.minecraft.client.renderer.texture.TextureAtlasSprite`
  block-access - `net.minecraft.world.IBlockAccess`"
  ([^BlockRendererDispatcher this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.math.BlockPos pos ^net.minecraft.client.renderer.texture.TextureAtlasSprite texture ^net.minecraft.world.IBlockAccess block-access]
    (-> this (.renderBlockDamage state pos texture block-access))))

(defn render-block
  "state - `net.minecraft.block.state.IBlockState`
  pos - `net.minecraft.util.math.BlockPos`
  block-access - `net.minecraft.world.IBlockAccess`
  world-renderer-in - `net.minecraft.client.renderer.VertexBuffer`

  returns: `boolean`"
  (^Boolean [^BlockRendererDispatcher this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.math.BlockPos pos ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.client.renderer.VertexBuffer world-renderer-in]
    (-> this (.renderBlock state pos block-access world-renderer-in))))

(defn get-block-model-renderer
  "returns: `net.minecraft.client.renderer.BlockModelRenderer`"
  (^net.minecraft.client.renderer.BlockModelRenderer [^BlockRendererDispatcher this]
    (-> this (.getBlockModelRenderer))))

(defn get-model-for-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^BlockRendererDispatcher this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getModelForState state))))

(defn render-block-brightness
  "state - `net.minecraft.block.state.IBlockState`
  brightness - `float`"
  ([^BlockRendererDispatcher this ^net.minecraft.block.state.IBlockState state ^Float brightness]
    (-> this (.renderBlockBrightness state brightness))))

(defn on-resource-manager-reload
  "resource-manager - `net.minecraft.client.resources.IResourceManager`"
  ([^BlockRendererDispatcher this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.onResourceManagerReload resource-manager))))

