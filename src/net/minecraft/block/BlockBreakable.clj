(ns net.minecraft.block.BlockBreakable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockBreakable]))

(defn opaque-cube?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockBreakable this ^net.minecraft.block.state.IBlockState state]
    (-> this (.isOpaqueCube state))))

(defn should-side-be-rendered?
  "block-state - `net.minecraft.block.state.IBlockState`
  block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^BlockBreakable this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.shouldSideBeRendered block-state block-access pos side))))

