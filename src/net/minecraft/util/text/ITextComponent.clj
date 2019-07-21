(ns net.minecraft.util.text.ITextComponent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.text ITextComponent]))

(defn get-siblings
  "returns: `java.util.List<net.minecraft.util.text.ITextComponent>`"
  (^java.util.List [^ITextComponent this]
    (-> this (.getSiblings))))

(defn set-style
  "style - `net.minecraft.util.text.Style`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^ITextComponent this ^net.minecraft.util.text.Style style]
    (-> this (.setStyle style))))

(defn get-unformatted-component-text
  "returns: `java.lang.String`"
  (^java.lang.String [^ITextComponent this]
    (-> this (.getUnformattedComponentText))))

(defn append-text
  "text - `java.lang.String`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^ITextComponent this ^java.lang.String text]
    (-> this (.appendText text))))

(defn append-sibling
  "component - `net.minecraft.util.text.ITextComponent`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^ITextComponent this ^net.minecraft.util.text.ITextComponent component]
    (-> this (.appendSibling component))))

(defn get-formatted-text
  "returns: `java.lang.String`"
  (^java.lang.String [^ITextComponent this]
    (-> this (.getFormattedText))))

(defn create-copy
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^ITextComponent this]
    (-> this (.createCopy))))

(defn get-unformatted-text
  "returns: `java.lang.String`"
  (^java.lang.String [^ITextComponent this]
    (-> this (.getUnformattedText))))

(defn get-style
  "returns: `net.minecraft.util.text.Style`"
  (^net.minecraft.util.text.Style [^ITextComponent this]
    (-> this (.getStyle))))

