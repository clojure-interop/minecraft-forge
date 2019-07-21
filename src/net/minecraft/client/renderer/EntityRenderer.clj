(ns net.minecraft.client.renderer.EntityRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer EntityRenderer]))

(defn ->entity-renderer
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`
  resource-manager-in - `net.minecraft.client.resources.IResourceManager`"
  (^EntityRenderer [^net.minecraft.client.Minecraft mc-in ^net.minecraft.client.resources.IResourceManager resource-manager-in]
    (new EntityRenderer mc-in resource-manager-in)))

(defn *-anaglyph-enable
  "Static Field.

  type: boolean"
  []
  EntityRenderer/anaglyphEnable)

(defn *-anaglyph-field
  "Static Field.

  type: int"
  []
  EntityRenderer/anaglyphField)

(defn item-renderer
  "Instance Constant.

  type: net.minecraft.client.renderer.ItemRenderer"
  (^net.minecraft.client.renderer.ItemRenderer [^EntityRenderer this]
    (-> this .-itemRenderer)))

(def *-shader-count
  "Static Constant.

  type: int"
  EntityRenderer/SHADER_COUNT)

(defn *draw-nameplate
  "font-renderer-in - `net.minecraft.client.gui.FontRenderer`
  str - `java.lang.String`
  x - `float`
  y - `float`
  z - `float`
  vertical-shift - `int`
  viewer-yaw - `float`
  viewer-pitch - `float`
  is-third-person-frontal - `boolean`
  is-sneaking - `boolean`"
  ([^net.minecraft.client.gui.FontRenderer font-renderer-in ^java.lang.String str ^Float x ^Float y ^Float z ^Integer vertical-shift ^Float viewer-yaw ^Float viewer-pitch ^Boolean is-third-person-frontal ^Boolean is-sneaking]
    (EntityRenderer/drawNameplate font-renderer-in str x y z vertical-shift viewer-yaw viewer-pitch is-third-person-frontal is-sneaking)))

(defn on-resource-manager-reload
  "resource-manager - `net.minecraft.client.resources.IResourceManager`"
  ([^EntityRenderer this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.onResourceManagerReload resource-manager))))

(defn shader-active?
  "returns: `boolean`"
  (^Boolean [^EntityRenderer this]
    (-> this (.isShaderActive))))

(defn get-mouse-over
  "partial-ticks - `float`"
  ([^EntityRenderer this ^Float partial-ticks]
    (-> this (.getMouseOver partial-ticks))))

(defn display-item-activation
  "p-190565-1 - `net.minecraft.item.ItemStack`"
  ([^EntityRenderer this ^net.minecraft.item.ItemStack p-190565-1]
    (-> this (.displayItemActivation p-190565-1))))

(defn update-shader-group-size
  "width - `int`
  height - `int`"
  ([^EntityRenderer this ^Integer width ^Integer height]
    (-> this (.updateShaderGroupSize width height))))

(defn switch-use-shader
  ""
  ([^EntityRenderer this]
    (-> this (.switchUseShader))))

(defn render-stream-indicator
  "partial-ticks - `float`"
  ([^EntityRenderer this ^Float partial-ticks]
    (-> this (.renderStreamIndicator partial-ticks))))

(defn load-entity-shader
  "entity-in - `net.minecraft.entity.Entity`"
  ([^EntityRenderer this ^net.minecraft.entity.Entity entity-in]
    (-> this (.loadEntityShader entity-in))))

(defn render-world
  "partial-ticks - `float`
  finish-time-nano - `long`"
  ([^EntityRenderer this ^Float partial-ticks ^Long finish-time-nano]
    (-> this (.renderWorld partial-ticks finish-time-nano))))

(defn enable-lightmap
  ""
  ([^EntityRenderer this]
    (-> this (.enableLightmap))))

(defn stop-use-shader
  ""
  ([^EntityRenderer this]
    (-> this (.stopUseShader))))

(defn func-191514-d
  "p-191514-1 - `boolean`"
  ([^EntityRenderer this ^Boolean p-191514-1]
    (-> this (.func_191514_d p-191514-1))))

(defn reset-data
  ""
  ([^EntityRenderer this]
    (-> this (.resetData))))

(defn get-shader-group
  "returns: `net.minecraft.client.shader.ShaderGroup`"
  (^net.minecraft.client.shader.ShaderGroup [^EntityRenderer this]
    (-> this (.getShaderGroup))))

(defn get-map-item-renderer
  "returns: `net.minecraft.client.gui.MapItemRenderer`"
  (^net.minecraft.client.gui.MapItemRenderer [^EntityRenderer this]
    (-> this (.getMapItemRenderer))))

(defn setup-overlay-rendering
  ""
  ([^EntityRenderer this]
    (-> this (.setupOverlayRendering))))

(defn update-camera-and-render
  "partial-ticks - `float`
  nano-time - `long`"
  ([^EntityRenderer this ^Float partial-ticks ^Long nano-time]
    (-> this (.updateCameraAndRender partial-ticks nano-time))))

(defn disable-lightmap
  ""
  ([^EntityRenderer this]
    (-> this (.disableLightmap))))

(defn load-shader
  "resource-location-in - `net.minecraft.util.ResourceLocation`"
  ([^EntityRenderer this ^net.minecraft.util.ResourceLocation resource-location-in]
    (-> this (.loadShader resource-location-in))))

(defn update-renderer
  ""
  ([^EntityRenderer this]
    (-> this (.updateRenderer))))

