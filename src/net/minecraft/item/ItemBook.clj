(ns net.minecraft.item.ItemBook
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemBook]))

(defn ->item-book
  "Constructor."
  (^ItemBook []
    (new ItemBook )))

(defn enchantable?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemBook this ^net.minecraft.item.ItemStack stack]
    (-> this (.isEnchantable stack))))

(defn get-item-enchantability
  "returns: `int`"
  (^Integer [^ItemBook this]
    (-> this (.getItemEnchantability))))

