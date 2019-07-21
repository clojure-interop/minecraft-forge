(ns net.minecraftforge.client.model.pipeline.VertexLighterFlat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.pipeline VertexLighterFlat]))

(defn ->vertex-lighter-flat
  "Constructor.

  colors - `net.minecraft.client.renderer.color.BlockColors`"
  (^VertexLighterFlat [^net.minecraft.client.renderer.color.BlockColors colors]
    (new VertexLighterFlat colors)))

(defn set-quad-culled
  ""
  ([^VertexLighterFlat this]
    (-> this (.setQuadCulled))))

(defn set-quad-tint
  "tint - `int`"
  ([^VertexLighterFlat this ^Integer tint]
    (-> this (.setQuadTint tint))))

(defn set-parent
  "parent - `net.minecraftforge.client.model.pipeline.IVertexConsumer`"
  ([^VertexLighterFlat this ^net.minecraftforge.client.model.pipeline.IVertexConsumer parent]
    (-> this (.setParent parent))))

(defn set-world
  "world - `net.minecraft.world.IBlockAccess`"
  ([^VertexLighterFlat this ^net.minecraft.world.IBlockAccess world]
    (-> this (.setWorld world))))

(defn set-texture
  "texture - `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  ([^VertexLighterFlat this ^net.minecraft.client.renderer.texture.TextureAtlasSprite texture]
    (-> this (.setTexture texture))))

(defn set-block-pos
  "block-pos - `net.minecraft.util.math.BlockPos`"
  ([^VertexLighterFlat this ^net.minecraft.util.math.BlockPos block-pos]
    (-> this (.setBlockPos block-pos))))

(defn set-state
  "state - `net.minecraft.block.state.IBlockState`"
  ([^VertexLighterFlat this ^net.minecraft.block.state.IBlockState state]
    (-> this (.setState state))))

(defn set-quad-orientation
  "orientation - `net.minecraft.util.EnumFacing`"
  ([^VertexLighterFlat this ^net.minecraft.util.EnumFacing orientation]
    (-> this (.setQuadOrientation orientation))))

(defn set-apply-diffuse-lighting
  "diffuse - `boolean`"
  ([^VertexLighterFlat this ^Boolean diffuse]
    (-> this (.setApplyDiffuseLighting diffuse))))

(defn update-block-info
  ""
  ([^VertexLighterFlat this]
    (-> this (.updateBlockInfo))))

