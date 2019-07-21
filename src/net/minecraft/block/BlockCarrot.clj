(ns net.minecraft.block.BlockCarrot
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockCarrot]))

(defn ->block-carrot
  "Constructor."
  (^BlockCarrot []
    (new BlockCarrot )))

(defn get-bounding-box
  "state - `net.minecraft.block.state.IBlockState`
  source - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^BlockCarrot this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess source ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getBoundingBox state source pos))))

