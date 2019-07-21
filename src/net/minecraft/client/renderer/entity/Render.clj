(ns net.minecraft.client.renderer.entity.Render
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity Render]))

(defn *render-offset-aabb
  "bounding-box - `net.minecraft.util.math.AxisAlignedBB`
  x - `double`
  y - `double`
  z - `double`"
  ([^net.minecraft.util.math.AxisAlignedBB bounding-box ^Double x ^Double y ^Double z]
    (Render/renderOffsetAABB bounding-box x y z)))

(defn get-font-renderer-from-render-manager
  "returns: `net.minecraft.client.gui.FontRenderer`"
  (^net.minecraft.client.gui.FontRenderer [^Render this]
    (-> this (.getFontRendererFromRenderManager))))

(defn set-render-outlines
  "render-outlines-in - `boolean`"
  ([^Render this ^Boolean render-outlines-in]
    (-> this (.setRenderOutlines render-outlines-in))))

(defn should-render?
  "living-entity - `T`
  camera - `net.minecraft.client.renderer.culling.ICamera`
  cam-x - `double`
  cam-y - `double`
  cam-z - `double`

  returns: `boolean`"
  (^Boolean [^Render this living-entity ^net.minecraft.client.renderer.culling.ICamera camera ^Double cam-x ^Double cam-y ^Double cam-z]
    (-> this (.shouldRender living-entity camera cam-x cam-y cam-z))))

(defn multipass?
  "returns: `boolean`"
  (^Boolean [^Render this]
    (-> this (.isMultipass))))

(defn do-render-shadow-and-fire
  "entity-in - `net.minecraft.entity.Entity`
  x - `double`
  y - `double`
  z - `double`
  yaw - `float`
  partial-ticks - `float`"
  ([^Render this ^net.minecraft.entity.Entity entity-in ^Double x ^Double y ^Double z ^Float yaw ^Float partial-ticks]
    (-> this (.doRenderShadowAndFire entity-in x y z yaw partial-ticks))))

(defn do-render
  "entity - `T`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^Render this entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

(defn bind-texture
  "location - `net.minecraft.util.ResourceLocation`"
  ([^Render this ^net.minecraft.util.ResourceLocation location]
    (-> this (.bindTexture location))))

(defn render-multipass
  "p-188300-1 - `T`
  p-188300-2 - `double`
  p-188300-4 - `double`
  p-188300-6 - `double`
  p-188300-8 - `float`
  p-188300-9 - `float`"
  ([^Render this p-188300-1 ^Double p-188300-2 ^Double p-188300-4 ^Double p-188300-6 ^Float p-188300-8 ^Float p-188300-9]
    (-> this (.renderMultipass p-188300-1 p-188300-2 p-188300-4 p-188300-6 p-188300-8 p-188300-9))))

(defn get-render-manager
  "returns: `net.minecraft.client.renderer.entity.RenderManager`"
  (^net.minecraft.client.renderer.entity.RenderManager [^Render this]
    (-> this (.getRenderManager))))

