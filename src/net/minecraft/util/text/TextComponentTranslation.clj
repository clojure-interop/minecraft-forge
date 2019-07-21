(ns net.minecraft.util.text.TextComponentTranslation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.text TextComponentTranslation]))

(defn ->text-component-translation
  "Constructor.

  translation-key - `java.lang.String`
  args - `java.lang.Object`"
  (^TextComponentTranslation [^java.lang.String translation-key ^java.lang.Object args]
    (new TextComponentTranslation translation-key args)))

(def *-string-variable-pattern
  "Static Constant.

  type: java.util.regex.Pattern"
  TextComponentTranslation/STRING_VARIABLE_PATTERN)

(defn get-format-args
  "returns: `java.lang.Object[]`"
  ([^TextComponentTranslation this]
    (-> this (.getFormatArgs))))

(defn get-key
  "returns: `java.lang.String`"
  (^java.lang.String [^TextComponentTranslation this]
    (-> this (.getKey))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TextComponentTranslation this]
    (-> this (.toString))))

(defn iterator
  "returns: `java.util.Iterator<net.minecraft.util.text.ITextComponent>`"
  (^java.util.Iterator [^TextComponentTranslation this]
    (-> this (.iterator))))

(defn set-style
  "style - `net.minecraft.util.text.Style`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^TextComponentTranslation this ^net.minecraft.util.text.Style style]
    (-> this (.setStyle style))))

(defn get-unformatted-component-text
  "returns: `java.lang.String`"
  (^java.lang.String [^TextComponentTranslation this]
    (-> this (.getUnformattedComponentText))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TextComponentTranslation this]
    (-> this (.hashCode))))

(defn create-copy
  "returns: `net.minecraft.util.text.TextComponentTranslation`"
  (^net.minecraft.util.text.TextComponentTranslation [^TextComponentTranslation this]
    (-> this (.createCopy))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TextComponentTranslation this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

