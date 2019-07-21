(ns net.minecraft.block.BlockEmptyDrops
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockEmptyDrops]))

(defn ->block-empty-drops
  "Constructor.

  material-in - `net.minecraft.block.material.Material`"
  (^BlockEmptyDrops [^net.minecraft.block.material.Material material-in]
    (new BlockEmptyDrops material-in)))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockEmptyDrops this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockEmptyDrops this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

