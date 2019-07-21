(ns net.minecraft.client.particle.Particle
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle Particle]))

(defn ->particle
  "Constructor.

  world-in - `net.minecraft.world.World`
  x-coord-in - `double`
  y-coord-in - `double`
  z-coord-in - `double`
  x-speed-in - `double`
  y-speed-in - `double`
  z-speed-in - `double`"
  (^Particle [^net.minecraft.world.World world-in ^Double x-coord-in ^Double y-coord-in ^Double z-coord-in ^Double x-speed-in ^Double y-speed-in ^Double z-speed-in]
    (new Particle world-in x-coord-in y-coord-in z-coord-in x-speed-in y-speed-in z-speed-in)))

(defn *-interp-pos-x
  "Static Field.

  type: double"
  []
  Particle/interpPosX)

(defn *-interp-pos-y
  "Static Field.

  type: double"
  []
  Particle/interpPosY)

(defn *-interp-pos-z
  "Static Field.

  type: double"
  []
  Particle/interpPosZ)

(defn *-camera-view-dir
  "Static Field.

  type: net.minecraft.util.math.Vec3d"
  []
  Particle/cameraViewDir)

(defn set-bounding-box
  "bb - `net.minecraft.util.math.AxisAlignedBB`"
  ([^Particle this ^net.minecraft.util.math.AxisAlignedBB bb]
    (-> this (.setBoundingBox bb))))

(defn set-position
  "p-187109-1 - `double`
  p-187109-3 - `double`
  p-187109-5 - `double`"
  ([^Particle this ^Double p-187109-1 ^Double p-187109-3 ^Double p-187109-5]
    (-> this (.setPosition p-187109-1 p-187109-3 p-187109-5))))

(defn set-expired
  ""
  ([^Particle this]
    (-> this (.setExpired))))

(defn on-update
  ""
  ([^Particle this]
    (-> this (.onUpdate))))

(defn alive?
  "returns: `boolean`"
  (^Boolean [^Particle this]
    (-> this (.isAlive))))

(defn render-particle
  "buffer - `net.minecraft.client.renderer.VertexBuffer`
  entity-in - `net.minecraft.entity.Entity`
  partial-ticks - `float`
  rotation-x - `float`
  rotation-z - `float`
  rotation-yz - `float`
  rotation-xy - `float`
  rotation-xz - `float`"
  ([^Particle this ^net.minecraft.client.renderer.VertexBuffer buffer ^net.minecraft.entity.Entity entity-in ^Float partial-ticks ^Float rotation-x ^Float rotation-z ^Float rotation-yz ^Float rotation-xy ^Float rotation-xz]
    (-> this (.renderParticle buffer entity-in partial-ticks rotation-x rotation-z rotation-yz rotation-xy rotation-xz))))

(defn set-particle-texture-index
  "particle-texture-index - `int`"
  ([^Particle this ^Integer particle-texture-index]
    (-> this (.setParticleTextureIndex particle-texture-index))))

(defn next-texture-index-x
  ""
  ([^Particle this]
    (-> this (.nextTextureIndexX))))

(defn transparent?
  "returns: `boolean`"
  (^Boolean [^Particle this]
    (-> this (.isTransparent))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Particle this]
    (-> this (.toString))))

(defn get-fx-layer
  "returns: `int`"
  (^Integer [^Particle this]
    (-> this (.getFXLayer))))

(defn get-green-color-f
  "returns: `float`"
  (^Float [^Particle this]
    (-> this (.getGreenColorF))))

(defn get-brightness-for-render
  "p-189214-1 - `float`

  returns: `int`"
  (^Integer [^Particle this ^Float p-189214-1]
    (-> this (.getBrightnessForRender p-189214-1))))

(defn get-blue-color-f
  "returns: `float`"
  (^Float [^Particle this]
    (-> this (.getBlueColorF))))

(defn set-alpha-f
  "alpha - `float`"
  ([^Particle this ^Float alpha]
    (-> this (.setAlphaF alpha))))

(defn move
  "x - `double`
  y - `double`
  z - `double`"
  ([^Particle this ^Double x ^Double y ^Double z]
    (-> this (.move x y z))))

(defn set-rbg-color-f
  "particle-red-in - `float`
  particle-green-in - `float`
  particle-blue-in - `float`"
  ([^Particle this ^Float particle-red-in ^Float particle-green-in ^Float particle-blue-in]
    (-> this (.setRBGColorF particle-red-in particle-green-in particle-blue-in))))

(defn multiple-particle-scale-by
  "scale - `float`

  returns: `net.minecraft.client.particle.Particle`"
  (^net.minecraft.client.particle.Particle [^Particle this ^Float scale]
    (-> this (.multipleParticleScaleBy scale))))

(defn set-particle-texture
  "texture - `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  ([^Particle this ^net.minecraft.client.renderer.texture.TextureAtlasSprite texture]
    (-> this (.setParticleTexture texture))))

(defn multiply-velocity
  "multiplier - `float`

  returns: `net.minecraft.client.particle.Particle`"
  (^net.minecraft.client.particle.Particle [^Particle this ^Float multiplier]
    (-> this (.multiplyVelocity multiplier))))

(defn get-red-color-f
  "returns: `float`"
  (^Float [^Particle this]
    (-> this (.getRedColorF))))

(defn set-max-age
  "p-187114-1 - `int`"
  ([^Particle this ^Integer p-187114-1]
    (-> this (.setMaxAge p-187114-1))))

(defn get-bounding-box
  "returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^Particle this]
    (-> this (.getBoundingBox))))

