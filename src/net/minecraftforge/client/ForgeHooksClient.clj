(ns net.minecraftforge.client.ForgeHooksClient
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client ForgeHooksClient]))

(defn ->forge-hooks-client
  "Constructor."
  (^ForgeHooksClient []
    (new ForgeHooksClient )))

(defn *render-specific-first-person-hand
  "hand - `net.minecraft.util.EnumHand`
  partial-ticks - `float`
  interp-pitch - `float`
  swing-progress - `float`
  equip-progress - `float`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.util.EnumHand hand ^Float partial-ticks ^Float interp-pitch ^Float swing-progress ^Float equip-progress ^net.minecraft.item.ItemStack stack]
    (ForgeHooksClient/renderSpecificFirstPersonHand hand partial-ticks interp-pitch swing-progress equip-progress stack)))

(defn *on-draw-block-highlight
  "context - `net.minecraft.client.renderer.RenderGlobal`
  player - `net.minecraft.entity.player.EntityPlayer`
  target - `net.minecraft.util.math.RayTraceResult`
  sub-id - `int`
  partial-ticks - `float`

  returns: `boolean`"
  (^Boolean [^net.minecraft.client.renderer.RenderGlobal context ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.RayTraceResult target ^Integer sub-id ^Float partial-ticks]
    (ForgeHooksClient/onDrawBlockHighlight context player target sub-id partial-ticks)))

(defn *get-offset-fov
  "entity - `net.minecraft.entity.player.EntityPlayer`
  fov - `float`

  returns: `float`"
  (^Float [^net.minecraft.entity.player.EntityPlayer entity ^Float fov]
    (ForgeHooksClient/getOffsetFOV entity fov)))

(defn *get-sky-blend-colour
  "world - `net.minecraft.world.World`
  center - `net.minecraft.util.math.BlockPos`

  returns: `int`"
  (^Integer [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos center]
    (ForgeHooksClient/getSkyBlendColour world center)))

(defn *draw-screen
  "screen - `net.minecraft.client.gui.GuiScreen`
  mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^net.minecraft.client.gui.GuiScreen screen ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (ForgeHooksClient/drawScreen screen mouse-x mouse-y partial-ticks)))

(defn *orient-bed-camera
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  entity - `net.minecraft.entity.Entity`"
  ([^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.entity.Entity entity]
    (ForgeHooksClient/orientBedCamera world pos state entity)))

(defn *load-entity-shader
  "entity - `net.minecraft.entity.Entity`
  entity-renderer - `net.minecraft.client.renderer.EntityRenderer`"
  ([^net.minecraft.entity.Entity entity ^net.minecraft.client.renderer.EntityRenderer entity-renderer]
    (ForgeHooksClient/loadEntityShader entity entity-renderer)))

(defn *on-fog-render
  "renderer - `net.minecraft.client.renderer.EntityRenderer`
  entity - `net.minecraft.entity.Entity`
  state - `net.minecraft.block.state.IBlockState`
  partial - `float`
  mode - `int`
  distance - `float`"
  ([^net.minecraft.client.renderer.EntityRenderer renderer ^net.minecraft.entity.Entity entity ^net.minecraft.block.state.IBlockState state ^Float partial ^Integer mode ^Float distance]
    (ForgeHooksClient/onFogRender renderer entity state partial mode distance)))

(defn *handle-camera-transforms
  "model - `net.minecraft.client.renderer.block.model.IBakedModel`
  camera-transform-type - `net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType`
  left-hand-hackery - `boolean`

  returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^net.minecraft.client.renderer.block.model.IBakedModel model ^net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType camera-transform-type ^Boolean left-hand-hackery]
    (ForgeHooksClient/handleCameraTransforms model camera-transform-type left-hand-hackery)))

(defn *should-cause-block-break-reset?
  "from - `net.minecraft.item.ItemStack`
  to - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack from ^net.minecraft.item.ItemStack to]
    (ForgeHooksClient/shouldCauseBlockBreakReset from to)))

