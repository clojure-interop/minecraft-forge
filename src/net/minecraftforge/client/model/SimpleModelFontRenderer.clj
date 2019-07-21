(ns net.minecraftforge.client.model.SimpleModelFontRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model SimpleModelFontRenderer]))

(defn ->simple-model-font-renderer
  "Constructor.

  settings - `net.minecraft.client.settings.GameSettings`
  font - `net.minecraft.util.ResourceLocation`
  manager - `net.minecraft.client.renderer.texture.TextureManager`
  is-unicode - `boolean`
  matrix - `javax.vecmath.Matrix4f`
  format - `net.minecraft.client.renderer.vertex.VertexFormat`"
  (^SimpleModelFontRenderer [^net.minecraft.client.settings.GameSettings settings ^net.minecraft.util.ResourceLocation font ^net.minecraft.client.renderer.texture.TextureManager manager ^Boolean is-unicode ^javax.vecmath.Matrix4f matrix ^net.minecraft.client.renderer.vertex.VertexFormat format]
    (new SimpleModelFontRenderer settings font manager is-unicode matrix format)))

(defn set-sprite
  "sprite - `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  ([^SimpleModelFontRenderer this ^net.minecraft.client.renderer.texture.TextureAtlasSprite sprite]
    (-> this (.setSprite sprite))))

(defn set-fill-blanks
  "fill-blanks - `boolean`"
  ([^SimpleModelFontRenderer this ^Boolean fill-blanks]
    (-> this (.setFillBlanks fill-blanks))))

(defn on-resource-manager-reload
  "resource-manager - `net.minecraft.client.resources.IResourceManager`"
  ([^SimpleModelFontRenderer this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.onResourceManagerReload resource-manager))))

(defn enable-alpha
  ""
  ([^SimpleModelFontRenderer this]
    (-> this (.enableAlpha))))

(defn build
  "returns: `com.google.common.collect.ImmutableList<net.minecraft.client.renderer.block.model.BakedQuad>`"
  (^com.google.common.collect.ImmutableList [^SimpleModelFontRenderer this]
    (-> this (.build))))

