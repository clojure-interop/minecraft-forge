(ns net.minecraft.realms.RealmsVertexFormat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms RealmsVertexFormat]))

(defn ->realms-vertex-format
  "Constructor.

  v-in - `net.minecraft.client.renderer.vertex.VertexFormat`"
  (^RealmsVertexFormat [^net.minecraft.client.renderer.vertex.VertexFormat v-in]
    (new RealmsVertexFormat v-in)))

(defn get-vertex-size
  "returns: `int`"
  (^Integer [^RealmsVertexFormat this]
    (-> this (.getVertexSize))))

(defn has-uv?
  "p-has-uv-1 - `int`

  returns: `boolean`"
  (^Boolean [^RealmsVertexFormat this ^Integer p-has-uv-1]
    (-> this (.hasUv p-has-uv-1))))

(defn add-element
  "p-add-element-1 - `net.minecraft.realms.RealmsVertexFormatElement`

  returns: `net.minecraft.realms.RealmsVertexFormat`"
  (^net.minecraft.realms.RealmsVertexFormat [^RealmsVertexFormat this ^net.minecraft.realms.RealmsVertexFormatElement p-add-element-1]
    (-> this (.addElement p-add-element-1))))

(defn get-uv-offset
  "p-get-uv-offset-1 - `int`

  returns: `int`"
  (^Integer [^RealmsVertexFormat this ^Integer p-get-uv-offset-1]
    (-> this (.getUvOffset p-get-uv-offset-1))))

(defn get-element
  "p-get-element-1 - `int`

  returns: `net.minecraft.realms.RealmsVertexFormatElement`"
  (^net.minecraft.realms.RealmsVertexFormatElement [^RealmsVertexFormat this ^Integer p-get-element-1]
    (-> this (.getElement p-get-element-1))))

(defn get-element-count
  "returns: `int`"
  (^Integer [^RealmsVertexFormat this]
    (-> this (.getElementCount))))

(defn has-color?
  "returns: `boolean`"
  (^Boolean [^RealmsVertexFormat this]
    (-> this (.hasColor))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RealmsVertexFormat this]
    (-> this (.toString))))

(defn get-offset
  "p-get-offset-1 - `int`

  returns: `int`"
  (^Integer [^RealmsVertexFormat this ^Integer p-get-offset-1]
    (-> this (.getOffset p-get-offset-1))))

(defn get-elements
  "returns: `java.util.List<net.minecraft.realms.RealmsVertexFormatElement>`"
  (^java.util.List [^RealmsVertexFormat this]
    (-> this (.getElements))))

(defn get-normal-offset
  "returns: `int`"
  (^Integer [^RealmsVertexFormat this]
    (-> this (.getNormalOffset))))

(defn from
  "p-from-1 - `net.minecraft.client.renderer.vertex.VertexFormat`

  returns: `net.minecraft.realms.RealmsVertexFormat`"
  (^net.minecraft.realms.RealmsVertexFormat [^RealmsVertexFormat this ^net.minecraft.client.renderer.vertex.VertexFormat p-from-1]
    (-> this (.from p-from-1))))

(defn has-normal?
  "returns: `boolean`"
  (^Boolean [^RealmsVertexFormat this]
    (-> this (.hasNormal))))

(defn get-vertex-format
  "returns: `net.minecraft.client.renderer.vertex.VertexFormat`"
  (^net.minecraft.client.renderer.vertex.VertexFormat [^RealmsVertexFormat this]
    (-> this (.getVertexFormat))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RealmsVertexFormat this]
    (-> this (.hashCode))))

(defn clear
  ""
  ([^RealmsVertexFormat this]
    (-> this (.clear))))

(defn get-color-offset
  "returns: `int`"
  (^Integer [^RealmsVertexFormat this]
    (-> this (.getColorOffset))))

(defn get-integer-size
  "returns: `int`"
  (^Integer [^RealmsVertexFormat this]
    (-> this (.getIntegerSize))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RealmsVertexFormat this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

