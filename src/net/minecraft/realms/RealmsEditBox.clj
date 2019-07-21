(ns net.minecraft.realms.RealmsEditBox
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms RealmsEditBox]))

(defn ->realms-edit-box
  "Constructor.

  id - `int`
  x - `int`
  y - `int`
  width - `int`
  height - `int`"
  (^RealmsEditBox [^Integer id ^Integer x ^Integer y ^Integer width ^Integer height]
    (new RealmsEditBox id x y width height)))

(defn tick
  ""
  ([^RealmsEditBox this]
    (-> this (.tick))))

(defn set-is-editable
  "p-set-is-editable-1 - `boolean`"
  ([^RealmsEditBox this ^Boolean p-set-is-editable-1]
    (-> this (.setIsEditable p-set-is-editable-1))))

(defn get-value
  "returns: `java.lang.String`"
  (^java.lang.String [^RealmsEditBox this]
    (-> this (.getValue))))

(defn key-pressed
  "p-key-pressed-1 - `char`
  p-key-pressed-2 - `int`"
  ([^RealmsEditBox this ^Character p-key-pressed-1 ^Integer p-key-pressed-2]
    (-> this (.keyPressed p-key-pressed-1 p-key-pressed-2))))

(defn set-max-length
  "p-set-max-length-1 - `int`"
  ([^RealmsEditBox this ^Integer p-set-max-length-1]
    (-> this (.setMaxLength p-set-max-length-1))))

(defn set-value
  "p-set-value-1 - `java.lang.String`"
  ([^RealmsEditBox this ^java.lang.String p-set-value-1]
    (-> this (.setValue p-set-value-1))))

(defn render
  ""
  ([^RealmsEditBox this]
    (-> this (.render))))

(defn mouse-clicked
  "p-mouse-clicked-1 - `int`
  p-mouse-clicked-2 - `int`
  p-mouse-clicked-3 - `int`"
  ([^RealmsEditBox this ^Integer p-mouse-clicked-1 ^Integer p-mouse-clicked-2 ^Integer p-mouse-clicked-3]
    (-> this (.mouseClicked p-mouse-clicked-1 p-mouse-clicked-2 p-mouse-clicked-3))))

(defn set-focus
  "p-set-focus-1 - `boolean`"
  ([^RealmsEditBox this ^Boolean p-set-focus-1]
    (-> this (.setFocus p-set-focus-1))))

(defn focused?
  "returns: `boolean`"
  (^Boolean [^RealmsEditBox this]
    (-> this (.isFocused))))

