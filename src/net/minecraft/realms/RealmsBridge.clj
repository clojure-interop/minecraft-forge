(ns net.minecraft.realms.RealmsBridge
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms RealmsBridge]))

(defn ->realms-bridge
  "Constructor."
  (^RealmsBridge []
    (new RealmsBridge )))

(defn switch-to-realms
  "p-switch-to-realms-1 - `net.minecraft.client.gui.GuiScreen`"
  ([^RealmsBridge this ^net.minecraft.client.gui.GuiScreen p-switch-to-realms-1]
    (-> this (.switchToRealms p-switch-to-realms-1))))

(defn get-notification-screen
  "p-get-notification-screen-1 - `net.minecraft.client.gui.GuiScreen`

  returns: `net.minecraft.client.gui.GuiScreenRealmsProxy`"
  (^net.minecraft.client.gui.GuiScreenRealmsProxy [^RealmsBridge this ^net.minecraft.client.gui.GuiScreen p-get-notification-screen-1]
    (-> this (.getNotificationScreen p-get-notification-screen-1))))

(defn init
  ""
  ([^RealmsBridge this]
    (-> this (.init))))

