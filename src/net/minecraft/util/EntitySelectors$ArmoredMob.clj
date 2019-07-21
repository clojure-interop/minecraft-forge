(ns net.minecraft.util.EntitySelectors$ArmoredMob
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util EntitySelectors$ArmoredMob]))

(defn ->armored-mob
  "Constructor.

  armor - `net.minecraft.item.ItemStack`"
  (^EntitySelectors$ArmoredMob [^net.minecraft.item.ItemStack armor]
    (new EntitySelectors$ArmoredMob armor)))

(defn apply
  "p-apply-1 - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^EntitySelectors$ArmoredMob this ^net.minecraft.entity.Entity p-apply-1]
    (-> this (.apply p-apply-1))))

