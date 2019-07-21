(ns net.minecraft.client.gui.achievement.GuiAchievement
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.achievement GuiAchievement]))

(defn ->gui-achievement
  "Constructor.

  mc - `net.minecraft.client.Minecraft`"
  (^GuiAchievement [^net.minecraft.client.Minecraft mc]
    (new GuiAchievement mc)))

(defn display-achievement
  "ach - `net.minecraft.stats.Achievement`"
  ([^GuiAchievement this ^net.minecraft.stats.Achievement ach]
    (-> this (.displayAchievement ach))))

(defn display-unformatted-achievement
  "achievement-in - `net.minecraft.stats.Achievement`"
  ([^GuiAchievement this ^net.minecraft.stats.Achievement achievement-in]
    (-> this (.displayUnformattedAchievement achievement-in))))

(defn update-achievement-window
  ""
  ([^GuiAchievement this]
    (-> this (.updateAchievementWindow))))

(defn clear-achievements
  ""
  ([^GuiAchievement this]
    (-> this (.clearAchievements))))

