(ns net.minecraft.client.gui.GuiButtonRealmsProxy
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiButtonRealmsProxy]))

(defn ->gui-button-realms-proxy
  "Constructor.

  realms-button-in - `net.minecraft.realms.RealmsButton`
  button-id - `int`
  x - `int`
  y - `int`
  text - `java.lang.String`
  width-in - `int`
  height-in - `int`"
  (^GuiButtonRealmsProxy [^net.minecraft.realms.RealmsButton realms-button-in ^Integer button-id ^Integer x ^Integer y ^java.lang.String text ^Integer width-in ^Integer height-in]
    (new GuiButtonRealmsProxy realms-button-in button-id x y text width-in height-in))
  (^GuiButtonRealmsProxy [^net.minecraft.realms.RealmsButton realms-button-in ^Integer button-id ^Integer x ^Integer y ^java.lang.String text]
    (new GuiButtonRealmsProxy realms-button-in button-id x y text)))

(defn set-text
  "text - `java.lang.String`"
  ([^GuiButtonRealmsProxy this ^java.lang.String text]
    (-> this (.setText text))))

(defn get-button-width
  "returns: `int`"
  (^Integer [^GuiButtonRealmsProxy this]
    (-> this (.getButtonWidth))))

(defn mouse-pressed
  "mc - `net.minecraft.client.Minecraft`
  mouse-x - `int`
  mouse-y - `int`

  returns: `boolean`"
  (^Boolean [^GuiButtonRealmsProxy this ^net.minecraft.client.Minecraft mc ^Integer mouse-x ^Integer mouse-y]
    (-> this (.mousePressed mc mouse-x mouse-y))))

(defn mouse-released
  "mouse-x - `int`
  mouse-y - `int`"
  ([^GuiButtonRealmsProxy this ^Integer mouse-x ^Integer mouse-y]
    (-> this (.mouseReleased mouse-x mouse-y))))

(defn get-id
  "returns: `int`"
  (^Integer [^GuiButtonRealmsProxy this]
    (-> this (.getId))))

(defn get-hover-state
  "mouse-over - `boolean`

  returns: `int`"
  (^Integer [^GuiButtonRealmsProxy this ^Boolean mouse-over]
    (-> this (.getHoverState mouse-over))))

(defn get-height
  "returns: `int`"
  (^Integer [^GuiButtonRealmsProxy this]
    (-> this (.getHeight))))

(defn get-y-image
  "p-154312-1 - `boolean`

  returns: `int`"
  (^Integer [^GuiButtonRealmsProxy this ^Boolean p-154312-1]
    (-> this (.getYImage p-154312-1))))

(defn get-realms-button
  "returns: `net.minecraft.realms.RealmsButton`"
  (^net.minecraft.realms.RealmsButton [^GuiButtonRealmsProxy this]
    (-> this (.getRealmsButton))))

(defn set-enabled
  "is-enabled - `boolean`"
  ([^GuiButtonRealmsProxy this ^Boolean is-enabled]
    (-> this (.setEnabled is-enabled))))

(defn get-enabled?
  "returns: `boolean`"
  (^Boolean [^GuiButtonRealmsProxy this]
    (-> this (.getEnabled))))

(defn mouse-dragged
  "mc - `net.minecraft.client.Minecraft`
  mouse-x - `int`
  mouse-y - `int`"
  ([^GuiButtonRealmsProxy this ^net.minecraft.client.Minecraft mc ^Integer mouse-x ^Integer mouse-y]
    (-> this (.mouseDragged mc mouse-x mouse-y))))

(defn get-position-y
  "returns: `int`"
  (^Integer [^GuiButtonRealmsProxy this]
    (-> this (.getPositionY))))

