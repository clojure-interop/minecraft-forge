(ns net.minecraft.client.renderer.block.model.ModelBlock
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model ModelBlock]))

(defn ->model-block
  "Constructor.

  parent-location-in - `net.minecraft.util.ResourceLocation`
  elements-in - `java.util.List`
  textures-in - `java.util.Map`
  ambient-occlusion-in - `boolean`
  gui-3d-in - `boolean`
  camera-transforms-in - `net.minecraft.client.renderer.block.model.ItemCameraTransforms`
  overrides-in - `java.util.List`"
  (^ModelBlock [^net.minecraft.util.ResourceLocation parent-location-in ^java.util.List elements-in ^java.util.Map textures-in ^Boolean ambient-occlusion-in ^Boolean gui-3d-in ^net.minecraft.client.renderer.block.model.ItemCameraTransforms camera-transforms-in ^java.util.List overrides-in]
    (new ModelBlock parent-location-in elements-in textures-in ambient-occlusion-in gui-3d-in camera-transforms-in overrides-in)))

(defn ambient-occlusion
  "Instance Constant.

  type: boolean"
  (^Boolean [^ModelBlock this]
    (-> this .-ambientOcclusion)))

(defn name
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^ModelBlock this]
    (-> this .-name)))

(defn textures
  "Instance Constant.

  type: java.util.Map<java.lang.String,java.lang.String>"
  (^java.util.Map [^ModelBlock this]
    (-> this .-textures)))

(defn parent
  "Instance Field.

  type: net.minecraft.client.renderer.block.model.ModelBlock"
  (^net.minecraft.client.renderer.block.model.ModelBlock [^ModelBlock this]
    (-> this .-parent)))

(defn *deserialize
  "reader-in - `java.io.Reader`

  returns: `net.minecraft.client.renderer.block.model.ModelBlock`"
  (^net.minecraft.client.renderer.block.model.ModelBlock [^java.io.Reader reader-in]
    (ModelBlock/deserialize reader-in)))

(defn *check-model-hierarchy
  "p-178312-0 - `java.util.Map`"
  ([^java.util.Map p-178312-0]
    (ModelBlock/checkModelHierarchy p-178312-0)))

(defn resolved?
  "returns: `boolean`"
  (^Boolean [^ModelBlock this]
    (-> this (.isResolved))))

(defn gui-3d?
  "returns: `boolean`"
  (^Boolean [^ModelBlock this]
    (-> this (.isGui3d))))

(defn get-override-locations
  "returns: `java.util.Collection<net.minecraft.util.ResourceLocation>`"
  (^java.util.Collection [^ModelBlock this]
    (-> this (.getOverrideLocations))))

(defn get-root-model
  "returns: `net.minecraft.client.renderer.block.model.ModelBlock`"
  (^net.minecraft.client.renderer.block.model.ModelBlock [^ModelBlock this]
    (-> this (.getRootModel))))

(defn texture-present?
  "texture-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^ModelBlock this ^java.lang.String texture-name]
    (-> this (.isTexturePresent texture-name))))

(defn get-elements
  "returns: `java.util.List<net.minecraft.client.renderer.block.model.BlockPart>`"
  (^java.util.List [^ModelBlock this]
    (-> this (.getElements))))

(defn ambient-occlusion?
  "returns: `boolean`"
  (^Boolean [^ModelBlock this]
    (-> this (.isAmbientOcclusion))))

(defn get-parent-location
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^ModelBlock this]
    (-> this (.getParentLocation))))

(defn get-overrides
  "returns: `java.util.List<net.minecraft.client.renderer.block.model.ItemOverride>`"
  (^java.util.List [^ModelBlock this]
    (-> this (.getOverrides))))

(defn get-all-transforms
  "returns: `net.minecraft.client.renderer.block.model.ItemCameraTransforms`"
  (^net.minecraft.client.renderer.block.model.ItemCameraTransforms [^ModelBlock this]
    (-> this (.getAllTransforms))))

(defn resolve-texture-name
  "texture-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ModelBlock this ^java.lang.String texture-name]
    (-> this (.resolveTextureName texture-name))))

(defn create-overrides
  "returns: `net.minecraft.client.renderer.block.model.ItemOverrideList`"
  (^net.minecraft.client.renderer.block.model.ItemOverrideList [^ModelBlock this]
    (-> this (.createOverrides))))

(defn get-parent-from-map
  "p-178299-1 - `java.util.Map`"
  ([^ModelBlock this ^java.util.Map p-178299-1]
    (-> this (.getParentFromMap p-178299-1))))

