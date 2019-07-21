(ns net.minecraft.realms.RealmsVertexFormatElement
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms RealmsVertexFormatElement]))

(defn ->realms-vertex-format-element
  "Constructor.

  v-in - `net.minecraft.client.renderer.vertex.VertexFormatElement`"
  (^RealmsVertexFormatElement [^net.minecraft.client.renderer.vertex.VertexFormatElement v-in]
    (new RealmsVertexFormatElement v-in)))

(defn get-vertex-format-element
  "returns: `net.minecraft.client.renderer.vertex.VertexFormatElement`"
  (^net.minecraft.client.renderer.vertex.VertexFormatElement [^RealmsVertexFormatElement this]
    (-> this (.getVertexFormatElement))))

(defn position?
  "returns: `boolean`"
  (^Boolean [^RealmsVertexFormatElement this]
    (-> this (.isPosition))))

(defn get-index
  "returns: `int`"
  (^Integer [^RealmsVertexFormatElement this]
    (-> this (.getIndex))))

(defn get-byte-size
  "returns: `int`"
  (^Integer [^RealmsVertexFormatElement this]
    (-> this (.getByteSize))))

(defn get-count
  "returns: `int`"
  (^Integer [^RealmsVertexFormatElement this]
    (-> this (.getCount))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RealmsVertexFormatElement this]
    (-> this (.hashCode))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RealmsVertexFormatElement this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RealmsVertexFormatElement this]
    (-> this (.toString))))

