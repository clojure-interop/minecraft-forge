(ns net.minecraftforge.event.entity.living.LivingEntityUseItemEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingEntityUseItemEvent]))

(defn get-item
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^LivingEntityUseItemEvent this]
    (-> this (.getItem))))

(defn get-duration
  "returns: `int`"
  (^Integer [^LivingEntityUseItemEvent this]
    (-> this (.getDuration))))

(defn set-duration
  "duration - `int`"
  ([^LivingEntityUseItemEvent this ^Integer duration]
    (-> this (.setDuration duration))))

