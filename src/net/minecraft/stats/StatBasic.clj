(ns net.minecraft.stats.StatBasic
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.stats StatBasic]))

(defn ->stat-basic
  "Constructor.

  stat-id-in - `java.lang.String`
  stat-name-in - `net.minecraft.util.text.ITextComponent`
  type-in - `net.minecraft.stats.IStatType`"
  (^StatBasic [^java.lang.String stat-id-in ^net.minecraft.util.text.ITextComponent stat-name-in ^net.minecraft.stats.IStatType type-in]
    (new StatBasic stat-id-in stat-name-in type-in))
  (^StatBasic [^java.lang.String stat-id-in ^net.minecraft.util.text.ITextComponent stat-name-in]
    (new StatBasic stat-id-in stat-name-in)))

(defn register-stat
  "returns: `net.minecraft.stats.StatBase`"
  (^net.minecraft.stats.StatBase [^StatBasic this]
    (-> this (.registerStat))))

