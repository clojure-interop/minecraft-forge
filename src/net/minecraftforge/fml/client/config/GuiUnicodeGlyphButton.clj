(ns net.minecraftforge.fml.client.config.GuiUnicodeGlyphButton
  "This class provides a button that shows a string glyph at the beginning. The glyph can be scaled using the glyphScale parameter."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiUnicodeGlyphButton]))

(defn ->gui-unicode-glyph-button
  "Constructor.

  id - `int`
  x-pos - `int`
  y-pos - `int`
  width - `int`
  height - `int`
  display-string - `java.lang.String`
  glyph - `java.lang.String`
  glyph-scale - `float`"
  (^GuiUnicodeGlyphButton [^Integer id ^Integer x-pos ^Integer y-pos ^Integer width ^Integer height ^java.lang.String display-string ^java.lang.String glyph ^Float glyph-scale]
    (new GuiUnicodeGlyphButton id x-pos y-pos width height display-string glyph glyph-scale)))

(defn glyph
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^GuiUnicodeGlyphButton this]
    (-> this .-glyph)))

(defn glyph-scale
  "Instance Field.

  type: float"
  (^Float [^GuiUnicodeGlyphButton this]
    (-> this .-glyphScale)))

(defn draw-button
  "Description copied from class: GuiButtonExt

  mc - `net.minecraft.client.Minecraft`
  mouse-x - `int`
  mouse-y - `int`"
  ([^GuiUnicodeGlyphButton this ^net.minecraft.client.Minecraft mc ^Integer mouse-x ^Integer mouse-y]
    (-> this (.drawButton mc mouse-x mouse-y))))

