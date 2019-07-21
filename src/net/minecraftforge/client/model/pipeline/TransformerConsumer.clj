(ns net.minecraftforge.client.model.pipeline.TransformerConsumer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.pipeline TransformerConsumer]))

(defn get-vertex-format
  "returns: the format that should be used for passed data. - `net.minecraft.client.renderer.vertex.VertexFormat`"
  (^net.minecraft.client.renderer.vertex.VertexFormat [^TransformerConsumer this]
    (-> this (.getVertexFormat))))

(defn put
  "element - `int`
  data - `float`"
  ([^TransformerConsumer this ^Integer element ^Float data]
    (-> this (.put element data))))

