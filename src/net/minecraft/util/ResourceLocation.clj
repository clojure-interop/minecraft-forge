(ns net.minecraft.util.ResourceLocation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util ResourceLocation]))

(defn ->resource-location
  "Constructor.

  resource-domain-in - `java.lang.String`
  resource-path-in - `java.lang.String`"
  (^ResourceLocation [^java.lang.String resource-domain-in ^java.lang.String resource-path-in]
    (new ResourceLocation resource-domain-in resource-path-in))
  (^ResourceLocation [^java.lang.String resource-name]
    (new ResourceLocation resource-name)))

(defn get-resource-path
  "returns: `java.lang.String`"
  (^java.lang.String [^ResourceLocation this]
    (-> this (.getResourcePath))))

(defn get-resource-domain
  "returns: `java.lang.String`"
  (^java.lang.String [^ResourceLocation this]
    (-> this (.getResourceDomain))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ResourceLocation this]
    (-> this (.toString))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ResourceLocation this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ResourceLocation this]
    (-> this (.hashCode))))

