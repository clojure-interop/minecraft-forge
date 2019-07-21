(ns net.minecraft.client.renderer.texture.TextureManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.texture TextureManager]))

(defn ->texture-manager
  "Constructor.

  resource-manager - `net.minecraft.client.resources.IResourceManager`"
  (^TextureManager [^net.minecraft.client.resources.IResourceManager resource-manager]
    (new TextureManager resource-manager)))

(defn bind-texture
  "resource - `net.minecraft.util.ResourceLocation`"
  ([^TextureManager this ^net.minecraft.util.ResourceLocation resource]
    (-> this (.bindTexture resource))))

(defn load-tickable-texture
  "texture-location - `net.minecraft.util.ResourceLocation`
  texture-obj - `net.minecraft.client.renderer.texture.ITickableTextureObject`

  returns: `boolean`"
  (^Boolean [^TextureManager this ^net.minecraft.util.ResourceLocation texture-location ^net.minecraft.client.renderer.texture.ITickableTextureObject texture-obj]
    (-> this (.loadTickableTexture texture-location texture-obj))))

(defn load-texture
  "texture-location - `net.minecraft.util.ResourceLocation`
  texture-obj - `net.minecraft.client.renderer.texture.ITextureObject`

  returns: `boolean`"
  (^Boolean [^TextureManager this ^net.minecraft.util.ResourceLocation texture-location ^net.minecraft.client.renderer.texture.ITextureObject texture-obj]
    (-> this (.loadTexture texture-location texture-obj))))

(defn get-texture
  "texture-location - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraft.client.renderer.texture.ITextureObject`"
  (^net.minecraft.client.renderer.texture.ITextureObject [^TextureManager this ^net.minecraft.util.ResourceLocation texture-location]
    (-> this (.getTexture texture-location))))

(defn get-dynamic-texture-location
  "name - `java.lang.String`
  texture - `net.minecraft.client.renderer.texture.DynamicTexture`

  returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^TextureManager this ^java.lang.String name ^net.minecraft.client.renderer.texture.DynamicTexture texture]
    (-> this (.getDynamicTextureLocation name texture))))

(defn tick
  ""
  ([^TextureManager this]
    (-> this (.tick))))

(defn delete-texture
  "texture-location - `net.minecraft.util.ResourceLocation`"
  ([^TextureManager this ^net.minecraft.util.ResourceLocation texture-location]
    (-> this (.deleteTexture texture-location))))

(defn on-resource-manager-reload
  "resource-manager - `net.minecraft.client.resources.IResourceManager`"
  ([^TextureManager this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.onResourceManagerReload resource-manager))))

