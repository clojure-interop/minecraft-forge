(ns net.minecraft.realms.RealmsScreen
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms RealmsScreen]))

(defn ->realms-screen
  "Constructor."
  (^RealmsScreen []
    (new RealmsScreen )))

(def *-skin-head-u
  "Static Constant.

  type: int"
  RealmsScreen/SKIN_HEAD_U)

(def *-skin-head-v
  "Static Constant.

  type: int"
  RealmsScreen/SKIN_HEAD_V)

(def *-skin-head-width
  "Static Constant.

  type: int"
  RealmsScreen/SKIN_HEAD_WIDTH)

(def *-skin-head-height
  "Static Constant.

  type: int"
  RealmsScreen/SKIN_HEAD_HEIGHT)

(def *-skin-hat-u
  "Static Constant.

  type: int"
  RealmsScreen/SKIN_HAT_U)

(def *-skin-hat-v
  "Static Constant.

  type: int"
  RealmsScreen/SKIN_HAT_V)

(def *-skin-hat-width
  "Static Constant.

  type: int"
  RealmsScreen/SKIN_HAT_WIDTH)

(def *-skin-hat-height
  "Static Constant.

  type: int"
  RealmsScreen/SKIN_HAT_HEIGHT)

(def *-skin-tex-width
  "Static Constant.

  type: int"
  RealmsScreen/SKIN_TEX_WIDTH)

(def *-skin-tex-height
  "Static Constant.

  type: int"
  RealmsScreen/SKIN_TEX_HEIGHT)

(defn width
  "Instance Field.

  type: int"
  (^Integer [^RealmsScreen this]
    (-> this .-width)))

(defn height
  "Instance Field.

  type: int"
  (^Integer [^RealmsScreen this]
    (-> this .-height)))

(defn *blit
  "p-blit-0 - `int`
  p-blit-1 - `int`
  p-blit-2 - `float`
  p-blit-3 - `float`
  p-blit-4 - `int`
  p-blit-5 - `int`
  p-blit-6 - `int`
  p-blit-7 - `int`
  p-blit-8 - `float`
  p-blit-9 - `float`"
  ([^Integer p-blit-0 ^Integer p-blit-1 ^Float p-blit-2 ^Float p-blit-3 ^Integer p-blit-4 ^Integer p-blit-5 ^Integer p-blit-6 ^Integer p-blit-7 ^Float p-blit-8 ^Float p-blit-9]
    (RealmsScreen/blit p-blit-0 p-blit-1 p-blit-2 p-blit-3 p-blit-4 p-blit-5 p-blit-6 p-blit-7 p-blit-8 p-blit-9))
  ([^Integer p-blit-0 ^Integer p-blit-1 ^Float p-blit-2 ^Float p-blit-3 ^Integer p-blit-4 ^Integer p-blit-5 ^Float p-blit-6 ^Float p-blit-7]
    (RealmsScreen/blit p-blit-0 p-blit-1 p-blit-2 p-blit-3 p-blit-4 p-blit-5 p-blit-6 p-blit-7)))

(defn *bind-face
  "p-bind-face-0 - `java.lang.String`
  p-bind-face-1 - `java.lang.String`"
  ([^java.lang.String p-bind-face-0 ^java.lang.String p-bind-face-1]
    (RealmsScreen/bindFace p-bind-face-0 p-bind-face-1)))

(defn *bind
  "p-bind-0 - `java.lang.String`"
  ([^java.lang.String p-bind-0]
    (RealmsScreen/bind p-bind-0)))

