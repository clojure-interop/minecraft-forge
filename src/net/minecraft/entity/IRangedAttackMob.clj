(ns net.minecraft.entity.IRangedAttackMob
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity IRangedAttackMob]))

(defn attack-entity-with-ranged-attack
  "target - `net.minecraft.entity.EntityLivingBase`
  distance-factor - `float`"
  ([^IRangedAttackMob this ^net.minecraft.entity.EntityLivingBase target ^Float distance-factor]
    (-> this (.attackEntityWithRangedAttack target distance-factor))))

