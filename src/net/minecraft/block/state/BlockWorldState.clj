(ns net.minecraft.block.state.BlockWorldState
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.state BlockWorldState]))

(defn ->block-world-state
  "Constructor.

  world-in - `net.minecraft.world.World`
  pos-in - `net.minecraft.util.math.BlockPos`
  force-load-in - `boolean`"
  (^BlockWorldState [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos-in ^Boolean force-load-in]
    (new BlockWorldState world-in pos-in force-load-in)))

(defn *has-state
  "predicates-in - `com.google.common.base.Predicate`

  returns: `com.google.common.base.Predicate<net.minecraft.block.state.BlockWorldState>`"
  (^com.google.common.base.Predicate [^com.google.common.base.Predicate predicates-in]
    (BlockWorldState/hasState predicates-in)))

(defn get-block-state
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockWorldState this]
    (-> this (.getBlockState))))

(defn get-tile-entity
  "returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^BlockWorldState this]
    (-> this (.getTileEntity))))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockWorldState this]
    (-> this (.getPos))))