(defn *get-armor-texture
  "entity - `net.minecraft.entity.Entity`
  armor - `net.minecraft.item.ItemStack`
  default - `java.lang.String`
  slot - `net.minecraft.inventory.EntityEquipmentSlot`
  type - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraft.entity.Entity entity ^net.minecraft.item.ItemStack armor ^java.lang.String default ^net.minecraft.inventory.EntityEquipmentSlot slot ^java.lang.String type]
    (ForgeHooksClient/getArmorTexture entity armor default slot type)))

(defn *post-mouse-event
  "returns: `boolean`"
  (^Boolean []
    (ForgeHooksClient/postMouseEvent )))

(defn *get-world-render-pass
  "returns: `int`"
  (^Integer []
    (ForgeHooksClient/getWorldRenderPass )))

(defn *transform
  "vec - `org.lwjgl.util.vector.Vector3f`
  m - `javax.vecmath.Matrix4f`"
  ([^org.lwjgl.util.vector.Vector3f vec ^javax.vecmath.Matrix4f m]
    (ForgeHooksClient/transform vec m)))

(defn *boss-bar-render-pre
  "res - `net.minecraft.client.gui.ScaledResolution`
  boss-info - `net.minecraft.world.BossInfoLerping`
  x - `int`
  y - `int`
  increment - `int`

  returns: `net.minecraftforge.client.event.RenderGameOverlayEvent$BossInfo`"
  (^net.minecraftforge.client.event.RenderGameOverlayEvent$BossInfo [^net.minecraft.client.gui.ScaledResolution res ^net.minecraft.world.BossInfoLerping boss-info ^Integer x ^Integer y ^Integer increment]
    (ForgeHooksClient/bossBarRenderPre res boss-info x y increment)))

(defn *render-tile-item
  "item - `net.minecraft.item.Item`
  metadata - `int`"
  ([^net.minecraft.item.Item item ^Integer metadata]
    (ForgeHooksClient/renderTileItem item metadata)))

(defn *on-model-bake
  "model-manager - `net.minecraft.client.renderer.block.model.ModelManager`
  model-registry - `net.minecraft.util.registry.IRegistry`
  model-loader - `net.minecraftforge.client.model.ModelLoader`"
  ([^net.minecraft.client.renderer.block.model.ModelManager model-manager ^net.minecraft.util.registry.IRegistry model-registry ^net.minecraftforge.client.model.ModelLoader model-loader]
    (ForgeHooksClient/onModelBake model-manager model-registry model-loader)))

(defn *boss-bar-render-post
  "res - `net.minecraft.client.gui.ScaledResolution`"
  ([^net.minecraft.client.gui.ScaledResolution res]
    (ForgeHooksClient/bossBarRenderPost res)))

(defn *render-first-person-hand
  "context - `net.minecraft.client.renderer.RenderGlobal`
  partial-ticks - `float`
  render-pass - `int`

  returns: `boolean`"
  (^Boolean [^net.minecraft.client.renderer.RenderGlobal context ^Float partial-ticks ^Integer render-pass]
    (ForgeHooksClient/renderFirstPersonHand context partial-ticks render-pass)))

(defn *put-quad-color
  "renderer - `net.minecraft.client.renderer.VertexBuffer`
  quad - `net.minecraft.client.renderer.block.model.BakedQuad`
  color - `int`"
  ([^net.minecraft.client.renderer.VertexBuffer renderer ^net.minecraft.client.renderer.block.model.BakedQuad quad ^Integer color]
    (ForgeHooksClient/putQuadColor renderer quad color)))

(defn *get-fov-modifier
  "renderer - `net.minecraft.client.renderer.EntityRenderer`
  entity - `net.minecraft.entity.Entity`
  state - `net.minecraft.block.state.IBlockState`
  render-partial-ticks - `double`
  fov - `float`

  returns: `float`"
  (^Float [^net.minecraft.client.renderer.EntityRenderer renderer ^net.minecraft.entity.Entity entity ^net.minecraft.block.state.IBlockState state ^Double render-partial-ticks ^Float fov]
    (ForgeHooksClient/getFOVModifier renderer entity state render-partial-ticks fov)))

(defn *on-screenshot
  "image - `java.awt.image.BufferedImage`
  screenshot-file - `java.io.File`

  returns: `net.minecraftforge.client.event.ScreenshotEvent`"
  (^net.minecraftforge.client.event.ScreenshotEvent [^java.awt.image.BufferedImage image ^java.io.File screenshot-file]
    (ForgeHooksClient/onScreenshot image screenshot-file)))