(defn *new-button
  "p-new-button-0 - `int`
  p-new-button-1 - `int`
  p-new-button-2 - `int`
  p-new-button-3 - `int`
  p-new-button-4 - `int`
  p-new-button-5 - `java.lang.String`

  returns: `net.minecraft.realms.RealmsButton`"
  (^net.minecraft.realms.RealmsButton [^Integer p-new-button-0 ^Integer p-new-button-1 ^Integer p-new-button-2 ^Integer p-new-button-3 ^Integer p-new-button-4 ^java.lang.String p-new-button-5]
    (RealmsScreen/newButton p-new-button-0 p-new-button-1 p-new-button-2 p-new-button-3 p-new-button-4 p-new-button-5))
  (^net.minecraft.realms.RealmsButton [^Integer p-new-button-0 ^Integer p-new-button-1 ^Integer p-new-button-2 ^java.lang.String p-new-button-3]
    (RealmsScreen/newButton p-new-button-0 p-new-button-1 p-new-button-2 p-new-button-3)))

(defn *get-localized-string
  "p-get-localized-string-0 - `java.lang.String`
  p-get-localized-string-1 - `java.lang.Object`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String p-get-localized-string-0 ^java.lang.Object p-get-localized-string-1]
    (RealmsScreen/getLocalizedString p-get-localized-string-0 p-get-localized-string-1))
  (^java.lang.String [^java.lang.String p-get-localized-string-0]
    (RealmsScreen/getLocalizedString p-get-localized-string-0)))

(defn font-line-height
  "returns: `int`"
  (^Integer [^RealmsScreen this]
    (-> this (.fontLineHeight))))

(defn tick
  ""
  ([^RealmsScreen this]
    (-> this (.tick))))

(defn width
  "returns: `int`"
  (^Integer [^RealmsScreen this]
    (-> this (.width))))

(defn removed
  ""
  ([^RealmsScreen this]
    (-> this (.removed))))

(defn button-clicked
  "p-button-clicked-1 - `net.minecraft.realms.RealmsButton`"
  ([^RealmsScreen this ^net.minecraft.realms.RealmsButton p-button-clicked-1]
    (-> this (.buttonClicked p-button-clicked-1))))

(defn get-level-storage-source
  "returns: `net.minecraft.realms.RealmsAnvilLevelStorageSource`"
  (^net.minecraft.realms.RealmsAnvilLevelStorageSource [^RealmsScreen this]
    (-> this (.getLevelStorageSource))))

(defn height
  "returns: `int`"
  (^Integer [^RealmsScreen this]
    (-> this (.height))))

(defn blit
  "p-blit-1 - `int`
  p-blit-2 - `int`
  p-blit-3 - `int`
  p-blit-4 - `int`
  p-blit-5 - `int`
  p-blit-6 - `int`"
  ([^RealmsScreen this ^Integer p-blit-1 ^Integer p-blit-2 ^Integer p-blit-3 ^Integer p-blit-4 ^Integer p-blit-5 ^Integer p-blit-6]
    (-> this (.blit p-blit-1 p-blit-2 p-blit-3 p-blit-4 p-blit-5 p-blit-6))))

(defn pause-screen?
  "returns: `boolean`"
  (^Boolean [^RealmsScreen this]
    (-> this (.isPauseScreen))))

(defn font-draw-shadow
  "p-font-draw-shadow-1 - `java.lang.String`
  p-font-draw-shadow-2 - `int`
  p-font-draw-shadow-3 - `int`
  p-font-draw-shadow-4 - `int`"
  ([^RealmsScreen this ^java.lang.String p-font-draw-shadow-1 ^Integer p-font-draw-shadow-2 ^Integer p-font-draw-shadow-3 ^Integer p-font-draw-shadow-4]
    (-> this (.fontDrawShadow p-font-draw-shadow-1 p-font-draw-shadow-2 p-font-draw-shadow-3 p-font-draw-shadow-4))))

(defn mouse-released
  "p-mouse-released-1 - `int`
  p-mouse-released-2 - `int`
  p-mouse-released-3 - `int`"
  ([^RealmsScreen this ^Integer p-mouse-released-1 ^Integer p-mouse-released-2 ^Integer p-mouse-released-3]
    (-> this (.mouseReleased p-mouse-released-1 p-mouse-released-2 p-mouse-released-3))))

