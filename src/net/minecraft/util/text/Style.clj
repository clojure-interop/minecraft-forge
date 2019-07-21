(ns net.minecraft.util.text.Style
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.text Style]))

(defn ->style
  "Constructor."
  (^Style []
    (new Style )))

(defn get-bold?
  "returns: `boolean`"
  (^Boolean [^Style this]
    (-> this (.getBold))))

(defn set-obfuscated
  "obfuscated - `java.lang.Boolean`

  returns: `net.minecraft.util.text.Style`"
  (^net.minecraft.util.text.Style [^Style this ^java.lang.Boolean obfuscated]
    (-> this (.setObfuscated obfuscated))))

(defn set-insertion
  "insertion - `java.lang.String`

  returns: `net.minecraft.util.text.Style`"
  (^net.minecraft.util.text.Style [^Style this ^java.lang.String insertion]
    (-> this (.setInsertion insertion))))

(defn set-click-event
  "event - `net.minecraft.util.text.event.ClickEvent`

  returns: `net.minecraft.util.text.Style`"
  (^net.minecraft.util.text.Style [^Style this ^net.minecraft.util.text.event.ClickEvent event]
    (-> this (.setClickEvent event))))

(defn get-underlined?
  "returns: `boolean`"
  (^Boolean [^Style this]
    (-> this (.getUnderlined))))

(defn create-shallow-copy
  "returns: `net.minecraft.util.text.Style`"
  (^net.minecraft.util.text.Style [^Style this]
    (-> this (.createShallowCopy))))

(defn set-parent-style
  "parent - `net.minecraft.util.text.Style`

  returns: `net.minecraft.util.text.Style`"
  (^net.minecraft.util.text.Style [^Style this ^net.minecraft.util.text.Style parent]
    (-> this (.setParentStyle parent))))

(defn set-strikethrough
  "strikethrough - `java.lang.Boolean`

  returns: `net.minecraft.util.text.Style`"
  (^net.minecraft.util.text.Style [^Style this ^java.lang.Boolean strikethrough]
    (-> this (.setStrikethrough strikethrough))))

(defn set-underlined
  "underlined - `java.lang.Boolean`

  returns: `net.minecraft.util.text.Style`"
  (^net.minecraft.util.text.Style [^Style this ^java.lang.Boolean underlined]
    (-> this (.setUnderlined underlined))))

(defn set-italic
  "italic - `java.lang.Boolean`

  returns: `net.minecraft.util.text.Style`"
  (^net.minecraft.util.text.Style [^Style this ^java.lang.Boolean italic]
    (-> this (.setItalic italic))))

(defn create-deep-copy
  "returns: `net.minecraft.util.text.Style`"
  (^net.minecraft.util.text.Style [^Style this]
    (-> this (.createDeepCopy))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Style this]
    (-> this (.toString))))

(defn set-bold
  "bold-in - `java.lang.Boolean`

  returns: `net.minecraft.util.text.Style`"
  (^net.minecraft.util.text.Style [^Style this ^java.lang.Boolean bold-in]
    (-> this (.setBold bold-in))))

(defn set-color
  "color - `net.minecraft.util.text.TextFormatting`

  returns: `net.minecraft.util.text.Style`"
  (^net.minecraft.util.text.Style [^Style this ^net.minecraft.util.text.TextFormatting color]
    (-> this (.setColor color))))

(defn get-click-event
  "returns: `net.minecraft.util.text.event.ClickEvent`"
  (^net.minecraft.util.text.event.ClickEvent [^Style this]
    (-> this (.getClickEvent))))

(defn get-insertion
  "returns: `java.lang.String`"
  (^java.lang.String [^Style this]
    (-> this (.getInsertion))))

(defn get-formatting-code
  "returns: `java.lang.String`"
  (^java.lang.String [^Style this]
    (-> this (.getFormattingCode))))

(defn get-obfuscated?
  "returns: `boolean`"
  (^Boolean [^Style this]
    (-> this (.getObfuscated))))

(defn get-strikethrough?
  "returns: `boolean`"
  (^Boolean [^Style this]
    (-> this (.getStrikethrough))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Style this]
    (-> this (.hashCode))))

(defn get-hover-event
  "returns: `net.minecraft.util.text.event.HoverEvent`"
  (^net.minecraft.util.text.event.HoverEvent [^Style this]
    (-> this (.getHoverEvent))))

(defn set-hover-event
  "event - `net.minecraft.util.text.event.HoverEvent`

  returns: `net.minecraft.util.text.Style`"
  (^net.minecraft.util.text.Style [^Style this ^net.minecraft.util.text.event.HoverEvent event]
    (-> this (.setHoverEvent event))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^Style this]
    (-> this (.isEmpty))))

(defn get-color
  "returns: `net.minecraft.util.text.TextFormatting`"
  (^net.minecraft.util.text.TextFormatting [^Style this]
    (-> this (.getColor))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Style this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn get-italic?
  "returns: `boolean`"
  (^Boolean [^Style this]
    (-> this (.getItalic))))

