(ns net.minecraft.client.shader.ShaderManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.shader ShaderManager]))

(defn ->shader-manager
  "Constructor.

  resource-manager - `net.minecraft.client.resources.IResourceManager`
  program-name - `java.lang.String`

  throws: net.minecraft.client.util.JsonException"
  (^ShaderManager [^net.minecraft.client.resources.IResourceManager resource-manager ^java.lang.String program-name]
    (new ShaderManager resource-manager program-name)))

(defn get-shader-uniform
  "name - `java.lang.String`

  returns: `net.minecraft.client.shader.ShaderUniform`"
  (^net.minecraft.client.shader.ShaderUniform [^ShaderManager this ^java.lang.String name]
    (-> this (.getShaderUniform name))))

(defn delete-shader
  ""
  ([^ShaderManager this]
    (-> this (.deleteShader))))

(defn get-fragment-shader-loader
  "returns: `net.minecraft.client.shader.ShaderLoader`"
  (^net.minecraft.client.shader.ShaderLoader [^ShaderManager this]
    (-> this (.getFragmentShaderLoader))))

(defn get-vertex-shader-loader
  "returns: `net.minecraft.client.shader.ShaderLoader`"
  (^net.minecraft.client.shader.ShaderLoader [^ShaderManager this]
    (-> this (.getVertexShaderLoader))))

(defn get-program
  "returns: `int`"
  (^Integer [^ShaderManager this]
    (-> this (.getProgram))))

(defn use-shader
  ""
  ([^ShaderManager this]
    (-> this (.useShader))))

(defn get-shader-uniform-or-default
  "name - `java.lang.String`

  returns: `net.minecraft.client.shader.ShaderUniform`"
  (^net.minecraft.client.shader.ShaderUniform [^ShaderManager this ^java.lang.String name]
    (-> this (.getShaderUniformOrDefault name))))

(defn end-shader
  ""
  ([^ShaderManager this]
    (-> this (.endShader))))

(defn add-sampler-texture
  "name - `java.lang.String`
  sampler-texture - `java.lang.Object`"
  ([^ShaderManager this ^java.lang.String name ^java.lang.Object sampler-texture]
    (-> this (.addSamplerTexture name sampler-texture))))

(defn mark-dirty
  ""
  ([^ShaderManager this]
    (-> this (.markDirty))))

