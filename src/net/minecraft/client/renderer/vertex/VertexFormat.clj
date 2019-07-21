(ns net.minecraft.client.renderer.vertex.VertexFormat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.vertex VertexFormat]))

(defn ->vertex-format
  "Constructor.

  vertex-format-in - `net.minecraft.client.renderer.vertex.VertexFormat`"
  (^VertexFormat [^net.minecraft.client.renderer.vertex.VertexFormat vertex-format-in]
    (new VertexFormat vertex-format-in))
  (^VertexFormat []
    (new VertexFormat )))

(defn add-element
  "element - `net.minecraft.client.renderer.vertex.VertexFormatElement`

  returns: `net.minecraft.client.renderer.vertex.VertexFormat`"
  (^net.minecraft.client.renderer.vertex.VertexFormat [^VertexFormat this ^net.minecraft.client.renderer.vertex.VertexFormatElement element]
    (-> this (.addElement element))))

(defn get-element
  "index - `int`

  returns: `net.minecraft.client.renderer.vertex.VertexFormatElement`"
  (^net.minecraft.client.renderer.vertex.VertexFormatElement [^VertexFormat this ^Integer index]
    (-> this (.getElement index))))

(defn get-element-count
  "returns: `int`"
  (^Integer [^VertexFormat this]
    (-> this (.getElementCount))))

(defn has-color?
  "returns: `boolean`"
  (^Boolean [^VertexFormat this]
    (-> this (.hasColor))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^VertexFormat this]
    (-> this (.toString))))

(defn get-offset
  "index - `int`

  returns: `int`"
  (^Integer [^VertexFormat this ^Integer index]
    (-> this (.getOffset index))))

(defn get-elements
  "returns: `java.util.List<net.minecraft.client.renderer.vertex.VertexFormatElement>`"
  (^java.util.List [^VertexFormat this]
    (-> this (.getElements))))

(defn get-next-offset
  "returns: `int`"
  (^Integer [^VertexFormat this]
    (-> this (.getNextOffset))))

(defn get-normal-offset
  "returns: `int`"
  (^Integer [^VertexFormat this]
    (-> this (.getNormalOffset))))

(defn has-normal?
  "returns: `boolean`"
  (^Boolean [^VertexFormat this]
    (-> this (.hasNormal))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VertexFormat this]
    (-> this (.hashCode))))

(defn get-uv-offset-by-id
  "id - `int`

  returns: `int`"
  (^Integer [^VertexFormat this ^Integer id]
    (-> this (.getUvOffsetById id))))

(defn clear
  ""
  ([^VertexFormat this]
    (-> this (.clear))))

(defn get-color-offset
  "returns: `int`"
  (^Integer [^VertexFormat this]
    (-> this (.getColorOffset))))

(defn get-integer-size
  "returns: `int`"
  (^Integer [^VertexFormat this]
    (-> this (.getIntegerSize))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VertexFormat this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn has-uv-offset?
  "id - `int`

  returns: `boolean`"
  (^Boolean [^VertexFormat this ^Integer id]
    (-> this (.hasUvOffset id))))

