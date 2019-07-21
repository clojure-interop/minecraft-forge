(ns net.minecraftforge.client.model.ModelLoader$White
  "16x16 pure white sprite."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model ModelLoader$White]))

(def *-location
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  ModelLoader$White/LOCATION)

(def *-instance
  "Static Constant.

  type: net.minecraftforge.client.model.ModelLoader$White"
  ModelLoader$White/INSTANCE)

(defn has-custom-loader?
  "Description copied from class: TextureAtlasSprite

  manager - Main resource manager - `net.minecraft.client.resources.IResourceManager`
  location - File resource location - `net.minecraft.util.ResourceLocation`

  returns: True to use your own custom load code and bypass vanilla loading. - `boolean`"
  (^Boolean [^ModelLoader$White this ^net.minecraft.client.resources.IResourceManager manager ^net.minecraft.util.ResourceLocation location]
    (-> this (.hasCustomLoader manager location))))

(defn load
  "Description copied from class: TextureAtlasSprite

  manager - Main resource manager - `net.minecraft.client.resources.IResourceManager`
  location - File resource location - `net.minecraft.util.ResourceLocation`

  returns: False to prevent this Icon from being stitched - `boolean`"
  (^Boolean [^ModelLoader$White this ^net.minecraft.client.resources.IResourceManager manager ^net.minecraft.util.ResourceLocation location]
    (-> this (.load manager location))))

(defn register
  "map - `net.minecraft.client.renderer.texture.TextureMap`"
  ([^ModelLoader$White this ^net.minecraft.client.renderer.texture.TextureMap map]
    (-> this (.register map))))

