(ns net.minecraft.world.BossInfoServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world BossInfoServer]))

(defn ->boss-info-server
  "Constructor.

  name-in - `net.minecraft.util.text.ITextComponent`
  color-in - `net.minecraft.world.BossInfo$Color`
  overlay-in - `net.minecraft.world.BossInfo$Overlay`"
  (^BossInfoServer [^net.minecraft.util.text.ITextComponent name-in ^net.minecraft.world.BossInfo$Color color-in ^net.minecraft.world.BossInfo$Overlay overlay-in]
    (new BossInfoServer name-in color-in overlay-in)))

(defn set-create-fog
  "create-fog-in - `boolean`

  returns: `net.minecraft.world.BossInfo`"
  (^net.minecraft.world.BossInfo [^BossInfoServer this ^Boolean create-fog-in]
    (-> this (.setCreateFog create-fog-in))))

(defn set-darken-sky
  "darken-sky-in - `boolean`

  returns: `net.minecraft.world.BossInfo`"
  (^net.minecraft.world.BossInfo [^BossInfoServer this ^Boolean darken-sky-in]
    (-> this (.setDarkenSky darken-sky-in))))

(defn get-players
  "returns: `java.util.Collection<net.minecraft.entity.player.EntityPlayerMP>`"
  (^java.util.Collection [^BossInfoServer this]
    (-> this (.getPlayers))))

(defn set-percent
  "percent-in - `float`"
  ([^BossInfoServer this ^Float percent-in]
    (-> this (.setPercent percent-in))))

(defn set-name
  "name-in - `net.minecraft.util.text.ITextComponent`"
  ([^BossInfoServer this ^net.minecraft.util.text.ITextComponent name-in]
    (-> this (.setName name-in))))

(defn remove-player
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^BossInfoServer this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.removePlayer player))))

(defn set-color
  "color-in - `net.minecraft.world.BossInfo$Color`"
  ([^BossInfoServer this ^net.minecraft.world.BossInfo$Color color-in]
    (-> this (.setColor color-in))))

(defn set-play-end-boss-music
  "play-end-boss-music-in - `boolean`

  returns: `net.minecraft.world.BossInfo`"
  (^net.minecraft.world.BossInfo [^BossInfoServer this ^Boolean play-end-boss-music-in]
    (-> this (.setPlayEndBossMusic play-end-boss-music-in))))

(defn set-visible
  "visible-in - `boolean`"
  ([^BossInfoServer this ^Boolean visible-in]
    (-> this (.setVisible visible-in))))

(defn set-overlay
  "overlay-in - `net.minecraft.world.BossInfo$Overlay`"
  ([^BossInfoServer this ^net.minecraft.world.BossInfo$Overlay overlay-in]
    (-> this (.setOverlay overlay-in))))

(defn add-player
  "player - `net.minecraft.entity.player.EntityPlayerMP`"
  ([^BossInfoServer this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.addPlayer player))))

