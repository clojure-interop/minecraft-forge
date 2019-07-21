(ns net.minecraft.client.gui.spectator.BaseSpectatorGroup
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.spectator BaseSpectatorGroup]))

(defn ->base-spectator-group
  "Constructor."
  (^BaseSpectatorGroup []
    (new BaseSpectatorGroup )))

(defn get-items
  "returns: `java.util.List<net.minecraft.client.gui.spectator.ISpectatorMenuObject>`"
  (^java.util.List [^BaseSpectatorGroup this]
    (-> this (.getItems))))

(defn get-prompt
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^BaseSpectatorGroup this]
    (-> this (.getPrompt))))

