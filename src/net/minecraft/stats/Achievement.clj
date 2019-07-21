(ns net.minecraft.stats.Achievement
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.stats Achievement]))

(defn ->achievement
  "Constructor.

  stat-id-in - `java.lang.String`
  unlocalized-name - `java.lang.String`
  column - `int`
  row - `int`
  item-in - `net.minecraft.item.Item`
  parent - `net.minecraft.stats.Achievement`"
  (^Achievement [^java.lang.String stat-id-in ^java.lang.String unlocalized-name ^Integer column ^Integer row ^net.minecraft.item.Item item-in ^net.minecraft.stats.Achievement parent]
    (new Achievement stat-id-in unlocalized-name column row item-in parent)))

(defn display-column
  "Instance Constant.

  type: int"
  (^Integer [^Achievement this]
    (-> this .-displayColumn)))

(defn display-row
  "Instance Constant.

  type: int"
  (^Integer [^Achievement this]
    (-> this .-displayRow)))

(defn parent-achievement
  "Instance Constant.

  type: net.minecraft.stats.Achievement"
  (^net.minecraft.stats.Achievement [^Achievement this]
    (-> this .-parentAchievement)))

(defn the-item-stack
  "Instance Constant.

  type: net.minecraft.item.ItemStack"
  (^net.minecraft.item.ItemStack [^Achievement this]
    (-> this .-theItemStack)))

(defn get-special?
  "returns: `boolean`"
  (^Boolean [^Achievement this]
    (-> this (.getSpecial))))

(defn get-stat-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^Achievement this]
    (-> this (.getStatName))))

(defn set-special
  "returns: `net.minecraft.stats.Achievement`"
  (^net.minecraft.stats.Achievement [^Achievement this]
    (-> this (.setSpecial))))

(defn achievement?
  "returns: `boolean`"
  (^Boolean [^Achievement this]
    (-> this (.isAchievement))))

(defn register-stat
  "returns: `net.minecraft.stats.Achievement`"
  (^net.minecraft.stats.Achievement [^Achievement this]
    (-> this (.registerStat))))

(defn get-description
  "returns: `java.lang.String`"
  (^java.lang.String [^Achievement this]
    (-> this (.getDescription))))

(defn set-stat-string-formatter
  "stat-string-formatter-in - `net.minecraft.stats.IStatStringFormat`

  returns: `net.minecraft.stats.Achievement`"
  (^net.minecraft.stats.Achievement [^Achievement this ^net.minecraft.stats.IStatStringFormat stat-string-formatter-in]
    (-> this (.setStatStringFormatter stat-string-formatter-in))))

(defn init-independent-stat
  "returns: `net.minecraft.stats.Achievement`"
  (^net.minecraft.stats.Achievement [^Achievement this]
    (-> this (.initIndependentStat))))

(defn set-serializable-clazz
  "clazz - `java.lang.Class`

  returns: `net.minecraft.stats.Achievement`"
  (^net.minecraft.stats.Achievement [^Achievement this ^java.lang.Class clazz]
    (-> this (.setSerializableClazz clazz))))

