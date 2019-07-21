(ns net.minecraft.client.renderer.RenderGlobal
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer RenderGlobal]))

(defn ->render-global
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`"
  (^RenderGlobal [^net.minecraft.client.Minecraft mc-in]
    (new RenderGlobal mc-in)))

(defn *draw-selection-bounding-box
  "box - `net.minecraft.util.math.AxisAlignedBB`
  red - `float`
  green - `float`
  blue - `float`
  alpha - `float`"
  ([^net.minecraft.util.math.AxisAlignedBB box ^Float red ^Float green ^Float blue ^Float alpha]
    (RenderGlobal/drawSelectionBoundingBox box red green blue alpha)))

(defn *draw-bounding-box
  "buffer - `net.minecraft.client.renderer.VertexBuffer`
  min-x - `double`
  min-y - `double`
  min-z - `double`
  max-x - `double`
  max-y - `double`
  max-z - `double`
  red - `float`
  green - `float`
  blue - `float`
  alpha - `float`"
  ([^net.minecraft.client.renderer.VertexBuffer buffer ^Double min-x ^Double min-y ^Double min-z ^Double max-x ^Double max-y ^Double max-z ^Float red ^Float green ^Float blue ^Float alpha]
    (RenderGlobal/drawBoundingBox buffer min-x min-y min-z max-x max-y max-z red green blue alpha))
  ([^Double min-x ^Double min-y ^Double min-z ^Double max-x ^Double max-y ^Double max-z ^Float red ^Float green ^Float blue ^Float alpha]
    (RenderGlobal/drawBoundingBox min-x min-y min-z max-x max-y max-z red green blue alpha)))

(defn *render-filled-box
  "p-189695-0 - `double`
  p-189695-2 - `double`
  p-189695-4 - `double`
  p-189695-6 - `double`
  p-189695-8 - `double`
  p-189695-10 - `double`
  p-189695-12 - `float`
  p-189695-13 - `float`
  p-189695-14 - `float`
  p-189695-15 - `float`"
  ([^Double p-189695-0 ^Double p-189695-2 ^Double p-189695-4 ^Double p-189695-6 ^Double p-189695-8 ^Double p-189695-10 ^Float p-189695-12 ^Float p-189695-13 ^Float p-189695-14 ^Float p-189695-15]
    (RenderGlobal/renderFilledBox p-189695-0 p-189695-2 p-189695-4 p-189695-6 p-189695-8 p-189695-10 p-189695-12 p-189695-13 p-189695-14 p-189695-15))
  ([^net.minecraft.util.math.AxisAlignedBB p-189696-0 ^Float p-189696-1 ^Float p-189696-2 ^Float p-189696-3 ^Float p-189696-4]
    (RenderGlobal/renderFilledBox p-189696-0 p-189696-1 p-189696-2 p-189696-3 p-189696-4)))

(defn *add-chained-filled-box-vertices
  "p-189693-0 - `net.minecraft.client.renderer.VertexBuffer`
  p-189693-1 - `double`
  p-189693-3 - `double`
  p-189693-5 - `double`
  p-189693-7 - `double`
  p-189693-9 - `double`
  p-189693-11 - `double`
  p-189693-13 - `float`
  p-189693-14 - `float`
  p-189693-15 - `float`
  p-189693-16 - `float`"
  ([^net.minecraft.client.renderer.VertexBuffer p-189693-0 ^Double p-189693-1 ^Double p-189693-3 ^Double p-189693-5 ^Double p-189693-7 ^Double p-189693-9 ^Double p-189693-11 ^Float p-189693-13 ^Float p-189693-14 ^Float p-189693-15 ^Float p-189693-16]
    (RenderGlobal/addChainedFilledBoxVertices p-189693-0 p-189693-1 p-189693-3 p-189693-5 p-189693-7 p-189693-9 p-189693-11 p-189693-13 p-189693-14 p-189693-15 p-189693-16)))

(defn on-resource-manager-reload
  "resource-manager - `net.minecraft.client.resources.IResourceManager`"
  ([^RenderGlobal this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.onResourceManagerReload resource-manager))))

(defn broadcast-sound
  "sound-id - `int`
  pos - `net.minecraft.util.math.BlockPos`
  data - `int`"
  ([^RenderGlobal this ^Integer sound-id ^net.minecraft.util.math.BlockPos pos ^Integer data]
    (-> this (.broadcastSound sound-id pos data))))

(defn draw-block-damage-texture
  "tessellator-in - `net.minecraft.client.renderer.Tessellator`
  world-renderer-in - `net.minecraft.client.renderer.VertexBuffer`
  entity-in - `net.minecraft.entity.Entity`
  partial-ticks - `float`"
  ([^RenderGlobal this ^net.minecraft.client.renderer.Tessellator tessellator-in ^net.minecraft.client.renderer.VertexBuffer world-renderer-in ^net.minecraft.entity.Entity entity-in ^Float partial-ticks]
    (-> this (.drawBlockDamageTexture tessellator-in world-renderer-in entity-in partial-ticks))))

(defn mark-block-range-for-render-update
  "x-1 - `int`
  y-1 - `int`
  z-1 - `int`
  x-2 - `int`
  y-2 - `int`
  z-2 - `int`"
  ([^RenderGlobal this ^Integer x-1 ^Integer y-1 ^Integer z-1 ^Integer x-2 ^Integer y-2 ^Integer z-2]
    (-> this (.markBlockRangeForRenderUpdate x-1 y-1 z-1 x-2 y-2 z-2))))

(defn on-entity-added
  "entity-in - `net.minecraft.entity.Entity`"
  ([^RenderGlobal this ^net.minecraft.entity.Entity entity-in]
    (-> this (.onEntityAdded entity-in))))

(defn render-entities
  "render-view-entity - `net.minecraft.entity.Entity`
  camera - `net.minecraft.client.renderer.culling.ICamera`
  partial-ticks - `float`"
  ([^RenderGlobal this ^net.minecraft.entity.Entity render-view-entity ^net.minecraft.client.renderer.culling.ICamera camera ^Float partial-ticks]
    (-> this (.renderEntities render-view-entity camera partial-ticks))))

(defn set-world-and-load-renderers
  "world-client-in - `net.minecraft.client.multiplayer.WorldClient`"
  ([^RenderGlobal this ^net.minecraft.client.multiplayer.WorldClient world-client-in]
    (-> this (.setWorldAndLoadRenderers world-client-in))))

(defn play-sound-to-all-near-except
  "player - `net.minecraft.entity.player.EntityPlayer`
  sound-in - `net.minecraft.util.SoundEvent`
  category - `net.minecraft.util.SoundCategory`
  x - `double`
  y - `double`
  z - `double`
  volume - `float`
  pitch - `float`"
  ([^RenderGlobal this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.SoundEvent sound-in ^net.minecraft.util.SoundCategory category ^Double x ^Double y ^Double z ^Float volume ^Float pitch]
    (-> this (.playSoundToAllNearExcept player sound-in category x y z volume pitch))))

(defn set-display-list-entities-dirty
  ""
  ([^RenderGlobal this]
    (-> this (.setDisplayListEntitiesDirty))))

(defn notify-light-set
  "pos - `net.minecraft.util.math.BlockPos`"
  ([^RenderGlobal this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.notifyLightSet pos))))

(defn get-debug-info-renders
  "returns: `java.lang.String`"
  (^java.lang.String [^RenderGlobal this]
    (-> this (.getDebugInfoRenders))))

(defn make-entity-outline-shader
  ""
  ([^RenderGlobal this]
    (-> this (.makeEntityOutlineShader))))

(defn render-entity-outline-framebuffer
  ""
  ([^RenderGlobal this]
    (-> this (.renderEntityOutlineFramebuffer))))

(defn render-world-border
  "entity-in - `net.minecraft.entity.Entity`
  partial-ticks - `float`"
  ([^RenderGlobal this ^net.minecraft.entity.Entity entity-in ^Float partial-ticks]
    (-> this (.renderWorldBorder entity-in partial-ticks))))

(defn play-event
  "player - `net.minecraft.entity.player.EntityPlayer`
  type - `int`
  block-pos-in - `net.minecraft.util.math.BlockPos`
  data - `int`"
  ([^RenderGlobal this ^net.minecraft.entity.player.EntityPlayer player ^Integer type ^net.minecraft.util.math.BlockPos block-pos-in ^Integer data]
    (-> this (.playEvent player type block-pos-in data))))

(defn render-sky
  "partial-ticks - `float`
  pass - `int`"
  ([^RenderGlobal this ^Float partial-ticks ^Integer pass]
    (-> this (.renderSky partial-ticks pass))))

(defn has-cloud-fog?
  "x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`

  returns: `boolean`"
  (^Boolean [^RenderGlobal this ^Double x ^Double y ^Double z ^Float partial-ticks]
    (-> this (.hasCloudFog x y z partial-ticks))))

