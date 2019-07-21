(ns net.minecraft.client.renderer.BannerTextures
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer BannerTextures]))

(defn ->banner-textures
  "Constructor."
  (^BannerTextures []
    (new BannerTextures )))

(def *-banner-designs
  "Static Constant.

  type: net.minecraft.client.renderer.BannerTextures$Cache"
  BannerTextures/BANNER_DESIGNS)

(def *-shield-designs
  "Static Constant.

  type: net.minecraft.client.renderer.BannerTextures$Cache"
  BannerTextures/SHIELD_DESIGNS)

(def *-shield-base-texture
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  BannerTextures/SHIELD_BASE_TEXTURE)

(def *-banner-base-texture
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  BannerTextures/BANNER_BASE_TEXTURE)

