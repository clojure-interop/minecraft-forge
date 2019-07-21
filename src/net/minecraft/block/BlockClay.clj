(ns net.minecraft.block.BlockClay
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockClay]))

(defn ->block-clay
  "Constructor."
  (^BlockClay []
    (new BlockClay )))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockClay this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockClay this ^java.util.Random random]
    (-> this (.quantityDropped random))))

