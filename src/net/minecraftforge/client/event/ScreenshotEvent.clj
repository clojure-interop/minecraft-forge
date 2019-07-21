(ns net.minecraftforge.client.event.ScreenshotEvent
  "This event is fired before and after a screenshot is taken
  This event is fired on the MinecraftForge.EVENT_BUS
  This event is Cancelable

  screenshotFile contains the file the screenshot will be/was saved to
  image contains the BufferedImage that will be saved
  resultMessage contains the ITextComponent to be returned. If null, the default vanilla message will be used instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event ScreenshotEvent]))

(defn ->screenshot-event
  "Constructor.

  image - `java.awt.image.BufferedImage`
  screenshot-file - `java.io.File`"
  (^ScreenshotEvent [^java.awt.image.BufferedImage image ^java.io.File screenshot-file]
    (new ScreenshotEvent image screenshot-file)))

(def *-default-cancel-reason
  "Static Constant.

  type: net.minecraft.util.text.ITextComponent"
  ScreenshotEvent/DEFAULT_CANCEL_REASON)

(defn get-image
  "returns: `java.awt.image.BufferedImage`"
  (^java.awt.image.BufferedImage [^ScreenshotEvent this]
    (-> this (.getImage))))

(defn get-screenshot-file
  "returns: `java.io.File`"
  (^java.io.File [^ScreenshotEvent this]
    (-> this (.getScreenshotFile))))

(defn set-screenshot-file
  "screenshot-file - `java.io.File`"
  ([^ScreenshotEvent this ^java.io.File screenshot-file]
    (-> this (.setScreenshotFile screenshot-file))))

(defn get-result-message
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^ScreenshotEvent this]
    (-> this (.getResultMessage))))

(defn set-result-message
  "result-message - `net.minecraft.util.text.ITextComponent`"
  ([^ScreenshotEvent this ^net.minecraft.util.text.ITextComponent result-message]
    (-> this (.setResultMessage result-message))))

(defn get-cancel-message
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^ScreenshotEvent this]
    (-> this (.getCancelMessage))))

