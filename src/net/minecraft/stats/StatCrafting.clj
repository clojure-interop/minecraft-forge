(ns net.minecraft.stats.StatCrafting
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.stats StatCrafting]))

(defn ->stat-crafting
  "Constructor.

  p-i-45910-1 - `java.lang.String`
  p-i-45910-2 - `java.lang.String`
  stat-name-in - `net.minecraft.util.text.ITextComponent`
  p-i-45910-4 - `net.minecraft.item.Item`"
  (^StatCrafting [^java.lang.String p-i-45910-1 ^java.lang.String p-i-45910-2 ^net.minecraft.util.text.ITextComponent stat-name-in ^net.minecraft.item.Item p-i-45910-4]
    (new StatCrafting p-i-45910-1 p-i-45910-2 stat-name-in p-i-45910-4)))

(defn get-item
  "returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^StatCrafting this]
    (-> this (.getItem))))

