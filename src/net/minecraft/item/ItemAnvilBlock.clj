(ns net.minecraft.item.ItemAnvilBlock
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemAnvilBlock]))

(defn ->item-anvil-block
  "Constructor.

  block - `net.minecraft.block.Block`"
  (^ItemAnvilBlock [^net.minecraft.block.Block block]
    (new ItemAnvilBlock block)))

(defn get-metadata
  "damage - `int`

  returns: `int`"
  (^Integer [^ItemAnvilBlock this ^Integer damage]
    (-> this (.getMetadata damage))))

