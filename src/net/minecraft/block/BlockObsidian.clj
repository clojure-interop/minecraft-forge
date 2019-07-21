(ns net.minecraft.block.BlockObsidian
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockObsidian]))

(defn ->block-obsidian
  "Constructor."
  (^BlockObsidian []
    (new BlockObsidian )))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockObsidian this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockObsidian this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