(defn send-block-break-progress
  "breaker-id - `int`
  pos - `net.minecraft.util.math.BlockPos`
  progress - `int`"
  ([^RenderGlobal this ^Integer breaker-id ^net.minecraft.util.math.BlockPos pos ^Integer progress]
    (-> this (.sendBlockBreakProgress breaker-id pos progress))))

(defn play-record
  "sound-in - `net.minecraft.util.SoundEvent`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^RenderGlobal this ^net.minecraft.util.SoundEvent sound-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.playRecord sound-in pos))))

(defn get-debug-info-entities
  "returns: `java.lang.String`"
  (^java.lang.String [^RenderGlobal this]
    (-> this (.getDebugInfoEntities))))

(defn has-no-chunk-updates?
  "returns: `boolean`"
  (^Boolean [^RenderGlobal this]
    (-> this (.hasNoChunkUpdates))))

(defn on-entity-removed
  "entity-in - `net.minecraft.entity.Entity`"
  ([^RenderGlobal this ^net.minecraft.entity.Entity entity-in]
    (-> this (.onEntityRemoved entity-in))))

(defn render-clouds
  "partial-ticks - `float`
  pass - `int`
  p-180447-3 - `double`
  p-180447-5 - `double`
  p-180447-7 - `double`"
  ([^RenderGlobal this ^Float partial-ticks ^Integer pass ^Double p-180447-3 ^Double p-180447-5 ^Double p-180447-7]
    (-> this (.renderClouds partial-ticks pass p-180447-3 p-180447-5 p-180447-7))))

(defn update-clouds
  ""
  ([^RenderGlobal this]
    (-> this (.updateClouds))))

(defn update-chunks
  "finish-time-nano - `long`"
  ([^RenderGlobal this ^Long finish-time-nano]
    (-> this (.updateChunks finish-time-nano))))

(defn draw-selection-box
  "player - `net.minecraft.entity.player.EntityPlayer`
  moving-object-position-in - `net.minecraft.util.math.RayTraceResult`
  execute - `int`
  partial-ticks - `float`"
  ([^RenderGlobal this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.RayTraceResult moving-object-position-in ^Integer execute ^Float partial-ticks]
    (-> this (.drawSelectionBox player moving-object-position-in execute partial-ticks))))

(defn notify-block-update
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  old-state - `net.minecraft.block.state.IBlockState`
  new-state - `net.minecraft.block.state.IBlockState`
  flags - `int`"
  ([^RenderGlobal this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState old-state ^net.minecraft.block.state.IBlockState new-state ^Integer flags]
    (-> this (.notifyBlockUpdate world-in pos old-state new-state flags))))

(defn setup-terrain
  "view-entity - `net.minecraft.entity.Entity`
  partial-ticks - `double`
  camera - `net.minecraft.client.renderer.culling.ICamera`
  frame-count - `int`
  player-spectator - `boolean`"
  ([^RenderGlobal this ^net.minecraft.entity.Entity view-entity ^Double partial-ticks ^net.minecraft.client.renderer.culling.ICamera camera ^Integer frame-count ^Boolean player-spectator]
    (-> this (.setupTerrain view-entity partial-ticks camera frame-count player-spectator))))

(defn spawn-particle
  "p-190570-1 - `int`
  p-190570-2 - `boolean`
  p-190570-3 - `boolean`
  p-190570-4 - `double`
  p-190570-6 - `double`
  p-190570-8 - `double`
  p-190570-10 - `double`
  p-190570-12 - `double`
  p-190570-14 - `double`
  p-190570-16 - `int`"
  ([^RenderGlobal this ^Integer p-190570-1 ^Boolean p-190570-2 ^Boolean p-190570-3 ^Double p-190570-4 ^Double p-190570-6 ^Double p-190570-8 ^Double p-190570-10 ^Double p-190570-12 ^Double p-190570-14 ^Integer p-190570-16]
    (-> this (.spawnParticle p-190570-1 p-190570-2 p-190570-3 p-190570-4 p-190570-6 p-190570-8 p-190570-10 p-190570-12 p-190570-14 p-190570-16)))
  ([^RenderGlobal this ^Integer particle-id ^Boolean ignore-range ^Double x-coord ^Double y-coord ^Double z-coord ^Double x-speed ^Double y-speed ^Double z-speed ^Integer parameters]
    (-> this (.spawnParticle particle-id ignore-range x-coord y-coord z-coord x-speed y-speed z-speed parameters))))

(defn update-tile-entities
  "tile-entities-to-remove - `java.util.Collection`
  tile-entities-to-add - `java.util.Collection`"
  ([^RenderGlobal this ^java.util.Collection tile-entities-to-remove ^java.util.Collection tile-entities-to-add]
    (-> this (.updateTileEntities tile-entities-to-remove tile-entities-to-add))))

(defn load-renderers
  ""
  ([^RenderGlobal this]
    (-> this (.loadRenderers))))

(defn render-block-layer
  "block-layer-in - `net.minecraft.util.BlockRenderLayer`
  partial-ticks - `double`
  pass - `int`
  entity-in - `net.minecraft.entity.Entity`

  returns: `int`"
  (^Integer [^RenderGlobal this ^net.minecraft.util.BlockRenderLayer block-layer-in ^Double partial-ticks ^Integer pass ^net.minecraft.entity.Entity entity-in]
    (-> this (.renderBlockLayer block-layer-in partial-ticks pass entity-in))))

(defn delete-all-display-lists
  ""
  ([^RenderGlobal this]
    (-> this (.deleteAllDisplayLists))))

(defn create-bind-entity-outline-fbs
  "width - `int`
  height - `int`"
  ([^RenderGlobal this ^Integer width ^Integer height]
    (-> this (.createBindEntityOutlineFbs width height))))

