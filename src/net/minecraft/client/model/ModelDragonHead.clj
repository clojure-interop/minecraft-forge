(ns net.minecraft.client.model.ModelDragonHead
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelDragonHead]))

(defn ->model-dragon-head
  "Constructor.

  p-i-46588-1 - `float`"
  (^ModelDragonHead [^Float p-i-46588-1]
    (new ModelDragonHead p-i-46588-1)))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelDragonHead this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

