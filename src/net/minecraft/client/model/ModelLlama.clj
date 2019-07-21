(ns net.minecraft.client.model.ModelLlama
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelLlama]))

(defn ->model-llama
  "Constructor.

  p-i-47226-1 - `float`"
  (^ModelLlama [^Float p-i-47226-1]
    (new ModelLlama p-i-47226-1)))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelLlama this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

