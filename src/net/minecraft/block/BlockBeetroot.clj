(ns net.minecraft.block.BlockBeetroot
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockBeetroot]))

(defn ->block-beetroot
  "Constructor."
  (^BlockBeetroot []
    (new BlockBeetroot )))

(def *-beetroot-age
  "Static Constant.

  type: net.minecraft.block.properties.PropertyInteger"
  BlockBeetroot/BEETROOT_AGE)

(defn get-max-age
  "returns: `int`"
  (^Integer [^BlockBeetroot this]
    (-> this (.getMaxAge))))

(defn update-tick
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`"
  ([^BlockBeetroot this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^java.util.Random rand]
    (-> this (.updateTick world-in pos state rand))))

(defn get-bounding-box
  "state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockBeetroot this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBoundingBox state source pos))))

