(ns net.minecraft.client.renderer.WorldVertexBufferUploader
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer WorldVertexBufferUploader]))

(defn ->world-vertex-buffer-uploader
  "Constructor."
  (^WorldVertexBufferUploader []
    (new WorldVertexBufferUploader )))

(defn draw
  "vertex-buffer-in - `net.minecraft.client.renderer.VertexBuffer`"
  ([^WorldVertexBufferUploader this ^net.minecraft.client.renderer.VertexBuffer vertex-buffer-in]
    (-> this (.draw vertex-buffer-in))))

