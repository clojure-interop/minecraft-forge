(ns net.minecraft.client.gui.GuiButton
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiButton]))

(defn ->gui-button
  "Constructor.

  button-id - `int`
  x - `int`
  y - `int`
  width-in - `int`
  height-in - `int`
  button-text - `java.lang.String`"
  (^GuiButton [^Integer button-id ^Integer x ^Integer y ^Integer width-in ^Integer height-in ^java.lang.String button-text]
    (new GuiButton button-id x y width-in height-in button-text))
  (^GuiButton [^Integer button-id ^Integer x ^Integer y ^java.lang.String button-text]
    (new GuiButton button-id x y button-text)))

(defn width
  "Instance Field.

  type: int"
  (^Integer [^GuiButton this]
    (-> this .-width)))

(defn height
  "Instance Field.

  type: int"
  (^Integer [^GuiButton this]
    (-> this .-height)))

(defn x-position
  "Instance Field.

  type: int"
  (^Integer [^GuiButton this]
    (-> this .-xPosition)))

(defn y-position
  "Instance Field.

  type: int"
  (^Integer [^GuiButton this]
    (-> this .-yPosition)))

(defn display-string
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^GuiButton this]
    (-> this .-displayString)))

(defn id
  "Instance Field.

  type: int"
  (^Integer [^GuiButton this]
    (-> this .-id)))

(defn enabled
  "Instance Field.

  type: boolean"
  (^Boolean [^GuiButton this]
    (-> this .-enabled)))

(defn visible
  "Instance Field.

  type: boolean"
  (^Boolean [^GuiButton this]
    (-> this .-visible)))

(defn packed-fg-colour
  "Instance Field.

  type: int"
  (^Integer [^GuiButton this]
    (-> this .-packedFGColour)))

(defn draw-button
  "mc - `net.minecraft.client.Minecraft`
  mouse-x - `int`
  mouse-y - `int`"
  ([^GuiButton this ^net.minecraft.client.Minecraft mc ^Integer mouse-x ^Integer mouse-y]
    (-> this (.drawButton mc mouse-x mouse-y))))

(defn mouse-released
  "mouse-x - `int`
  mouse-y - `int`"
  ([^GuiButton this ^Integer mouse-x ^Integer mouse-y]
    (-> this (.mouseReleased mouse-x mouse-y))))

(defn mouse-pressed
  "mc - `net.minecraft.client.Minecraft`
  mouse-x - `int`
  mouse-y - `int`

  returns: `boolean`"
  (^Boolean [^GuiButton this ^net.minecraft.client.Minecraft mc ^Integer mouse-x ^Integer mouse-y]
    (-> this (.mousePressed mc mouse-x mouse-y))))

(defn mouse-over?
  "returns: `boolean`"
  (^Boolean [^GuiButton this]
    (-> this (.isMouseOver))))

(defn draw-button-foreground-layer
  "mouse-x - `int`
  mouse-y - `int`"
  ([^GuiButton this ^Integer mouse-x ^Integer mouse-y]
    (-> this (.drawButtonForegroundLayer mouse-x mouse-y))))

(defn play-press-sound
  "sound-handler-in - `net.minecraft.client.audio.SoundHandler`"
  ([^GuiButton this ^net.minecraft.client.audio.SoundHandler sound-handler-in]
    (-> this (.playPressSound sound-handler-in))))

(defn get-button-width
  "returns: `int`"
  (^Integer [^GuiButton this]
    (-> this (.getButtonWidth))))

(defn set-width
  "width - `int`"
  ([^GuiButton this ^Integer width]
    (-> this (.setWidth width))))