(defn buttons
  "returns: `java.util.List<net.minecraft.realms.RealmsButton>`"
  (^java.util.List [^RealmsScreen this]
    (-> this (.buttons))))

(defn key-pressed
  "p-key-pressed-1 - `char`
  p-key-pressed-2 - `int`"
  ([^RealmsScreen this ^Character p-key-pressed-1 ^Integer p-key-pressed-2]
    (-> this (.keyPressed p-key-pressed-1 p-key-pressed-2))))

(defn confirm-result
  "p-confirm-result-1 - `boolean`
  p-confirm-result-2 - `int`"
  ([^RealmsScreen this ^Boolean p-confirm-result-1 ^Integer p-confirm-result-2]
    (-> this (.confirmResult p-confirm-result-1 p-confirm-result-2))))

(defn font-width
  "p-font-width-1 - `java.lang.String`

  returns: `int`"
  (^Integer [^RealmsScreen this ^java.lang.String p-font-width-1]
    (-> this (.fontWidth p-font-width-1))))

(defn draw-string
  "p-draw-string-1 - `java.lang.String`
  p-draw-string-2 - `int`
  p-draw-string-3 - `int`
  p-draw-string-4 - `int`
  p-draw-string-5 - `boolean`"
  ([^RealmsScreen this ^java.lang.String p-draw-string-1 ^Integer p-draw-string-2 ^Integer p-draw-string-3 ^Integer p-draw-string-4 ^Boolean p-draw-string-5]
    (-> this (.drawString p-draw-string-1 p-draw-string-2 p-draw-string-3 p-draw-string-4 p-draw-string-5)))
  ([^RealmsScreen this ^java.lang.String p-draw-string-1 ^Integer p-draw-string-2 ^Integer p-draw-string-3 ^Integer p-draw-string-4]
    (-> this (.drawString p-draw-string-1 p-draw-string-2 p-draw-string-3 p-draw-string-4))))

(defn buttons-add
  "p-buttons-add-1 - `net.minecraft.realms.RealmsButton`"
  ([^RealmsScreen this ^net.minecraft.realms.RealmsButton p-buttons-add-1]
    (-> this (.buttonsAdd p-buttons-add-1))))

(defn buttons-remove
  "p-buttons-remove-1 - `net.minecraft.realms.RealmsButton`"
  ([^RealmsScreen this ^net.minecraft.realms.RealmsButton p-buttons-remove-1]
    (-> this (.buttonsRemove p-buttons-remove-1))))

(defn buttons-clear
  ""
  ([^RealmsScreen this]
    (-> this (.buttonsClear))))

(defn get-proxy
  "returns: `net.minecraft.client.gui.GuiScreenRealmsProxy`"
  (^net.minecraft.client.gui.GuiScreenRealmsProxy [^RealmsScreen this]
    (-> this (.getProxy))))

(defn draw-centered-string
  "p-draw-centered-string-1 - `java.lang.String`
  p-draw-centered-string-2 - `int`
  p-draw-centered-string-3 - `int`
  p-draw-centered-string-4 - `int`"
  ([^RealmsScreen this ^java.lang.String p-draw-centered-string-1 ^Integer p-draw-centered-string-2 ^Integer p-draw-centered-string-3 ^Integer p-draw-centered-string-4]
    (-> this (.drawCenteredString p-draw-centered-string-1 p-draw-centered-string-2 p-draw-centered-string-3 p-draw-centered-string-4))))

(defn render
  "p-render-1 - `int`
  p-render-2 - `int`
  p-render-3 - `float`"
  ([^RealmsScreen this ^Integer p-render-1 ^Integer p-render-2 ^Float p-render-3]
    (-> this (.render p-render-1 p-render-2 p-render-3))))

(defn init
  "p-init-1 - `net.minecraft.client.Minecraft`
  p-init-2 - `int`
  p-init-3 - `int`"
  ([^RealmsScreen this ^net.minecraft.client.Minecraft p-init-1 ^Integer p-init-2 ^Integer p-init-3]
    (-> this (.init p-init-1 p-init-2 p-init-3)))
  ([^RealmsScreen this]
    (-> this (.init))))

