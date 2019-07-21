(ns net.minecraft.block.BlockDoubleStoneSlab
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockDoubleStoneSlab]))

(defn ->block-double-stone-slab
  "Constructor."
  (^BlockDoubleStoneSlab []
    (new BlockDoubleStoneSlab )))

(defn double?
  "returns: `boolean`"
  (^Boolean [^BlockDoubleStoneSlab this]
    (-> this (.isDouble))))

