(ns net.minecraft.client.gui.spectator.PlayerMenuObject
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.spectator PlayerMenuObject]))

(defn ->player-menu-object
  "Constructor.

  profile-in - `com.mojang.authlib.GameProfile`"
  (^PlayerMenuObject [^com.mojang.authlib.GameProfile profile-in]
    (new PlayerMenuObject profile-in)))

(defn select-item
  "menu - `net.minecraft.client.gui.spectator.SpectatorMenu`"
  ([^PlayerMenuObject this ^net.minecraft.client.gui.spectator.SpectatorMenu menu]
    (-> this (.selectItem menu))))

(defn get-spectator-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^PlayerMenuObject this]
    (-> this (.getSpectatorName))))

(defn render-icon
  "p-178663-1 - `float`
  alpha - `int`"
  ([^PlayerMenuObject this ^Float p-178663-1 ^Integer alpha]
    (-> this (.renderIcon p-178663-1 alpha))))

(defn enabled?
  "returns: `boolean`"
  (^Boolean [^PlayerMenuObject this]
    (-> this (.isEnabled))))

