(ns net.minecraft.client.gui.spectator.categories.TeleportToPlayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.spectator.categories TeleportToPlayer]))

(defn ->teleport-to-player
  "Constructor.

  p-i-45493-1 - `java.util.Collection`"
  (^TeleportToPlayer [^java.util.Collection p-i-45493-1]
    (new TeleportToPlayer p-i-45493-1))
  (^TeleportToPlayer []
    (new TeleportToPlayer )))

(defn get-items
  "returns: `java.util.List<net.minecraft.client.gui.spectator.ISpectatorMenuObject>`"
  (^java.util.List [^TeleportToPlayer this]
    (-> this (.getItems))))

(defn get-prompt
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^TeleportToPlayer this]
    (-> this (.getPrompt))))

(defn select-item
  "menu - `net.minecraft.client.gui.spectator.SpectatorMenu`"
  ([^TeleportToPlayer this ^net.minecraft.client.gui.spectator.SpectatorMenu menu]
    (-> this (.selectItem menu))))

(defn get-spectator-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^TeleportToPlayer this]
    (-> this (.getSpectatorName))))

(defn render-icon
  "p-178663-1 - `float`
  alpha - `int`"
  ([^TeleportToPlayer this ^Float p-178663-1 ^Integer alpha]
    (-> this (.renderIcon p-178663-1 alpha))))

(defn enabled?
  "returns: `boolean`"
  (^Boolean [^TeleportToPlayer this]
    (-> this (.isEnabled))))

