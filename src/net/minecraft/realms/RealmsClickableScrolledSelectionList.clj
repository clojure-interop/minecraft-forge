(ns net.minecraft.realms.RealmsClickableScrolledSelectionList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms RealmsClickableScrolledSelectionList]))

(defn ->realms-clickable-scrolled-selection-list
  "Constructor.

  p-i-46052-1 - `int`
  p-i-46052-2 - `int`
  p-i-46052-3 - `int`
  p-i-46052-4 - `int`
  p-i-46052-5 - `int`"
  (^RealmsClickableScrolledSelectionList [^Integer p-i-46052-1 ^Integer p-i-46052-2 ^Integer p-i-46052-3 ^Integer p-i-46052-4 ^Integer p-i-46052-5]
    (new RealmsClickableScrolledSelectionList p-i-46052-1 p-i-46052-2 p-i-46052-3 p-i-46052-4 p-i-46052-5)))

(defn ym
  "returns: `int`"
  (^Integer [^RealmsClickableScrolledSelectionList this]
    (-> this (.ym))))

(defn render-item
  "p-render-item-1 - `int`
  p-render-item-2 - `int`
  p-render-item-3 - `int`
  p-render-item-4 - `int`
  p-render-item-5 - `int`
  p-render-item-6 - `int`"
  ([^RealmsClickableScrolledSelectionList this ^Integer p-render-item-1 ^Integer p-render-item-2 ^Integer p-render-item-3 ^Integer p-render-item-4 ^Integer p-render-item-5 ^Integer p-render-item-6]
    (-> this (.renderItem p-render-item-1 p-render-item-2 p-render-item-3 p-render-item-4 p-render-item-5 p-render-item-6))))

(defn width
  "returns: `int`"
  (^Integer [^RealmsClickableScrolledSelectionList this]
    (-> this (.width))))

(defn get-max-position
  "returns: `int`"
  (^Integer [^RealmsClickableScrolledSelectionList this]
    (-> this (.getMaxPosition))))

(defn get-item-count
  "returns: `int`"
  (^Integer [^RealmsClickableScrolledSelectionList this]
    (-> this (.getItemCount))))

(defn scroll
  "p-scroll-1 - `int`"
  ([^RealmsClickableScrolledSelectionList this ^Integer p-scroll-1]
    (-> this (.scroll p-scroll-1))))

(defn xm
  "returns: `int`"
  (^Integer [^RealmsClickableScrolledSelectionList this]
    (-> this (.xm))))

(defn render-selected
  "p-render-selected-1 - `int`
  p-render-selected-2 - `int`
  p-render-selected-3 - `int`
  p-render-selected-4 - `net.minecraft.realms.Tezzelator`"
  ([^RealmsClickableScrolledSelectionList this ^Integer p-render-selected-1 ^Integer p-render-selected-2 ^Integer p-render-selected-3 ^net.minecraft.realms.Tezzelator p-render-selected-4]
    (-> this (.renderSelected p-render-selected-1 p-render-selected-2 p-render-selected-3 p-render-selected-4))))

(defn item-clicked
  "p-item-clicked-1 - `int`
  p-item-clicked-2 - `int`
  p-item-clicked-3 - `int`
  p-item-clicked-4 - `int`
  p-item-clicked-5 - `int`"
  ([^RealmsClickableScrolledSelectionList this ^Integer p-item-clicked-1 ^Integer p-item-clicked-2 ^Integer p-item-clicked-3 ^Integer p-item-clicked-4 ^Integer p-item-clicked-5]
    (-> this (.itemClicked p-item-clicked-1 p-item-clicked-2 p-item-clicked-3 p-item-clicked-4 p-item-clicked-5))))

(defn get-scroll
  "returns: `int`"
  (^Integer [^RealmsClickableScrolledSelectionList this]
    (-> this (.getScroll))))

(defn get-scrollbar-position
  "returns: `int`"
  (^Integer [^RealmsClickableScrolledSelectionList this]
    (-> this (.getScrollbarPosition))))

(defn custom-mouse-event
  "p-custom-mouse-event-1 - `int`
  p-custom-mouse-event-2 - `int`
  p-custom-mouse-event-3 - `int`
  p-custom-mouse-event-4 - `float`
  p-custom-mouse-event-5 - `int`"
  ([^RealmsClickableScrolledSelectionList this ^Integer p-custom-mouse-event-1 ^Integer p-custom-mouse-event-2 ^Integer p-custom-mouse-event-3 ^Float p-custom-mouse-event-4 ^Integer p-custom-mouse-event-5]
    (-> this (.customMouseEvent p-custom-mouse-event-1 p-custom-mouse-event-2 p-custom-mouse-event-3 p-custom-mouse-event-4 p-custom-mouse-event-5))))

(defn render
  "p-render-1 - `int`
  p-render-2 - `int`
  p-render-3 - `float`"
  ([^RealmsClickableScrolledSelectionList this ^Integer p-render-1 ^Integer p-render-2 ^Float p-render-3]
    (-> this (.render p-render-1 p-render-2 p-render-3))))

(defn select-item
  "p-select-item-1 - `int`
  p-select-item-2 - `boolean`
  p-select-item-3 - `int`
  p-select-item-4 - `int`"
  ([^RealmsClickableScrolledSelectionList this ^Integer p-select-item-1 ^Boolean p-select-item-2 ^Integer p-select-item-3 ^Integer p-select-item-4]
    (-> this (.selectItem p-select-item-1 p-select-item-2 p-select-item-3 p-select-item-4))))

(defn selected-item?
  "p-is-selected-item-1 - `int`

  returns: `boolean`"
  (^Boolean [^RealmsClickableScrolledSelectionList this ^Integer p-is-selected-item-1]
    (-> this (.isSelectedItem p-is-selected-item-1))))

(defn mouse-event
  ""
  ([^RealmsClickableScrolledSelectionList this]
    (-> this (.mouseEvent))))

(defn render-background
  ""
  ([^RealmsClickableScrolledSelectionList this]
    (-> this (.renderBackground))))

(defn set-left-pos
  "p-set-left-pos-1 - `int`"
  ([^RealmsClickableScrolledSelectionList this ^Integer p-set-left-pos-1]
    (-> this (.setLeftPos p-set-left-pos-1))))

