(ns net.minecraft.client.renderer.entity.RenderLivingBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderLivingBase]))

(defn ->render-living-base
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`
  model-base-in - `net.minecraft.client.model.ModelBase`
  shadow-size-in - `float`"
  (^RenderLivingBase [^net.minecraft.client.renderer.entity.RenderManager render-manager-in ^net.minecraft.client.model.ModelBase model-base-in ^Float shadow-size-in]
    (new RenderLivingBase render-manager-in model-base-in shadow-size-in)))

(defn *-name-tag-range
  "Static Field.

  type: float"
  []
  RenderLivingBase/NAME_TAG_RANGE)

(defn *-name-tag-range-sneak
  "Static Field.

  type: float"
  []
  RenderLivingBase/NAME_TAG_RANGE_SNEAK)

(defn add-layer
  "layer - `U`

  returns: `<V extends net.minecraft.entity.EntityLivingBase,U extends net.minecraft.client.renderer.entity.layers.LayerRenderer<V>> boolean`"
  ([^RenderLivingBase this layer]
    (-> this (.addLayer layer))))

(defn get-main-model
  "returns: `net.minecraft.client.model.ModelBase`"
  (^net.minecraft.client.model.ModelBase [^RenderLivingBase this]
    (-> this (.getMainModel))))

(defn transform-held-full-3-d-item-layer
  ""
  ([^RenderLivingBase this]
    (-> this (.transformHeldFull3DItemLayer))))

(defn do-render
  "entity - `T`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderLivingBase this entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

(defn prepare-scale
  "entitylivingbase-in - `T`
  partial-ticks - `float`

  returns: `float`"
  (^Float [^RenderLivingBase this entitylivingbase-in ^Float partial-ticks]
    (-> this (.prepareScale entitylivingbase-in partial-ticks))))

(defn render-name
  "entity - `T`
  x - `double`
  y - `double`
  z - `double`"
  ([^RenderLivingBase this entity ^Double x ^Double y ^Double z]
    (-> this (.renderName entity x y z))))

