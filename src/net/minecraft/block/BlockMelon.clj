(ns net.minecraft.block.BlockMelon
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockMelon]))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockMelon this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockMelon this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn quantity-dropped-with-bonus
  "fortune - `int`
  random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockMelon this ^Integer fortune ^java.util.Random random]
    (-> this (.quantityDroppedWithBonus fortune random))))

