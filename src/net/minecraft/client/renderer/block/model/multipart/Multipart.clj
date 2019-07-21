(ns net.minecraft.client.renderer.block.model.multipart.Multipart
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model.multipart Multipart]))

(defn ->multipart
  "Constructor.

  selectors-in - `java.util.List`"
  (^Multipart [^java.util.List selectors-in]
    (new Multipart selectors-in)))

(defn get-selectors
  "returns: `java.util.List<net.minecraft.client.renderer.block.model.multipart.Selector>`"
  (^java.util.List [^Multipart this]
    (-> this (.getSelectors))))

(defn get-variants
  "returns: `java.util.Set<net.minecraft.client.renderer.block.model.VariantList>`"
  (^java.util.Set [^Multipart this]
    (-> this (.getVariants))))

(defn set-state-container
  "state-container-in - `net.minecraft.block.state.BlockStateContainer`"
  ([^Multipart this ^net.minecraft.block.state.BlockStateContainer state-container-in]
    (-> this (.setStateContainer state-container-in))))

(defn get-state-container
  "returns: `net.minecraft.block.state.BlockStateContainer`"
  (^net.minecraft.block.state.BlockStateContainer [^Multipart this]
    (-> this (.getStateContainer))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Multipart this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Multipart this]
    (-> this (.hashCode))))

