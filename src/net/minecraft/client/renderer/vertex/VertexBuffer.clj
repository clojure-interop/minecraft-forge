(ns net.minecraft.client.renderer.vertex.VertexBuffer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.vertex VertexBuffer]))

(defn ->vertex-buffer
  "Constructor.

  vertex-format-in - `net.minecraft.client.renderer.vertex.VertexFormat`"
  (^VertexBuffer [^net.minecraft.client.renderer.vertex.VertexFormat vertex-format-in]
    (new VertexBuffer vertex-format-in)))

(defn bind-buffer
  ""
  ([^VertexBuffer this]
    (-> this (.bindBuffer))))

(defn buffer-data
  "data - `java.nio.ByteBuffer`"
  ([^VertexBuffer this ^java.nio.ByteBuffer data]
    (-> this (.bufferData data))))

(defn draw-arrays
  "mode - `int`"
  ([^VertexBuffer this ^Integer mode]
    (-> this (.drawArrays mode))))

(defn unbind-buffer
  ""
  ([^VertexBuffer this]
    (-> this (.unbindBuffer))))

(defn delete-gl-buffers
  ""
  ([^VertexBuffer this]
    (-> this (.deleteGlBuffers))))

