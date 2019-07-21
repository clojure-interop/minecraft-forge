(ns net.minecraft.item.ItemSimpleFoiled
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemSimpleFoiled]))

(defn ->item-simple-foiled
  "Constructor."
  (^ItemSimpleFoiled []
    (new ItemSimpleFoiled )))

(defn has-effect?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemSimpleFoiled this ^net.minecraft.item.ItemStack stack]
    (-> this (.hasEffect stack))))

