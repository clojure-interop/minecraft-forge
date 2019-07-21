(ns net.minecraft.client.renderer.entity.RenderManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderManager]))

(defn ->render-manager
  "Constructor.

  render-engine-in - `net.minecraft.client.renderer.texture.TextureManager`
  item-renderer-in - `net.minecraft.client.renderer.RenderItem`"
  (^RenderManager [^net.minecraft.client.renderer.texture.TextureManager render-engine-in ^net.minecraft.client.renderer.RenderItem item-renderer-in]
    (new RenderManager render-engine-in item-renderer-in)))

(defn entity-render-map
  "Instance Constant.

  type: java.util.Map<java.lang.Class<? extends net.minecraft.entity.Entity>,net.minecraft.client.renderer.entity.Render<? extends net.minecraft.entity.Entity>>"
  ([^RenderManager this]
    (-> this .-entityRenderMap)))

(defn render-engine
  "Instance Field.

  type: net.minecraft.client.renderer.texture.TextureManager"
  (^net.minecraft.client.renderer.texture.TextureManager [^RenderManager this]
    (-> this .-renderEngine)))

(defn world
  "Instance Field.

  type: net.minecraft.world.World"
  (^net.minecraft.world.World [^RenderManager this]
    (-> this .-world)))

(defn render-view-entity
  "Instance Field.

  type: net.minecraft.entity.Entity"
  (^net.minecraft.entity.Entity [^RenderManager this]
    (-> this .-renderViewEntity)))

(defn pointed-entity
  "Instance Field.

  type: net.minecraft.entity.Entity"
  (^net.minecraft.entity.Entity [^RenderManager this]
    (-> this .-pointedEntity)))

(defn player-view-y
  "Instance Field.

  type: float"
  (^Float [^RenderManager this]
    (-> this .-playerViewY)))

(defn player-view-x
  "Instance Field.

  type: float"
  (^Float [^RenderManager this]
    (-> this .-playerViewX)))

(defn options
  "Instance Field.

  type: net.minecraft.client.settings.GameSettings"
  (^net.minecraft.client.settings.GameSettings [^RenderManager this]
    (-> this .-options)))

(defn viewer-pos-x
  "Instance Field.

  type: double"
  (^Double [^RenderManager this]
    (-> this .-viewerPosX)))

(defn viewer-pos-y
  "Instance Field.

  type: double"
  (^Double [^RenderManager this]
    (-> this .-viewerPosY)))

(defn viewer-pos-z
  "Instance Field.

  type: double"
  (^Double [^RenderManager this]
    (-> this .-viewerPosZ)))

(defn set-debug-bounding-box
  "debug-bounding-box-in - `boolean`"
  ([^RenderManager this ^Boolean debug-bounding-box-in]
    (-> this (.setDebugBoundingBox debug-bounding-box-in))))

(defn render-multipass?
  "p-188390-1 - `net.minecraft.entity.Entity`

  returns: `boolean`"
  (^Boolean [^RenderManager this ^net.minecraft.entity.Entity p-188390-1]
    (-> this (.isRenderMultipass p-188390-1))))

(defn set-world
  "world-in - `net.minecraft.world.World`"
  ([^RenderManager this ^net.minecraft.world.World world-in]
    (-> this (.setWorld world-in))))

(defn render-shadow?
  "returns: `boolean`"
  (^Boolean [^RenderManager this]
    (-> this (.isRenderShadow))))

(defn get-distance-to-camera
  "x - `double`
  y - `double`
  z - `double`

  returns: `double`"
  (^Double [^RenderManager this ^Double x ^Double y ^Double z]
    (-> this (.getDistanceToCamera x y z))))

(defn set-render-outlines
  "render-outlines-in - `boolean`"
  ([^RenderManager this ^Boolean render-outlines-in]
    (-> this (.setRenderOutlines render-outlines-in))))

(defn set-render-position
  "render-pos-x-in - `double`
  render-pos-y-in - `double`
  render-pos-z-in - `double`"
  ([^RenderManager this ^Double render-pos-x-in ^Double render-pos-y-in ^Double render-pos-z-in]
    (-> this (.setRenderPosition render-pos-x-in render-pos-y-in render-pos-z-in))))

