(ns net.minecraft.client.model.ModelVindicator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelVindicator]))

(defn ->model-vindicator
  "Constructor.

  scale-factor - `float`
  p-i-47223-2 - `float`
  texture-width-in - `int`
  texture-height-in - `int`"
  (^ModelVindicator [^Float scale-factor ^Float p-i-47223-2 ^Integer texture-width-in ^Integer texture-height-in]
    (new ModelVindicator scale-factor p-i-47223-2 texture-width-in texture-height-in))
  (^ModelVindicator [^Float scale-factor]
    (new ModelVindicator scale-factor)))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelVindicator this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelVindicator this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

