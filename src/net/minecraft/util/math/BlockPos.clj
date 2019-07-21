(ns net.minecraft.util.math.BlockPos
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.math BlockPos]))

(defn ->block-pos
  "Constructor.

  x - `int`
  y - `int`
  z - `int`"
  (^BlockPos [^Integer x ^Integer y ^Integer z]
    (new BlockPos x y z))
  (^BlockPos [^net.minecraft.entity.Entity source]
    (new BlockPos source)))

(def *-origin
  "Static Constant.

  type: net.minecraft.util.math.BlockPos"
  BlockPos/ORIGIN)

(defn *from-long
  "serialized - `long`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^Long serialized]
    (BlockPos/fromLong serialized)))

(defn *get-all-in-box
  "from - `net.minecraft.util.math.BlockPos`
  to - `net.minecraft.util.math.BlockPos`

  returns: `java.lang.Iterable<net.minecraft.util.math.BlockPos>`"
  (^java.lang.Iterable [^net.minecraft.util.math.BlockPos from ^net.minecraft.util.math.BlockPos to]
    (BlockPos/getAllInBox from to)))

(defn *func-191532-a
  "p-191532-0 - `int`
  p-191532-1 - `int`
  p-191532-2 - `int`
  p-191532-3 - `int`
  p-191532-4 - `int`
  p-191532-5 - `int`

  returns: `java.lang.Iterable<net.minecraft.util.math.BlockPos>`"
  (^java.lang.Iterable [^Integer p-191532-0 ^Integer p-191532-1 ^Integer p-191532-2 ^Integer p-191532-3 ^Integer p-191532-4 ^Integer p-191532-5]
    (BlockPos/func_191532_a p-191532-0 p-191532-1 p-191532-2 p-191532-3 p-191532-4 p-191532-5)))

(defn *get-all-in-box-mutable
  "from - `net.minecraft.util.math.BlockPos`
  to - `net.minecraft.util.math.BlockPos`

  returns: `java.lang.Iterable<net.minecraft.util.math.BlockPos$MutableBlockPos>`"
  (^java.lang.Iterable [^net.minecraft.util.math.BlockPos from ^net.minecraft.util.math.BlockPos to]
    (BlockPos/getAllInBoxMutable from to)))

(defn *func-191531-b
  "p-191531-0 - `int`
  p-191531-1 - `int`
  p-191531-2 - `int`
  p-191531-3 - `int`
  p-191531-4 - `int`
  p-191531-5 - `int`

  returns: `java.lang.Iterable<net.minecraft.util.math.BlockPos$MutableBlockPos>`"
  (^java.lang.Iterable [^Integer p-191531-0 ^Integer p-191531-1 ^Integer p-191531-2 ^Integer p-191531-3 ^Integer p-191531-4 ^Integer p-191531-5]
    (BlockPos/func_191531_b p-191531-0 p-191531-1 p-191531-2 p-191531-3 p-191531-4 p-191531-5)))

(defn cross-product
  "vec - `net.minecraft.util.math.Vec3i`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockPos this ^net.minecraft.util.math.Vec3i vec]
    (-> this (.crossProduct vec))))

(defn up
  "n - `int`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockPos this ^Integer n]
    (-> this (.up n)))
  (^net.minecraft.util.math.BlockPos [^BlockPos this]
    (-> this (.up))))

(defn offset
  "facing - `net.minecraft.util.EnumFacing`
  n - `int`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockPos this ^net.minecraft.util.EnumFacing facing ^Integer n]
    (-> this (.offset facing n)))
  (^net.minecraft.util.math.BlockPos [^BlockPos this ^net.minecraft.util.EnumFacing facing]
    (-> this (.offset facing))))

(defn to-immutable
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockPos this]
    (-> this (.toImmutable))))

(defn subtract
  "vec - `net.minecraft.util.math.Vec3i`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockPos this ^net.minecraft.util.math.Vec3i vec]
    (-> this (.subtract vec))))

(defn to-long
  "returns: `long`"
  (^Long [^BlockPos this]
    (-> this (.toLong))))

(defn west
  "n - `int`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockPos this ^Integer n]
    (-> this (.west n)))
  (^net.minecraft.util.math.BlockPos [^BlockPos this]
    (-> this (.west))))

(defn down
  "n - `int`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockPos this ^Integer n]
    (-> this (.down n)))
  (^net.minecraft.util.math.BlockPos [^BlockPos this]
    (-> this (.down))))

(defn south
  "n - `int`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockPos this ^Integer n]
    (-> this (.south n)))
  (^net.minecraft.util.math.BlockPos [^BlockPos this]
    (-> this (.south))))

(defn add
  "x - `double`
  y - `double`
  z - `double`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockPos this ^Double x ^Double y ^Double z]
    (-> this (.add x y z)))
  (^net.minecraft.util.math.BlockPos [^BlockPos this ^net.minecraft.util.math.Vec3i vec]
    (-> this (.add vec))))

(defn rotate
  "rotation-in - `net.minecraft.util.Rotation`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockPos this ^net.minecraft.util.Rotation rotation-in]
    (-> this (.rotate rotation-in))))

(defn east
  "n - `int`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockPos this ^Integer n]
    (-> this (.east n)))
  (^net.minecraft.util.math.BlockPos [^BlockPos this]
    (-> this (.east))))

(defn north
  "n - `int`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockPos this ^Integer n]
    (-> this (.north n)))
  (^net.minecraft.util.math.BlockPos [^BlockPos this]
    (-> this (.north))))

