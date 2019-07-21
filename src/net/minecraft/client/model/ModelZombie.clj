(ns net.minecraft.client.model.ModelZombie
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelZombie]))

(defn ->model-zombie
  "Constructor.

  model-size - `float`
  p-i-1168-2 - `boolean`"
  (^ModelZombie [^Float model-size ^Boolean p-i-1168-2]
    (new ModelZombie model-size p-i-1168-2))
  (^ModelZombie []
    (new ModelZombie )))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelZombie this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

