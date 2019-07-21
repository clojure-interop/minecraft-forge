(ns net.minecraft.world.gen.FlatLayerInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen FlatLayerInfo]))

(defn ->flat-layer-info
  "Constructor.

  p-i-45628-1 - `int`
  p-i-45628-2 - `int`
  layer-material-in - `net.minecraft.block.Block`
  p-i-45628-4 - `int`"
  (^FlatLayerInfo [^Integer p-i-45628-1 ^Integer p-i-45628-2 ^net.minecraft.block.Block layer-material-in ^Integer p-i-45628-4]
    (new FlatLayerInfo p-i-45628-1 p-i-45628-2 layer-material-in p-i-45628-4))
  (^FlatLayerInfo [^Integer p-i-45627-1 ^Integer height ^net.minecraft.block.Block layer-material-in]
    (new FlatLayerInfo p-i-45627-1 height layer-material-in))
  (^FlatLayerInfo [^Integer p-i-45467-1 ^net.minecraft.block.Block layer-material-in]
    (new FlatLayerInfo p-i-45467-1 layer-material-in)))

(defn get-layer-count
  "returns: `int`"
  (^Integer [^FlatLayerInfo this]
    (-> this (.getLayerCount))))

(defn get-layer-material
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^FlatLayerInfo this]
    (-> this (.getLayerMaterial))))

(defn get-min-y
  "returns: `int`"
  (^Integer [^FlatLayerInfo this]
    (-> this (.getMinY))))

(defn set-min-y
  "min-y - `int`"
  ([^FlatLayerInfo this ^Integer min-y]
    (-> this (.setMinY min-y))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FlatLayerInfo this]
    (-> this (.toString))))

