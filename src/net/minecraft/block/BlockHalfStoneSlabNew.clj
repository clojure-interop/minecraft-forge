(ns net.minecraft.block.BlockHalfStoneSlabNew
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockHalfStoneSlabNew]))

(defn ->block-half-stone-slab-new
  "Constructor."
  (^BlockHalfStoneSlabNew []
    (new BlockHalfStoneSlabNew )))

(defn double?
  "returns: `boolean`"
  (^Boolean [^BlockHalfStoneSlabNew this]
    (-> this (.isDouble))))

