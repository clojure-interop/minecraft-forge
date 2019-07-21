(ns net.minecraft.client.shader.ShaderGroup
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.shader ShaderGroup]))

(defn ->shader-group
  "Constructor.

  p-i-1050-1 - `net.minecraft.client.renderer.texture.TextureManager`
  resource-manager-in - `net.minecraft.client.resources.IResourceManager`
  main-framebuffer-in - `net.minecraft.client.shader.Framebuffer`
  p-i-1050-4 - `net.minecraft.util.ResourceLocation`

  throws: net.minecraft.client.util.JsonException"
  (^ShaderGroup [^net.minecraft.client.renderer.texture.TextureManager p-i-1050-1 ^net.minecraft.client.resources.IResourceManager resource-manager-in ^net.minecraft.client.shader.Framebuffer main-framebuffer-in ^net.minecraft.util.ResourceLocation p-i-1050-4]
    (new ShaderGroup p-i-1050-1 resource-manager-in main-framebuffer-in p-i-1050-4)))

(defn parse-group
  "p-152765-1 - `net.minecraft.client.renderer.texture.TextureManager`
  p-152765-2 - `net.minecraft.util.ResourceLocation`

  throws: net.minecraft.client.util.JsonException"
  ([^ShaderGroup this ^net.minecraft.client.renderer.texture.TextureManager p-152765-1 ^net.minecraft.util.ResourceLocation p-152765-2]
    (-> this (.parseGroup p-152765-1 p-152765-2))))

(defn get-framebuffer-raw
  "attribute-name - `java.lang.String`

  returns: `net.minecraft.client.shader.Framebuffer`"
  (^net.minecraft.client.shader.Framebuffer [^ShaderGroup this ^java.lang.String attribute-name]
    (-> this (.getFramebufferRaw attribute-name))))

(defn add-framebuffer
  "p-148020-1 - `java.lang.String`
  p-148020-2 - `int`
  p-148020-3 - `int`"
  ([^ShaderGroup this ^java.lang.String p-148020-1 ^Integer p-148020-2 ^Integer p-148020-3]
    (-> this (.addFramebuffer p-148020-1 p-148020-2 p-148020-3))))

(defn delete-shader-group
  ""
  ([^ShaderGroup this]
    (-> this (.deleteShaderGroup))))

(defn add-shader
  "program-name - `java.lang.String`
  framebuffer-in - `net.minecraft.client.shader.Framebuffer`
  framebuffer-out - `net.minecraft.client.shader.Framebuffer`

  returns: `net.minecraft.client.shader.Shader`

  throws: net.minecraft.client.util.JsonException"
  (^net.minecraft.client.shader.Shader [^ShaderGroup this ^java.lang.String program-name ^net.minecraft.client.shader.Framebuffer framebuffer-in ^net.minecraft.client.shader.Framebuffer framebuffer-out]
    (-> this (.addShader program-name framebuffer-in framebuffer-out))))

(defn create-bind-framebuffers
  "width - `int`
  height - `int`"
  ([^ShaderGroup this ^Integer width ^Integer height]
    (-> this (.createBindFramebuffers width height))))

(defn load-shader-group
  "partial-ticks - `float`"
  ([^ShaderGroup this ^Float partial-ticks]
    (-> this (.loadShaderGroup partial-ticks))))

(defn get-shader-group-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ShaderGroup this]
    (-> this (.getShaderGroupName))))

