(ns net.minecraft.block.BlockPurpurSlab$Half
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockPurpurSlab$Half]))

(defn ->half
  "Constructor."
  (^BlockPurpurSlab$Half []
    (new BlockPurpurSlab$Half )))

(defn double?
  "returns: `boolean`"
  (^Boolean [^BlockPurpurSlab$Half this]
    (-> this (.isDouble))))

