(ns net.minecraft.client.gui.GuiScreenRealmsProxy
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiScreenRealmsProxy]))

(defn ->gui-screen-realms-proxy
  "Constructor.

  proxy-in - `net.minecraft.realms.RealmsScreen`"
  (^GuiScreenRealmsProxy [^net.minecraft.realms.RealmsScreen proxy-in]
    (new GuiScreenRealmsProxy proxy-in)))

(defn does-gui-pause-game
  "returns: `boolean`"
  (^Boolean [^GuiScreenRealmsProxy this]
    (-> this (.doesGuiPauseGame))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiScreenRealmsProxy this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn confirm-clicked
  "result - `boolean`
  id - `int`"
  ([^GuiScreenRealmsProxy this ^Boolean result ^Integer id]
    (-> this (.confirmClicked result id))))

(defn handle-keyboard-input
  "throws: java.io.IOException"
  ([^GuiScreenRealmsProxy this]
    (-> this (.handleKeyboardInput))))

(defn key-typed
  "typed-char - `char`
  key-code - `int`

  throws: java.io.IOException"
  ([^GuiScreenRealmsProxy this ^Character typed-char ^Integer key-code]
    (-> this (.keyTyped typed-char key-code))))

(defn get-string-width
  "text - `java.lang.String`

  returns: `int`"
  (^Integer [^GuiScreenRealmsProxy this ^java.lang.String text]
    (-> this (.getStringWidth text))))

(defn font-draw-shadow
  "text - `java.lang.String`
  x - `int`
  y - `int`
  color - `int`"
  ([^GuiScreenRealmsProxy this ^java.lang.String text ^Integer x ^Integer y ^Integer color]
    (-> this (.fontDrawShadow text x y color))))

(defn update-screen
  ""
  ([^GuiScreenRealmsProxy this]
    (-> this (.updateScreen))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiScreenRealmsProxy this]
    (-> this (.handleMouseInput))))

(defn draw-creative-tab-hovering-text
  "tab-name - `java.lang.String`
  mouse-x - `int`
  mouse-y - `int`"
  ([^GuiScreenRealmsProxy this ^java.lang.String tab-name ^Integer mouse-x ^Integer mouse-y]
    (-> this (.drawCreativeTabHoveringText tab-name mouse-x mouse-y))))

(defn get-font-height
  "returns: `int`"
  (^Integer [^GuiScreenRealmsProxy this]
    (-> this (.getFontHeight))))

(defn on-gui-closed
  ""
  ([^GuiScreenRealmsProxy this]
    (-> this (.onGuiClosed))))

(defn mouse-released
  "mouse-x - `int`
  mouse-y - `int`
  state - `int`"
  ([^GuiScreenRealmsProxy this ^Integer mouse-x ^Integer mouse-y ^Integer state]
    (-> this (.mouseReleased mouse-x mouse-y state))))

(defn buttons
  "returns: `java.util.List<net.minecraft.realms.RealmsButton>`"
  (^java.util.List [^GuiScreenRealmsProxy this]
    (-> this (.buttons))))

(defn draw-string
  "text - `java.lang.String`
  x - `int`
  y - `int`
  color - `int`
  p-154322-5 - `boolean`"
  ([^GuiScreenRealmsProxy this ^java.lang.String text ^Integer x ^Integer y ^Integer color ^Boolean p-154322-5]
    (-> this (.drawString text x y color p-154322-5))))

(defn buttons-add
  "button - `net.minecraft.realms.RealmsButton`"
  ([^GuiScreenRealmsProxy this ^net.minecraft.realms.RealmsButton button]
    (-> this (.buttonsAdd button))))

(defn buttons-remove
  "button - `net.minecraft.realms.RealmsButton`"
  ([^GuiScreenRealmsProxy this ^net.minecraft.realms.RealmsButton button]
    (-> this (.buttonsRemove button))))

(defn buttons-clear
  ""
  ([^GuiScreenRealmsProxy this]
    (-> this (.buttonsClear))))

(defn get-proxy
  "returns: `net.minecraft.realms.RealmsScreen`"
  (^net.minecraft.realms.RealmsScreen [^GuiScreenRealmsProxy this]
    (-> this (.getProxy))))

(defn init-gui
  ""
  ([^GuiScreenRealmsProxy this]
    (-> this (.initGui))))

(defn draw-centered-string
  "text - `java.lang.String`
  x - `int`
  y - `int`
  color - `int`"
  ([^GuiScreenRealmsProxy this ^java.lang.String text ^Integer x ^Integer y ^Integer color]
    (-> this (.drawCenteredString text x y color))))

(defn action-performed
  "button - `net.minecraft.client.gui.GuiButton`

  throws: java.io.IOException"
  ([^GuiScreenRealmsProxy this ^net.minecraft.client.gui.GuiButton button]
    (-> this (.actionPerformed button))))

(defn draw-default-background
  ""
  ([^GuiScreenRealmsProxy this]
    (-> this (.drawDefaultBackground))))

(defn draw-hovering-text
  "text-lines - `java.util.List`
  x - `int`
  y - `int`"
  ([^GuiScreenRealmsProxy this ^java.util.List text-lines ^Integer x ^Integer y]
    (-> this (.drawHoveringText text-lines x y))))

(defn draw-world-background
  "tint - `int`"
  ([^GuiScreenRealmsProxy this ^Integer tint]
    (-> this (.drawWorldBackground tint))))

(defn font-split
  "text - `java.lang.String`
  wrap-width - `int`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^GuiScreenRealmsProxy this ^java.lang.String text ^Integer wrap-width]
    (-> this (.fontSplit text wrap-width))))

(defn mouse-click-move
  "mouse-x - `int`
  mouse-y - `int`
  clicked-mouse-button - `int`
  time-since-last-click - `long`"
  ([^GuiScreenRealmsProxy this ^Integer mouse-x ^Integer mouse-y ^Integer clicked-mouse-button ^Long time-since-last-click]
    (-> this (.mouseClickMove mouse-x mouse-y clicked-mouse-button time-since-last-click))))

(defn draw-textured-modal-rect
  "x - `int`
  y - `int`
  texture-x - `int`
  texture-y - `int`
  width - `int`
  height - `int`"
  ([^GuiScreenRealmsProxy this ^Integer x ^Integer y ^Integer texture-x ^Integer texture-y ^Integer width ^Integer height]
    (-> this (.drawTexturedModalRect x y texture-x texture-y width height))))

(defn mouse-clicked
  "mouse-x - `int`
  mouse-y - `int`
  mouse-button - `int`

  throws: java.io.IOException"
  ([^GuiScreenRealmsProxy this ^Integer mouse-x ^Integer mouse-y ^Integer mouse-button]
    (-> this (.mouseClicked mouse-x mouse-y mouse-button))))

(defn draw-gradient-rect
  "left - `int`
  top - `int`
  right - `int`
  bottom - `int`
  start-color - `int`
  end-color - `int`"
  ([^GuiScreenRealmsProxy this ^Integer left ^Integer top ^Integer right ^Integer bottom ^Integer start-color ^Integer end-color]
    (-> this (.drawGradientRect left top right bottom start-color end-color))))

(defn render-tool-tip
  "stack - `net.minecraft.item.ItemStack`
  x - `int`
  y - `int`"
  ([^GuiScreenRealmsProxy this ^net.minecraft.item.ItemStack stack ^Integer x ^Integer y]
    (-> this (.renderToolTip stack x y))))

