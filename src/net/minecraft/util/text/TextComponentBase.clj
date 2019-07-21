(ns net.minecraft.util.text.TextComponentBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.text TextComponentBase]))

(defn ->text-component-base
  "Constructor."
  (^TextComponentBase []
    (new TextComponentBase )))

(defn *create-deep-copy-iterator
  "components - `java.lang.Iterable`

  returns: `java.util.Iterator<net.minecraft.util.text.ITextComponent>`"
  (^java.util.Iterator [^java.lang.Iterable components]
    (TextComponentBase/createDeepCopyIterator components)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TextComponentBase this]
    (-> this (.toString))))

(defn iterator
  "returns: `java.util.Iterator<net.minecraft.util.text.ITextComponent>`"
  (^java.util.Iterator [^TextComponentBase this]
    (-> this (.iterator))))

(defn get-siblings
  "returns: `java.util.List<net.minecraft.util.text.ITextComponent>`"
  (^java.util.List [^TextComponentBase this]
    (-> this (.getSiblings))))

(defn set-style
  "style - `net.minecraft.util.text.Style`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^TextComponentBase this ^net.minecraft.util.text.Style style]
    (-> this (.setStyle style))))

(defn append-text
  "text - `java.lang.String`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^TextComponentBase this ^java.lang.String text]
    (-> this (.appendText text))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TextComponentBase this]
    (-> this (.hashCode))))

(defn append-sibling
  "component - `net.minecraft.util.text.ITextComponent`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^TextComponentBase this ^net.minecraft.util.text.ITextComponent component]
    (-> this (.appendSibling component))))

(defn get-formatted-text
  "returns: `java.lang.String`"
  (^java.lang.String [^TextComponentBase this]
    (-> this (.getFormattedText))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TextComponentBase this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn get-unformatted-text
  "returns: `java.lang.String`"
  (^java.lang.String [^TextComponentBase this]
    (-> this (.getUnformattedText))))

(defn get-style
  "returns: `net.minecraft.util.text.Style`"
  (^net.minecraft.util.text.Style [^TextComponentBase this]
    (-> this (.getStyle))))

