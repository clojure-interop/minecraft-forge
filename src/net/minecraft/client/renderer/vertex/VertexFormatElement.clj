(ns net.minecraft.client.renderer.vertex.VertexFormatElement
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.vertex VertexFormatElement]))

(defn ->vertex-format-element
  "Constructor.

  index-in - `int`
  type-in - `net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType`
  usage-in - `net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage`
  count - `int`"
  (^VertexFormatElement [^Integer index-in ^net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType type-in ^net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage usage-in ^Integer count]
    (new VertexFormatElement index-in type-in usage-in count)))

(defn get-type
  "returns: `net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType`"
  (^net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType [^VertexFormatElement this]
    (-> this (.getType))))

(defn get-index
  "returns: `int`"
  (^Integer [^VertexFormatElement this]
    (-> this (.getIndex))))

(defn get-element-count
  "returns: `int`"
  (^Integer [^VertexFormatElement this]
    (-> this (.getElementCount))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^VertexFormatElement this]
    (-> this (.toString))))

(defn get-usage
  "returns: `net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage`"
  (^net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage [^VertexFormatElement this]
    (-> this (.getUsage))))

(defn position-element?
  "returns: `boolean`"
  (^Boolean [^VertexFormatElement this]
    (-> this (.isPositionElement))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VertexFormatElement this]
    (-> this (.hashCode))))

(defn get-size
  "returns: `int`"
  (^Integer [^VertexFormatElement this]
    (-> this (.getSize))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VertexFormatElement this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

