(ns net.minecraft.client.gui.achievement.GuiAchievements
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.achievement GuiAchievements]))

(defn ->gui-achievements
  "Constructor.

  parent-screen-in - `net.minecraft.client.gui.GuiScreen`
  stat-file-writer-in - `net.minecraft.stats.StatisticsManager`"
  (^GuiAchievements [^net.minecraft.client.gui.GuiScreen parent-screen-in ^net.minecraft.stats.StatisticsManager stat-file-writer-in]
    (new GuiAchievements parent-screen-in stat-file-writer-in)))

(defn init-gui
  ""
  ([^GuiAchievements this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiAchievements this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn done-loading
  ""
  ([^GuiAchievements this]
    (-> this (.doneLoading))))

(defn update-screen
  ""
  ([^GuiAchievements this]
    (-> this (.updateScreen))))

(defn does-gui-pause-game
  "returns: `boolean`"
  (^Boolean [^GuiAchievements this]
    (-> this (.doesGuiPauseGame))))

