(ns net.minecraftforge.client.model.Attributes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model Attributes]))

(defn ->attributes
  "Constructor."
  (^Attributes []
    (new Attributes )))

(def *-default-baked-format
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormat"
  Attributes/DEFAULT_BAKED_FORMAT)

(defn *more-specific
  "first - `net.minecraft.client.renderer.vertex.VertexFormat`
  second - `net.minecraft.client.renderer.vertex.VertexFormat`

  returns: `boolean`"
  (^Boolean [^net.minecraft.client.renderer.vertex.VertexFormat first ^net.minecraft.client.renderer.vertex.VertexFormat second]
    (Attributes/moreSpecific first second)))

