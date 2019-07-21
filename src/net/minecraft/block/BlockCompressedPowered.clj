(ns net.minecraft.block.BlockCompressedPowered
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockCompressedPowered]))

(defn ->block-compressed-powered
  "Constructor.

  material-in - `net.minecraft.block.material.Material`
  color - `net.minecraft.block.material.MapColor`"
  (^BlockCompressedPowered [^net.minecraft.block.material.Material material-in ^net.minecraft.block.material.MapColor color]
    (new BlockCompressedPowered material-in color)))

(defn can-provide-power?
  "state - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockCompressedPowered this ^net.minecraft.block.state.IBlockState state]
    (-> this (.canProvidePower state))))

(defn get-weak-power
  "block-state - `net.minecraft.block.state.IBlockState`
  block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`

  returns: `int`"
  (^Integer [^BlockCompressedPowered this ^net.minecraft.block.state.IBlockState block-state ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.getWeakPower block-state block-access pos side))))

