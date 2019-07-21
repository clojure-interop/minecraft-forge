(ns net.minecraft.block.BlockHalfWoodSlab
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockHalfWoodSlab]))

(defn ->block-half-wood-slab
  "Constructor."
  (^BlockHalfWoodSlab []
    (new BlockHalfWoodSlab )))

(defn double?
  "returns: `boolean`"
  (^Boolean [^BlockHalfWoodSlab this]
    (-> this (.isDouble))))

