(ns net.minecraftforge.client.model.ItemLayerModel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model ItemLayerModel]))

(defn ->item-layer-model
  "Constructor.

  textures - `com.google.common.collect.ImmutableList`
  overrides - `net.minecraft.client.renderer.block.model.ItemOverrideList`"
  (^ItemLayerModel [^com.google.common.collect.ImmutableList textures ^net.minecraft.client.renderer.block.model.ItemOverrideList overrides]
    (new ItemLayerModel textures overrides))
  (^ItemLayerModel [^com.google.common.collect.ImmutableList textures]
    (new ItemLayerModel textures)))

(def *-instance
  "Static Constant.

  type: net.minecraftforge.client.model.ItemLayerModel"
  ItemLayerModel/INSTANCE)

(defn *get-quads-for-sprite
  "tint - `int`
  sprite - `net.minecraft.client.renderer.texture.TextureAtlasSprite`
  format - `net.minecraft.client.renderer.vertex.VertexFormat`
  transform - `com.google.common.base.Optional`

  returns: `com.google.common.collect.ImmutableList<net.minecraft.client.renderer.block.model.BakedQuad>`"
  (^com.google.common.collect.ImmutableList [^Integer tint ^net.minecraft.client.renderer.texture.TextureAtlasSprite sprite ^net.minecraft.client.renderer.vertex.VertexFormat format ^com.google.common.base.Optional transform]
    (ItemLayerModel/getQuadsForSprite tint sprite format transform)))

(defn get-dependencies
  "returns: `java.util.Collection<net.minecraft.util.ResourceLocation>`"
  (^java.util.Collection [^ItemLayerModel this]
    (-> this (.getDependencies))))

(defn get-textures
  "returns: `java.util.Collection<net.minecraft.util.ResourceLocation>`"
  (^java.util.Collection [^ItemLayerModel this]
    (-> this (.getTextures))))

(defn get-default-state
  "returns: `net.minecraftforge.common.model.IModelState`"
  (^net.minecraftforge.common.model.IModelState [^ItemLayerModel this]
    (-> this (.getDefaultState))))

(defn retexture
  "Description copied from interface: IRetexturableModel

  textures - New - `com.google.common.collect.ImmutableMap`

  returns: Model with textures applied. - `net.minecraftforge.client.model.ItemLayerModel`"
  (^net.minecraftforge.client.model.ItemLayerModel [^ItemLayerModel this ^com.google.common.collect.ImmutableMap textures]
    (-> this (.retexture textures))))

(defn bake
  "state - `net.minecraftforge.common.model.IModelState`
  format - `net.minecraft.client.renderer.vertex.VertexFormat`
  baked-texture-getter - `com.google.common.base.Function`

  returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^ItemLayerModel this ^net.minecraftforge.common.model.IModelState state ^net.minecraft.client.renderer.vertex.VertexFormat format ^com.google.common.base.Function baked-texture-getter]
    (-> this (.bake state format baked-texture-getter))))

