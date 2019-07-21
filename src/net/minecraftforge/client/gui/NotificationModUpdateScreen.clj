(ns net.minecraftforge.client.gui.NotificationModUpdateScreen
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.gui NotificationModUpdateScreen]))

(defn ->notification-mod-update-screen
  "Constructor.

  mod-button - `net.minecraft.client.gui.GuiButton`"
  (^NotificationModUpdateScreen [^net.minecraft.client.gui.GuiButton mod-button]
    (new NotificationModUpdateScreen mod-button)))

(defn *init
  "gui-main-menu - `net.minecraft.client.gui.GuiMainMenu`
  mod-button - `net.minecraft.client.gui.GuiButton`

  returns: `net.minecraftforge.client.gui.NotificationModUpdateScreen`"
  (^net.minecraftforge.client.gui.NotificationModUpdateScreen [^net.minecraft.client.gui.GuiMainMenu gui-main-menu ^net.minecraft.client.gui.GuiButton mod-button]
    (NotificationModUpdateScreen/init gui-main-menu mod-button)))

(defn init-gui
  ""
  ([^NotificationModUpdateScreen this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^NotificationModUpdateScreen this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

