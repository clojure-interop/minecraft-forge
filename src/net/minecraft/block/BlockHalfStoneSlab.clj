(ns net.minecraft.block.BlockHalfStoneSlab
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockHalfStoneSlab]))

(defn ->block-half-stone-slab
  "Constructor."
  (^BlockHalfStoneSlab []
    (new BlockHalfStoneSlab )))

(defn double?
  "returns: `boolean`"
  (^Boolean [^BlockHalfStoneSlab this]
    (-> this (.isDouble))))

