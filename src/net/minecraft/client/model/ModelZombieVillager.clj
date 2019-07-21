(ns net.minecraft.client.model.ModelZombieVillager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelZombieVillager]))

(defn ->model-zombie-villager
  "Constructor.

  p-i-1165-1 - `float`
  p-i-1165-2 - `float`
  p-i-1165-3 - `boolean`"
  (^ModelZombieVillager [^Float p-i-1165-1 ^Float p-i-1165-2 ^Boolean p-i-1165-3]
    (new ModelZombieVillager p-i-1165-1 p-i-1165-2 p-i-1165-3))
  (^ModelZombieVillager []
    (new ModelZombieVillager )))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelZombieVillager this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

