(ns net.minecraftforge.client.model.pipeline.BlockInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.pipeline BlockInfo]))

(defn ->block-info
  "Constructor.

  colors - `net.minecraft.client.renderer.color.BlockColors`"
  (^BlockInfo [^net.minecraft.client.renderer.color.BlockColors colors]
    (new BlockInfo colors)))

(defn get-shz
  "returns: `float`"
  (^Float [^BlockInfo this]
    (-> this (.getShz))))

(defn get-shy
  "returns: `float`"
  (^Float [^BlockInfo this]
    (-> this (.getShy))))

(defn set-world
  "world - `net.minecraft.world.IBlockAccess`"
  ([^BlockInfo this ^net.minecraft.world.IBlockAccess world]
    (-> this (.setWorld world))))

(defn get-block-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockInfo this]
    (-> this (.getBlockPos))))

(defn get-sky-light
  "returns: `float[][][][]`"
  ([^BlockInfo this]
    (-> this (.getSkyLight))))

(defn set-block-pos
  "block-pos - `net.minecraft.util.math.BlockPos`"
  ([^BlockInfo this ^net.minecraft.util.math.BlockPos block-pos]
    (-> this (.setBlockPos block-pos))))

(defn get-cached-tint
  "returns: `int`"
  (^Integer [^BlockInfo this]
    (-> this (.getCachedTint))))

(defn get-color-multiplier
  "tint - `int`

  returns: `int`"
  (^Integer [^BlockInfo this ^Integer tint]
    (-> this (.getColorMultiplier tint))))

(defn set-state
  "state - `net.minecraft.block.state.IBlockState`"
  ([^BlockInfo this ^net.minecraft.block.state.IBlockState state]
    (-> this (.setState state))))

(defn get-state
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockInfo this]
    (-> this (.getState))))

(defn get-cached-multiplier
  "returns: `int`"
  (^Integer [^BlockInfo this]
    (-> this (.getCachedMultiplier))))

(defn update-light-matrix
  ""
  ([^BlockInfo this]
    (-> this (.updateLightMatrix))))

(defn update-shift
  "ignore-y - `boolean`"
  ([^BlockInfo this ^Boolean ignore-y]
    (-> this (.updateShift ignore-y)))
  ([^BlockInfo this]
    (-> this (.updateShift))))

(defn get-block-light
  "returns: `float[][][][]`"
  ([^BlockInfo this]
    (-> this (.getBlockLight))))

(defn get-world
  "returns: `net.minecraft.world.IBlockAccess`"
  (^net.minecraft.world.IBlockAccess [^BlockInfo this]
    (-> this (.getWorld))))

(defn get-translucent
  "returns: `boolean[][][]`"
  ([^BlockInfo this]
    (-> this (.getTranslucent))))

(defn get-ao
  "returns: `float[][][]`"
  ([^BlockInfo this]
    (-> this (.getAo))))

(defn get-shx
  "returns: `float`"
  (^Float [^BlockInfo this]
    (-> this (.getShx))))

