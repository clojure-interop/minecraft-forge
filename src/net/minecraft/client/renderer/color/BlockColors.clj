(ns net.minecraft.client.renderer.color.BlockColors
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.color BlockColors]))

(defn ->block-colors
  "Constructor."
  (^BlockColors []
    (new BlockColors )))

(defn *init
  "returns: `net.minecraft.client.renderer.color.BlockColors`"
  (^net.minecraft.client.renderer.color.BlockColors []
    (BlockColors/init )))

(defn get-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockColors this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getColor state))))

(defn color-multiplier
  "state - `net.minecraft.block.state.IBlockState`
  block-access - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  render-pass - `int`

  returns: `int`"
  (^Integer [^BlockColors this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.util.math.BlockPos pos ^Integer render-pass]
    (-> this (.colorMultiplier state block-access pos render-pass))))

(defn register-block-color-handler
  "block-color - `net.minecraft.client.renderer.color.IBlockColor`
  blocks-in - `net.minecraft.block.Block`"
  ([^BlockColors this ^net.minecraft.client.renderer.color.IBlockColor block-color ^net.minecraft.block.Block blocks-in]
    (-> this (.registerBlockColorHandler block-color blocks-in))))

