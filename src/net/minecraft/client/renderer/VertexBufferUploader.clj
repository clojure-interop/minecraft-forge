(ns net.minecraft.client.renderer.VertexBufferUploader
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer VertexBufferUploader]))

(defn ->vertex-buffer-uploader
  "Constructor."
  (^VertexBufferUploader []
    (new VertexBufferUploader )))

(defn draw
  "vertex-buffer-in - `net.minecraft.client.renderer.VertexBuffer`"
  ([^VertexBufferUploader this ^net.minecraft.client.renderer.VertexBuffer vertex-buffer-in]
    (-> this (.draw vertex-buffer-in))))

(defn set-vertex-buffer
  "vertex-buffer-in - `net.minecraft.client.renderer.vertex.VertexBuffer`"
  ([^VertexBufferUploader this ^net.minecraft.client.renderer.vertex.VertexBuffer vertex-buffer-in]
    (-> this (.setVertexBuffer vertex-buffer-in))))

