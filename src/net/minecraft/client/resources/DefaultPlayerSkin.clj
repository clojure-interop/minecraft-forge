(ns net.minecraft.client.resources.DefaultPlayerSkin
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources DefaultPlayerSkin]))

(defn ->default-player-skin
  "Constructor."
  (^DefaultPlayerSkin []
    (new DefaultPlayerSkin )))

(defn *get-default-skin-legacy
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation []
    (DefaultPlayerSkin/getDefaultSkinLegacy )))

(defn *get-default-skin
  "player-uuid - `java.util.UUID`

  returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^java.util.UUID player-uuid]
    (DefaultPlayerSkin/getDefaultSkin player-uuid)))

(defn *get-skin-type
  "player-uuid - `java.util.UUID`

  returns: `java.lang.String`"
  (^java.lang.String [^java.util.UUID player-uuid]
    (DefaultPlayerSkin/getSkinType player-uuid)))

