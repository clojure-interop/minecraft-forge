(ns net.minecraft.client.renderer.block.model.ModelResourceLocation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model ModelResourceLocation]))

(defn ->model-resource-location
  "Constructor.

  location - `net.minecraft.util.ResourceLocation`
  variant-in - `java.lang.String`"
  (^ModelResourceLocation [^net.minecraft.util.ResourceLocation location ^java.lang.String variant-in]
    (new ModelResourceLocation location variant-in))
  (^ModelResourceLocation [^java.lang.String path-in]
    (new ModelResourceLocation path-in)))

(defn get-variant
  "returns: `java.lang.String`"
  (^java.lang.String [^ModelResourceLocation this]
    (-> this (.getVariant))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ModelResourceLocation this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ModelResourceLocation this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ModelResourceLocation this]
    (-> this (.toString))))

