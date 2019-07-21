(ns net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity TileEntityRendererDispatcher]))

(defn map-special-renderers
  "Instance Constant.

  type: java.util.Map<java.lang.Class<? extends net.minecraft.tileentity.TileEntity>,net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer<? extends net.minecraft.tileentity.TileEntity>>"
  ([^TileEntityRendererDispatcher this]
    (-> this .-mapSpecialRenderers)))

(defn *-instance
  "Static Field.

  type: net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher"
  []
  TileEntityRendererDispatcher/instance)

(defn *-static-player-x
  "Static Field.

  type: double"
  []
  TileEntityRendererDispatcher/staticPlayerX)

(defn *-static-player-y
  "Static Field.

  type: double"
  []
  TileEntityRendererDispatcher/staticPlayerY)

(defn *-static-player-z
  "Static Field.

  type: double"
  []
  TileEntityRendererDispatcher/staticPlayerZ)

(defn render-engine
  "Instance Field.

  type: net.minecraft.client.renderer.texture.TextureManager"
  (^net.minecraft.client.renderer.texture.TextureManager [^TileEntityRendererDispatcher this]
    (-> this .-renderEngine)))

(defn world
  "Instance Field.

  type: net.minecraft.world.World"
  (^net.minecraft.world.World [^TileEntityRendererDispatcher this]
    (-> this .-world)))

(defn entity
  "Instance Field.

  type: net.minecraft.entity.Entity"
  (^net.minecraft.entity.Entity [^TileEntityRendererDispatcher this]
    (-> this .-entity)))

(defn entity-yaw
  "Instance Field.

  type: float"
  (^Float [^TileEntityRendererDispatcher this]
    (-> this .-entityYaw)))

(defn entity-pitch
  "Instance Field.

  type: float"
  (^Float [^TileEntityRendererDispatcher this]
    (-> this .-entityPitch)))

(defn camera-hit-result
  "Instance Field.

  type: net.minecraft.util.math.RayTraceResult"
  (^net.minecraft.util.math.RayTraceResult [^TileEntityRendererDispatcher this]
    (-> this .-cameraHitResult)))

(defn entity-x
  "Instance Field.

  type: double"
  (^Double [^TileEntityRendererDispatcher this]
    (-> this .-entityX)))

(defn entity-y
  "Instance Field.

  type: double"
  (^Double [^TileEntityRendererDispatcher this]
    (-> this .-entityY)))

(defn entity-z
  "Instance Field.

  type: double"
  (^Double [^TileEntityRendererDispatcher this]
    (-> this .-entityZ)))

(defn set-world
  "world-in - `net.minecraft.world.World`"
  ([^TileEntityRendererDispatcher this ^net.minecraft.world.World world-in]
    (-> this (.setWorld world-in))))

(defn get-special-renderer-by-class
  "te-class - `java.lang.Class`

  returns: `<T extends net.minecraft.tileentity.TileEntity> net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer<T>`"
  ([^TileEntityRendererDispatcher this ^java.lang.Class te-class]
    (-> this (.getSpecialRendererByClass te-class))))

(defn render-tile-entity-at
  "tile-entity-in - `net.minecraft.tileentity.TileEntity`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  destroy-stage - `int`"
  ([^TileEntityRendererDispatcher this ^net.minecraft.tileentity.TileEntity tile-entity-in ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer destroy-stage]
    (-> this (.renderTileEntityAt tile-entity-in x y z partial-ticks destroy-stage)))
  ([^TileEntityRendererDispatcher this ^net.minecraft.tileentity.TileEntity tile-entity-in ^Double x ^Double y ^Double z ^Float partial-ticks]
    (-> this (.renderTileEntityAt tile-entity-in x y z partial-ticks))))

(defn render-tile-entity
  "tileentity-in - `net.minecraft.tileentity.TileEntity`
  partial-ticks - `float`
  destroy-stage - `int`"
  ([^TileEntityRendererDispatcher this ^net.minecraft.tileentity.TileEntity tileentity-in ^Float partial-ticks ^Integer destroy-stage]
    (-> this (.renderTileEntity tileentity-in partial-ticks destroy-stage))))

(defn get-special-renderer
  "tile-entity-in - `net.minecraft.tileentity.TileEntity`

  returns: `<T extends net.minecraft.tileentity.TileEntity> net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer<T>`"
  ([^TileEntityRendererDispatcher this ^net.minecraft.tileentity.TileEntity tile-entity-in]
    (-> this (.getSpecialRenderer tile-entity-in))))

(defn prepare
  "world-in - `net.minecraft.world.World`
  render-engine-in - `net.minecraft.client.renderer.texture.TextureManager`
  font-renderer-in - `net.minecraft.client.gui.FontRenderer`
  entity-in - `net.minecraft.entity.Entity`
  camera-hit-result-in - `net.minecraft.util.math.RayTraceResult`
  p-190056-6 - `float`"
  ([^TileEntityRendererDispatcher this ^net.minecraft.world.World world-in ^net.minecraft.client.renderer.texture.TextureManager render-engine-in ^net.minecraft.client.gui.FontRenderer font-renderer-in ^net.minecraft.entity.Entity entity-in ^net.minecraft.util.math.RayTraceResult camera-hit-result-in ^Float p-190056-6]
    (-> this (.prepare world-in render-engine-in font-renderer-in entity-in camera-hit-result-in p-190056-6))))

(defn draw-batch
  "Render all TESRs batched so far.
   You probably shouldn't call this manually.

  pass - `int`"
  ([^TileEntityRendererDispatcher this ^Integer pass]
    (-> this (.drawBatch pass))))

(defn get-font-renderer
  "returns: `net.minecraft.client.gui.FontRenderer`"
  (^net.minecraft.client.gui.FontRenderer [^TileEntityRendererDispatcher this]
    (-> this (.getFontRenderer))))

(defn pre-draw-batch
  "Prepare for a batched TESR rendering.
   You probably shouldn't call this manually."
  ([^TileEntityRendererDispatcher this]
    (-> this (.preDrawBatch))))

