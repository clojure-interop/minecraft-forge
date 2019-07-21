(ns net.minecraftforge.common.AchievementPage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common AchievementPage]))

(defn ->achievement-page
  "Constructor.

  name - `java.lang.String`
  achievements - `net.minecraft.stats.Achievement`"
  (^AchievementPage [^java.lang.String name ^net.minecraft.stats.Achievement achievements]
    (new AchievementPage name achievements)))

(defn *register-achievement-page
  "Registers an achievement page.

  page - The page. - `net.minecraftforge.common.AchievementPage`"
  ([^net.minecraftforge.common.AchievementPage page]
    (AchievementPage/registerAchievementPage page)))

(defn *get-achievement-page
  "Will return an achievement page by its index on the list.

  index - The page's index. - `int`

  returns: the achievement page corresponding to the index or null if invalid index - `net.minecraftforge.common.AchievementPage`"
  (^net.minecraftforge.common.AchievementPage [^Integer index]
    (AchievementPage/getAchievementPage index)))

(defn *get-achievement-pages
  "Will return the list of achievement pages.

  returns: the list's size - `java.util.Set<net.minecraftforge.common.AchievementPage>`"
  (^java.util.Set []
    (AchievementPage/getAchievementPages )))

(defn *achievement-in-pages?
  "Will return whether an achievement is in any page or not.

  achievement - The achievement. - `net.minecraft.stats.Achievement`

  returns: `boolean`"
  (^Boolean [^net.minecraft.stats.Achievement achievement]
    (AchievementPage/isAchievementInPages achievement)))

(defn *get-title
  "index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Integer index]
    (AchievementPage/getTitle index)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^AchievementPage this]
    (-> this (.getName))))

(defn get-achievements
  "returns: `java.util.List<net.minecraft.stats.Achievement>`"
  (^java.util.List [^AchievementPage this]
    (-> this (.getAchievements))))

