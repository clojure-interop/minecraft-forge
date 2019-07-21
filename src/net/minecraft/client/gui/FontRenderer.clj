(ns net.minecraft.client.gui.FontRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui FontRenderer]))

(defn ->font-renderer
  "Constructor.

  game-settings-in - `net.minecraft.client.settings.GameSettings`
  location - `net.minecraft.util.ResourceLocation`
  texture-manager-in - `net.minecraft.client.renderer.texture.TextureManager`
  unicode - `boolean`"
  (^FontRenderer [^net.minecraft.client.settings.GameSettings game-settings-in ^net.minecraft.util.ResourceLocation location ^net.minecraft.client.renderer.texture.TextureManager texture-manager-in ^Boolean unicode]
    (new FontRenderer game-settings-in location texture-manager-in unicode)))

(defn font-height
  "Instance Field.

  type: int"
  (^Integer [^FontRenderer this]
    (-> this .-FONT_HEIGHT)))

(defn font-random
  "Instance Field.

  type: java.util.Random"
  (^java.util.Random [^FontRenderer this]
    (-> this .-fontRandom)))

(defn *get-format-from-string
  "text - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String text]
    (FontRenderer/getFormatFromString text)))

(defn set-bidi-flag
  "bidi-flag-in - `boolean`"
  ([^FontRenderer this ^Boolean bidi-flag-in]
    (-> this (.setBidiFlag bidi-flag-in))))

(defn on-resource-manager-reload
  "resource-manager - `net.minecraft.client.resources.IResourceManager`"
  ([^FontRenderer this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.onResourceManagerReload resource-manager))))

(defn get-string-width
  "text - `java.lang.String`

  returns: `int`"
  (^Integer [^FontRenderer this ^java.lang.String text]
    (-> this (.getStringWidth text))))

(defn trim-string-to-width
  "text - `java.lang.String`
  width - `int`
  reverse - `boolean`

  returns: `java.lang.String`"
  (^java.lang.String [^FontRenderer this ^java.lang.String text ^Integer width ^Boolean reverse]
    (-> this (.trimStringToWidth text width reverse)))
  (^java.lang.String [^FontRenderer this ^java.lang.String text ^Integer width]
    (-> this (.trimStringToWidth text width))))

(defn set-unicode-flag
  "unicode-flag-in - `boolean`"
  ([^FontRenderer this ^Boolean unicode-flag-in]
    (-> this (.setUnicodeFlag unicode-flag-in))))

(defn draw-string
  "text - `java.lang.String`
  x - `float`
  y - `float`
  color - `int`
  drop-shadow - `boolean`

  returns: `int`"
  (^Integer [^FontRenderer this ^java.lang.String text ^Float x ^Float y ^Integer color ^Boolean drop-shadow]
    (-> this (.drawString text x y color drop-shadow)))
  (^Integer [^FontRenderer this ^java.lang.String text ^Integer x ^Integer y ^Integer color]
    (-> this (.drawString text x y color))))

(defn get-word-wrapped-height
  "str - `java.lang.String`
  max-length - `int`

  returns: `int`"
  (^Integer [^FontRenderer this ^java.lang.String str ^Integer max-length]
    (-> this (.getWordWrappedHeight str max-length))))

(defn list-formatted-string-to-width
  "str - `java.lang.String`
  wrap-width - `int`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^FontRenderer this ^java.lang.String str ^Integer wrap-width]
    (-> this (.listFormattedStringToWidth str wrap-width))))

(defn get-unicode-flag?
  "returns: `boolean`"
  (^Boolean [^FontRenderer this]
    (-> this (.getUnicodeFlag))))

(defn get-color-code
  "character - `char`

  returns: `int`"
  (^Integer [^FontRenderer this ^Character character]
    (-> this (.getColorCode character))))

(defn get-char-width
  "character - `char`

  returns: `int`"
  (^Integer [^FontRenderer this ^Character character]
    (-> this (.getCharWidth character))))

(defn get-bidi-flag?
  "returns: `boolean`"
  (^Boolean [^FontRenderer this]
    (-> this (.getBidiFlag))))

(defn draw-split-string
  "str - `java.lang.String`
  x - `int`
  y - `int`
  wrap-width - `int`
  text-color - `int`"
  ([^FontRenderer this ^java.lang.String str ^Integer x ^Integer y ^Integer wrap-width ^Integer text-color]
    (-> this (.drawSplitString str x y wrap-width text-color))))

(defn draw-string-with-shadow
  "text - `java.lang.String`
  x - `float`
  y - `float`
  color - `int`

  returns: `int`"
  (^Integer [^FontRenderer this ^java.lang.String text ^Float x ^Float y ^Integer color]
    (-> this (.drawStringWithShadow text x y color))))

