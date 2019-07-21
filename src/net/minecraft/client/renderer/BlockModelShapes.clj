(ns net.minecraft.client.renderer.BlockModelShapes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer BlockModelShapes]))

(defn ->block-model-shapes
  "Constructor.

  manager - `net.minecraft.client.renderer.block.model.ModelManager`"
  (^BlockModelShapes [^net.minecraft.client.renderer.block.model.ModelManager manager]
    (new BlockModelShapes manager)))

(defn get-block-state-mapper
  "returns: `net.minecraft.client.renderer.block.statemap.BlockStateMapper`"
  (^net.minecraft.client.renderer.block.statemap.BlockStateMapper [^BlockModelShapes this]
    (-> this (.getBlockStateMapper))))

(defn get-texture
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  (^net.minecraft.client.renderer.texture.TextureAtlasSprite [^BlockModelShapes this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getTexture state))))

(defn get-model-for-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^BlockModelShapes this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getModelForState state))))

(defn get-model-manager
  "returns: `net.minecraft.client.renderer.block.model.ModelManager`"
  (^net.minecraft.client.renderer.block.model.ModelManager [^BlockModelShapes this]
    (-> this (.getModelManager))))

(defn reload-models
  ""
  ([^BlockModelShapes this]
    (-> this (.reloadModels))))

(defn register-block-with-state-mapper
  "assoc - `net.minecraft.block.Block`
  state-mapper - `net.minecraft.client.renderer.block.statemap.IStateMapper`"
  ([^BlockModelShapes this ^net.minecraft.block.Block assoc ^net.minecraft.client.renderer.block.statemap.IStateMapper state-mapper]
    (-> this (.registerBlockWithStateMapper assoc state-mapper))))

(defn register-built-in-blocks
  "built-ins - `net.minecraft.block.Block`"
  ([^BlockModelShapes this ^net.minecraft.block.Block built-ins]
    (-> this (.registerBuiltInBlocks built-ins))))