(defn should-render?
  "entity-in - `net.minecraft.entity.Entity`
  camera - `net.minecraft.client.renderer.culling.ICamera`
  cam-x - `double`
  cam-y - `double`
  cam-z - `double`

  returns: `boolean`"
  (^Boolean [^RenderManager this ^net.minecraft.entity.Entity entity-in ^net.minecraft.client.renderer.culling.ICamera camera ^Double cam-x ^Double cam-y ^Double cam-z]
    (-> this (.shouldRender entity-in camera cam-x cam-y cam-z))))

(defn get-entity-render-object
  "entity-in - `T`

  returns: `<T extends net.minecraft.entity.Entity> net.minecraft.client.renderer.entity.Render<T>`"
  ([^RenderManager this entity-in]
    (-> this (.getEntityRenderObject entity-in))))

(defn set-player-view-y
  "player-view-y-in - `float`"
  ([^RenderManager this ^Float player-view-y-in]
    (-> this (.setPlayerViewY player-view-y-in))))

(defn debug-bounding-box?
  "returns: `boolean`"
  (^Boolean [^RenderManager this]
    (-> this (.isDebugBoundingBox))))

(defn get-skin-map
  "returns: `java.util.Map<java.lang.String,net.minecraft.client.renderer.entity.RenderPlayer>`"
  (^java.util.Map [^RenderManager this]
    (-> this (.getSkinMap))))

(defn render-entity-static
  "entity-in - `net.minecraft.entity.Entity`
  partial-ticks - `float`
  p-188388-3 - `boolean`"
  ([^RenderManager this ^net.minecraft.entity.Entity entity-in ^Float partial-ticks ^Boolean p-188388-3]
    (-> this (.renderEntityStatic entity-in partial-ticks p-188388-3))))

(defn cache-active-render-info
  "world-in - `net.minecraft.world.World`
  text-renderer-in - `net.minecraft.client.gui.FontRenderer`
  living-player-in - `net.minecraft.entity.Entity`
  pointed-entity-in - `net.minecraft.entity.Entity`
  options-in - `net.minecraft.client.settings.GameSettings`
  partial-ticks - `float`"
  ([^RenderManager this ^net.minecraft.world.World world-in ^net.minecraft.client.gui.FontRenderer text-renderer-in ^net.minecraft.entity.Entity living-player-in ^net.minecraft.entity.Entity pointed-entity-in ^net.minecraft.client.settings.GameSettings options-in ^Float partial-ticks]
    (-> this (.cacheActiveRenderInfo world-in text-renderer-in living-player-in pointed-entity-in options-in partial-ticks))))

(defn get-entity-class-render-object
  "entity-class - `java.lang.Class`

  returns: `<T extends net.minecraft.entity.Entity> net.minecraft.client.renderer.entity.Render<T>`"
  ([^RenderManager this ^java.lang.Class entity-class]
    (-> this (.getEntityClassRenderObject entity-class))))

(defn set-render-shadow
  "render-shadow-in - `boolean`"
  ([^RenderManager this ^Boolean render-shadow-in]
    (-> this (.setRenderShadow render-shadow-in))))

(defn get-font-renderer
  "returns: `net.minecraft.client.gui.FontRenderer`"
  (^net.minecraft.client.gui.FontRenderer [^RenderManager this]
    (-> this (.getFontRenderer))))

(defn render-multipass
  "p-188389-1 - `net.minecraft.entity.Entity`
  p-188389-2 - `float`"
  ([^RenderManager this ^net.minecraft.entity.Entity p-188389-1 ^Float p-188389-2]
    (-> this (.renderMultipass p-188389-1 p-188389-2))))

(defn do-render-entity
  "entity-in - `net.minecraft.entity.Entity`
  x - `double`
  y - `double`
  z - `double`
  yaw - `float`
  partial-ticks - `float`
  p-188391-10 - `boolean`"
  ([^RenderManager this ^net.minecraft.entity.Entity entity-in ^Double x ^Double y ^Double z ^Float yaw ^Float partial-ticks ^Boolean p-188391-10]
    (-> this (.doRenderEntity entity-in x y z yaw partial-ticks p-188391-10))))

