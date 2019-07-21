(ns net.minecraft.util.math.BlockPos$MutableBlockPos
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.math BlockPos$MutableBlockPos]))

(defn ->mutable-block-pos
  "Constructor.

  x - `int`
  y - `int`
  z - `int`"
  (^BlockPos$MutableBlockPos [^Integer x ^Integer y ^Integer z]
    (new BlockPos$MutableBlockPos x y z))
  (^BlockPos$MutableBlockPos [^net.minecraft.util.math.BlockPos pos]
    (new BlockPos$MutableBlockPos pos))
  (^BlockPos$MutableBlockPos []
    (new BlockPos$MutableBlockPos )))

(defn set-pos
  "x-in - `int`
  y-in - `int`
  z-in - `int`

  returns: `net.minecraft.util.math.BlockPos$MutableBlockPos`"
  (^net.minecraft.util.math.BlockPos$MutableBlockPos [^BlockPos$MutableBlockPos this ^Integer x-in ^Integer y-in ^Integer z-in]
    (-> this (.setPos x-in y-in z-in)))
  (^net.minecraft.util.math.BlockPos$MutableBlockPos [^BlockPos$MutableBlockPos this ^net.minecraft.entity.Entity entity-in]
    (-> this (.setPos entity-in))))

(defn offset
  "facing - `net.minecraft.util.EnumFacing`
  n - `int`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockPos$MutableBlockPos this ^net.minecraft.util.EnumFacing facing ^Integer n]
    (-> this (.offset facing n))))

(defn get-z
  "returns: `int`"
  (^Integer [^BlockPos$MutableBlockPos this]
    (-> this (.getZ))))

(defn to-immutable
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockPos$MutableBlockPos this]
    (-> this (.toImmutable))))

(defn get-y
  "returns: `int`"
  (^Integer [^BlockPos$MutableBlockPos this]
    (-> this (.getY))))

(defn get-x
  "returns: `int`"
  (^Integer [^BlockPos$MutableBlockPos this]
    (-> this (.getX))))

(defn set-y
  "y-in - `int`"
  ([^BlockPos$MutableBlockPos this ^Integer y-in]
    (-> this (.setY y-in))))

(defn move
  "facing - `net.minecraft.util.EnumFacing`
  p-189534-2 - `int`

  returns: `net.minecraft.util.math.BlockPos$MutableBlockPos`"
  (^net.minecraft.util.math.BlockPos$MutableBlockPos [^BlockPos$MutableBlockPos this ^net.minecraft.util.EnumFacing facing ^Integer p-189534-2]
    (-> this (.move facing p-189534-2)))
  (^net.minecraft.util.math.BlockPos$MutableBlockPos [^BlockPos$MutableBlockPos this ^net.minecraft.util.EnumFacing facing]
    (-> this (.move facing))))

(defn add
  "x - `double`
  y - `double`
  z - `double`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockPos$MutableBlockPos this ^Double x ^Double y ^Double z]
    (-> this (.add x y z))))

(defn rotate
  "rotation-in - `net.minecraft.util.Rotation`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockPos$MutableBlockPos this ^net.minecraft.util.Rotation rotation-in]
    (-> this (.rotate rotation-in))))

