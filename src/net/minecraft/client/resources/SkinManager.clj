(ns net.minecraft.client.resources.SkinManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources SkinManager]))

(defn ->skin-manager
  "Constructor.

  texture-manager-instance - `net.minecraft.client.renderer.texture.TextureManager`
  skin-cache-directory - `java.io.File`
  session-service - `com.mojang.authlib.minecraft.MinecraftSessionService`"
  (^SkinManager [^net.minecraft.client.renderer.texture.TextureManager texture-manager-instance ^java.io.File skin-cache-directory ^com.mojang.authlib.minecraft.MinecraftSessionService session-service]
    (new SkinManager texture-manager-instance skin-cache-directory session-service)))

(defn load-skin
  "profile-texture - `com.mojang.authlib.minecraft.MinecraftProfileTexture`
  texture-type - `com.mojang.authlib.minecraft.MinecraftProfileTexture.Type`
  skin-available-callback - `net.minecraft.client.resources.SkinManager$SkinAvailableCallback`

  returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^SkinManager this ^com.mojang.authlib.minecraft.MinecraftProfileTexture profile-texture ^com.mojang.authlib.minecraft.MinecraftProfileTexture.Type texture-type ^net.minecraft.client.resources.SkinManager$SkinAvailableCallback skin-available-callback]
    (-> this (.loadSkin profile-texture texture-type skin-available-callback)))
  (^net.minecraft.util.ResourceLocation [^SkinManager this ^com.mojang.authlib.minecraft.MinecraftProfileTexture profile-texture ^com.mojang.authlib.minecraft.MinecraftProfileTexture.Type texture-type]
    (-> this (.loadSkin profile-texture texture-type))))

(defn load-profile-textures
  "profile - `com.mojang.authlib.GameProfile`
  skin-available-callback - `net.minecraft.client.resources.SkinManager$SkinAvailableCallback`
  require-secure - `boolean`"
  ([^SkinManager this ^com.mojang.authlib.GameProfile profile ^net.minecraft.client.resources.SkinManager$SkinAvailableCallback skin-available-callback ^Boolean require-secure]
    (-> this (.loadProfileTextures profile skin-available-callback require-secure))))

(defn load-skin-from-cache
  "profile - `com.mojang.authlib.GameProfile`

  returns: `java.util.Map<com.mojang.authlib.minecraft.MinecraftProfileTexture.Type,com.mojang.authlib.minecraft.MinecraftProfileTexture>`"
  (^java.util.Map [^SkinManager this ^com.mojang.authlib.GameProfile profile]
    (-> this (.loadSkinFromCache profile))))

