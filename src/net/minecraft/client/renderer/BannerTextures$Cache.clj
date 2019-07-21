(ns net.minecraft.client.renderer.BannerTextures$Cache
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer BannerTextures$Cache]))

(defn ->cache
  "Constructor.

  id - `java.lang.String`
  base-resource - `net.minecraft.util.ResourceLocation`
  resource-path - `java.lang.String`"
  (^BannerTextures$Cache [^java.lang.String id ^net.minecraft.util.ResourceLocation base-resource ^java.lang.String resource-path]
    (new BannerTextures$Cache id base-resource resource-path)))

(defn get-resource-location
  "id - `java.lang.String`
  pattern-list - `java.util.List`
  color-list - `java.util.List`

  returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^BannerTextures$Cache this ^java.lang.String id ^java.util.List pattern-list ^java.util.List color-list]
    (-> this (.getResourceLocation id pattern-list color-list))))

