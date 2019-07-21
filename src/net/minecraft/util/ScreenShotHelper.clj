(ns net.minecraft.util.ScreenShotHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util ScreenShotHelper]))

(defn ->screen-shot-helper
  "Constructor."
  (^ScreenShotHelper []
    (new ScreenShotHelper )))

(defn *save-screenshot
  "game-directory - `java.io.File`
  screenshot-name - `java.lang.String`
  width - `int`
  height - `int`
  buffer - `net.minecraft.client.shader.Framebuffer`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^java.io.File game-directory ^java.lang.String screenshot-name ^Integer width ^Integer height ^net.minecraft.client.shader.Framebuffer buffer]
    (ScreenShotHelper/saveScreenshot game-directory screenshot-name width height buffer))
  (^net.minecraft.util.text.ITextComponent [^java.io.File game-directory ^Integer width ^Integer height ^net.minecraft.client.shader.Framebuffer buffer]
    (ScreenShotHelper/saveScreenshot game-directory width height buffer)))

(defn *create-screenshot
  "width - `int`
  height - `int`
  framebuffer-in - `net.minecraft.client.shader.Framebuffer`

  returns: `java.awt.image.BufferedImage`"
  (^java.awt.image.BufferedImage [^Integer width ^Integer height ^net.minecraft.client.shader.Framebuffer framebuffer-in]
    (ScreenShotHelper/createScreenshot width height framebuffer-in)))

