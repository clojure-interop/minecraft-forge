(ns net.minecraft.client.gui.spectator.ISpectatorMenuRecipient
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.spectator ISpectatorMenuRecipient]))

(defn on-spectator-menu-closed
  "p-175257-1 - `net.minecraft.client.gui.spectator.SpectatorMenu`"
  ([^ISpectatorMenuRecipient this ^net.minecraft.client.gui.spectator.SpectatorMenu p-175257-1]
    (-> this (.onSpectatorMenuClosed p-175257-1))))

