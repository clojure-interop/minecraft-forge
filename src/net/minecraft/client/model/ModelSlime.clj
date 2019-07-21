(ns net.minecraft.client.model.ModelSlime
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelSlime]))

(defn ->model-slime
  "Constructor.

  p-i-1157-1 - `int`"
  (^ModelSlime [^Integer p-i-1157-1]
    (new ModelSlime p-i-1157-1)))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelSlime this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

