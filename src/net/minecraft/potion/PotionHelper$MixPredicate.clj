(ns net.minecraft.potion.PotionHelper$MixPredicate
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.potion PotionHelper$MixPredicate]))

(defn ->mix-predicate
  "Constructor.

  input-in - `T`
  reagent-in - `com.google.common.base.Predicate`
  output-in - `T`"
  (^PotionHelper$MixPredicate [input-in ^com.google.common.base.Predicate reagent-in output-in]
    (new PotionHelper$MixPredicate input-in reagent-in output-in)))

