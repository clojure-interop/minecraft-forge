(ns net.minecraft.block.BlockSnowBlock
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockSnowBlock]))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockSnowBlock this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockSnowBlock this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn update-tick
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`"
  ([^BlockSnowBlock this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.Random rand]
    (-> this (.updateTick world-in pos state rand))))

