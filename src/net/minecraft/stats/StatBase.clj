(ns net.minecraft.stats.StatBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.stats StatBase]))

(defn ->stat-base
  "Constructor.

  stat-id-in - `java.lang.String`
  stat-name-in - `net.minecraft.util.text.ITextComponent`
  formatter-in - `net.minecraft.stats.IStatType`"
  (^StatBase [^java.lang.String stat-id-in ^net.minecraft.util.text.ITextComponent stat-name-in ^net.minecraft.stats.IStatType formatter-in]
    (new StatBase stat-id-in stat-name-in formatter-in))
  (^StatBase [^java.lang.String stat-id-in ^net.minecraft.util.text.ITextComponent stat-name-in]
    (new StatBase stat-id-in stat-name-in)))

(defn stat-id
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^StatBase this]
    (-> this .-statId)))

(defn is-independent
  "Instance Field.

  type: boolean"
  (^Boolean [^StatBase this]
    (-> this .-isIndependent)))

(defn *-simple-stat-type
  "Static Field.

  type: net.minecraft.stats.IStatType"
  []
  StatBase/simpleStatType)

(defn *-time-stat-type
  "Static Field.

  type: net.minecraft.stats.IStatType"
  []
  StatBase/timeStatType)

(defn *-distance-stat-type
  "Static Field.

  type: net.minecraft.stats.IStatType"
  []
  StatBase/distanceStatType)

(defn *-divide-by-ten
  "Static Field.

  type: net.minecraft.stats.IStatType"
  []
  StatBase/divideByTen)

(defn get-stat-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^StatBase this]
    (-> this (.getStatName))))

(defn get-serializable-clazz
  "returns: `java.lang.Class<? extends net.minecraft.util.IJsonSerializable>`"
  ([^StatBase this]
    (-> this (.getSerializableClazz))))

(defn achievement?
  "returns: `boolean`"
  (^Boolean [^StatBase this]
    (-> this (.isAchievement))))

(defn register-stat
  "returns: `net.minecraft.stats.StatBase`"
  (^net.minecraft.stats.StatBase [^StatBase this]
    (-> this (.registerStat))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StatBase this]
    (-> this (.toString))))

(defn get-criteria
  "returns: `net.minecraft.scoreboard.IScoreCriteria`"
  (^net.minecraft.scoreboard.IScoreCriteria [^StatBase this]
    (-> this (.getCriteria))))

(defn hash-code
  "returns: `int`"
  (^Integer [^StatBase this]
    (-> this (.hashCode))))

(defn create-chat-component
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^StatBase this]
    (-> this (.createChatComponent))))

(defn init-independent-stat
  "returns: `net.minecraft.stats.StatBase`"
  (^net.minecraft.stats.StatBase [^StatBase this]
    (-> this (.initIndependentStat))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^StatBase this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn format
  "number - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^StatBase this ^Integer number]
    (-> this (.format number))))

(defn set-serializable-clazz
  "clazz - `java.lang.Class`

  returns: `net.minecraft.stats.StatBase`"
  (^net.minecraft.stats.StatBase [^StatBase this ^java.lang.Class clazz]
    (-> this (.setSerializableClazz clazz))))

