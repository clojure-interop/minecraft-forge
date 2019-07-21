(ns net.minecraft.block.state.IBlockBehaviors
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.state IBlockBehaviors]))

(defn on-block-event-received
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  id - `int`
  param - `int`

  returns: `boolean`"
  (^Boolean [^IBlockBehaviors this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^Integer id ^Integer param]
    (-> this (.onBlockEventReceived world-in pos id param))))

(defn neighbor-changed
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-in - `net.minecraft.block.Block`
  from-pos - `net.minecraft.util.math.BlockPos`"
  ([^IBlockBehaviors this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.Block block-in ^net.minecraft.util.math.BlockPos from-pos]
    (-> this (.neighborChanged world-in pos block-in from-pos))))

