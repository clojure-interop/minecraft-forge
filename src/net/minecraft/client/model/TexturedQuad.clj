(ns net.minecraft.client.model.TexturedQuad
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model TexturedQuad]))

(defn ->textured-quad
  "Constructor.

  vertices - `net.minecraft.client.model.PositionTextureVertex[]`
  texcoord-u-1 - `int`
  texcoord-v-1 - `int`
  texcoord-u-2 - `int`
  texcoord-v-2 - `int`
  texture-width - `float`
  texture-height - `float`"
  (^TexturedQuad [vertices ^Integer texcoord-u-1 ^Integer texcoord-v-1 ^Integer texcoord-u-2 ^Integer texcoord-v-2 ^Float texture-width ^Float texture-height]
    (new TexturedQuad vertices texcoord-u-1 texcoord-v-1 texcoord-u-2 texcoord-v-2 texture-width texture-height))
  (^TexturedQuad [vertices]
    (new TexturedQuad vertices)))

(defn vertex-positions
  "Instance Field.

  type: net.minecraft.client.model.PositionTextureVertex[]"
  ([^TexturedQuad this]
    (-> this .-vertexPositions)))

(defn n-vertices
  "Instance Field.

  type: int"
  (^Integer [^TexturedQuad this]
    (-> this .-nVertices)))

(defn flip-face
  ""
  ([^TexturedQuad this]
    (-> this (.flipFace))))

(defn draw
  "renderer - `net.minecraft.client.renderer.VertexBuffer`
  scale - `float`"
  ([^TexturedQuad this ^net.minecraft.client.renderer.VertexBuffer renderer ^Float scale]
    (-> this (.draw renderer scale))))

