(ns net.minecraft.util.math.AxisAlignedBB
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.math AxisAlignedBB]))

(defn ->axis-aligned-bb
  "Constructor.

  x-1 - `double`
  y-1 - `double`
  z-1 - `double`
  x-2 - `double`
  y-2 - `double`
  z-2 - `double`"
  (^AxisAlignedBB [^Double x-1 ^Double y-1 ^Double z-1 ^Double x-2 ^Double y-2 ^Double z-2]
    (new AxisAlignedBB x-1 y-1 z-1 x-2 y-2 z-2))
  (^AxisAlignedBB [^net.minecraft.util.math.BlockPos pos-1 ^net.minecraft.util.math.BlockPos pos-2]
    (new AxisAlignedBB pos-1 pos-2))
  (^AxisAlignedBB [^net.minecraft.util.math.BlockPos pos]
    (new AxisAlignedBB pos)))

(defn min-x
  "Instance Constant.

  type: double"
  (^Double [^AxisAlignedBB this]
    (-> this .-minX)))

(defn min-y
  "Instance Constant.

  type: double"
  (^Double [^AxisAlignedBB this]
    (-> this .-minY)))

(defn min-z
  "Instance Constant.

  type: double"
  (^Double [^AxisAlignedBB this]
    (-> this .-minZ)))

(defn max-x
  "Instance Constant.

  type: double"
  (^Double [^AxisAlignedBB this]
    (-> this .-maxX)))

(defn max-y
  "Instance Constant.

  type: double"
  (^Double [^AxisAlignedBB this]
    (-> this .-maxY)))

(defn max-z
  "Instance Constant.

  type: double"
  (^Double [^AxisAlignedBB this]
    (-> this .-maxZ)))

(defn intersects-with-xz
  "vec - `net.minecraft.util.math.Vec3d`

  returns: `boolean`"
  (^Boolean [^AxisAlignedBB this ^net.minecraft.util.math.Vec3d vec]
    (-> this (.intersectsWithXZ vec))))

(defn offset
  "x - `double`
  y - `double`
  z - `double`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^AxisAlignedBB this ^Double x ^Double y ^Double z]
    (-> this (.offset x y z)))
  (^net.minecraft.util.math.AxisAlignedBB [^AxisAlignedBB this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.offset pos))))

(defn calculate-y-offset
  "other - `net.minecraft.util.math.AxisAlignedBB`
  offset-y - `double`

  returns: `double`"
  (^Double [^AxisAlignedBB this ^net.minecraft.util.math.AxisAlignedBB other ^Double offset-y]
    (-> this (.calculateYOffset other offset-y))))

(defn expand
  "x - `double`
  y - `double`
  z - `double`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^AxisAlignedBB this ^Double x ^Double y ^Double z]
    (-> this (.expand x y z))))

(defn intersect
  "p-191500-1 - `net.minecraft.util.math.AxisAlignedBB`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^AxisAlignedBB this ^net.minecraft.util.math.AxisAlignedBB p-191500-1]
    (-> this (.intersect p-191500-1))))

(defn add-coord
  "x - `double`
  y - `double`
  z - `double`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^AxisAlignedBB this ^Double x ^Double y ^Double z]
    (-> this (.addCoord x y z))))

(defn union
  "other - `net.minecraft.util.math.AxisAlignedBB`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^AxisAlignedBB this ^net.minecraft.util.math.AxisAlignedBB other]
    (-> this (.union other))))

(defn calculate-z-offset
  "other - `net.minecraft.util.math.AxisAlignedBB`
  offset-z - `double`

  returns: `double`"
  (^Double [^AxisAlignedBB this ^net.minecraft.util.math.AxisAlignedBB other ^Double offset-z]
    (-> this (.calculateZOffset other offset-z))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AxisAlignedBB this]
    (-> this (.toString))))

