(ns net.minecraft.client.resources.SkinManager$SkinAvailableCallback
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources SkinManager$SkinAvailableCallback]))

(defn skin-available
  "type-in - `com.mojang.authlib.minecraft.MinecraftProfileTexture.Type`
  location - `net.minecraft.util.ResourceLocation`
  profile-texture - `com.mojang.authlib.minecraft.MinecraftProfileTexture`"
  ([^SkinManager$SkinAvailableCallback this ^com.mojang.authlib.minecraft.MinecraftProfileTexture.Type type-in ^net.minecraft.util.ResourceLocation location ^com.mojang.authlib.minecraft.MinecraftProfileTexture profile-texture]
    (-> this (.skinAvailable type-in location profile-texture))))

