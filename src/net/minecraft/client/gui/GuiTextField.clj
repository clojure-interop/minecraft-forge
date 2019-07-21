(ns net.minecraft.client.gui.GuiTextField
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiTextField]))

(defn ->gui-text-field
  "Constructor.

  component-id - `int`
  fontrenderer-obj - `net.minecraft.client.gui.FontRenderer`
  x - `int`
  y - `int`
  par-5-width - `int`
  par-6-height - `int`"
  (^GuiTextField [^Integer component-id ^net.minecraft.client.gui.FontRenderer fontrenderer-obj ^Integer x ^Integer y ^Integer par-5-width ^Integer par-6-height]
    (new GuiTextField component-id fontrenderer-obj x y par-5-width par-6-height)))

(defn x-position
  "Instance Field.

  type: int"
  (^Integer [^GuiTextField this]
    (-> this .-xPosition)))

(defn y-position
  "Instance Field.

  type: int"
  (^Integer [^GuiTextField this]
    (-> this .-yPosition)))

(defn width
  "Instance Field.

  type: int"
  (^Integer [^GuiTextField this]
    (-> this .-width)))

(defn height
  "Instance Field.

  type: int"
  (^Integer [^GuiTextField this]
    (-> this .-height)))

(defn set-cursor-position-end
  ""
  ([^GuiTextField this]
    (-> this (.setCursorPositionEnd))))

(defn move-cursor-by
  "num - `int`"
  ([^GuiTextField this ^Integer num]
    (-> this (.moveCursorBy num))))

(defn get-selected-text
  "returns: `java.lang.String`"
  (^java.lang.String [^GuiTextField this]
    (-> this (.getSelectedText))))

(defn set-cursor-position
  "pos - `int`"
  ([^GuiTextField this ^Integer pos]
    (-> this (.setCursorPosition pos))))

(defn set-responder-entry-value
  "id-in - `int`
  text-in - `java.lang.String`"
  ([^GuiTextField this ^Integer id-in ^java.lang.String text-in]
    (-> this (.setResponderEntryValue id-in text-in))))

(defn get-width
  "returns: `int`"
  (^Integer [^GuiTextField this]
    (-> this (.getWidth))))

(defn set-gui-responder
  "gui-responder-in - `net.minecraft.client.gui.GuiPageButtonList$GuiResponder`"
  ([^GuiTextField this ^net.minecraft.client.gui.GuiPageButtonList$GuiResponder gui-responder-in]
    (-> this (.setGuiResponder gui-responder-in))))

(defn get-max-string-length
  "returns: `int`"
  (^Integer [^GuiTextField this]
    (-> this (.getMaxStringLength))))

(defn get-nth-word-from-pos-ws
  "n - `int`
  pos - `int`
  skip-ws - `boolean`

  returns: `int`"
  (^Integer [^GuiTextField this ^Integer n ^Integer pos ^Boolean skip-ws]
    (-> this (.getNthWordFromPosWS n pos skip-ws))))

(defn set-text
  "text-in - `java.lang.String`"
  ([^GuiTextField this ^java.lang.String text-in]
    (-> this (.setText text-in))))

(defn get-nth-word-from-pos
  "n - `int`
  pos - `int`

  returns: `int`"
  (^Integer [^GuiTextField this ^Integer n ^Integer pos]
    (-> this (.getNthWordFromPos n pos))))

(defn get-text
  "returns: `java.lang.String`"
  (^java.lang.String [^GuiTextField this]
    (-> this (.getText))))

(defn set-enable-background-drawing
  "enable-background-drawing-in - `boolean`"
  ([^GuiTextField this ^Boolean enable-background-drawing-in]
    (-> this (.setEnableBackgroundDrawing enable-background-drawing-in))))

(defn draw-text-box
  ""
  ([^GuiTextField this]
    (-> this (.drawTextBox))))

(defn set-text-color
  "color - `int`"
  ([^GuiTextField this ^Integer color]
    (-> this (.setTextColor color))))

(defn set-cursor-position-zero
  ""
  ([^GuiTextField this]
    (-> this (.setCursorPositionZero))))

(defn get-cursor-position
  "returns: `int`"
  (^Integer [^GuiTextField this]
    (-> this (.getCursorPosition))))

(defn get-nth-word-from-cursor
  "num-words - `int`

  returns: `int`"
  (^Integer [^GuiTextField this ^Integer num-words]
    (-> this (.getNthWordFromCursor num-words))))

(defn update-cursor-counter
  ""
  ([^GuiTextField this]
    (-> this (.updateCursorCounter))))

(defn set-max-string-length
  "length - `int`"
  ([^GuiTextField this ^Integer length]
    (-> this (.setMaxStringLength length))))

(defn set-selection-pos
  "position - `int`"
  ([^GuiTextField this ^Integer position]
    (-> this (.setSelectionPos position))))

(defn get-selection-end
  "returns: `int`"
  (^Integer [^GuiTextField this]
    (-> this (.getSelectionEnd))))

(defn get-id
  "returns: `int`"
  (^Integer [^GuiTextField this]
    (-> this (.getId))))

(defn set-can-lose-focus
  "can-lose-focus-in - `boolean`"
  ([^GuiTextField this ^Boolean can-lose-focus-in]
    (-> this (.setCanLoseFocus can-lose-focus-in))))

(defn set-validator
  "the-validator - `com.google.common.base.Predicate`"
  ([^GuiTextField this ^com.google.common.base.Predicate the-validator]
    (-> this (.setValidator the-validator))))

(defn set-visible
  "is-visible - `boolean`"
  ([^GuiTextField this ^Boolean is-visible]
    (-> this (.setVisible is-visible))))

(defn set-enabled
  "enabled - `boolean`"
  ([^GuiTextField this ^Boolean enabled]
    (-> this (.setEnabled enabled))))

(defn set-disabled-text-colour
  "color - `int`"
  ([^GuiTextField this ^Integer color]
    (-> this (.setDisabledTextColour color))))

(defn write-text
  "text-to-write - `java.lang.String`"
  ([^GuiTextField this ^java.lang.String text-to-write]
    (-> this (.writeText text-to-write))))

(defn get-visible?
  "returns: `boolean`"
  (^Boolean [^GuiTextField this]
    (-> this (.getVisible))))

(defn set-focused
  "is-focused-in - `boolean`"
  ([^GuiTextField this ^Boolean is-focused-in]
    (-> this (.setFocused is-focused-in))))

(defn get-enable-background-drawing?
  "returns: `boolean`"
  (^Boolean [^GuiTextField this]
    (-> this (.getEnableBackgroundDrawing))))

(defn mouse-clicked
  "mouse-x - `int`
  mouse-y - `int`
  mouse-button - `int`"
  ([^GuiTextField this ^Integer mouse-x ^Integer mouse-y ^Integer mouse-button]
    (-> this (.mouseClicked mouse-x mouse-y mouse-button))))

(defn delete-from-cursor
  "num - `int`"
  ([^GuiTextField this ^Integer num]
    (-> this (.deleteFromCursor num))))

(defn delete-words
  "num - `int`"
  ([^GuiTextField this ^Integer num]
    (-> this (.deleteWords num))))

(defn focused?
  "returns: `boolean`"
  (^Boolean [^GuiTextField this]
    (-> this (.isFocused))))

(defn textbox-key-typed
  "typed-char - `char`
  key-code - `int`

  returns: `boolean`"
  (^Boolean [^GuiTextField this ^Character typed-char ^Integer key-code]
    (-> this (.textboxKeyTyped typed-char key-code))))

