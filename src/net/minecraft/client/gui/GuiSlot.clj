(ns net.minecraft.client.gui.GuiSlot
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiSlot]))

(defn ->gui-slot
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`
  width - `int`
  height - `int`
  top-in - `int`
  bottom-in - `int`
  slot-height-in - `int`"
  (^GuiSlot [^net.minecraft.client.Minecraft mc-in ^Integer width ^Integer height ^Integer top-in ^Integer bottom-in ^Integer slot-height-in]
    (new GuiSlot mc-in width height top-in bottom-in slot-height-in)))

(defn width
  "Instance Field.

  type: int"
  (^Integer [^GuiSlot this]
    (-> this .-width)))

(defn height
  "Instance Field.

  type: int"
  (^Integer [^GuiSlot this]
    (-> this .-height)))

(defn top
  "Instance Field.

  type: int"
  (^Integer [^GuiSlot this]
    (-> this .-top)))

(defn bottom
  "Instance Field.

  type: int"
  (^Integer [^GuiSlot this]
    (-> this .-bottom)))

(defn right
  "Instance Field.

  type: int"
  (^Integer [^GuiSlot this]
    (-> this .-right)))

(defn left
  "Instance Field.

  type: int"
  (^Integer [^GuiSlot this]
    (-> this .-left)))

(defn slot-height
  "Instance Constant.

  type: int"
  (^Integer [^GuiSlot this]
    (-> this .-slotHeight)))

(defn header-padding
  "Instance Field.

  type: int"
  (^Integer [^GuiSlot this]
    (-> this .-headerPadding)))

(defn get-list-width
  "returns: `int`"
  (^Integer [^GuiSlot this]
    (-> this (.getListWidth))))

(defn get-max-scroll
  "returns: `int`"
  (^Integer [^GuiSlot this]
    (-> this (.getMaxScroll))))

(defn draw-screen
  "mouse-x-in - `int`
  mouse-y-in - `int`
  partial-ticks - `float`"
  ([^GuiSlot this ^Integer mouse-x-in ^Integer mouse-y-in ^Float partial-ticks]
    (-> this (.drawScreen mouse-x-in mouse-y-in partial-ticks))))

(defn get-slot-height
  "returns: `int`"
  (^Integer [^GuiSlot this]
    (-> this (.getSlotHeight))))

(defn scroll-by
  "amount - `int`"
  ([^GuiSlot this ^Integer amount]
    (-> this (.scrollBy amount))))

(defn set-dimensions
  "width-in - `int`
  height-in - `int`
  top-in - `int`
  bottom-in - `int`"
  ([^GuiSlot this ^Integer width-in ^Integer height-in ^Integer top-in ^Integer bottom-in]
    (-> this (.setDimensions width-in height-in top-in bottom-in))))

(defn mouse-y-within-slot-bounds?
  "p-148141-1 - `int`

  returns: `boolean`"
  (^Boolean [^GuiSlot this ^Integer p-148141-1]
    (-> this (.isMouseYWithinSlotBounds p-148141-1))))

(defn handle-mouse-input
  ""
  ([^GuiSlot this]
    (-> this (.handleMouseInput))))

(defn set-show-selection-box
  "show-selection-box-in - `boolean`"
  ([^GuiSlot this ^Boolean show-selection-box-in]
    (-> this (.setShowSelectionBox show-selection-box-in))))

(defn action-performed
  "button - `net.minecraft.client.gui.GuiButton`"
  ([^GuiSlot this ^net.minecraft.client.gui.GuiButton button]
    (-> this (.actionPerformed button))))

(defn set-enabled
  "enabled-in - `boolean`"
  ([^GuiSlot this ^Boolean enabled-in]
    (-> this (.setEnabled enabled-in))))

(defn get-amount-scrolled
  "returns: `int`"
  (^Integer [^GuiSlot this]
    (-> this (.getAmountScrolled))))

(defn get-enabled?
  "returns: `boolean`"
  (^Boolean [^GuiSlot this]
    (-> this (.getEnabled))))

(defn get-slot-index-from-screen-coords
  "pos-x - `int`
  pos-y - `int`

  returns: `int`"
  (^Integer [^GuiSlot this ^Integer pos-x ^Integer pos-y]
    (-> this (.getSlotIndexFromScreenCoords pos-x pos-y))))

(defn register-scroll-buttons
  "scroll-up-button-id-in - `int`
  scroll-down-button-id-in - `int`"
  ([^GuiSlot this ^Integer scroll-up-button-id-in ^Integer scroll-down-button-id-in]
    (-> this (.registerScrollButtons scroll-up-button-id-in scroll-down-button-id-in))))

(defn set-slot-x-bounds-from-left
  "left-in - `int`"
  ([^GuiSlot this ^Integer left-in]
    (-> this (.setSlotXBoundsFromLeft left-in))))

