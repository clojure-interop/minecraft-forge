(ns net.minecraft.client.shader.Shader
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.shader Shader]))

(defn ->shader
  "Constructor.

  resource-manager - `net.minecraft.client.resources.IResourceManager`
  program-name - `java.lang.String`
  framebuffer-in-in - `net.minecraft.client.shader.Framebuffer`
  framebuffer-out-in - `net.minecraft.client.shader.Framebuffer`

  throws: net.minecraft.client.util.JsonException"
  (^Shader [^net.minecraft.client.resources.IResourceManager resource-manager ^java.lang.String program-name ^net.minecraft.client.shader.Framebuffer framebuffer-in-in ^net.minecraft.client.shader.Framebuffer framebuffer-out-in]
    (new Shader resource-manager program-name framebuffer-in-in framebuffer-out-in)))

(defn framebuffer-in
  "Instance Constant.

  type: net.minecraft.client.shader.Framebuffer"
  (^net.minecraft.client.shader.Framebuffer [^Shader this]
    (-> this .-framebufferIn)))

(defn framebuffer-out
  "Instance Constant.

  type: net.minecraft.client.shader.Framebuffer"
  (^net.minecraft.client.shader.Framebuffer [^Shader this]
    (-> this .-framebufferOut)))

(defn delete-shader
  ""
  ([^Shader this]
    (-> this (.deleteShader))))

(defn add-aux-framebuffer
  "aux-name - `java.lang.String`
  aux-framebuffer-in - `java.lang.Object`
  width - `int`
  height - `int`"
  ([^Shader this ^java.lang.String aux-name ^java.lang.Object aux-framebuffer-in ^Integer width ^Integer height]
    (-> this (.addAuxFramebuffer aux-name aux-framebuffer-in width height))))

(defn set-projection-matrix
  "projection-matrix-in - `org.lwjgl.util.vector.Matrix4f`"
  ([^Shader this ^org.lwjgl.util.vector.Matrix4f projection-matrix-in]
    (-> this (.setProjectionMatrix projection-matrix-in))))

(defn load-shader
  "p-148042-1 - `float`"
  ([^Shader this ^Float p-148042-1]
    (-> this (.loadShader p-148042-1))))

(defn get-shader-manager
  "returns: `net.minecraft.client.shader.ShaderManager`"
  (^net.minecraft.client.shader.ShaderManager [^Shader this]
    (-> this (.getShaderManager))))

