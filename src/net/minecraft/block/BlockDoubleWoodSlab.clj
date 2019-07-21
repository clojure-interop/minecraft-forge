(ns net.minecraft.block.BlockDoubleWoodSlab
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockDoubleWoodSlab]))

(defn ->block-double-wood-slab
  "Constructor."
  (^BlockDoubleWoodSlab []
    (new BlockDoubleWoodSlab )))

(defn double?
  "returns: `boolean`"
  (^Boolean [^BlockDoubleWoodSlab this]
    (-> this (.isDouble))))

