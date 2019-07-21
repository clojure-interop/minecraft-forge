(ns net.minecraft.util.math.Vec3i
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.math Vec3i]))

(defn ->vec-3i
  "Constructor.

  x-in - `int`
  y-in - `int`
  z-in - `int`"
  (^Vec3i [^Integer x-in ^Integer y-in ^Integer z-in]
    (new Vec3i x-in y-in z-in)))

(def *-null-vector
  "Static Constant.

  type: net.minecraft.util.math.Vec3i"
  Vec3i/NULL_VECTOR)

(defn cross-product
  "vec - `net.minecraft.util.math.Vec3i`

  returns: `net.minecraft.util.math.Vec3i`"
  (^net.minecraft.util.math.Vec3i [^Vec3i this ^net.minecraft.util.math.Vec3i vec]
    (-> this (.crossProduct vec))))

(defn distance-sq
  "to-x - `double`
  to-y - `double`
  to-z - `double`

  returns: `double`"
  (^Double [^Vec3i this ^Double to-x ^Double to-y ^Double to-z]
    (-> this (.distanceSq to-x to-y to-z)))
  (^Double [^Vec3i this ^net.minecraft.util.math.Vec3i to]
    (-> this (.distanceSq to))))

(defn get-distance
  "x-in - `int`
  y-in - `int`
  z-in - `int`

  returns: `double`"
  (^Double [^Vec3i this ^Integer x-in ^Integer y-in ^Integer z-in]
    (-> this (.getDistance x-in y-in z-in))))

(defn get-z
  "returns: `int`"
  (^Integer [^Vec3i this]
    (-> this (.getZ))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Vec3i this]
    (-> this (.toString))))

(defn get-y
  "returns: `int`"
  (^Integer [^Vec3i this]
    (-> this (.getY))))

(defn distance-sq-to-center
  "x-in - `double`
  y-in - `double`
  z-in - `double`

  returns: `double`"
  (^Double [^Vec3i this ^Double x-in ^Double y-in ^Double z-in]
    (-> this (.distanceSqToCenter x-in y-in z-in))))

(defn get-x
  "returns: `int`"
  (^Integer [^Vec3i this]
    (-> this (.getX))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Vec3i this]
    (-> this (.hashCode))))

(defn compare-to
  "p-compare-to-1 - `net.minecraft.util.math.Vec3i`

  returns: `int`"
  (^Integer [^Vec3i this ^net.minecraft.util.math.Vec3i p-compare-to-1]
    (-> this (.compareTo p-compare-to-1))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Vec3i this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

