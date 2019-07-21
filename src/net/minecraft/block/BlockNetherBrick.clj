(ns net.minecraft.block.BlockNetherBrick
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockNetherBrick]))

(defn ->block-nether-brick
  "Constructor."
  (^BlockNetherBrick []
    (new BlockNetherBrick )))

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockNetherBrick this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

