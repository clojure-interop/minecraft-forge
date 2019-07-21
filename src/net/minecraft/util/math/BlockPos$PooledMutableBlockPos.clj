(ns net.minecraft.util.math.BlockPos$PooledMutableBlockPos
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.math BlockPos$PooledMutableBlockPos]))

(defn *retain
  "x-in - `double`
  y-in - `double`
  z-in - `double`

  returns: `net.minecraft.util.math.BlockPos$PooledMutableBlockPos`"
  (^net.minecraft.util.math.BlockPos$PooledMutableBlockPos [^Double x-in ^Double y-in ^Double z-in]
    (BlockPos$PooledMutableBlockPos/retain x-in y-in z-in))
  (^net.minecraft.util.math.BlockPos$PooledMutableBlockPos [^net.minecraft.util.math.Vec3i vec]
    (BlockPos$PooledMutableBlockPos/retain vec))
  (^net.minecraft.util.math.BlockPos$PooledMutableBlockPos []
    (BlockPos$PooledMutableBlockPos/retain )))

(defn release
  ""
  ([^BlockPos$PooledMutableBlockPos this]
    (-> this (.release))))

(defn set-pos
  "x-in - `int`
  y-in - `int`
  z-in - `int`

  returns: `net.minecraft.util.math.BlockPos$PooledMutableBlockPos`"
  (^net.minecraft.util.math.BlockPos$PooledMutableBlockPos [^BlockPos$PooledMutableBlockPos this ^Integer x-in ^Integer y-in ^Integer z-in]
    (-> this (.setPos x-in y-in z-in)))
  (^net.minecraft.util.math.BlockPos$PooledMutableBlockPos [^BlockPos$PooledMutableBlockPos this ^net.minecraft.entity.Entity entity-in]
    (-> this (.setPos entity-in))))

(defn move
  "facing - `net.minecraft.util.EnumFacing`
  p-189534-2 - `int`

  returns: `net.minecraft.util.math.BlockPos$PooledMutableBlockPos`"
  (^net.minecraft.util.math.BlockPos$PooledMutableBlockPos [^BlockPos$PooledMutableBlockPos this ^net.minecraft.util.EnumFacing facing ^Integer p-189534-2]
    (-> this (.move facing p-189534-2)))
  (^net.minecraft.util.math.BlockPos$PooledMutableBlockPos [^BlockPos$PooledMutableBlockPos this ^net.minecraft.util.EnumFacing facing]
    (-> this (.move facing))))

