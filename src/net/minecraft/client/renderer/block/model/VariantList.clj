(ns net.minecraft.client.renderer.block.model.VariantList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model VariantList]))

(defn ->variant-list
  "Constructor.

  variant-list-in - `java.util.List`"
  (^VariantList [^java.util.List variant-list-in]
    (new VariantList variant-list-in)))

(defn get-variant-list
  "returns: `java.util.List<net.minecraft.client.renderer.block.model.Variant>`"
  (^java.util.List [^VariantList this]
    (-> this (.getVariantList))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VariantList this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VariantList this]
    (-> this (.hashCode))))