(defn keyboard-event
  ""
  ([^RealmsScreen this]
    (-> this (.keyboardEvent))))

(defn mouse-event
  ""
  ([^RealmsScreen this]
    (-> this (.mouseEvent))))

(defn fill-gradient
  "p-fill-gradient-1 - `int`
  p-fill-gradient-2 - `int`
  p-fill-gradient-3 - `int`
  p-fill-gradient-4 - `int`
  p-fill-gradient-5 - `int`
  p-fill-gradient-6 - `int`"
  ([^RealmsScreen this ^Integer p-fill-gradient-1 ^Integer p-fill-gradient-2 ^Integer p-fill-gradient-3 ^Integer p-fill-gradient-4 ^Integer p-fill-gradient-5 ^Integer p-fill-gradient-6]
    (-> this (.fillGradient p-fill-gradient-1 p-fill-gradient-2 p-fill-gradient-3 p-fill-gradient-4 p-fill-gradient-5 p-fill-gradient-6))))

(defn font-split
  "p-font-split-1 - `java.lang.String`
  p-font-split-2 - `int`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RealmsScreen this ^java.lang.String p-font-split-1 ^Integer p-font-split-2]
    (-> this (.fontSplit p-font-split-1 p-font-split-2))))

(defn mouse-dragged
  "p-mouse-dragged-1 - `int`
  p-mouse-dragged-2 - `int`
  p-mouse-dragged-3 - `int`
  p-mouse-dragged-4 - `long`"
  ([^RealmsScreen this ^Integer p-mouse-dragged-1 ^Integer p-mouse-dragged-2 ^Integer p-mouse-dragged-3 ^Long p-mouse-dragged-4]
    (-> this (.mouseDragged p-mouse-dragged-1 p-mouse-dragged-2 p-mouse-dragged-3 p-mouse-dragged-4))))

(defn render-background
  "p-render-background-1 - `int`"
  ([^RealmsScreen this ^Integer p-render-background-1]
    (-> this (.renderBackground p-render-background-1)))
  ([^RealmsScreen this]
    (-> this (.renderBackground))))

(defn mouse-clicked
  "p-mouse-clicked-1 - `int`
  p-mouse-clicked-2 - `int`
  p-mouse-clicked-3 - `int`"
  ([^RealmsScreen this ^Integer p-mouse-clicked-1 ^Integer p-mouse-clicked-2 ^Integer p-mouse-clicked-3]
    (-> this (.mouseClicked p-mouse-clicked-1 p-mouse-clicked-2 p-mouse-clicked-3))))

(defn new-edit-box
  "p-new-edit-box-1 - `int`
  p-new-edit-box-2 - `int`
  p-new-edit-box-3 - `int`
  p-new-edit-box-4 - `int`
  p-new-edit-box-5 - `int`

  returns: `net.minecraft.realms.RealmsEditBox`"
  (^net.minecraft.realms.RealmsEditBox [^RealmsScreen this ^Integer p-new-edit-box-1 ^Integer p-new-edit-box-2 ^Integer p-new-edit-box-3 ^Integer p-new-edit-box-4 ^Integer p-new-edit-box-5]
    (-> this (.newEditBox p-new-edit-box-1 p-new-edit-box-2 p-new-edit-box-3 p-new-edit-box-4 p-new-edit-box-5))))

(defn render-tooltip
  "p-render-tooltip-1 - `net.minecraft.item.ItemStack`
  p-render-tooltip-2 - `int`
  p-render-tooltip-3 - `int`"
  ([^RealmsScreen this ^net.minecraft.item.ItemStack p-render-tooltip-1 ^Integer p-render-tooltip-2 ^Integer p-render-tooltip-3]
    (-> this (.renderTooltip p-render-tooltip-1 p-render-tooltip-2 p-render-tooltip-3))))

