(ns net.minecraft.client.gui.spectator.SpectatorMenu
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.spectator SpectatorMenu]))

(defn ->spectator-menu
  "Constructor.

  p-i-45497-1 - `net.minecraft.client.gui.spectator.ISpectatorMenuRecipient`"
  (^SpectatorMenu [^net.minecraft.client.gui.spectator.ISpectatorMenuRecipient p-i-45497-1]
    (new SpectatorMenu p-i-45497-1)))

(def *-empty-slot
  "Static Constant.

  type: net.minecraft.client.gui.spectator.ISpectatorMenuObject"
  SpectatorMenu/EMPTY_SLOT)

(defn get-item
  "p-178643-1 - `int`

  returns: `net.minecraft.client.gui.spectator.ISpectatorMenuObject`"
  (^net.minecraft.client.gui.spectator.ISpectatorMenuObject [^SpectatorMenu this ^Integer p-178643-1]
    (-> this (.getItem p-178643-1))))

(defn select-slot
  "slot-in - `int`"
  ([^SpectatorMenu this ^Integer slot-in]
    (-> this (.selectSlot slot-in))))

(defn get-selected-slot
  "returns: `int`"
  (^Integer [^SpectatorMenu this]
    (-> this (.getSelectedSlot))))

(defn get-items
  "returns: `java.util.List<net.minecraft.client.gui.spectator.ISpectatorMenuObject>`"
  (^java.util.List [^SpectatorMenu this]
    (-> this (.getItems))))

(defn get-selected-category
  "returns: `net.minecraft.client.gui.spectator.ISpectatorMenuView`"
  (^net.minecraft.client.gui.spectator.ISpectatorMenuView [^SpectatorMenu this]
    (-> this (.getSelectedCategory))))

(defn get-selected-item
  "returns: `net.minecraft.client.gui.spectator.ISpectatorMenuObject`"
  (^net.minecraft.client.gui.spectator.ISpectatorMenuObject [^SpectatorMenu this]
    (-> this (.getSelectedItem))))

(defn exit
  ""
  ([^SpectatorMenu this]
    (-> this (.exit))))

(defn select-category
  "menu-view - `net.minecraft.client.gui.spectator.ISpectatorMenuView`"
  ([^SpectatorMenu this ^net.minecraft.client.gui.spectator.ISpectatorMenuView menu-view]
    (-> this (.selectCategory menu-view))))

(defn get-current-page
  "returns: `net.minecraft.client.gui.spectator.categories.SpectatorDetails`"
  (^net.minecraft.client.gui.spectator.categories.SpectatorDetails [^SpectatorMenu this]
    (-> this (.getCurrentPage))))

