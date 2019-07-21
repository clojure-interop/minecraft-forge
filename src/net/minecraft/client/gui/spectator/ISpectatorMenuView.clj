(ns net.minecraft.client.gui.spectator.ISpectatorMenuView
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.spectator ISpectatorMenuView]))

(defn get-items
  "returns: `java.util.List<net.minecraft.client.gui.spectator.ISpectatorMenuObject>`"
  (^java.util.List [^ISpectatorMenuView this]
    (-> this (.getItems))))

(defn get-prompt
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^ISpectatorMenuView this]
    (-> this (.getPrompt))))

