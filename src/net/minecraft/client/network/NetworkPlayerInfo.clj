(ns net.minecraft.client.network.NetworkPlayerInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.network NetworkPlayerInfo]))

(defn ->network-player-info
  "Constructor.

  profile - `com.mojang.authlib.GameProfile`"
  (^NetworkPlayerInfo [^com.mojang.authlib.GameProfile profile]
    (new NetworkPlayerInfo profile)))

(defn get-skin-type
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkPlayerInfo this]
    (-> this (.getSkinType))))

(defn set-display-name
  "display-name-in - `net.minecraft.util.text.ITextComponent`"
  ([^NetworkPlayerInfo this ^net.minecraft.util.text.ITextComponent display-name-in]
    (-> this (.setDisplayName display-name-in))))

(defn get-last-health-time
  "returns: `long`"
  (^Long [^NetworkPlayerInfo this]
    (-> this (.getLastHealthTime))))

(defn set-last-health-time
  "p-178846-1 - `long`"
  ([^NetworkPlayerInfo this ^Long p-178846-1]
    (-> this (.setLastHealthTime p-178846-1))))

(defn get-location-elytra
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^NetworkPlayerInfo this]
    (-> this (.getLocationElytra))))

(defn has-location-skin?
  "returns: `boolean`"
  (^Boolean [^NetworkPlayerInfo this]
    (-> this (.hasLocationSkin))))

(defn get-response-time
  "returns: `int`"
  (^Integer [^NetworkPlayerInfo this]
    (-> this (.getResponseTime))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^NetworkPlayerInfo this]
    (-> this (.getDisplayName))))

(defn set-last-health
  "p-178836-1 - `int`"
  ([^NetworkPlayerInfo this ^Integer p-178836-1]
    (-> this (.setLastHealth p-178836-1))))

(defn get-last-health
  "returns: `int`"
  (^Integer [^NetworkPlayerInfo this]
    (-> this (.getLastHealth))))

(defn get-location-cape
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^NetworkPlayerInfo this]
    (-> this (.getLocationCape))))

(defn get-game-type
  "returns: `net.minecraft.world.GameType`"
  (^net.minecraft.world.GameType [^NetworkPlayerInfo this]
    (-> this (.getGameType))))

(defn set-health-blink-time
  "p-178844-1 - `long`"
  ([^NetworkPlayerInfo this ^Long p-178844-1]
    (-> this (.setHealthBlinkTime p-178844-1))))

(defn get-display-health
  "returns: `int`"
  (^Integer [^NetworkPlayerInfo this]
    (-> this (.getDisplayHealth))))

(defn set-render-visibility-id
  "p-178843-1 - `long`"
  ([^NetworkPlayerInfo this ^Long p-178843-1]
    (-> this (.setRenderVisibilityId p-178843-1))))

(defn get-location-skin
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^NetworkPlayerInfo this]
    (-> this (.getLocationSkin))))

(defn set-display-health
  "p-178857-1 - `int`"
  ([^NetworkPlayerInfo this ^Integer p-178857-1]
    (-> this (.setDisplayHealth p-178857-1))))

(defn get-game-profile
  "returns: `com.mojang.authlib.GameProfile`"
  (^com.mojang.authlib.GameProfile [^NetworkPlayerInfo this]
    (-> this (.getGameProfile))))

(defn get-health-blink-time
  "returns: `long`"
  (^Long [^NetworkPlayerInfo this]
    (-> this (.getHealthBlinkTime))))

(defn get-render-visibility-id
  "returns: `long`"
  (^Long [^NetworkPlayerInfo this]
    (-> this (.getRenderVisibilityId))))

(defn get-player-team
  "returns: `net.minecraft.scoreboard.ScorePlayerTeam`"
  (^net.minecraft.scoreboard.ScorePlayerTeam [^NetworkPlayerInfo this]
    (-> this (.getPlayerTeam))))

