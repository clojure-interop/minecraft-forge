(ns net.minecraft.block.BlockDoubleStoneSlabNew
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockDoubleStoneSlabNew]))

(defn ->block-double-stone-slab-new
  "Constructor."
  (^BlockDoubleStoneSlabNew []
    (new BlockDoubleStoneSlabNew )))

(defn double?
  "returns: `boolean`"
  (^Boolean [^BlockDoubleStoneSlabNew this]
    (-> this (.isDouble))))

