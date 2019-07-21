(ns net.minecraft.client.renderer.block.model.SimpleBakedModel$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model SimpleBakedModel$Builder]))

(defn ->builder
  "Constructor.

  state - `net.minecraft.block.state.IBlockState`
  model - `net.minecraft.client.renderer.block.model.IBakedModel`
  texture - `net.minecraft.client.renderer.texture.TextureAtlasSprite`
  pos - `net.minecraft.util.math.BlockPos`"
  (^SimpleBakedModel$Builder [^net.minecraft.block.state.IBlockState state ^net.minecraft.client.renderer.block.model.IBakedModel model ^net.minecraft.client.renderer.texture.TextureAtlasSprite texture ^net.minecraft.util.math.BlockPos pos]
    (new SimpleBakedModel$Builder state model texture pos))
  (^SimpleBakedModel$Builder [^net.minecraft.client.renderer.block.model.ModelBlock model ^net.minecraft.client.renderer.block.model.ItemOverrideList overrides]
    (new SimpleBakedModel$Builder model overrides)))

(defn add-face-quad
  "facing - `net.minecraft.util.EnumFacing`
  quad - `net.minecraft.client.renderer.block.model.BakedQuad`

  returns: `net.minecraft.client.renderer.block.model.SimpleBakedModel$Builder`"
  (^net.minecraft.client.renderer.block.model.SimpleBakedModel$Builder [^SimpleBakedModel$Builder this ^net.minecraft.util.EnumFacing facing ^net.minecraft.client.renderer.block.model.BakedQuad quad]
    (-> this (.addFaceQuad facing quad))))

(defn add-general-quad
  "quad - `net.minecraft.client.renderer.block.model.BakedQuad`

  returns: `net.minecraft.client.renderer.block.model.SimpleBakedModel$Builder`"
  (^net.minecraft.client.renderer.block.model.SimpleBakedModel$Builder [^SimpleBakedModel$Builder this ^net.minecraft.client.renderer.block.model.BakedQuad quad]
    (-> this (.addGeneralQuad quad))))

(defn set-texture
  "texture - `net.minecraft.client.renderer.texture.TextureAtlasSprite`

  returns: `net.minecraft.client.renderer.block.model.SimpleBakedModel$Builder`"
  (^net.minecraft.client.renderer.block.model.SimpleBakedModel$Builder [^SimpleBakedModel$Builder this ^net.minecraft.client.renderer.texture.TextureAtlasSprite texture]
    (-> this (.setTexture texture))))

(defn make-baked-model
  "returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^SimpleBakedModel$Builder this]
    (-> this (.makeBakedModel))))

