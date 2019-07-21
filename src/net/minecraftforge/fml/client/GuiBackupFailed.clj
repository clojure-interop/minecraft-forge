(ns net.minecraftforge.fml.client.GuiBackupFailed
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client GuiBackupFailed]))

(defn ->gui-backup-failed
  "Constructor.

  parent - `net.minecraft.client.gui.GuiScreen`
  zip-name - `java.io.File`"
  (^GuiBackupFailed [^net.minecraft.client.gui.GuiScreen parent ^java.io.File zip-name]
    (new GuiBackupFailed parent zip-name)))

(defn init-gui
  ""
  ([^GuiBackupFailed this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiBackupFailed this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

