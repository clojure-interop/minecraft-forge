(ns net.minecraft.block.state.pattern.BlockPattern
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.state.pattern BlockPattern]))

(defn ->block-pattern
  "Constructor.

  predicates-in - `com.google.common.base.Predicate[][][]`"
  (^BlockPattern [predicates-in]
    (new BlockPattern predicates-in)))

(defn *create-loading-cache
  "world-in - `net.minecraft.world.World`
  force-load-in - `boolean`

  returns: `com.google.common.cache.LoadingCache<net.minecraft.util.math.BlockPos,net.minecraft.block.state.BlockWorldState>`"
  (^com.google.common.cache.LoadingCache [^net.minecraft.world.World world-in ^Boolean force-load-in]
    (BlockPattern/createLoadingCache world-in force-load-in)))

(defn get-finger-length
  "returns: `int`"
  (^Integer [^BlockPattern this]
    (-> this (.getFingerLength))))

(defn get-thumb-length
  "returns: `int`"
  (^Integer [^BlockPattern this]
    (-> this (.getThumbLength))))

(defn get-palm-length
  "returns: `int`"
  (^Integer [^BlockPattern this]
    (-> this (.getPalmLength))))

(defn match
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.pattern.BlockPattern$PatternHelper`"
  (^net.minecraft.block.state.pattern.BlockPattern$PatternHelper [^BlockPattern this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.match world-in pos))))

