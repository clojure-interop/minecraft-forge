(ns net.minecraft.client.model.ModelArmorStandArmor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelArmorStandArmor]))

(defn ->model-armor-stand-armor
  "Constructor.

  model-size - `float`"
  (^ModelArmorStandArmor [^Float model-size]
    (new ModelArmorStandArmor model-size))
  (^ModelArmorStandArmor []
    (new ModelArmorStandArmor )))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelArmorStandArmor this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