(defn *get-fog-density
  "renderer - `net.minecraft.client.renderer.EntityRenderer`
  entity - `net.minecraft.entity.Entity`
  state - `net.minecraft.block.state.IBlockState`
  partial - `float`
  density - `float`

  returns: `float`"
  (^Float [^net.minecraft.client.renderer.EntityRenderer renderer ^net.minecraft.entity.Entity entity ^net.minecraft.block.state.IBlockState state ^Float partial ^Float density]
    (ForgeHooksClient/getFogDensity renderer entity state partial density)))

(defn *post-draw
  "attr-type - `net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage`
  format - `net.minecraft.client.renderer.vertex.VertexFormat`
  element - `int`
  stride - `int`
  buffer - `java.nio.ByteBuffer`"
  ([^net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage attr-type ^net.minecraft.client.renderer.vertex.VertexFormat format ^Integer element ^Integer stride ^java.nio.ByteBuffer buffer]
    (ForgeHooksClient/postDraw attr-type format element stride buffer)))

(defn *set-render-pass
  "pass - `int`"
  ([^Integer pass]
    (ForgeHooksClient/setRenderPass pass)))

(defn *get-armor-model
  "entity-living - `net.minecraft.entity.EntityLivingBase`
  item-stack - `net.minecraft.item.ItemStack`
  slot - `net.minecraft.inventory.EntityEquipmentSlot`
  default - `net.minecraft.client.model.ModelBiped`

  returns: `net.minecraft.client.model.ModelBiped`"
  (^net.minecraft.client.model.ModelBiped [^net.minecraft.entity.EntityLivingBase entity-living ^net.minecraft.item.ItemStack item-stack ^net.minecraft.inventory.EntityEquipmentSlot slot ^net.minecraft.client.model.ModelBiped default]
    (ForgeHooksClient/getArmorModel entity-living item-stack slot default)))

