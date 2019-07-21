(ns net.minecraft.realms.RealmsSimpleScrolledSelectionList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms RealmsSimpleScrolledSelectionList]))

(defn ->realms-simple-scrolled-selection-list
  "Constructor.

  width - `int`
  height - `int`
  top - `int`
  bottom - `int`
  slot-height - `int`"
  (^RealmsSimpleScrolledSelectionList [^Integer width ^Integer height ^Integer top ^Integer bottom ^Integer slot-height]
    (new RealmsSimpleScrolledSelectionList width height top bottom slot-height)))

(defn ym
  "returns: `int`"
  (^Integer [^RealmsSimpleScrolledSelectionList this]
    (-> this (.ym))))

(defn render-item
  "p-render-item-1 - `int`
  p-render-item-2 - `int`
  p-render-item-3 - `int`
  p-render-item-4 - `int`
  p-render-item-5 - `int`
  p-render-item-6 - `int`"
  ([^RealmsSimpleScrolledSelectionList this ^Integer p-render-item-1 ^Integer p-render-item-2 ^Integer p-render-item-3 ^Integer p-render-item-4 ^Integer p-render-item-5 ^Integer p-render-item-6]
    (-> this (.renderItem p-render-item-1 p-render-item-2 p-render-item-3 p-render-item-4 p-render-item-5 p-render-item-6))))

(defn width
  "returns: `int`"
  (^Integer [^RealmsSimpleScrolledSelectionList this]
    (-> this (.width))))

(defn get-max-position
  "returns: `int`"
  (^Integer [^RealmsSimpleScrolledSelectionList this]
    (-> this (.getMaxPosition))))

(defn get-item-count
  "returns: `int`"
  (^Integer [^RealmsSimpleScrolledSelectionList this]
    (-> this (.getItemCount))))

(defn scroll
  "p-scroll-1 - `int`"
  ([^RealmsSimpleScrolledSelectionList this ^Integer p-scroll-1]
    (-> this (.scroll p-scroll-1))))

(defn xm
  "returns: `int`"
  (^Integer [^RealmsSimpleScrolledSelectionList this]
    (-> this (.xm))))

(defn get-scroll
  "returns: `int`"
  (^Integer [^RealmsSimpleScrolledSelectionList this]
    (-> this (.getScroll))))

(defn get-scrollbar-position
  "returns: `int`"
  (^Integer [^RealmsSimpleScrolledSelectionList this]
    (-> this (.getScrollbarPosition))))

(defn render
  "p-render-1 - `int`
  p-render-2 - `int`
  p-render-3 - `float`"
  ([^RealmsSimpleScrolledSelectionList this ^Integer p-render-1 ^Integer p-render-2 ^Float p-render-3]
    (-> this (.render p-render-1 p-render-2 p-render-3))))

(defn select-item
  "p-select-item-1 - `int`
  p-select-item-2 - `boolean`
  p-select-item-3 - `int`
  p-select-item-4 - `int`"
  ([^RealmsSimpleScrolledSelectionList this ^Integer p-select-item-1 ^Boolean p-select-item-2 ^Integer p-select-item-3 ^Integer p-select-item-4]
    (-> this (.selectItem p-select-item-1 p-select-item-2 p-select-item-3 p-select-item-4))))

(defn selected-item?
  "p-is-selected-item-1 - `int`

  returns: `boolean`"
  (^Boolean [^RealmsSimpleScrolledSelectionList this ^Integer p-is-selected-item-1]
    (-> this (.isSelectedItem p-is-selected-item-1))))

(defn mouse-event
  ""
  ([^RealmsSimpleScrolledSelectionList this]
    (-> this (.mouseEvent))))

(defn render-background
  ""
  ([^RealmsSimpleScrolledSelectionList this]
    (-> this (.renderBackground))))

