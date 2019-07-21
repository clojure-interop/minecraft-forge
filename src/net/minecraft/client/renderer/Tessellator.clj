(ns net.minecraft.client.renderer.Tessellator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer Tessellator]))

(defn ->tessellator
  "Constructor.

  buffer-size - `int`"
  (^Tessellator [^Integer buffer-size]
    (new Tessellator buffer-size)))

(defn *get-instance
  "returns: `net.minecraft.client.renderer.Tessellator`"
  (^net.minecraft.client.renderer.Tessellator []
    (Tessellator/getInstance )))

(defn draw
  ""
  ([^Tessellator this]
    (-> this (.draw))))

(defn get-buffer
  "returns: `net.minecraft.client.renderer.VertexBuffer`"
  (^net.minecraft.client.renderer.VertexBuffer [^Tessellator this]
    (-> this (.getBuffer))))

