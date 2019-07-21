(ns net.minecraft.client.renderer.block.model.ModelBlockDefinition
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model ModelBlockDefinition]))

(defn ->model-block-definition
  "Constructor.

  variants - `java.util.Map`
  multipart-in - `net.minecraft.client.renderer.block.model.multipart.Multipart`"
  (^ModelBlockDefinition [^java.util.Map variants ^net.minecraft.client.renderer.block.model.multipart.Multipart multipart-in]
    (new ModelBlockDefinition variants multipart-in))
  (^ModelBlockDefinition [^java.util.List p-i-46222-1]
    (new ModelBlockDefinition p-i-46222-1)))

(defn *parse-from-reader
  "reader - `java.io.Reader`

  returns: `net.minecraft.client.renderer.block.model.ModelBlockDefinition`"
  (^net.minecraft.client.renderer.block.model.ModelBlockDefinition [^java.io.Reader reader]
    (ModelBlockDefinition/parseFromReader reader)))

(defn has-variant?
  "p-188000-1 - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^ModelBlockDefinition this ^java.lang.String p-188000-1]
    (-> this (.hasVariant p-188000-1))))

(defn get-variant
  "p-188004-1 - `java.lang.String`

  returns: `net.minecraft.client.renderer.block.model.VariantList`"
  (^net.minecraft.client.renderer.block.model.VariantList [^ModelBlockDefinition this ^java.lang.String p-188004-1]
    (-> this (.getVariant p-188004-1))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ModelBlockDefinition this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ModelBlockDefinition this]
    (-> this (.hashCode))))

(defn get-multipart-variants
  "returns: `java.util.Set<net.minecraft.client.renderer.block.model.VariantList>`"
  (^java.util.Set [^ModelBlockDefinition this]
    (-> this (.getMultipartVariants))))

(defn has-multipart-data?
  "returns: `boolean`"
  (^Boolean [^ModelBlockDefinition this]
    (-> this (.hasMultipartData))))

(defn get-multipart-data
  "returns: `net.minecraft.client.renderer.block.model.multipart.Multipart`"
  (^net.minecraft.client.renderer.block.model.multipart.Multipart [^ModelBlockDefinition this]
    (-> this (.getMultipartData))))

