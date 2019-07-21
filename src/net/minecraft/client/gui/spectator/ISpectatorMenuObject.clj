(ns net.minecraft.client.gui.spectator.ISpectatorMenuObject
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.spectator ISpectatorMenuObject]))

(defn select-item
  "menu - `net.minecraft.client.gui.spectator.SpectatorMenu`"
  ([^ISpectatorMenuObject this ^net.minecraft.client.gui.spectator.SpectatorMenu menu]
    (-> this (.selectItem menu))))

(defn get-spectator-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^ISpectatorMenuObject this]
    (-> this (.getSpectatorName))))

(defn render-icon
  "p-178663-1 - `float`
  alpha - `int`"
  ([^ISpectatorMenuObject this ^Float p-178663-1 ^Integer alpha]
    (-> this (.renderIcon p-178663-1 alpha))))

(defn enabled?
  "returns: `boolean`"
  (^Boolean [^ISpectatorMenuObject this]
    (-> this (.isEnabled))))

