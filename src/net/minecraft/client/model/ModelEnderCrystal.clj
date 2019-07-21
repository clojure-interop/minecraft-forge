(ns net.minecraft.client.model.ModelEnderCrystal
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelEnderCrystal]))

(defn ->model-ender-crystal
  "Constructor.

  p-i-1170-1 - `float`
  render-base - `boolean`"
  (^ModelEnderCrystal [^Float p-i-1170-1 ^Boolean render-base]
    (new ModelEnderCrystal p-i-1170-1 render-base)))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelEnderCrystal this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

