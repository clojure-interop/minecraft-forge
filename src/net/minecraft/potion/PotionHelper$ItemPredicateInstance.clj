(ns net.minecraft.potion.PotionHelper$ItemPredicateInstance
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.potion PotionHelper$ItemPredicateInstance]))

(defn ->item-predicate-instance
  "Constructor.

  item-in - `net.minecraft.item.Item`
  meta-in - `int`"
  (^PotionHelper$ItemPredicateInstance [^net.minecraft.item.Item item-in ^Integer meta-in]
    (new PotionHelper$ItemPredicateInstance item-in meta-in))
  (^PotionHelper$ItemPredicateInstance [^net.minecraft.item.Item item-in]
    (new PotionHelper$ItemPredicateInstance item-in)))

(defn apply
  "p-apply-1 - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^PotionHelper$ItemPredicateInstance this ^net.minecraft.item.ItemStack p-apply-1]
    (-> this (.apply p-apply-1))))

