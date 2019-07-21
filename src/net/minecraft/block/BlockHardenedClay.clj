(ns net.minecraft.block.BlockHardenedClay
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockHardenedClay]))

(defn ->block-hardened-clay
  "Constructor."
  (^BlockHardenedClay []
    (new BlockHardenedClay )))

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockHardenedClay this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

