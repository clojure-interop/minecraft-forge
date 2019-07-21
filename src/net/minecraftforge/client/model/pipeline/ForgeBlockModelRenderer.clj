(ns net.minecraftforge.client.model.pipeline.ForgeBlockModelRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.pipeline ForgeBlockModelRenderer]))

(defn ->forge-block-model-renderer
  "Constructor.

  colors - `net.minecraft.client.renderer.color.BlockColors`"
  (^ForgeBlockModelRenderer [^net.minecraft.client.renderer.color.BlockColors colors]
    (new ForgeBlockModelRenderer colors)))

(defn *render
  "lighter - `net.minecraftforge.client.model.pipeline.VertexLighterFlat`
  world - `net.minecraft.world.IBlockAccess`
  model - `net.minecraft.client.renderer.block.model.IBakedModel`
  state - `net.minecraft.block.state.IBlockState`
  pos - `net.minecraft.util.math.BlockPos`
  wr - `net.minecraft.client.renderer.VertexBuffer`
  check-sides - `boolean`
  rand - `long`

  returns: `boolean`"
  (^Boolean [^net.minecraftforge.client.model.pipeline.VertexLighterFlat lighter ^net.minecraft.world.IBlockAccess world ^net.minecraft.client.renderer.block.model.IBakedModel model ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.math.BlockPos pos ^net.minecraft.client.renderer.VertexBuffer wr ^Boolean check-sides ^Long rand]
    (ForgeBlockModelRenderer/render lighter world model state pos wr check-sides rand)))

(defn render-model-flat
  "world - `net.minecraft.world.IBlockAccess`
  model - `net.minecraft.client.renderer.block.model.IBakedModel`
  state - `net.minecraft.block.state.IBlockState`
  pos - `net.minecraft.util.math.BlockPos`
  buffer - `net.minecraft.client.renderer.VertexBuffer`
  check-sides - `boolean`
  rand - `long`

  returns: `boolean`"
  (^Boolean [^ForgeBlockModelRenderer this ^net.minecraft.world.IBlockAccess world ^net.minecraft.client.renderer.block.model.IBakedModel model ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.math.BlockPos pos ^net.minecraft.client.renderer.VertexBuffer buffer ^Boolean check-sides ^Long rand]
    (-> this (.renderModelFlat world model state pos buffer check-sides rand))))

(defn render-model-smooth
  "world - `net.minecraft.world.IBlockAccess`
  model - `net.minecraft.client.renderer.block.model.IBakedModel`
  state - `net.minecraft.block.state.IBlockState`
  pos - `net.minecraft.util.math.BlockPos`
  buffer - `net.minecraft.client.renderer.VertexBuffer`
  check-sides - `boolean`
  rand - `long`

  returns: `boolean`"
  (^Boolean [^ForgeBlockModelRenderer this ^net.minecraft.world.IBlockAccess world ^net.minecraft.client.renderer.block.model.IBakedModel model ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.math.BlockPos pos ^net.minecraft.client.renderer.VertexBuffer buffer ^Boolean check-sides ^Long rand]
    (-> this (.renderModelSmooth world model state pos buffer check-sides rand))))

