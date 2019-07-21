(ns net.minecraft.util.math.RayTraceResult
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.math RayTraceResult]))

(defn ->ray-trace-result
  "Constructor.

  type-in - `net.minecraft.util.math.RayTraceResult$Type`
  hit-vec-in - `net.minecraft.util.math.Vec3d`
  side-hit-in - `net.minecraft.util.EnumFacing`
  block-pos-in - `net.minecraft.util.math.BlockPos`"
  (^RayTraceResult [^net.minecraft.util.math.RayTraceResult$Type type-in ^net.minecraft.util.math.Vec3d hit-vec-in ^net.minecraft.util.EnumFacing side-hit-in ^net.minecraft.util.math.BlockPos block-pos-in]
    (new RayTraceResult type-in hit-vec-in side-hit-in block-pos-in))
  (^RayTraceResult [^net.minecraft.util.math.Vec3d hit-vec-in ^net.minecraft.util.EnumFacing side-hit-in ^net.minecraft.util.math.BlockPos block-pos-in]
    (new RayTraceResult hit-vec-in side-hit-in block-pos-in))
  (^RayTraceResult [^net.minecraft.util.math.Vec3d hit-vec-in ^net.minecraft.util.EnumFacing side-hit-in]
    (new RayTraceResult hit-vec-in side-hit-in))
  (^RayTraceResult [^net.minecraft.entity.Entity entity-in]
    (new RayTraceResult entity-in)))

(defn sub-hit
  "Instance Field.

  Used to determine what sub-segment is hit

  type: int"
  (^Integer [^RayTraceResult this]
    (-> this .-subHit)))

(defn hit-info
  "Instance Field.

  Used to add extra hit info

  type: java.lang.Object"
  (^java.lang.Object [^RayTraceResult this]
    (-> this .-hitInfo)))

(defn type-of-hit
  "Instance Field.

  type: net.minecraft.util.math.RayTraceResult$Type"
  (^net.minecraft.util.math.RayTraceResult$Type [^RayTraceResult this]
    (-> this .-typeOfHit)))

(defn side-hit
  "Instance Field.

  type: net.minecraft.util.EnumFacing"
  (^net.minecraft.util.EnumFacing [^RayTraceResult this]
    (-> this .-sideHit)))

(defn hit-vec
  "Instance Field.

  type: net.minecraft.util.math.Vec3d"
  (^net.minecraft.util.math.Vec3d [^RayTraceResult this]
    (-> this .-hitVec)))

(defn entity-hit
  "Instance Field.

  type: net.minecraft.entity.Entity"
  (^net.minecraft.entity.Entity [^RayTraceResult this]
    (-> this .-entityHit)))

(defn get-block-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^RayTraceResult this]
    (-> this (.getBlockPos))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RayTraceResult this]
    (-> this (.toString))))

