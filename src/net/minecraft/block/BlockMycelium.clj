(ns net.minecraft.block.BlockMycelium
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockMycelium]))

(def *-snowy
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockMycelium/SNOWY)

(defn get-actual-state
  "state - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockMycelium this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getActualState state world-in pos))))

(defn update-tick
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`"
  ([^BlockMycelium this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.Random rand]
    (-> this (.updateTick world-in pos state rand))))

(defn random-display-tick
  "state-in - `net.minecraft.block.state.IBlockState`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  rand - `java.util.Random`"
  ([^BlockMycelium this ^net.minecraft.block.state.IBlockState state-in ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^java.util.Random rand]
    (-> this (.randomDisplayTick state-in world-in pos rand))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockMycelium this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockMycelium this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

