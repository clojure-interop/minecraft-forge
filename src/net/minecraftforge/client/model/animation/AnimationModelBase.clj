(ns net.minecraftforge.client.model.animation.AnimationModelBase
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.animation AnimationModelBase]))

(defn ->animation-model-base
  "Constructor.

  Deprecated.

  model-location - `net.minecraft.util.ResourceLocation`
  lighter - `net.minecraftforge.client.model.pipeline.VertexLighterFlat`"
  (^AnimationModelBase [^net.minecraft.util.ResourceLocation model-location ^net.minecraftforge.client.model.pipeline.VertexLighterFlat lighter]
    (new AnimationModelBase model-location lighter)))

(defn render
  "Deprecated.

  entity - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-speed - `float`
  time-alive - `float`
  yaw-head - `float`
  rotation-pitch - `float`
  scale - `float`"
  ([^AnimationModelBase this ^net.minecraft.entity.Entity entity ^Float limb-swing ^Float limb-swing-speed ^Float time-alive ^Float yaw-head ^Float rotation-pitch ^Float scale]
    (-> this (.render entity limb-swing limb-swing-speed time-alive yaw-head rotation-pitch scale))))

(defn handle-events
  "Deprecated.

  instance - `T`
  time - `float`
  past-events - `java.lang.Iterable`"
  ([^AnimationModelBase this instance ^Float time ^java.lang.Iterable past-events]
    (-> this (.handleEvents instance time past-events))))

