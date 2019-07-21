(ns net.minecraft.client.model.ModelLlamaSpit
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelLlamaSpit]))

(defn ->model-llama-spit
  "Constructor.

  p-i-47225-1 - `float`"
  (^ModelLlamaSpit [^Float p-i-47225-1]
    (new ModelLlamaSpit p-i-47225-1))
  (^ModelLlamaSpit []
    (new ModelLlamaSpit )))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelLlamaSpit this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

