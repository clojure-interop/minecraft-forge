(ns net.minecraft.client.gui.Gui
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui Gui]))

(defn ->gui
  "Constructor."
  (^Gui []
    (new Gui )))

(def *-options-background
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  Gui/OPTIONS_BACKGROUND)

(def *-stat-icons
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  Gui/STAT_ICONS)

(def *-icons
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  Gui/ICONS)

(defn *draw-rect
  "left - `int`
  top - `int`
  right - `int`
  bottom - `int`
  color - `int`"
  ([^Integer left ^Integer top ^Integer right ^Integer bottom ^Integer color]
    (Gui/drawRect left top right bottom color)))

(defn *draw-modal-rect-with-custom-sized-texture
  "x - `int`
  y - `int`
  u - `float`
  v - `float`
  width - `int`
  height - `int`
  texture-width - `float`
  texture-height - `float`"
  ([^Integer x ^Integer y ^Float u ^Float v ^Integer width ^Integer height ^Float texture-width ^Float texture-height]
    (Gui/drawModalRectWithCustomSizedTexture x y u v width height texture-width texture-height)))

(defn *draw-scaled-custom-size-modal-rect
  "x - `int`
  y - `int`
  u - `float`
  v - `float`
  u-width - `int`
  v-height - `int`
  width - `int`
  height - `int`
  tile-width - `float`
  tile-height - `float`"
  ([^Integer x ^Integer y ^Float u ^Float v ^Integer u-width ^Integer v-height ^Integer width ^Integer height ^Float tile-width ^Float tile-height]
    (Gui/drawScaledCustomSizeModalRect x y u v u-width v-height width height tile-width tile-height)))

(defn draw-centered-string
  "font-renderer-in - `net.minecraft.client.gui.FontRenderer`
  text - `java.lang.String`
  x - `int`
  y - `int`
  color - `int`"
  ([^Gui this ^net.minecraft.client.gui.FontRenderer font-renderer-in ^java.lang.String text ^Integer x ^Integer y ^Integer color]
    (-> this (.drawCenteredString font-renderer-in text x y color))))

(defn draw-string
  "font-renderer-in - `net.minecraft.client.gui.FontRenderer`
  text - `java.lang.String`
  x - `int`
  y - `int`
  color - `int`"
  ([^Gui this ^net.minecraft.client.gui.FontRenderer font-renderer-in ^java.lang.String text ^Integer x ^Integer y ^Integer color]
    (-> this (.drawString font-renderer-in text x y color))))

(defn draw-textured-modal-rect
  "x - `int`
  y - `int`
  texture-x - `int`
  texture-y - `int`
  width - `int`
  height - `int`"
  ([^Gui this ^Integer x ^Integer y ^Integer texture-x ^Integer texture-y ^Integer width ^Integer height]
    (-> this (.drawTexturedModalRect x y texture-x texture-y width height)))
  ([^Gui this ^Integer x-coord ^Integer y-coord ^net.minecraft.client.renderer.texture.TextureAtlasSprite texture-sprite ^Integer width-in ^Integer height-in]
    (-> this (.drawTexturedModalRect x-coord y-coord texture-sprite width-in height-in))))

