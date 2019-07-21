(ns net.minecraftforge.client.model.ModelDynBucket
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model ModelDynBucket]))

(defn ->model-dyn-bucket
  "Constructor.

  base-location - `net.minecraft.util.ResourceLocation`
  liquid-location - `net.minecraft.util.ResourceLocation`
  cover-location - `net.minecraft.util.ResourceLocation`
  fluid - `net.minecraftforge.fluids.Fluid`
  flip-gas - `boolean`"
  (^ModelDynBucket [^net.minecraft.util.ResourceLocation base-location ^net.minecraft.util.ResourceLocation liquid-location ^net.minecraft.util.ResourceLocation cover-location ^net.minecraftforge.fluids.Fluid fluid ^Boolean flip-gas]
    (new ModelDynBucket base-location liquid-location cover-location fluid flip-gas))
  (^ModelDynBucket []
    (new ModelDynBucket )))

(def *-location
  "Static Constant.

  type: net.minecraft.client.renderer.block.model.ModelResourceLocation"
  ModelDynBucket/LOCATION)

(def *-model
  "Static Constant.

  type: net.minecraftforge.client.model.IModel"
  ModelDynBucket/MODEL)

(defn get-dependencies
  "returns: `java.util.Collection<net.minecraft.util.ResourceLocation>`"
  (^java.util.Collection [^ModelDynBucket this]
    (-> this (.getDependencies))))

(defn get-textures
  "returns: `java.util.Collection<net.minecraft.util.ResourceLocation>`"
  (^java.util.Collection [^ModelDynBucket this]
    (-> this (.getTextures))))

(defn bake
  "state - `net.minecraftforge.common.model.IModelState`
  format - `net.minecraft.client.renderer.vertex.VertexFormat`
  baked-texture-getter - `com.google.common.base.Function`

  returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^ModelDynBucket this ^net.minecraftforge.common.model.IModelState state ^net.minecraft.client.renderer.vertex.VertexFormat format ^com.google.common.base.Function baked-texture-getter]
    (-> this (.bake state format baked-texture-getter))))

(defn get-default-state
  "returns: `net.minecraftforge.common.model.IModelState`"
  (^net.minecraftforge.common.model.IModelState [^ModelDynBucket this]
    (-> this (.getDefaultState))))

(defn process
  "Sets the liquid in the model.
   fluid - Name of the fluid in the FluidRegistry
   flipGas - If \"true\" the model will be flipped upside down if the liquid is a gas. If \"false\" it wont

   If the fluid can't be found, water is used

  custom-data - `com.google.common.collect.ImmutableMap`

  returns: a new model, with data applied. - `net.minecraftforge.client.model.ModelDynBucket`"
  (^net.minecraftforge.client.model.ModelDynBucket [^ModelDynBucket this ^com.google.common.collect.ImmutableMap custom-data]
    (-> this (.process custom-data))))

(defn retexture
  "Allows to use different textures for the model.
   There are 3 layers:
   base - The empty bucket/container
   fluid - A texture representing the liquid portion. Non-transparent = liquid
   cover - An overlay that's put over the liquid (optional)

   If no liquid is given a hardcoded variant for the bucket is used.

  textures - New - `com.google.common.collect.ImmutableMap`

  returns: Model with textures applied. - `net.minecraftforge.client.model.ModelDynBucket`"
  (^net.minecraftforge.client.model.ModelDynBucket [^ModelDynBucket this ^com.google.common.collect.ImmutableMap textures]
    (-> this (.retexture textures))))

