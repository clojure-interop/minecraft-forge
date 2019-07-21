(ns net.minecraft.client.shader.ShaderLoader
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.shader ShaderLoader]))

(defn *load-shader
  "resource-manager - `net.minecraft.client.resources.IResourceManager`
  type - `net.minecraft.client.shader.ShaderLoader$ShaderType`
  filename - `java.lang.String`

  returns: `net.minecraft.client.shader.ShaderLoader`

  throws: java.io.IOException"
  (^net.minecraft.client.shader.ShaderLoader [^net.minecraft.client.resources.IResourceManager resource-manager ^net.minecraft.client.shader.ShaderLoader$ShaderType type ^java.lang.String filename]
    (ShaderLoader/loadShader resource-manager type filename)))

(defn attach-shader
  "manager - `net.minecraft.client.shader.ShaderManager`"
  ([^ShaderLoader this ^net.minecraft.client.shader.ShaderManager manager]
    (-> this (.attachShader manager))))

(defn delete-shader
  "manager - `net.minecraft.client.shader.ShaderManager`"
  ([^ShaderLoader this ^net.minecraft.client.shader.ShaderManager manager]
    (-> this (.deleteShader manager))))

(defn get-shader-filename
  "returns: `java.lang.String`"
  (^java.lang.String [^ShaderLoader this]
    (-> this (.getShaderFilename))))

