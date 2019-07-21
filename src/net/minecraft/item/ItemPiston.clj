(ns net.minecraft.item.ItemPiston
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemPiston]))

(defn ->item-piston
  "Constructor.

  block - `net.minecraft.block.Block`"
  (^ItemPiston [^net.minecraft.block.Block block]
    (new ItemPiston block)))

(defn get-metadata
  "damage - `int`

  returns: `int`"
  (^Integer [^ItemPiston this ^Integer damage]
    (-> this (.getMetadata damage))))

