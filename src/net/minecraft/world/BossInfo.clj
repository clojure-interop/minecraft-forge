(ns net.minecraft.world.BossInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world BossInfo]))

(defn ->boss-info
  "Constructor.

  unique-id-in - `java.util.UUID`
  name-in - `net.minecraft.util.text.ITextComponent`
  color-in - `net.minecraft.world.BossInfo$Color`
  overlay-in - `net.minecraft.world.BossInfo$Overlay`"
  (^BossInfo [^java.util.UUID unique-id-in ^net.minecraft.util.text.ITextComponent name-in ^net.minecraft.world.BossInfo$Color color-in ^net.minecraft.world.BossInfo$Overlay overlay-in]
    (new BossInfo unique-id-in name-in color-in overlay-in)))

(defn set-create-fog
  "create-fog-in - `boolean`

  returns: `net.minecraft.world.BossInfo`"
  (^net.minecraft.world.BossInfo [^BossInfo this ^Boolean create-fog-in]
    (-> this (.setCreateFog create-fog-in))))

(defn set-darken-sky
  "darken-sky-in - `boolean`

  returns: `net.minecraft.world.BossInfo`"
  (^net.minecraft.world.BossInfo [^BossInfo this ^Boolean darken-sky-in]
    (-> this (.setDarkenSky darken-sky-in))))

(defn set-percent
  "percent-in - `float`"
  ([^BossInfo this ^Float percent-in]
    (-> this (.setPercent percent-in))))

(defn set-name
  "name-in - `net.minecraft.util.text.ITextComponent`"
  ([^BossInfo this ^net.minecraft.util.text.ITextComponent name-in]
    (-> this (.setName name-in))))

(defn get-overlay
  "returns: `net.minecraft.world.BossInfo$Overlay`"
  (^net.minecraft.world.BossInfo$Overlay [^BossInfo this]
    (-> this (.getOverlay))))

(defn should-play-end-boss-music?
  "returns: `boolean`"
  (^Boolean [^BossInfo this]
    (-> this (.shouldPlayEndBossMusic))))

(defn get-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^BossInfo this]
    (-> this (.getName))))

(defn get-percent
  "returns: `float`"
  (^Float [^BossInfo this]
    (-> this (.getPercent))))

(defn set-color
  "color-in - `net.minecraft.world.BossInfo$Color`"
  ([^BossInfo this ^net.minecraft.world.BossInfo$Color color-in]
    (-> this (.setColor color-in))))

(defn set-play-end-boss-music
  "play-end-boss-music-in - `boolean`

  returns: `net.minecraft.world.BossInfo`"
  (^net.minecraft.world.BossInfo [^BossInfo this ^Boolean play-end-boss-music-in]
    (-> this (.setPlayEndBossMusic play-end-boss-music-in))))

(defn should-create-fog?
  "returns: `boolean`"
  (^Boolean [^BossInfo this]
    (-> this (.shouldCreateFog))))

(defn get-unique-id
  "returns: `java.util.UUID`"
  (^java.util.UUID [^BossInfo this]
    (-> this (.getUniqueId))))

(defn set-overlay
  "overlay-in - `net.minecraft.world.BossInfo$Overlay`"
  ([^BossInfo this ^net.minecraft.world.BossInfo$Overlay overlay-in]
    (-> this (.setOverlay overlay-in))))

(defn get-color
  "returns: `net.minecraft.world.BossInfo$Color`"
  (^net.minecraft.world.BossInfo$Color [^BossInfo this]
    (-> this (.getColor))))

(defn should-darken-sky?
  "returns: `boolean`"
  (^Boolean [^BossInfo this]
    (-> this (.shouldDarkenSky))))

