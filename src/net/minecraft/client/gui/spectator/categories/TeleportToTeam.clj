(ns net.minecraft.client.gui.spectator.categories.TeleportToTeam
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.spectator.categories TeleportToTeam]))

(defn ->teleport-to-team
  "Constructor."
  (^TeleportToTeam []
    (new TeleportToTeam )))

(defn get-items
  "returns: `java.util.List<net.minecraft.client.gui.spectator.ISpectatorMenuObject>`"
  (^java.util.List [^TeleportToTeam this]
    (-> this (.getItems))))

(defn get-prompt
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^TeleportToTeam this]
    (-> this (.getPrompt))))

(defn select-item
  "menu - `net.minecraft.client.gui.spectator.SpectatorMenu`"
  ([^TeleportToTeam this ^net.minecraft.client.gui.spectator.SpectatorMenu menu]
    (-> this (.selectItem menu))))

(defn get-spectator-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^TeleportToTeam this]
    (-> this (.getSpectatorName))))

(defn render-icon
  "p-178663-1 - `float`
  alpha - `int`"
  ([^TeleportToTeam this ^Float p-178663-1 ^Integer alpha]
    (-> this (.renderIcon p-178663-1 alpha))))

(defn enabled?
  "returns: `boolean`"
  (^Boolean [^TeleportToTeam this]
    (-> this (.isEnabled))))

