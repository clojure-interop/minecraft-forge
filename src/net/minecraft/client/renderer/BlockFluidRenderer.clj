(ns net.minecraft.client.renderer.BlockFluidRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer BlockFluidRenderer]))

(defn ->block-fluid-renderer
  "Constructor.

  block-colors-in - `net.minecraft.client.renderer.color.BlockColors`"
  (^BlockFluidRenderer [^net.minecraft.client.renderer.color.BlockColors block-colors-in]
    (new BlockFluidRenderer block-colors-in)))

(defn render-fluid
  "block-access - `net.minecraft.world.IBlockAccess`
  block-state-in - `net.minecraft.block.state.IBlockState`
  block-pos-in - `net.minecraft.util.math.BlockPos`
  world-renderer-in - `net.minecraft.client.renderer.VertexBuffer`

  returns: `boolean`"
  (^Boolean [^BlockFluidRenderer this ^net.minecraft.world.IBlockAccess block-access ^net.minecraft.block.state.IBlockState block-state-in ^net.minecraft.util.math.BlockPos block-pos-in ^net.minecraft.client.renderer.VertexBuffer world-renderer-in]
    (-> this (.renderFluid block-access block-state-in block-pos-in world-renderer-in))))

