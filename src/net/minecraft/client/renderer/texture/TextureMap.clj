(ns net.minecraft.client.renderer.texture.TextureMap
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.texture TextureMap]))

(defn ->texture-map
  "Constructor.

  base-path-in - `java.lang.String`
  icon-creator-in - `net.minecraft.client.renderer.texture.ITextureMapPopulator`
  skip-first - `boolean`"
  (^TextureMap [^java.lang.String base-path-in ^net.minecraft.client.renderer.texture.ITextureMapPopulator icon-creator-in ^Boolean skip-first]
    (new TextureMap base-path-in icon-creator-in skip-first))
  (^TextureMap [^java.lang.String base-path-in ^net.minecraft.client.renderer.texture.ITextureMapPopulator icon-creator-in]
    (new TextureMap base-path-in icon-creator-in))
  (^TextureMap [^java.lang.String base-path-in]
    (new TextureMap base-path-in)))

(def *-location-missing-texture
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  TextureMap/LOCATION_MISSING_TEXTURE)

(def *-location-blocks-texture
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  TextureMap/LOCATION_BLOCKS_TEXTURE)

(defn set-texture-entry
  "Adds a texture registry entry to this map for the specified name if one does not already exist.
   Returns false if the map already contains a entry for the specified name.

  entry - Entry instance - `net.minecraft.client.renderer.texture.TextureAtlasSprite`

  returns: True if the entry was added to the map, false otherwise. - `boolean`"
  (^Boolean [^TextureMap this ^net.minecraft.client.renderer.texture.TextureAtlasSprite entry]
    (-> this (.setTextureEntry entry))))

(defn set-mipmap-levels
  "mipmap-levels-in - `int`"
  ([^TextureMap this ^Integer mipmap-levels-in]
    (-> this (.setMipmapLevels mipmap-levels-in))))

(defn tick
  ""
  ([^TextureMap this]
    (-> this (.tick))))

(defn update-animations
  ""
  ([^TextureMap this]
    (-> this (.updateAnimations))))

(defn get-atlas-sprite
  "icon-name - `java.lang.String`

  returns: `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  (^net.minecraft.client.renderer.texture.TextureAtlasSprite [^TextureMap this ^java.lang.String icon-name]
    (-> this (.getAtlasSprite icon-name))))

(defn register-sprite
  "location - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  (^net.minecraft.client.renderer.texture.TextureAtlasSprite [^TextureMap this ^net.minecraft.util.ResourceLocation location]
    (-> this (.registerSprite location))))

(defn get-mipmap-levels
  "returns: `int`"
  (^Integer [^TextureMap this]
    (-> this (.getMipmapLevels))))

(defn load-texture
  "resource-manager - `net.minecraft.client.resources.IResourceManager`

  throws: java.io.IOException"
  ([^TextureMap this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.loadTexture resource-manager))))

(defn get-base-path
  "returns: `java.lang.String`"
  (^java.lang.String [^TextureMap this]
    (-> this (.getBasePath))))

(defn get-texture-extry
  "Grabs the registered entry for the specified name, returning null if there was not a entry.
   Opposed to registerIcon, this will not instantiate the entry, useful to test if a mapping exists.

  name - The name of the entry to find - `java.lang.String`

  returns: The registered entry, null if nothing was registered. - `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  (^net.minecraft.client.renderer.texture.TextureAtlasSprite [^TextureMap this ^java.lang.String name]
    (-> this (.getTextureExtry name))))

(defn load-texture-atlas
  "resource-manager - `net.minecraft.client.resources.IResourceManager`"
  ([^TextureMap this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.loadTextureAtlas resource-manager))))

(defn get-missing-sprite
  "returns: `net.minecraft.client.renderer.texture.TextureAtlasSprite`"
  (^net.minecraft.client.renderer.texture.TextureAtlasSprite [^TextureMap this]
    (-> this (.getMissingSprite))))

(defn load-sprites
  "resource-manager - `net.minecraft.client.resources.IResourceManager`
  icon-creator-in - `net.minecraft.client.renderer.texture.ITextureMapPopulator`"
  ([^TextureMap this ^net.minecraft.client.resources.IResourceManager resource-manager ^net.minecraft.client.renderer.texture.ITextureMapPopulator icon-creator-in]
    (-> this (.loadSprites resource-manager icon-creator-in))))

