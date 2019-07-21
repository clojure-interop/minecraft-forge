(ns net.minecraft.client.shader.ShaderLinkHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.shader ShaderLinkHelper]))

(defn ->shader-link-helper
  "Constructor."
  (^ShaderLinkHelper []
    (new ShaderLinkHelper )))

(defn *set-new-static-shader-link-helper
  ""
  ([]
    (ShaderLinkHelper/setNewStaticShaderLinkHelper )))

(defn *get-static-shader-link-helper
  "returns: `net.minecraft.client.shader.ShaderLinkHelper`"
  (^net.minecraft.client.shader.ShaderLinkHelper []
    (ShaderLinkHelper/getStaticShaderLinkHelper )))

(defn delete-shader
  "manager - `net.minecraft.client.shader.ShaderManager`"
  ([^ShaderLinkHelper this ^net.minecraft.client.shader.ShaderManager manager]
    (-> this (.deleteShader manager))))

(defn create-program
  "returns: `int`

  throws: net.minecraft.client.util.JsonException"
  (^Integer [^ShaderLinkHelper this]
    (-> this (.createProgram))))

(defn link-program
  "manager - `net.minecraft.client.shader.ShaderManager`

  throws: java.io.IOException"
  ([^ShaderLinkHelper this ^net.minecraft.client.shader.ShaderManager manager]
    (-> this (.linkProgram manager))))

