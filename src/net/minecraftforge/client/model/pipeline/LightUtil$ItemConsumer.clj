(ns net.minecraftforge.client.model.pipeline.LightUtil$ItemConsumer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.pipeline LightUtil$ItemConsumer]))

(defn ->item-consumer
  "Constructor.

  parent - `net.minecraftforge.client.model.pipeline.IVertexConsumer`"
  (^LightUtil$ItemConsumer [^net.minecraftforge.client.model.pipeline.IVertexConsumer parent]
    (new LightUtil$ItemConsumer parent)))

(defn set-aux-color
  "aux-color - `float`"
  ([^LightUtil$ItemConsumer this ^Float aux-color]
    (-> this (.setAuxColor aux-color))))

(defn put
  "element - `int`
  data - `float`"
  ([^LightUtil$ItemConsumer this ^Integer element ^Float data]
    (-> this (.put element data))))

