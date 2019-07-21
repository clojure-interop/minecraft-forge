(ns net.minecraft.util.EnchantmentNameParts
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util EnchantmentNameParts]))

(defn ->enchantment-name-parts
  "Constructor."
  (^EnchantmentNameParts []
    (new EnchantmentNameParts )))

(defn *get-instance
  "returns: `net.minecraft.util.EnchantmentNameParts`"
  (^net.minecraft.util.EnchantmentNameParts []
    (EnchantmentNameParts/getInstance )))

(defn generate-new-random-name
  "p-148334-1 - `net.minecraft.client.gui.FontRenderer`
  p-148334-2 - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^EnchantmentNameParts this ^net.minecraft.client.gui.FontRenderer p-148334-1 ^Integer p-148334-2]
    (-> this (.generateNewRandomName p-148334-1 p-148334-2))))

(defn reseed-random-generator
  "seed - `long`"
  ([^EnchantmentNameParts this ^Long seed]
    (-> this (.reseedRandomGenerator seed))))

