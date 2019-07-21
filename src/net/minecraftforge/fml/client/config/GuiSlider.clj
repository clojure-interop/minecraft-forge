(ns net.minecraftforge.fml.client.config.GuiSlider
  "This class is blatantly stolen from iChunUtils with permission."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiSlider]))

(defn ->gui-slider
  "Constructor.

  id - `int`
  x-pos - `int`
  y-pos - `int`
  width - `int`
  height - `int`
  prefix - `java.lang.String`
  suf - `java.lang.String`
  min-val - `double`
  max-val - `double`
  current-val - `double`
  show-dec - `boolean`
  draw-str - `boolean`
  par - `net.minecraftforge.fml.client.config.GuiSlider$ISlider`"
  (^GuiSlider [^Integer id ^Integer x-pos ^Integer y-pos ^Integer width ^Integer height ^java.lang.String prefix ^java.lang.String suf ^Double min-val ^Double max-val ^Double current-val ^Boolean show-dec ^Boolean draw-str ^net.minecraftforge.fml.client.config.GuiSlider$ISlider par]
    (new GuiSlider id x-pos y-pos width height prefix suf min-val max-val current-val show-dec draw-str par))
  (^GuiSlider [^Integer id ^Integer x-pos ^Integer y-pos ^Integer width ^Integer height ^java.lang.String prefix ^java.lang.String suf ^Double min-val ^Double max-val ^Double current-val ^Boolean show-dec ^Boolean draw-str]
    (new GuiSlider id x-pos y-pos width height prefix suf min-val max-val current-val show-dec draw-str))
  (^GuiSlider [^Integer id ^Integer x-pos ^Integer y-pos ^java.lang.String display-str ^Double min-val ^Double max-val ^Double current-val ^net.minecraftforge.fml.client.config.GuiSlider$ISlider par]
    (new GuiSlider id x-pos y-pos display-str min-val max-val current-val par)))

(defn slider-value
  "Instance Field.

  The value of this slider control.

  type: double"
  (^Double [^GuiSlider this]
    (-> this .-sliderValue)))

(defn disp-string
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^GuiSlider this]
    (-> this .-dispString)))

(defn dragging
  "Instance Field.

  Is this slider control being dragged.

  type: boolean"
  (^Boolean [^GuiSlider this]
    (-> this .-dragging)))

(defn show-decimal
  "Instance Field.

  type: boolean"
  (^Boolean [^GuiSlider this]
    (-> this .-showDecimal)))

(defn min-value
  "Instance Field.

  type: double"
  (^Double [^GuiSlider this]
    (-> this .-minValue)))

(defn max-value
  "Instance Field.

  type: double"
  (^Double [^GuiSlider this]
    (-> this .-maxValue)))

(defn precision
  "Instance Field.

  type: int"
  (^Integer [^GuiSlider this]
    (-> this .-precision)))

(defn parent
  "Instance Field.

  type: net.minecraftforge.fml.client.config.GuiSlider$ISlider"
  (^net.minecraftforge.fml.client.config.GuiSlider$ISlider [^GuiSlider this]
    (-> this .-parent)))

(defn suffix
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^GuiSlider this]
    (-> this .-suffix)))

(defn draw-string
  "Instance Field.

  type: boolean"
  (^Boolean [^GuiSlider this]
    (-> this .-drawString)))

(defn get-hover-state
  "Returns 0 if the button is disabled, 1 if the mouse is NOT hovering over this button and 2 if it IS hovering over
   this button.

  par-1 - `boolean`

  returns: `int`"
  (^Integer [^GuiSlider this ^Boolean par-1]
    (-> this (.getHoverState par-1))))

(defn mouse-pressed
  "Returns true if the mouse has been pressed on this control. Equivalent of MouseListener.mousePressed(MouseEvent
   e).

  par-1-minecraft - `net.minecraft.client.Minecraft`
  par-2 - `int`
  par-3 - `int`

  returns: `boolean`"
  (^Boolean [^GuiSlider this ^net.minecraft.client.Minecraft par-1-minecraft ^Integer par-2 ^Integer par-3]
    (-> this (.mousePressed par-1-minecraft par-2 par-3))))

(defn update-slider
  ""
  ([^GuiSlider this]
    (-> this (.updateSlider))))

(defn mouse-released
  "Fired when the mouse button is released. Equivalent of MouseListener.mouseReleased(MouseEvent e).

  par-1 - `int`
  par-2 - `int`"
  ([^GuiSlider this ^Integer par-1 ^Integer par-2]
    (-> this (.mouseReleased par-1 par-2))))

(defn get-value-int
  "returns: `int`"
  (^Integer [^GuiSlider this]
    (-> this (.getValueInt))))

(defn get-value
  "returns: `double`"
  (^Double [^GuiSlider this]
    (-> this (.getValue))))

(defn set-value
  "d - `double`"
  ([^GuiSlider this ^Double d]
    (-> this (.setValue d))))

