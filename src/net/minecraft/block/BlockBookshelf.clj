(ns net.minecraft.block.BlockBookshelf
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockBookshelf]))

(defn ->block-bookshelf
  "Constructor."
  (^BlockBookshelf []
    (new BlockBookshelf )))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockBookshelf this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockBookshelf this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

