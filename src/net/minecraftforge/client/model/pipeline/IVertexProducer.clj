(ns net.minecraftforge.client.model.pipeline.IVertexProducer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.pipeline IVertexProducer]))

(defn pipe
  "consumer - consumer to receive the vertex data this producer can provide - `net.minecraftforge.client.model.pipeline.IVertexConsumer`"
  ([^IVertexProducer this ^net.minecraftforge.client.model.pipeline.IVertexConsumer consumer]
    (-> this (.pipe consumer))))

