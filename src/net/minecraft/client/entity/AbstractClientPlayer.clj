(ns net.minecraft.client.entity.AbstractClientPlayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.entity AbstractClientPlayer]))

(defn ->abstract-client-player
  "Constructor.

  world-in - `net.minecraft.world.World`
  player-profile - `com.mojang.authlib.GameProfile`"
  (^AbstractClientPlayer [^net.minecraft.world.World world-in ^com.mojang.authlib.GameProfile player-profile]
    (new AbstractClientPlayer world-in player-profile)))

(defn rotate-elytra-x
  "Instance Field.

  type: float"
  (^Float [^AbstractClientPlayer this]
    (-> this .-rotateElytraX)))

(defn rotate-elytra-y
  "Instance Field.

  type: float"
  (^Float [^AbstractClientPlayer this]
    (-> this .-rotateElytraY)))

(defn rotate-elytra-z
  "Instance Field.

  type: float"
  (^Float [^AbstractClientPlayer this]
    (-> this .-rotateElytraZ)))

(defn *get-download-image-skin
  "resource-location-in - `net.minecraft.util.ResourceLocation`
  username - `java.lang.String`

  returns: `net.minecraft.client.renderer.ThreadDownloadImageData`"
  (^net.minecraft.client.renderer.ThreadDownloadImageData [^net.minecraft.util.ResourceLocation resource-location-in ^java.lang.String username]
    (AbstractClientPlayer/getDownloadImageSkin resource-location-in username)))

(defn *get-location-skin
  "username - `java.lang.String`

  returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^java.lang.String username]
    (AbstractClientPlayer/getLocationSkin username)))

(defn get-fov-modifier
  "returns: `float`"
  (^Float [^AbstractClientPlayer this]
    (-> this (.getFovModifier))))

(defn get-skin-type
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractClientPlayer this]
    (-> this (.getSkinType))))

(defn creative?
  "returns: `boolean`"
  (^Boolean [^AbstractClientPlayer this]
    (-> this (.isCreative))))

(defn has-player-info?
  "returns: `boolean`"
  (^Boolean [^AbstractClientPlayer this]
    (-> this (.hasPlayerInfo))))

(defn get-location-elytra
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^AbstractClientPlayer this]
    (-> this (.getLocationElytra))))

(defn spectator?
  "returns: `boolean`"
  (^Boolean [^AbstractClientPlayer this]
    (-> this (.isSpectator))))

(defn has-skin?
  "returns: `boolean`"
  (^Boolean [^AbstractClientPlayer this]
    (-> this (.hasSkin))))

(defn player-info-set?
  "returns: `boolean`"
  (^Boolean [^AbstractClientPlayer this]
    (-> this (.isPlayerInfoSet))))

(defn get-location-cape
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^AbstractClientPlayer this]
    (-> this (.getLocationCape))))

(defn get-location-skin
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^AbstractClientPlayer this]
    (-> this (.getLocationSkin))))

