(ns net.minecraftforge.client.model.pipeline.QuadGatheringTransformer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.pipeline QuadGatheringTransformer]))

(defn ->quad-gathering-transformer
  "Constructor."
  (^QuadGatheringTransformer []
    (new QuadGatheringTransformer )))

(defn set-parent
  "parent - `net.minecraftforge.client.model.pipeline.IVertexConsumer`"
  ([^QuadGatheringTransformer this ^net.minecraftforge.client.model.pipeline.IVertexConsumer parent]
    (-> this (.setParent parent))))

(defn set-vertex-format
  "format - `net.minecraft.client.renderer.vertex.VertexFormat`"
  ([^QuadGatheringTransformer this ^net.minecraft.client.renderer.vertex.VertexFormat format]
    (-> this (.setVertexFormat format))))

(defn get-vertex-format
  "returns: the format that should be used for passed data. - `net.minecraft.client.renderer.vertex.VertexFormat`"
  (^net.minecraft.client.renderer.vertex.VertexFormat [^QuadGatheringTransformer this]
    (-> this (.getVertexFormat))))

(defn put
  "element - `int`
  data - `float`"
  ([^QuadGatheringTransformer this ^Integer element ^Float data]
    (-> this (.put element data))))

