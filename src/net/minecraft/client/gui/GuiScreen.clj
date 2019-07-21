(ns net.minecraft.client.gui.GuiScreen
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiScreen]))

(defn ->gui-screen
  "Constructor."
  (^GuiScreen []
    (new GuiScreen )))

(defn mc
  "Instance Field.

  type: net.minecraft.client.Minecraft"
  (^net.minecraft.client.Minecraft [^GuiScreen this]
    (-> this .-mc)))

(defn width
  "Instance Field.

  type: int"
  (^Integer [^GuiScreen this]
    (-> this .-width)))

(defn height
  "Instance Field.

  type: int"
  (^Integer [^GuiScreen this]
    (-> this .-height)))

(defn allow-user-input
  "Instance Field.

  type: boolean"
  (^Boolean [^GuiScreen this]
    (-> this .-allowUserInput)))

(defn *shift-key-down?
  "returns: `boolean`"
  (^Boolean []
    (GuiScreen/isShiftKeyDown )))

(defn *key-combo-ctrl-c?
  "key-id - `int`

  returns: `boolean`"
  (^Boolean [^Integer key-id]
    (GuiScreen/isKeyComboCtrlC key-id)))

(defn *set-clipboard-string
  "copy-text - `java.lang.String`"
  ([^java.lang.String copy-text]
    (GuiScreen/setClipboardString copy-text)))

(defn *get-clipboard-string
  "returns: `java.lang.String`"
  (^java.lang.String []
    (GuiScreen/getClipboardString )))

(defn *key-combo-ctrl-a?
  "key-id - `int`

  returns: `boolean`"
  (^Boolean [^Integer key-id]
    (GuiScreen/isKeyComboCtrlA key-id)))

(defn *key-combo-ctrl-x?
  "key-id - `int`

  returns: `boolean`"
  (^Boolean [^Integer key-id]
    (GuiScreen/isKeyComboCtrlX key-id)))

(defn *alt-key-down?
  "returns: `boolean`"
  (^Boolean []
    (GuiScreen/isAltKeyDown )))

(defn *ctrl-key-down?
  "returns: `boolean`"
  (^Boolean []
    (GuiScreen/isCtrlKeyDown )))

(defn *key-combo-ctrl-v?
  "key-id - `int`

  returns: `boolean`"
  (^Boolean [^Integer key-id]
    (GuiScreen/isKeyComboCtrlV key-id)))

(defn does-gui-pause-game
  "returns: `boolean`"
  (^Boolean [^GuiScreen this]
    (-> this (.doesGuiPauseGame))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiScreen this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn handle-input
  "throws: java.io.IOException"
  ([^GuiScreen this]
    (-> this (.handleInput))))

(defn confirm-clicked
  "result - `boolean`
  id - `int`"
  ([^GuiScreen this ^Boolean result ^Integer id]
    (-> this (.confirmClicked result id))))

(defn handle-keyboard-input
  "throws: java.io.IOException"
  ([^GuiScreen this]
    (-> this (.handleKeyboardInput))))

(defn draw-background
  "tint - `int`"
  ([^GuiScreen this ^Integer tint]
    (-> this (.drawBackground tint))))

(defn update-screen
  ""
  ([^GuiScreen this]
    (-> this (.updateScreen))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiScreen this]
    (-> this (.handleMouseInput))))

(defn on-gui-closed
  ""
  ([^GuiScreen this]
    (-> this (.onGuiClosed))))

(defn set-world-and-resolution
  "mc - `net.minecraft.client.Minecraft`
  width - `int`
  height - `int`"
  ([^GuiScreen this ^net.minecraft.client.Minecraft mc ^Integer width ^Integer height]
    (-> this (.setWorldAndResolution mc width height))))

(defn set-gui-size
  "w - `int`
  h - `int`"
  ([^GuiScreen this ^Integer w ^Integer h]
    (-> this (.setGuiSize w h))))

(defn init-gui
  ""
  ([^GuiScreen this]
    (-> this (.initGui))))

(defn draw-default-background
  ""
  ([^GuiScreen this]
    (-> this (.drawDefaultBackground))))

(defn send-chat-message
  "msg - `java.lang.String`
  add-to-chat - `boolean`"
  ([^GuiScreen this ^java.lang.String msg ^Boolean add-to-chat]
    (-> this (.sendChatMessage msg add-to-chat)))
  ([^GuiScreen this ^java.lang.String msg]
    (-> this (.sendChatMessage msg))))

(defn draw-world-background
  "tint - `int`"
  ([^GuiScreen this ^Integer tint]
    (-> this (.drawWorldBackground tint))))

(defn on-resize
  "mc-in - `net.minecraft.client.Minecraft`
  w - `int`
  h - `int`"
  ([^GuiScreen this ^net.minecraft.client.Minecraft mc-in ^Integer w ^Integer h]
    (-> this (.onResize mc-in w h))))

