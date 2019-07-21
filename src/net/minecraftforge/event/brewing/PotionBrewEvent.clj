(ns net.minecraftforge.event.brewing.PotionBrewEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.brewing PotionBrewEvent]))

(defn get-item
  "index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^PotionBrewEvent this ^Integer index]
    (-> this (.getItem index))))

(defn set-item
  "index - `int`
  stack - `net.minecraft.item.ItemStack`"
  ([^PotionBrewEvent this ^Integer index ^net.minecraft.item.ItemStack stack]
    (-> this (.setItem index stack))))

(defn get-length
  "returns: `int`"
  (^Integer [^PotionBrewEvent this]
    (-> this (.getLength))))

