(ns net.minecraft.block.BlockNetherrack
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockNetherrack]))

(defn ->block-netherrack
  "Constructor."
  (^BlockNetherrack []
    (new BlockNetherrack )))

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockNetherrack this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

