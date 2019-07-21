(ns net.minecraft.util.math.Vec3d
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.math Vec3d]))

(defn ->vec-3d
  "Constructor.

  x - `double`
  y - `double`
  z - `double`"
  (^Vec3d [^Double x ^Double y ^Double z]
    (new Vec3d x y z))
  (^Vec3d [^net.minecraft.util.math.Vec3i vector]
    (new Vec3d vector)))

(def *-zero
  "Static Constant.

  type: net.minecraft.util.math.Vec3d"
  Vec3d/ZERO)

(defn x-coord
  "Instance Constant.

  type: double"
  (^Double [^Vec3d this]
    (-> this .-xCoord)))

(defn y-coord
  "Instance Constant.

  type: double"
  (^Double [^Vec3d this]
    (-> this .-yCoord)))

(defn z-coord
  "Instance Constant.

  type: double"
  (^Double [^Vec3d this]
    (-> this .-zCoord)))

(defn *from-pitch-yaw-vector
  "p-189984-0 - `net.minecraft.util.math.Vec2f`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^net.minecraft.util.math.Vec2f p-189984-0]
    (Vec3d/fromPitchYawVector p-189984-0)))

(defn *from-pitch-yaw
  "p-189986-0 - `float`
  p-189986-1 - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Float p-189986-0 ^Float p-189986-1]
    (Vec3d/fromPitchYaw p-189986-0 p-189986-1)))

(defn cross-product
  "vec - `net.minecraft.util.math.Vec3d`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Vec3d this ^net.minecraft.util.math.Vec3d vec]
    (-> this (.crossProduct vec))))

(defn length-squared
  "returns: `double`"
  (^Double [^Vec3d this]
    (-> this (.lengthSquared))))

(defn get-intermediate-with-x-value
  "vec - `net.minecraft.util.math.Vec3d`
  x - `double`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Vec3d this ^net.minecraft.util.math.Vec3d vec ^Double x]
    (-> this (.getIntermediateWithXValue vec x))))

(defn normalize
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Vec3d this]
    (-> this (.normalize))))

(defn scale
  "p-186678-1 - `double`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Vec3d this ^Double p-186678-1]
    (-> this (.scale p-186678-1))))

(defn dot-product
  "vec - `net.minecraft.util.math.Vec3d`

  returns: `double`"
  (^Double [^Vec3d this ^net.minecraft.util.math.Vec3d vec]
    (-> this (.dotProduct vec))))

(defn subtract-reverse
  "vec - `net.minecraft.util.math.Vec3d`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Vec3d this ^net.minecraft.util.math.Vec3d vec]
    (-> this (.subtractReverse vec))))

(defn length-vector
  "returns: `double`"
  (^Double [^Vec3d this]
    (-> this (.lengthVector))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Vec3d this]
    (-> this (.toString))))

(defn square-distance-to
  "x-in - `double`
  y-in - `double`
  z-in - `double`

  returns: `double`"
  (^Double [^Vec3d this ^Double x-in ^Double y-in ^Double z-in]
    (-> this (.squareDistanceTo x-in y-in z-in)))
  (^Double [^Vec3d this ^net.minecraft.util.math.Vec3d vec]
    (-> this (.squareDistanceTo vec))))

(defn rotate-yaw
  "yaw - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Vec3d this ^Float yaw]
    (-> this (.rotateYaw yaw))))

(defn subtract
  "x - `double`
  y - `double`
  z - `double`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Vec3d this ^Double x ^Double y ^Double z]
    (-> this (.subtract x y z)))
  (^net.minecraft.util.math.Vec3d [^Vec3d this ^net.minecraft.util.math.Vec3d vec]
    (-> this (.subtract vec))))

(defn get-intermediate-with-z-value
  "vec - `net.minecraft.util.math.Vec3d`
  z - `double`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Vec3d this ^net.minecraft.util.math.Vec3d vec ^Double z]
    (-> this (.getIntermediateWithZValue vec z))))

(defn get-intermediate-with-y-value
  "vec - `net.minecraft.util.math.Vec3d`
  y - `double`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Vec3d this ^net.minecraft.util.math.Vec3d vec ^Double y]
    (-> this (.getIntermediateWithYValue vec y))))

(defn distance-to
  "vec - `net.minecraft.util.math.Vec3d`

  returns: `double`"
  (^Double [^Vec3d this ^net.minecraft.util.math.Vec3d vec]
    (-> this (.distanceTo vec))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Vec3d this]
    (-> this (.hashCode))))

(defn add
  "vec - `net.minecraft.util.math.Vec3d`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Vec3d this ^net.minecraft.util.math.Vec3d vec]
    (-> this (.add vec))))

(defn rotate-pitch
  "pitch - `float`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Vec3d this ^Float pitch]
    (-> this (.rotatePitch pitch))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Vec3d this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn add-vector
  "x - `double`
  y - `double`
  z - `double`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^Vec3d this ^Double x ^Double y ^Double z]
    (-> this (.addVector x y z))))

