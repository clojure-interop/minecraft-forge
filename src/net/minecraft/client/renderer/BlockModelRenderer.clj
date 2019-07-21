(ns net.minecraft.client.renderer.BlockModelRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer BlockModelRenderer]))

(defn ->block-model-renderer
  "Constructor.

  block-colors-in - `net.minecraft.client.renderer.color.BlockColors`"
  (^BlockModelRenderer [^net.minecraft.client.renderer.color.BlockColors block-colors-in]
    (new BlockModelRenderer block-colors-in)))

(defn render-model
  "world-in - `net.minecraft.world.IBlockAccess`
  model-in - `net.minecraft.client.renderer.block.model.IBakedModel`
  state-in - `net.minecraft.block.state.IBlockState`
  pos-in - `net.minecraft.util.math.BlockPos`
  buffer - `net.minecraft.client.renderer.VertexBuffer`
  check-sides - `boolean`
  rand - `long`

  returns: `boolean`"
  (^Boolean [^BlockModelRenderer this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.client.renderer.block.model.IBakedModel model-in ^net.minecraft.block.state.IBlockState state-in ^net.minecraft.util.math.BlockPos pos-in ^net.minecraft.client.renderer.VertexBuffer buffer ^Boolean check-sides ^Long rand]
    (-> this (.renderModel world-in model-in state-in pos-in buffer check-sides rand)))
  (^Boolean [^BlockModelRenderer this ^net.minecraft.world.IBlockAccess block-access-in ^net.minecraft.client.renderer.block.model.IBakedModel model-in ^net.minecraft.block.state.IBlockState block-state-in ^net.minecraft.util.math.BlockPos block-pos-in ^net.minecraft.client.renderer.VertexBuffer buffer ^Boolean check-sides]
    (-> this (.renderModel block-access-in model-in block-state-in block-pos-in buffer check-sides))))

(defn render-model-smooth
  "world-in - `net.minecraft.world.IBlockAccess`
  model-in - `net.minecraft.client.renderer.block.model.IBakedModel`
  state-in - `net.minecraft.block.state.IBlockState`
  pos-in - `net.minecraft.util.math.BlockPos`
  buffer - `net.minecraft.client.renderer.VertexBuffer`
  check-sides - `boolean`
  rand - `long`

  returns: `boolean`"
  (^Boolean [^BlockModelRenderer this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.client.renderer.block.model.IBakedModel model-in ^net.minecraft.block.state.IBlockState state-in ^net.minecraft.util.math.BlockPos pos-in ^net.minecraft.client.renderer.VertexBuffer buffer ^Boolean check-sides ^Long rand]
    (-> this (.renderModelSmooth world-in model-in state-in pos-in buffer check-sides rand))))

(defn render-model-flat
  "world-in - `net.minecraft.world.IBlockAccess`
  model-in - `net.minecraft.client.renderer.block.model.IBakedModel`
  state-in - `net.minecraft.block.state.IBlockState`
  pos-in - `net.minecraft.util.math.BlockPos`
  buffer - `net.minecraft.client.renderer.VertexBuffer`
  check-sides - `boolean`
  rand - `long`

  returns: `boolean`"
  (^Boolean [^BlockModelRenderer this ^net.minecraft.world.IBlockAccess world-in ^net.minecraft.client.renderer.block.model.IBakedModel model-in ^net.minecraft.block.state.IBlockState state-in ^net.minecraft.util.math.BlockPos pos-in ^net.minecraft.client.renderer.VertexBuffer buffer ^Boolean check-sides ^Long rand]
    (-> this (.renderModelFlat world-in model-in state-in pos-in buffer check-sides rand))))

(defn render-model-brightness-color
  "state - `net.minecraft.block.state.IBlockState`
  p-187495-2 - `net.minecraft.client.renderer.block.model.IBakedModel`
  p-187495-3 - `float`
  p-187495-4 - `float`
  p-187495-5 - `float`
  p-187495-6 - `float`"
  ([^BlockModelRenderer this ^net.minecraft.block.state.IBlockState state ^net.minecraft.client.renderer.block.model.IBakedModel p-187495-2 ^Float p-187495-3 ^Float p-187495-4 ^Float p-187495-5 ^Float p-187495-6]
    (-> this (.renderModelBrightnessColor state p-187495-2 p-187495-3 p-187495-4 p-187495-5 p-187495-6)))
  ([^BlockModelRenderer this ^net.minecraft.client.renderer.block.model.IBakedModel baked-model ^Float p-178262-2 ^Float red ^Float green ^Float blue]
    (-> this (.renderModelBrightnessColor baked-model p-178262-2 red green blue))))

(defn render-model-brightness
  "model - `net.minecraft.client.renderer.block.model.IBakedModel`
  state - `net.minecraft.block.state.IBlockState`
  brightness - `float`
  p-178266-4 - `boolean`"
  ([^BlockModelRenderer this ^net.minecraft.client.renderer.block.model.IBakedModel model ^net.minecraft.block.state.IBlockState state ^Float brightness ^Boolean p-178266-4]
    (-> this (.renderModelBrightness model state brightness p-178266-4))))