(defn *get-damage-model
  "ibakedmodel - `net.minecraft.client.renderer.block.model.IBakedModel`
  texture - `net.minecraft.client.renderer.texture.TextureAtlasSprite`
  state - `net.minecraft.block.state.IBlockState`
  world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.client.renderer.block.model.IBakedModel`"
  (^net.minecraft.client.renderer.block.model.IBakedModel [^net.minecraft.client.renderer.block.model.IBakedModel ibakedmodel ^net.minecraft.client.renderer.texture.TextureAtlasSprite texture ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (ForgeHooksClient/getDamageModel ibakedmodel texture state world pos)))

(defn *on-texture-stitched-post
  "map - `net.minecraft.client.renderer.texture.TextureMap`"
  ([^net.minecraft.client.renderer.texture.TextureMap map]
    (ForgeHooksClient/onTextureStitchedPost map)))

(defn *dispatch-render-last
  "context - `net.minecraft.client.renderer.RenderGlobal`
  partial-ticks - `float`"
  ([^net.minecraft.client.renderer.RenderGlobal context ^Float partial-ticks]
    (ForgeHooksClient/dispatchRenderLast context partial-ticks)))

(defn *set-render-layer
  "layer - `net.minecraft.util.BlockRenderLayer`"
  ([^net.minecraft.util.BlockRenderLayer layer]
    (ForgeHooksClient/setRenderLayer layer)))

(defn *should-cause-reequip-animation?
  "from - `net.minecraft.item.ItemStack`
  to - `net.minecraft.item.ItemStack`
  slot - `int`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack from ^net.minecraft.item.ItemStack to ^Integer slot]
    (ForgeHooksClient/shouldCauseReequipAnimation from to slot)))

(defn *apply-transform
  "transform - `net.minecraft.client.renderer.block.model.ItemTransformVec3f`
  part - `com.google.common.base.Optional`

  returns: `com.google.common.base.Optional<net.minecraftforge.common.model.TRSRTransformation>`"
  (^com.google.common.base.Optional [^net.minecraft.client.renderer.block.model.ItemTransformVec3f transform ^com.google.common.base.Optional part]
    (ForgeHooksClient/applyTransform transform part)))

(defn *multiply-current-gl-matrix
  "matrix - `javax.vecmath.Matrix4f`"
  ([^javax.vecmath.Matrix4f matrix]
    (ForgeHooksClient/multiplyCurrentGlMatrix matrix)))

(defn *play-sound
  "manager - `net.minecraft.client.audio.SoundManager`
  sound - `net.minecraft.client.audio.ISound`

  returns: `net.minecraft.client.audio.ISound`"
  (^net.minecraft.client.audio.ISound [^net.minecraft.client.audio.SoundManager manager ^net.minecraft.client.audio.ISound sound]
    (ForgeHooksClient/playSound manager sound)))

(defn *register-tesr-item-stack
  "Deprecated. Will be removed as soon as possible, hopefully 1.9.

  item - `net.minecraft.item.Item`
  metadata - `int`
  tile-class - `java.lang.Class`"
  ([^net.minecraft.item.Item item ^Integer metadata ^java.lang.Class tile-class]
    (ForgeHooksClient/registerTESRItemStack item metadata tile-class)))

(defn *pre-draw
  "attr-type - `net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage`
  format - `net.minecraft.client.renderer.vertex.VertexFormat`
  element - `int`
  stride - `int`
  buffer - `java.nio.ByteBuffer`"
  ([^net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage attr-type ^net.minecraft.client.renderer.vertex.VertexFormat format ^Integer element ^Integer stride ^java.nio.ByteBuffer buffer]
    (ForgeHooksClient/preDraw attr-type format element stride buffer)))

(defn *get-matrix
  "transform - `net.minecraft.client.renderer.block.model.ItemTransformVec3f`

  returns: `javax.vecmath.Matrix4f`"
  (^javax.vecmath.Matrix4f [^net.minecraft.client.renderer.block.model.ItemTransformVec3f transform]
    (ForgeHooksClient/getMatrix transform)))

(defn *on-texture-stitched-pre
  "map - `net.minecraft.client.renderer.texture.TextureMap`"
  ([^net.minecraft.client.renderer.texture.TextureMap map]
    (ForgeHooksClient/onTextureStitchedPre map)))

(defn *fix-domain
  "base - `java.lang.String`
  complex - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String base ^java.lang.String complex]
    (ForgeHooksClient/fixDomain base complex)))

(defn *fill-normal
  "internal, relies on fixed format of FaceBakery

  face-data - `int[]`
  facing - `net.minecraft.util.EnumFacing`"
  ([face-data ^net.minecraft.util.EnumFacing facing]
    (ForgeHooksClient/fillNormal face-data facing)))

(defn *render-main-menu
  "gui - `net.minecraft.client.gui.GuiMainMenu`
  font - `net.minecraft.client.gui.FontRenderer`
  width - `int`
  height - `int`
  splash-text - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraft.client.gui.GuiMainMenu gui ^net.minecraft.client.gui.FontRenderer font ^Integer width ^Integer height ^java.lang.String splash-text]
    (ForgeHooksClient/renderMainMenu gui font width height splash-text)))

(defn *apply-uv-lock
  "block-face-uv - `net.minecraft.client.renderer.block.model.BlockFaceUV`
  original-side - `net.minecraft.util.EnumFacing`
  rotation - `net.minecraftforge.common.model.ITransformation`

  returns: `net.minecraft.client.renderer.block.model.BlockFaceUV`"
  (^net.minecraft.client.renderer.block.model.BlockFaceUV [^net.minecraft.client.renderer.block.model.BlockFaceUV block-face-uv ^net.minecraft.util.EnumFacing original-side ^net.minecraftforge.common.model.ITransformation rotation]
    (ForgeHooksClient/applyUVLock block-face-uv original-side rotation)))

(defn *main-menu-mouse-click
  "mouse-x - `int`
  mouse-y - `int`
  mouse-button - `int`
  font - `net.minecraft.client.gui.FontRenderer`
  width - `int`"
  ([^Integer mouse-x ^Integer mouse-y ^Integer mouse-button ^net.minecraft.client.gui.FontRenderer font ^Integer width]
    (ForgeHooksClient/mainMenuMouseClick mouse-x mouse-y mouse-button font width)))

