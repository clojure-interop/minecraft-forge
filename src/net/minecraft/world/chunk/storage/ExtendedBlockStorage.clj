(ns net.minecraft.world.chunk.storage.ExtendedBlockStorage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk.storage ExtendedBlockStorage]))

(defn ->extended-block-storage
  "Constructor.

  y - `int`
  store-skylight - `boolean`"
  (^ExtendedBlockStorage [^Integer y ^Boolean store-skylight]
    (new ExtendedBlockStorage y store-skylight)))

(defn get-data
  "returns: `net.minecraft.world.chunk.BlockStateContainer`"
  (^net.minecraft.world.chunk.BlockStateContainer [^ExtendedBlockStorage this]
    (-> this (.getData))))

(defn set-ext-skylight-value
  "x - `int`
  y - `int`
  z - `int`
  value - `int`"
  ([^ExtendedBlockStorage this ^Integer x ^Integer y ^Integer z ^Integer value]
    (-> this (.setExtSkylightValue x y z value))))

(defn get-ext-blocklight-value
  "x - `int`
  y - `int`
  z - `int`

  returns: `int`"
  (^Integer [^ExtendedBlockStorage this ^Integer x ^Integer y ^Integer z]
    (-> this (.getExtBlocklightValue x y z))))

(defn get-ext-skylight-value
  "x - `int`
  y - `int`
  z - `int`

  returns: `int`"
  (^Integer [^ExtendedBlockStorage this ^Integer x ^Integer y ^Integer z]
    (-> this (.getExtSkylightValue x y z))))

(defn get-skylight-array
  "returns: `net.minecraft.world.chunk.NibbleArray`"
  (^net.minecraft.world.chunk.NibbleArray [^ExtendedBlockStorage this]
    (-> this (.getSkylightArray))))

(defn set-skylight-array
  "new-skylight-array - `net.minecraft.world.chunk.NibbleArray`"
  ([^ExtendedBlockStorage this ^net.minecraft.world.chunk.NibbleArray new-skylight-array]
    (-> this (.setSkylightArray new-skylight-array))))

(defn get-y-location
  "returns: `int`"
  (^Integer [^ExtendedBlockStorage this]
    (-> this (.getYLocation))))

(defn set-blocklight-array
  "new-blocklight-array - `net.minecraft.world.chunk.NibbleArray`"
  ([^ExtendedBlockStorage this ^net.minecraft.world.chunk.NibbleArray new-blocklight-array]
    (-> this (.setBlocklightArray new-blocklight-array))))

(defn set-ext-blocklight-value
  "x - `int`
  y - `int`
  z - `int`
  value - `int`"
  ([^ExtendedBlockStorage this ^Integer x ^Integer y ^Integer z ^Integer value]
    (-> this (.setExtBlocklightValue x y z value))))

(defn remove-invalid-blocks
  ""
  ([^ExtendedBlockStorage this]
    (-> this (.removeInvalidBlocks))))

(defn get-needs-random-tick?
  "returns: `boolean`"
  (^Boolean [^ExtendedBlockStorage this]
    (-> this (.getNeedsRandomTick))))

(defn get-blocklight-array
  "returns: `net.minecraft.world.chunk.NibbleArray`"
  (^net.minecraft.world.chunk.NibbleArray [^ExtendedBlockStorage this]
    (-> this (.getBlocklightArray))))

(defn set
  "x - `int`
  y - `int`
  z - `int`
  state - `net.minecraft.block.state.IBlockState`"
  ([^ExtendedBlockStorage this ^Integer x ^Integer y ^Integer z ^net.minecraft.block.state.IBlockState state]
    (-> this (.set x y z state))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^ExtendedBlockStorage this]
    (-> this (.isEmpty))))

(defn get
  "x - `int`
  y - `int`
  z - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^ExtendedBlockStorage this ^Integer x ^Integer y ^Integer z]
    (-> this (.get x y z))))

