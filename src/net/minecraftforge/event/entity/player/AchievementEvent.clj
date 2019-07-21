(ns net.minecraftforge.event.entity.player.AchievementEvent
  "When the player receives an achievement. If canceled the player will not receive anything."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player AchievementEvent]))

(defn ->achievement-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  achievement - `net.minecraft.stats.Achievement`"
  (^AchievementEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.stats.Achievement achievement]
    (new AchievementEvent player achievement)))

(defn get-achievement
  "returns: `net.minecraft.stats.Achievement`"
  (^net.minecraft.stats.Achievement [^AchievementEvent this]
    (-> this (.getAchievement))))