(defn intersects-with-yz
  "vec - `net.minecraft.util.math.Vec3d`

  returns: `boolean`"
  (^Boolean [^AxisAlignedBB this ^net.minecraft.util.math.Vec3d vec]
    (-> this (.intersectsWithYZ vec))))

(defn get-center
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^AxisAlignedBB this]
    (-> this (.getCenter))))

(defn set-max-y
  "y-2 - `double`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^AxisAlignedBB this ^Double y-2]
    (-> this (.setMaxY y-2))))

(defn calculate-intercept
  "vec-a - `net.minecraft.util.math.Vec3d`
  vec-b - `net.minecraft.util.math.Vec3d`

  returns: `net.minecraft.util.math.RayTraceResult`"
  (^net.minecraft.util.math.RayTraceResult [^AxisAlignedBB this ^net.minecraft.util.math.Vec3d vec-a ^net.minecraft.util.math.Vec3d vec-b]
    (-> this (.calculateIntercept vec-a vec-b))))

(defn get-average-edge-length
  "returns: `double`"
  (^Double [^AxisAlignedBB this]
    (-> this (.getAverageEdgeLength))))

(defn move
  "p-191194-1 - `net.minecraft.util.math.Vec3d`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^AxisAlignedBB this ^net.minecraft.util.math.Vec3d p-191194-1]
    (-> this (.move p-191194-1))))

(defn calculate-x-offset
  "other - `net.minecraft.util.math.AxisAlignedBB`
  offset-x - `double`

  returns: `double`"
  (^Double [^AxisAlignedBB this ^net.minecraft.util.math.AxisAlignedBB other ^Double offset-x]
    (-> this (.calculateXOffset other offset-x))))

(defn contract
  "p-191195-1 - `double`
  p-191195-3 - `double`
  p-191195-5 - `double`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^AxisAlignedBB this ^Double p-191195-1 ^Double p-191195-3 ^Double p-191195-5]
    (-> this (.contract p-191195-1 p-191195-3 p-191195-5)))
  (^net.minecraft.util.math.AxisAlignedBB [^AxisAlignedBB this ^Double value]
    (-> this (.contract value))))

(defn intersects-with
  "other - `net.minecraft.util.math.AxisAlignedBB`

  returns: `boolean`"
  (^Boolean [^AxisAlignedBB this ^net.minecraft.util.math.AxisAlignedBB other]
    (-> this (.intersectsWith other))))

(defn expand-xyz
  "value - `double`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^AxisAlignedBB this ^Double value]
    (-> this (.expandXyz value))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AxisAlignedBB this]
    (-> this (.hashCode))))

(defn intersects-with-xy
  "vec - `net.minecraft.util.math.Vec3d`

  returns: `boolean`"
  (^Boolean [^AxisAlignedBB this ^net.minecraft.util.math.Vec3d vec]
    (-> this (.intersectsWithXY vec))))

(defn has-na-n?
  "returns: `boolean`"
  (^Boolean [^AxisAlignedBB this]
    (-> this (.hasNaN))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AxisAlignedBB this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn intersects
  "x-1 - `double`
  y-1 - `double`
  z-1 - `double`
  x-2 - `double`
  y-2 - `double`
  z-2 - `double`

  returns: `boolean`"
  (^Boolean [^AxisAlignedBB this ^Double x-1 ^Double y-1 ^Double z-1 ^Double x-2 ^Double y-2 ^Double z-2]
    (-> this (.intersects x-1 y-1 z-1 x-2 y-2 z-2)))
  (^Boolean [^AxisAlignedBB this ^net.minecraft.util.math.Vec3d min ^net.minecraft.util.math.Vec3d max]
    (-> this (.intersects min max))))

(defn vec-inside?
  "vec - `net.minecraft.util.math.Vec3d`

  returns: `boolean`"
  (^Boolean [^AxisAlignedBB this ^net.minecraft.util.math.Vec3d vec]
    (-> this (.isVecInside vec))))

